package Tests.Day2_Locators_Get_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("google.com");
        driver.findElement(By.linkText("Gmail")).click();
        String expected="Gmail";
        String actual=driver.getTitle();
        if(actual.contains(expected)){
            System.out.println("Verified");
        }
        else{
            System.out.println("Not verified");
        }
        driver.navigate().back();
        String expectedtitle="Google";
        String actualtitle= driver.getTitle();
        if(actualtitle.equals(expectedtitle)){
            System.out.println("Verified");
        }
        else{
            System.out.println("Not verified");
        }
    }
}
