package Tests.Day4_XpathnCssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Orders_Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       String expectedtitle="Web Orders Login";
       String actualtitle=driver.getTitle();
       if(actualtitle.equals(expectedtitle)){
           System.out.println("Title is verified");
       }
       else{
           System.out.println("Title isn't verified.");
       }
       WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
       username.sendKeys("Tester");
       WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
       password.sendKeys("test");
       driver.findElement(By.id("ctl00_MainContent_login_button")).click();
       Thread.sleep(3000);
       String newexptitle= "Web Orders";
       String newacttitle= driver.getTitle();
       if(newacttitle==newexptitle){
           System.out.println("Title is verified.");
       }
       else{
           System.out.println("Title not verified.");
       }


    }
}
