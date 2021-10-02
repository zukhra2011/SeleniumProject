package Tests.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  LibraryUtils {

    public static void loginToLibrary(WebDriver driver){


    // Enter username: ""
    WebElement inputUsername= driver.findElement(By.xpath("//input[@id='inputEmail']"));
    inputUsername.sendKeys("student11@library");
    // Enter password: ""
    WebElement inputPassword= driver.findElement(By.xpath("//input[@id='inputPassword']"));
    inputPassword.sendKeys("tScBPCUr");
    // Click Login button.
    WebElement loginbutton=driver.findElement(By.xpath("//button[text()='Sign in']"));
    loginbutton.click();
}}
