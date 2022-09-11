package Tests.Day4_XpathnCssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cssselector_Xpath_Cybertek {
    public static void main(String[] args) {
        WebDriver driver= WebDriver_Factory.getDriver("chrome" );
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement home= driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement forgotpassword=driver.findElement(By.xpath("//div[@class='example']/h2"));
        WebElement email=driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailbox=driver.findElement(By.xpath("//input[@type='text']"));
        WebElement retrievepassword=driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement poweredby= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println("home = " + home.isDisplayed());
        System.out.println("forgotpassword = " + forgotpassword.isDisplayed());
        System.out.println("email = " + email.isDisplayed());
        System.out.println("emailbox = " + emailbox.isDisplayed());
        System.out.println("retrievepassword = " + retrievepassword.isDisplayed());
        System.out.println("poweredby = " + poweredby.isDisplayed());



    }
}
