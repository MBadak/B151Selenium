package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfa konumu : " + driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanin boyutlari : " + driver.manage().window().getSize());

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();


        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");

        System.out.println("Sayfa konumu : " + driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanin boyutlari : " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Sayfayı fullScreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(50, 50)); // istedigimiz Konumagetirir
        driver.manage().window().setPosition(new Point(150, 50));
        driver.manage().window().setPosition(new Point(1050, 50));
        driver.manage().window().setPosition(new Point(1050, 350));

        driver.manage().window().setSize(new Dimension(555, 555)); // istediginiz boyuta getirir


        //Sayfayi kapatalim
        driver.close();
    }
}
