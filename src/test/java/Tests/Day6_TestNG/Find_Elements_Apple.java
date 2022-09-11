package Tests.Day6_TestNG;

import Tests.Day4_XpathnCssLocators.WebDriver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_Elements_Apple {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriver_Factory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");
        //Storing WebElements
        List<WebElement> headerLinks=driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        for(int eachLink=1; eachLink<headerLinks.size()-2; eachLink++){

            System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();
            Thread.sleep(1000);
            headerLinks=driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            //Getting all the titles.
            System.out.println("Current title in the page: "+driver.getTitle());
            List <WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
            System.out.println("Total number of links "+ allLinks.size());
            int linksWithText=0;
            int linksWithoutText=0;
            for (WebElement each : allLinks) {
                if(each.getText().isEmpty()){
                    linksWithoutText++;
                }
                else{
                    linksWithText++;
                }

            }

        }


    }
}
