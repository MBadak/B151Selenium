package techProEd.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike"  yazıp aratın

        // WebElement arama_Kutusu=driver.findElement(By.xpath("//*[@placeholder='Suche Amazon']"));
        // WebElement arama_Kutusu=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        // Bunlarda xpath ile alinan locator lar bunlarda kullanilabilir. Fakat id varsa id'i tercih ederiz
        WebElement arama_Kutusu = driver.findElement(By.id("twotabsearchtextbox"));
        arama_Kutusu.sendKeys("city bike" + Keys.ENTER);
        // Elektrofahrräder bölümüne tıklayın
        driver.findElement(By.xpath("//span[text()='Elektrofahrräder']")).click();
        // sonuc sayısını yazdırın
        WebElement sonuc = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonuc.getText());
        String sonuc_Sayisi[] = sonuc.getText().split(" ");
        System.out.println(sonuc_Sayisi[2]);

        // ilk ürününe tıklayın
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        //Sayfayı kapatınız
       // driver.close();


    }
}
