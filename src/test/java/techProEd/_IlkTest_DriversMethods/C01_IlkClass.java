package techProEd._IlkTest_DriversMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.techproeducation.com");




    }
}
