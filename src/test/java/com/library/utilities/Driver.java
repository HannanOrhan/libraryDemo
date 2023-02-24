package com.library.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private  Driver(){}
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null) {
            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
              return driver;
    }

    public  static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
