
import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Vytrack {

    WebDriver driver;
    //User
    //Setup.
    @BeforeClass
    public void start(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://app.vytrack.com/user/login");//Login page.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() throws InterruptedException {
        //Username credentials input.
        WebElement username=driver.findElement(By.id("prependedInput"));
        username.sendKeys("user38");
        //Password input.
        WebElement password=driver.findElement(By.id("prependedInput2"));
        Thread.sleep(1000);
        password.sendKeys("UserUser123");
        //Logging in
        WebElement loginbutton=driver.findElement(By.id("_submit"));
        loginbutton.click();
        //Clicking fleet button
        WebElement fleetbutton=driver.findElement(By.cssSelector("li[class='dropdown dropdown-level-1']"));
        fleetbutton.click();
        Thread.sleep(2000);
        //Choosing vehicle button
        WebElement vehiclesbutton=driver.findElement(By.cssSelector("a[href='entity/Extend_Entity_Carreservation']"));
        vehiclesbutton.click();

        //Clicking reset button.
        WebElement resetbutton= driver.findElement(By.xpath("//a[@title='Refresh']/..//a[3]"));
        Thread.sleep(1000);
        resetbutton.click();

        Assert.assertTrue(resetbutton.isEnabled());

    }
    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }}
