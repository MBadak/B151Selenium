package techProEd.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagName_getAttributeName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement arama_kutusu= driver.findElement(By.id("twotabsearchtextbox"));

// 2- arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName=arama_kutusu.getTagName();
        String expectedTagName="input";
        if (expectedTagName.equals(actualTagName)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

// 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAttributeName=arama_kutusu.getAttribute("name");
        String expectedAttributeName="field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
// 4- arama kutusunun placeholder attribute'nun degerinin "Suche Amazon" oldugunu test edin
        String actualAttributeName2=arama_kutusu.getAttribute("placeholder");
        String expectedAttributeName2="Suche Amazon";
        if (actualAttributeName2.equals(expectedAttributeName2)) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
// 5- sayfayı kapatınız
        driver.close();


    }
}
