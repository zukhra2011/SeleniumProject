package Tests.Day12_Actions_upload_jsexecutor;

import Tests.Utilities.BrowserUtil;
import Tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JS_Executor_Practices {
    @Test
    public void scroll_using_jsexecutor_test1(){
        //Get the page: http://pracitce.cybertekschool.com/infinite_scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        //(JavaScriptExecutor) Driver.getDriver(()).executeScript("")
        //Down casting our driver type to JavaScriptExecutor so we can reach methods in this interface
        BrowserUtil.sleep(2);
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        //using js we reach executeScript method so we are allowed to pass Javascript Functions
        //this method is capable of accepting Javascript functions and apply into our Java+Selenium code

       for (int i=0; i<10;i++) {
           BrowserUtil.sleep(1);
       js.executeScript("window.scrollBy(0,750)");

       }}
@Test
public void scroll_using_jsExecutor_tester2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
     WebElement Cyberteklink=Driver.getDriver().findElement(By.xpath("//a[@href='https://cybertekschool.com/']"));
     //by link would be (By linkText("Cybertek School"));



    }
}
