package Tests.Day13_Action_Pom_Design;

import Tests.Utilities.BrowserUtil;
import Tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions_Practices {
    @Test
    public void p2_double_click_test(){
        //1.Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml15_ev_ondbclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2.Switch to iframe
        //We are switching to iframe using id attribute value and switchTo method.
        Driver.getDriver().switchTo().frame("iframeResult");
        //Locating the text to double click
         WebElement textToDoubleClick=Driver.getDriver().findElement(By.id("demo"));
        //Double click on the text "Double click me to change my text color"
        //3.Double click on the text "Double click me to change my text color."
         Actions actions=new Actions(Driver.getDriver());
        //use the actions object to double click to already located web element
        BrowserUtil.sleep(2);
        actions.doubleClick(textToDoubleClick).perform();
        //4. Assert: Text's "style" attribute value contains "red".
        String expectedstyle="red";
        String actualstyle= textToDoubleClick.getAttribute("style");
        Assert.assertTrue(actualstyle.contains(expectedstyle));
    }
}
