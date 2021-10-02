package Tests.Day11_Test_base;

import Tests.Utilities.Configuration_Reader;
import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class Test_Base {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        String browser= Configuration_Reader.getProperty("browser");
        //This line returns String: chrome
        //This line returns String:https://practice.cybertekschool.com/tables#edit
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.DAYS);
}}
