package Tests.Day12_Actions_upload_jsexecutor;

import Tests.Utilities.Configuration_Reader;
import Tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtil_Practice {

    @Test
    public void simple_google_search_test(){
        //1. Go to google.com
        //Driver.getDriver()=driver---created driver instance and ready to use.
        Driver.getDriver().get(Configuration_Reader.getProperty("googleUrl"));
        //2. Search for a value
        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));
        String searchValue=Configuration_Reader.getProperty("searchValue");
       //send the searchValue and press enter.
        searchBox.sendKeys(searchValue+ Keys.ENTER);
        //3. Verify value is contained in the title.
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle=searchValue;
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //This will terminate and assign driver value to null
        Driver.closeDriver();
        Driver.getDriver().get("https://etsy.com");
        Driver.closeDriver();
    }
}
