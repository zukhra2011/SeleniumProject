package Tests.Day9.Properties_Browser_Util;

import Tests.Utilities.LibraryUtils;
import Tests.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }
    public void loginToLibrary(){

    }
@Test
    public void login_link_count_test(){
   // Print out count of all the links on landing page
    //LoginMethod calling to login Library app
    LibraryUtils.loginToLibrary(driver);
    List<WebElement> allLinks=driver.findElements(By.xpath("//body//a"));
    System.out.println("allLinks = " + allLinks);
   //Print out each link text on this page.
    for(WebElement each:allLinks){
        System.out.println(each.getText());
    }

}

}
