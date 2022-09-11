package Tests.Day5_Findelement_s;

import Tests.Day4_XpathnCssLocators.WebDriver_Factory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElement_xpath_checkboxes {
    public static void main(String[] args) {
        WebDriver driver= WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password");
        List<WebElement> listofLinks=driver.findElements(By.xpath("//body//a"));
        for(WebElement each:listofLinks){
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }
       int numberoflinks= listofLinks.size();
        System.out.println("numberoflinks = " + numberoflinks);


    }
}
