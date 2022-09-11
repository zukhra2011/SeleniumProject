package Tests.Day1_IntroSel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tesla.com");
        System.out.println(driver.getTitle());
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.close();

    }
}
