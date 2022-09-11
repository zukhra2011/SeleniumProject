package Tests.Day5_Findelement_s;

import Tests.Day4_XpathnCssLocators.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC_0_FindElements {
    public static void main(String[] args) {
        WebDriver driver= WebDriver_Factory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.merriam-webster.com/");
        List<WebElement> texts = driver.findElements(By.xpath("//body//a"));
        for (WebElement each: texts){
            System.out.println(each.getAttribute("href"));
            System.out.println(each.getText());
        }
        int numberoflinks=texts.size();
        System.out.println(numberoflinks);

    }
}
