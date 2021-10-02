package Tests.Day7_Alerts_Iframes_Windows;

import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }
    @Test
    public void iframe_test(){
        //Changing to iframe using index
       // driver.switchTo().frame(0);
        //Locate as a WebElement to switch
      //  WebElement iframe=driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        //driver.switchTo().frame(iframe);
        //If <iframe> tag has id or name attribute, we can pass its attribute value as a   string into
        //.switchTo().frame() method directly
        driver.switchTo().frame("mce_O_ifr");
        //Locating web element text
        WebElement ContentGoesHere=driver.findElement(By.xpath("//p"));
        //Assert "Your content goes here."
        Assert.assertTrue(ContentGoesHere.isDisplayed());
        //Locating header as a webelement
        driver.switchTo().defaultContent();
        WebElement TinyMceEditor=driver.findElement(By.xpath("//h3"));
        //Assert:"An iFrame containing the TinyMCE WYSIWG Editor"
        Assert.assertTrue(TinyMceEditor.isDisplayed());


    }


}
