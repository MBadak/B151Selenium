package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_finfElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(33));


        // "https://www.amazon.com" sayfasına gidiniz
        driver.get("https://www.amazon.com");

        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List<WebElement> linkler= driver.findElements(By.tagName("a"));
        System.out.println("Amzon Sayfasinda "+linkler.size()+ " link vardir.");

        // Linkleri konsolda yazdırın

        for (WebElement w:linkler   ) {
            System.out.println(w.getText());  // .getText string olarak degerini verir
        }

        // sayfayı kapatın
        driver.close();
    }
}
