package Tests.Day2_Locators_Get_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
        driver.findElement(By.name("btnK")).click();
        String actualTitle="Apple";
        String expectedTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Verification passed");

        } else {
            System.out.println("Verification failed");
        }
        driver.close();

    }
}
