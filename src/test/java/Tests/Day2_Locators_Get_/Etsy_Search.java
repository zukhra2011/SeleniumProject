package Tests.Day2_Locators_Get_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy_Search {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Wooden spoon"+ Keys.ENTER);
        if(driver.getTitle().contains("Wooden spoon | Etsy")){
            System.out.println("Verification has worked");
        }
        else{
            System.out.println("Verification not passed");
        }
        driver.close();
    }
}
