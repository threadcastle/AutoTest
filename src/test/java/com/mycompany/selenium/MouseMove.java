package com.mycompany.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class MouseMove {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.amazon.com/");


        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("//div[text()=\"EN\"]")))
                .build().perform();

        driver.findElement(By.cssSelector("a.nav-link .icp-radio")).click();

        //create a actions class, then .moveToElement, with drive.findElement.build.perform


    }
}
