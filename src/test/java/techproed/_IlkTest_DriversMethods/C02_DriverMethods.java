package techproed._IlkTest_DriversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        // getTitle()  driverin oldugu sayfanin basligini verir
        System.out.println("Amazon Sayfa Başlığı : " + driver.getTitle());//getTitle() methodu Sayfa başlığını verir
        // driver.getCurrentUrl() Gidilen sayfanin Url ini verir
        System.out.println("Amazon Actual Url : " + driver.getCurrentUrl());
        System.out.println("Amazon Windows handle :"+driver.getWindowHandle());  //getWindowHandle() gidilen sayfanın handle değerini(hashkod) verir.
        //bu handle değerini sayfalar arası geçiş için kullanırız.

        driver.get("https://techproeducation.com");
        // getTitle()  driverin oldugu sayfanin basligini verir
        System.out.println("Techproeducation Sayfa Başlığı : " + driver.getTitle());//getTitle() methodu Sayfa başlığını verir
        // driver.getCurrentUrl() Gidilen sayfanin Url ini verir
        System.out.println("TechProEd Actual Url : " + driver.getCurrentUrl());

        //System.out.println("TechProEd kaynak kodlari"+ driver.getPageSource());

        //getWindowHandle() gidilen sayfanın handle değerini(hashkod) verir.
        //bu handle değerini sayfalar arası geçiş için kullanırız.
        System.out.println("TechProEd Windows handle :"+driver.getWindowHandle());

    }
}
