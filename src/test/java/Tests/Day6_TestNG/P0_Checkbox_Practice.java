package Tests.Day6_TestNG;

import Tests.Day4_XpathnCssLocators.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_Checkbox_Practice {
    public static void main(String[] args) {
        WebDriver driver= WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com/checkboxes");
        WebElement  checkbox=driver.findElement(By.xpath("//input[@id='box1']"));
        if (!checkbox.isSelected()){
            System.out.println("Checkbox 1 not selected.Verification Passed");}
        else{
            System.out.println("Checkbox 2 is selected.Verification Failed.");
        }
        WebElement  checkbox2=driver.findElement(By.xpath("//input[@id='box2']"));
        if(checkbox2.isSelected()){
            System.out.println("Checkbox 2 is selected. Verification passed.");}
        else{
            System.out.println("Checkbox is not selected. Verification failed.");
        }
        checkbox.click();
        checkbox2.click();
        if(checkbox.isSelected()){
            System.out.println("Checkbox1 is selected.Verification Passed.");
        }
        else{
            System.out.println("Checkbox 1 is not selected.Verification failed.");
        }

        if(!checkbox2.isSelected()){
            System.out.println("Checkbox2 is not selected.Verification Passed.");
        }
        else{
            System.out.println("Checkbox 2 is  selected.Verification failed.");
        }

        driver.close();


    }



}
