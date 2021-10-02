package Tests.Day12_Actions_upload_jsexecutor;

import Tests.Utilities.BrowserUtil;
import Tests.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Upload_Practice {
    @Test
    public void upload_test(){
        //1. Go to http://practice.cybertekschool.com/upload
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        //2.Find some small file from your computer, and get the path of it
        String path="/Users/zukhrakhaknazarova/Desktop/Photo ideas/1-slide-great-alpine-traverse-swiss-alps-tyrolean-alps-pano.jpg";
        //3.Upload the file.
        WebElement chooseFile=Driver.getDriver().findElement(By.id("file-upload"));
        WebElement fileuploadButton=Driver.getDriver().findElement(By.id("file-submit"));
        BrowserUtil.sleep(3);

       //sending the file path to the chooserFile Webelement
        chooseFile.sendKeys(path);
        fileuploadButton.click();
        //4. Assert
        //File uploaded text is displayed on the page.
        WebElement fileUploadMessage= Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadMessage.isDisplayed());
        Driver.closeDriver();
    }

}
