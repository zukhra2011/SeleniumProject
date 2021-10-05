package Tests.Pages;

import Tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamicload_Page {
    public Dynamicload_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startbutton;

    @FindBy(id="loading")
    public WebElement loadingbar;

    @FindBy(id="username")
    public WebElement username;

    @FindBy (id="pwd")
    public WebElement password;

    @FindBy(xpath="//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(id="flash")
    public WebElement errorMessage;

}