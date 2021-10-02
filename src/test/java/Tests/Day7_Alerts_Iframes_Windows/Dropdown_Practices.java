package Tests.Day7_Alerts_Iframes_Windows;

import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Practices {
WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

    }
    @Test
    public void tc1_simple_dropdown_test(){
        //Verify "Simply dropdown" default selected value is correct
        //Expected:"Please select an option"
        Select simpleDropdown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption=simpleDropdown.getFirstSelectedOption();
        String actualTextOfCurrentOption=currentlySelectedOption.getText();
        String expectedText="Please select an option";
        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));
        //Another way of writing above
        //  Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(),"PLease select an option");
        //Verify "State selection" default selected value is correct
        //Expected: "Select a state"
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        WebElement currentlySelectedState=stateDropdown.getFirstSelectedOption();
        String actualStateDropdown= currentlySelectedState.getText();
        String expectedText1= "Select a State";
        Assert.assertTrue(actualStateDropdown.equals(expectedText1));
        System.out.println("expectedText1 = " + expectedText1);
        System.out.println("currentlySelectedState = " + actualStateDropdown);
        Assert.assertEquals(actualStateDropdown,expectedText1);
    }
    @Test
public void tc2_state_dropdown_test(){
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //Select Illinois
        stateDropdown.selectByVisibleText("Illinois");
        //Select Virginia
        stateDropdown.selectByValue("VA");
        //Select California
        stateDropdown.selectByIndex(5);
        //Verify final selected option is California.
        String expectedOption="California";
        String actualOption=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption, "Assertion failed.");
       // Whatever we pass into third aargument we can use as Assertions failure warning.
        // Use all Select Options
        // Use all select options(visible text, value, index)




    }

    @AfterClass
    public void teardownClass(){
        driver.close();
    }



}
