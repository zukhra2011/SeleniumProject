package Tests.Day2_Locators_Get_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zero_Bank_Link_Ver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        if("/index.html".equals(driver.findElement(By.tagName("href")).getText())){
            System.out.println("Verification passed.");
        }
        else{
            System.out.println("Verification didnt pass");
        }

    }
}
