package techproed.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02IlkClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        System.out.println("Amazon Sayfa Başlığı : "+driver.getTitle());//getTitle() methodu Sayfa başlığını verir
        driver.get("https://techproeducation.com");

        System.out.println("Techproeducation Sayfa Başlığı : "+driver.getTitle());//getTitle() methodu Sayfa başlığını verir
    }

}
