package Tests.Day7_Alerts_Iframes_Windows;

import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowsPractice {
    WebDriver driver;

    @BeforeMethod
    public void SetupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }
    @Test
    public void window_test(){
        //Assert title is "Practice"
        String actualtitlebeforeclick=driver.getTitle();
        String expectedtitlebeforeclick="Practice";
        System.out.println("actualtitlebeforeclick = " + actualtitlebeforeclick);
        //Click to: CLick here text
        WebElement clickHereLink=driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        //Switch to New Window
        for (String each : driver.getWindowHandles())
        {
            driver.switchTo().window(each);
            System.out.println("Current Title");
        }
        //Assert title is New Window

    }

}