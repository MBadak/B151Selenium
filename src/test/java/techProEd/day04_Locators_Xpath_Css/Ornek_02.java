package techProEd.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ornek_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
        driver.findElement(By.id("onetrust-reject-all-handler")).click();
        //Bir mail adersi giriniz

        driver.findElement(By.id("email")).sendKeys("m.badak99@gmail.com");
        //Bir password giriniz
        driver.findElement(By.id("password")).sendKeys("123456");
        //Login butonuna tiklayiniz
        driver.findElement(By.xpath("//*[@name='commit']")).submit();
        //"There was a problem with your login." texti gorunur ise
        boolean görünürlük= driver.findElement(By.xpath("//*[@role='alert']")).isDisplayed();
        //"kayit yapilamadi" yazdiriniz

        //eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        //sayfayı kapatiniz
    }
}
