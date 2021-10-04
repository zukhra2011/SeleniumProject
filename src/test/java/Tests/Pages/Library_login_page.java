package Tests.Pages;

import Tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_login_page {
    //1-Create constructor and intialize driver and object of the claa
    public Library_login_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(id = "inputEmail")
        public WebElement inputEmail;

        @FindBy(id="inputPassword")
        public WebElement inputPassword;

        @FindBy(xpath = "//button[text()='Sign in']")
        public WebElement signInButton;

        @FindBy(id="inputEmail-error")
        public WebElement invalidEmailFormatError;

        @FindBy(xpath = "//div[@class='alert alert-danger']")
        public WebElement incorrectEmailorPasswordError;

}