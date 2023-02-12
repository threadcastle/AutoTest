package com.mycompany.driver_factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    //ThreadLocal

    public static WebDriver getWebDriver(String browser){

        WebDriver driver;

        //String browser = "chrome";
        switch (browser) {

            case "chrome": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }


            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            }

            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();


        }

        return driver;


    }
}
