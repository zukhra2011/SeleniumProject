package Tests.Day12_Actions_upload_jsexecutor;

import Tests.Utilities.BrowserUtil;
import Tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions_Practices {
    @Test
    public void tc15_actions_hover(){
        //TC #15: Hover Test
        //1. Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        //Locating all the images here:
        WebElement img1=Driver.getDriver().findElement((By.xpath("(//img)[1]")));
        WebElement img2=Driver.getDriver().findElement((By.xpath("(//img)[2]")));
        WebElement img3=Driver.getDriver().findElement((By.xpath("(//img)[3]")));
        //Locating all the "user" names
        WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
       //We must create object of Actions class to be able to use methods coming from there
        BrowserUtil.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        //2. Hover over to first image
        actions.moveToElement(img1).perform();
        //


        //3.Assert
        Assert.assertTrue(user1.isDisplayed(),"User 1 is not displayed.");
        //4."name:User1" is displayed 4. Hover over to second image.
        actions.moveToElement(img2).perform();
        //5.Assert
        BrowserUtil.sleep(2);
        Assert.assertTrue(user2.isDisplayed(),"User 2 is not displayed");
        //6."name:user2" is displayed 6. Hover over to third image.
        actions.moveToElement(img3).perform();
        //7.Confirm:
        //8. "name:user3" is displayed.
        Assert.assertTrue(user3.isDisplayed(),"User3 text is not displayed");


    }

    @Test
    public void scrolling_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
        //scroll down to "Powered By Cybertek School"
        Actions actions=new Actions(Driver.getDriver());
        //Locate "Powered By Cybertek School"
        WebElement cybertekSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        //Scroll using actions object
        BrowserUtil.sleep(2);
        actions.moveToElement(cybertekSchoolLink).perform();
        //Scrolling up using Keys.Page_Up button
        BrowserUtil.sleep(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        //Scrolling down using Keys.Page_UP button
        BrowserUtil.sleep(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        //Scrolling down using Keys.Page_Down button
        BrowserUtil.sleep(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();






    }
}
