package techProEd.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(33));



        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add Element butonuna basin
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        Thread.sleep(2000);
        //Delete butonu'nun gorunur oldugunu test edin
        WebElement delete_Butonu= driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        if (delete_Butonu.isDisplayed()) {
            System.out.println("Delete butonu görünür");

        }else System.out.println("Delete butonu gözükmez");
        Thread.sleep(2000);

        //Delete butonuna basin
        delete_Butonu.click();
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.cssSelector("h3"));

        if(addRemoveElement.isDisplayed()){
            System.out.println("Add/Remove Element Yazisi Görünür");
        }else{
            System.out.println("Add/Remove Element Yazisi Görünür Degil");
        }

        Thread.sleep(2000);


        //Sayfayı kapatın
        driver.close();

          /*

        Xpath ve cssSelector arasındaki farklar:

        - Xpath text ile calısır.
        - cssSelector text ile calısmaz
        - Xpath index'e göre arama yapabilir.Daha fazla kombinasyona sahiptir.
        - cssSelector index'e göre arama yapamaz. Daha hızlı calısır

         */

    }
}
