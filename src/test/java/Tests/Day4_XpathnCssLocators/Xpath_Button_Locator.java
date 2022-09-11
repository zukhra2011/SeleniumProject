package Tests.Day4_XpathnCssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_Button_Locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriver_Factory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        String expectedttext= "Clicked on button one!";
        Thread.sleep(2000);
        String actualtext= driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println("actualtext = " + actualtext);
        if(actualtext.equals(expectedttext)){
            System.out.println("Text is verified.");
        }
        else{
            System.out.println("Text isn't verified");
        }



    }
}
