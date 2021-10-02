package Tests.Day10_Webtable_Properties;

import Tests.Utilities.Configuration_Reader;
import Tests.Utilities.TableUtils;
import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        String browser= Configuration_Reader.getProperty("browser");
        //This line returns String: chrome
        String url=Configuration_Reader.getProperty("dataTablesUrl");
        //This line returns String:https://practice.cybertekschool.com/tables#edit
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.DAYS);
        driver.get(url);
    }

    @Test
    public void task3_return_times_due_amount(){
        String url=Configuration_Reader.getProperty("dataTablesUrl");
       driver.get(url);
//Locating first table and verify Tim has due amount of "$50"
        WebElement timsDueAmount= driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/following-sibling::td[2]"));
        System.out.println("timsDueAmount.getText() = " + timsDueAmount.getText());
                String actualTimresult= timsDueAmount.getText();
                String expectedTimresult="$50.00";
        Assert.assertEquals(actualTimresult,expectedTimresult,"Not returning what expected");

    }
    @Test
    public void task4_verify_order_method(){
        TableUtils.verifyOrder(driver,"random");
    }
}
