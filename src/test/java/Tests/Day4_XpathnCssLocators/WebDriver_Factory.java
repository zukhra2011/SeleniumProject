package Tests.Day4_XpathnCssLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Factory {
    public static WebDriver getDriver( String browserType){
if(browserType.equalsIgnoreCase("chrome")) {
    WebDriverManager.chromedriver().setup();

    return new ChromeDriver();
}
else if( browserType.equalsIgnoreCase("firefox")){
    WebDriverManager.firefoxdriver().setup();
    return new FirefoxDriver();
}
    else{
    System.out.println("Given browser type doesnt exist.");
    return null;
}
}}
