package Tests.Day2_Locators_Get_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Classlocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(4000);
        driver.findElement(By.className("nav-link")).click();
        if(driver.getTitle().equals("Practice")){
            System.out.println("Verification passed.");
        }
        else{
            System.out.println("Verification failed.");
        }
        Thread.sleep(4000);
        driver.close();
    }
}
