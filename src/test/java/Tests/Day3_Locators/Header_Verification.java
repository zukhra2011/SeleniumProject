package Tests.Day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=  new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement header=driver.findElement(By.className("_8eso"));
        System.out.println("header = " + header);
        String expected="Connect with friends and the world around you on Facebook.";
        String actual= header.getText();
        if (actual.equals((expected))) {
            System.out.println("Title Verification Passed");
        }
        else{
        System.out.println("Not Passed");
    }

    }
}
