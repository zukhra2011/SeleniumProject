package Tests.Day14_Pom_Synchronization;

import Tests.Pages.DynamicLoad7Page;
import Tests.Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_Wait_practice {
    @Test
    public void dynamic_loading_test7(){
        //Go to http://practice.cybertekschool.com/dynamic_loading/7
        //Wait until title is "Dynamic title"
        //Assert:Message "Done" is displayed.
        //Assert:Image is displayed.
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        //use the object to wait for the explicit condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        //this will wait until the image is displayed on the page
        //wait.until(ExpectedConditions.visibilityOf(dynamicLoadPage.spongeBobImage));
        //3.Assert:Message "Done" is displayed.
        DynamicLoad7Page dynamicLoad7Page=new DynamicLoad7Page();
        Assert.assertTrue(dynamicLoad7Page.Donespongebob.isDisplayed());
        //Assert:image is displayed.
        Assert.assertTrue(dynamicLoad7Page.imagemessage.isDisplayed());




}}
