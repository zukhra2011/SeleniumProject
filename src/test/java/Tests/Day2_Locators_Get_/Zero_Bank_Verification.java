package Tests.Day2_Locators_Get_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zero_Bank_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zero.webappsecurity.com/login.html");
        if(("Log into Zero Bank").equals(driver.findElement(By.tagName("h3")).getText())){
            System.out.println("Header is verified");

        }else {
            System.out.println("Header isnt verified");

        }
    }
}
