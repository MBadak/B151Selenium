package techProEd.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(33));
        // https://www.amazon.com sayfasına gidiniz

        driver.get("https://www.amazon.com");
        // aramakutusunu locate ediniz ve Nutella aratınız
        WebElement arama_Kutusu = driver.findElement(By.id("twotabsearchtextbox"));
        arama_Kutusu.sendKeys("Nutella" + Keys.ENTER); //sendKeys yazi yazmak icin kullanilir


       /*
        arama_Kutusu.submit();  bu da enter gibi aynisini yapar
       WebElement ara = driver.findElement(By.id("nav-search-submit-button"));
       ara.click();
                keys.Enter yerine ara yi locator ettik ve .click ile tikladik bu yolda kullanilabilir.
       */

        // sayfayı kapatınız
      Thread.sleep(3000);
        driver.close();
    }
}
