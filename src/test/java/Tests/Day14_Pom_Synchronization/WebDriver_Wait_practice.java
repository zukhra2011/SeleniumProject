package Tests.Day14_Pom_Synchronization;

import Tests.Pages.DynamicLoad7Page;
import Tests.Pages.Dynamicload_Page;
import Tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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

}
@Test
        public void dynamic_loading_1_test(){
    //1.Go to http://practice.cybertekschool.com/dynamic_loading/1
    Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
    Dynamicload_Page dynamicload_page=new Dynamicload_Page();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    //2.Click to start
    dynamicload_page.startbutton.click();
    //3.Wait until loading bar dissapears
    wait.until(ExpectedConditions.invisibilityOf(dynamicload_page.loadingbar));
    //4.Assert username: inputbox is displayed
    Assert.assertTrue(dynamicload_page.username.isDisplayed());
    //5.Enter username:tomsmith
    dynamicload_page.username.sendKeys("tomsmith");
    //6. Enter passowrd: incorrectpassword
    dynamicload_page.password.sendKeys("incorrectPassword");
    //7.Click to Submit button
    dynamicload_page.submitButton.click();
    //8.Assert"Your password is invalid!" text is displayed.
    Assert.assertTrue(dynamicload_page.errorMessage.isDisplayed());




}
@AfterMethod
    public void tearupMethod(){
        Driver.closeDriver();
}

}

