package Tests.ExercisesPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cybertekschool.com");
        String expectedurl="cybertekschool";
        String actualurl=driver.getCurrentUrl();
        if(actualurl.contains(expectedurl)){
            System.out.println("It works!");
        }
        else{
            System.out.println("Not a match");
        }
        String expectedtitle="Practice";
        String actualtitle=driver.getTitle();
        if(actualurl==expectedurl){
            System.out.println("Match");
        }
        else {
            System.out.println("Not a match");
        }
    }
}
