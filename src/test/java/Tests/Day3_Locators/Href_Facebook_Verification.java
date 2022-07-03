package Tests.Day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Href_Facebook_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement link=driver.findElement(By.linkText("Create a Page"));
        String actual=link.getAttribute("href");
        String expected="registration_form";
       if(actual.contains(expected)){
           System.out.println("Vereification is done");
       }
        else{
            System.out.println("Verification is incomplete");
        }

    }
}
