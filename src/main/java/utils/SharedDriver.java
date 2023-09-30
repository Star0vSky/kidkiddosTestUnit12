package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver {

    private static WebDriver webDriver;

    protected static WebDriver getWebDriver(WebDriver webDriver){
//        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

//       SharedDriver.webDriver = new ChromeDriver();
        SharedDriver.webDriver = new FirefoxDriver();

        SharedDriver.webDriver.manage().window().maximize();
        SharedDriver.webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        return SharedDriver.webDriver;
    }

    protected static void closeDriver(){
        if(webDriver!=null) {
            webDriver.close();
        }
    }

}
