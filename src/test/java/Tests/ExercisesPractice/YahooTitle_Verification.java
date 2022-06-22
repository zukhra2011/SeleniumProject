package Tests.ExercisesPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTitle_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.yahoo.com");
        String actualtitle=driver.getTitle();
        System.out.println("actualtitle = " + actualtitle);
        String expectedtitle="Yahoo!";
        System.out.println("expectedtitle = " + expectedtitle);
    if (expectedtitle==actualtitle){
        System.out.println("It matches");
    }
                else {
        System.out.println("Doesnt match");
    }
                driver.close();
    }
}