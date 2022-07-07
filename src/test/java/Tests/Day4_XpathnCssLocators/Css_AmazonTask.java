package Tests.Day4_XpathnCssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriver_Factory.getDriver("chrome");
        driver.get("https:/www.amazon.com");
        WebElement amazonSearchBar=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
       amazonSearchBar.sendKeys("Wooden Spoon"+ Keys.ENTER);
       String expectedtitle="Amazon.com : Wooden Spoon";
       Thread.sleep(3000);
       String actualtitle= driver.getTitle();
        System.out.println(actualtitle);
       if(expectedtitle==actualtitle){
           System.out.println("Title is verified");
       }
       else{
           System.out.println("Title is not verified");
       }

    }
}
