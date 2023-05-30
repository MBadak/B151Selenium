package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(33));
        // https://www.amazon.com sayfasına gidiniz

        driver.get("https://www.amazon.com");
        // aramakutusunu locate ediniz ve Nutella aratınız
        WebElement arama_Kutusu = driver.findElement(By.id("twotabsearchtextbox"));
        arama_Kutusu.sendKeys("Nutella" );
        arama_Kutusu.submit(); //.submit();  ile enter'a basar


        // sayfayı kapatınız
        Thread.sleep(3000);
        driver.close();
    }
}
