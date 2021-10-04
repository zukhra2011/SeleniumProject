package Tests.Pages;

import Tests.Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObject_ModelPractices {
    @Test
    public void negative_login_to_library_test(){
        //1.Go to library
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        //Create object of the class
        //When we create the object of "Library LoginPage", constructor will automatically
        // Initialize driver and object of Libraryloginpage.
        //Meaning we will be able to use the selenium method through the object of the class.
        Library_login_page login_page=new Library_login_page();
        //2.Enter the incorrect username
        login_page.inputEmail.sendKeys("wrong@gmail.com");
        //3.Enter incorrect password
        login_page.inputPassword.sendKeys("wrong password");
        //4.Click to sign in button
        login_page.signInButton.click();
        //5 Verify error message is  displayed
        Assert.assertTrue(login_page.incorrectEmailorPasswordError.isDisplayed());



    }
}
