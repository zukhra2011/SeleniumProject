package Tests.Day7_Alerts_Iframes_Windows;

import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alerts_Practices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void information_alert_test(){
        WebElement informationAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //Click to "Click for JS Alert" button
        informationAlertButton.click();
        // CLick to Ok from alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //Verify "You successfully clicked an alert" is displayed.
        WebElement resultText=driver.findElement(By.xpath("//p[@id=result]"));
        Assert.assertTrue(resultText.isDisplayed());
        String expectedText="You successfully clicked on alert";
        String actualText= resultText.getText();
        Assert.assertTrue(resultText.isDisplayed());
        Assert.assertEquals(actualText,expectedText, "Assertion failed");

}

}
