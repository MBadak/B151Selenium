package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);  // Java kodlarini bekletmek icin kullanilir.3000 yazildigi icin 3saniye bekler

        //Sonra Amazon sayfasına gidelim
        // driver.get("http://www.amazon.com"); //buda gider
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(3000);


        //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfasinin basligi : " + driver.getTitle());
        Thread.sleep(3000);


        //Techproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa başlığını yazdıralım
        System.out.println("Techproed nin sayfa basligi : " + driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon Url : " + driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayi kapatalim
        driver.close();
    }
}
