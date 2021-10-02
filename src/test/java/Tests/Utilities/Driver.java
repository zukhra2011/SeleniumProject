package Tests.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
    Creating the private constructor
    so this class is not reachable from outside
     */
    private Driver(){}
        //making our driver instance
        // private so that its not reachable from outside
        //of the class. We make it static, because we want it to run
        // before everything else, we will use it in a static method
        //
      private static WebDriver driver;

    //creating reusable utility method that will return
    // same "driver" instance everytime we call it

    public static WebDriver getDriver(){
        if(driver==null){
            String browserType= Configuration_Reader.getProperty("browser");
            switch(browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

        }}
//same driver instance will be returned every time we call Driver.getDriver(); method

return driver;
}

public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }

}


}

