package Tests.Day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_incorrect_verification{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("zkhra2011");
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("Andy2010"+ Keys.ENTER);
        Thread.sleep(3000);
        if("Log into Facebook".equals(driver.getTitle())){
            System.out.println("Title has changed");
        }
        else{
            System.out.println("Title remains the same");
        }



    }
}
