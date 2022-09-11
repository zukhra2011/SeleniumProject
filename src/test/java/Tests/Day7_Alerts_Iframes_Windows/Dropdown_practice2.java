package Tests.Day7_Alerts_Iframes_Windows;

import Tests.Day4_XpathnCssLocators.WebDriver_Factory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Dropdown_practice2 {
    WebDriver driver; //instant variable.
    @BeforeClass
    public void setupClass() {
        driver = WebDriver_Factory.getDriver("chrome"); //local variable
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void tc1_simple_dropdown(){
        Select simpledropdown= new Select(driver.findElement(By.xpath(("//select[@id='dropdown']"))));
        WebElement currentlySelectedOption= simpledropdown.getFirstSelectedOption();
       String actualTextofCurrentOption=currentlySelectedOption.getText();
       String expectedText="Please select an option";
      Assert.assertTrue(actualTextofCurrentOption.equals(expectedText));
       // Assert.assertEquals(simpledropdown.getFirstSelectedOption().getText(),"Please select an option");

        //Verify "State selection" default selected value is correct.
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Select a State");


    }
    @Test
    public void tc2_state_dropdown_test() throws InterruptedException {
        Select stateDropDown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
 //Select Illinois
        Thread.sleep(1000);
        stateDropDown.selectByVisibleText("Illinois");
        //Select virginia
        Thread.sleep(1000);
        stateDropDown.selectByValue("VA");
        //Select Alaska
        Thread.sleep(1000);
        stateDropDown.selectByIndex(2);
         String expectedoption="Alaska";
         String actualoption=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualoption,expectedoption, "this will only be printed if this assertion fails");
    }
    @AfterClass
    public void teardownClass(){
       // driver.close();
}}