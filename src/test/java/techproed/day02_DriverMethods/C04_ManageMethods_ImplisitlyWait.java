package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplisitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // ImplisitlyWait: bir sayfadaki tüm elementlerin acilmasi icin bizim verecegimiz max zamana kadar bekler.
        // max süre bitmeden tüm elementler tamamlanirsa kod calismaya devam eder, max süreyi beklemez.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //techproed sayfasina gidelim
        String techproUrl="https://techproeducation.com";
       String amazonUrl="https://amazon.com";
        driver.get(techproUrl);
        //amazona gidelim
        driver.get(amazonUrl);
        //techpro sayfasina geri donelim
        driver.navigate().back();
        //sayfa basligini Techpro icerdigini test edelim

        if (driver.getTitle().contains("Techpro")) {
            System.out.println("Test Passed");

        }else System.out.println("Test Failed"+ driver.getTitle());
        //tekrar amazon sayfasina gidelim
      driver.navigate().forward();
        //sayfa basligini Amazon icerdigini test edelim
        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Test Passed");

        }else System.out.println("Test Failed --> "+ driver.getTitle());


        //Sayfayi kapatalim
        driver.close();



    }
}
