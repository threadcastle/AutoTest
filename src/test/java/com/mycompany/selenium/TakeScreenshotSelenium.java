package com.mycompany.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.io.File;

public class TakeScreenshotSelenium {

    static WebDriver driver;

    public static void main(String[] args) throws IOException {

        //this is the cross browser

        String browser = "chrome";
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


        //WebDriverManager.chromedriver().setup();

        //ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));
        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));
        driver.navigate().to("https://www.mlcalc.com/");


        //TakesScreenshot
        //cross browser testing, using polumorphysm

        //i keep a web browser as a string, if FireFox

        //Webdriver new FirefoxDriver


        TakesScreenshot ts = (TakesScreenshot) driver;

        File screentShot = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screentShot, new File("target/img.jpeg"));


    }
}
