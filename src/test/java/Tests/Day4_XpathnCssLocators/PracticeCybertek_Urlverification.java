package Tests.Day4_XpathnCssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCybertek_Urlverification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailbox= driver.findElement(By.xpath("//input[@type='text']"));
        emailbox.sendKeys("zukhra2011@gmail.com");
        WebElement retrievebutton=driver.findElement(By.id("form_submit"));
        retrievebutton.click();
        String urlexpected="email_sent";
        String urlactual= driver.getCurrentUrl();
        if(urlactual.contains(urlexpected)){
            System.out.println("Verified.");
        }
        else{
            System.out.println("Not verified.");
        }
        String textboxexp= "Your e-mail's been sent!";
        WebElement actextbox= driver.findElement(By.xpath("//h4[@name='confirmation_message']"));
                actextbox.getText();
        System.out.println("actextbox = " + actextbox);

    }
}
