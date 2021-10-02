package Tests.Day8.Windows.JavaFaker;

import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {
        WebDriver driver;
        @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.get("http://www.amazon.com");

}
@Test
    public void multiple_window_test(){
    ((JavascriptExecutor)driver).executeScript("window.open('http://google.com','_blank');");
    ((JavascriptExecutor)driver).executeScript("window.open('http://etsy.com','_blank');");
    ((JavascriptExecutor)driver).executeScript("window.open('http://facebook.com','_blank');");
    for(String each: driver.getWindowHandles()){
    driver.switchTo().window(each);
    System.out.println("Title in the current page - "+driver.getTitle());
   if(driver.getTitle().contains("Etsy")){
        Assert.assertTrue(driver.getTitle().contains("Etsy"));
       break;
    }
}

}
}
