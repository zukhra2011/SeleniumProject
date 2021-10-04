package Tests.Day14_Pom_Synchronization;

import Tests.Pages.TelerikPage;
import Tests.Utilities.BrowserUtil;
import Tests.Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions_practices {
    @Test
    public void drag_n_droptest(){
        //1.Go to https://demos.telerik.com/kedon-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        TelerikPage telerikPage=new TelerikPage();
        Actions actions= new Actions(Driver.getDriver());
        //Accept cookies by clicking to the button
        BrowserUtil.sleep(2);
        telerikPage.acceptcookiesbutton.click();
        //2.Drag and drop the small circle to bigger circle
        actions.dragAndDrop(telerikPage.smallCircle,telerikPage.bigCircle).perform();
        //2nd way of doing the same thing longer way
       // actions.moveToElement(telerikPage.smallCircle).clickAndHold(telerikPage.smallCircle)
        //        .moveToElement(telerikPage.bigCircle).release().perform();
        //3.Assert:
        String expected="You did great!";
        String actual=telerikPage.bigCircle.getText();
        Assert.assertEquals(actual,expected);





    }
}
