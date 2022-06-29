package Tests.Day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
         if("Facebook - log in or sign up".equals(driver.getTitle())){
             System.out.println("Title is verified");
         }
         else{
             System.out.println("Title is not verified");
         }
         driver.close();
    }
}
