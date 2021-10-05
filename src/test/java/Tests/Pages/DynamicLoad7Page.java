package Tests.Pages;

import Tests.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {


    public DynamicLoad7Page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
@FindBy(xpath="//strong[.='Done!']")
    public WebElement Donespongebob;

   @FindBy(xpath = "//img[@src=\"/img/a-few-moments.jpg\"]")
    public WebElement imagemessage;

}
