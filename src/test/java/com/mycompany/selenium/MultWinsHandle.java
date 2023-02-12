package com.mycompany.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Set;


public class MultWinsHandle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.mlcalc.com/");

        //new WebDriverWait(driver,Duration.ofSeconds(30).until(ExpectedConditions.elementToBeClickable("[value=\"Check Today's Mortgage Rates\"]")));
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mortgageForm\"]//tbody/tr[12]/td/input")));


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String script = "document.querySelector(\"input[type='button']\").click()";
        jse.executeScript(script);


        //

        //code to switch to second win/tab
        driver.manage().window().maximize(); //open the full wins

        String firstWin = driver.getWindowHandle();
        System.out.println("first win:" + firstWin);

        driver.findElement(By.xpath("//*[@id=\"mortgageForm\"]//tbody/tr[12]/td/input")).click();


        Set<String> allWins = driver.getWindowHandles();
        allWins.remove(firstWin);


        String secondWin = allWins.stream().findFirst().get();
        System.out.println("second win:" + secondWin);


        driver.switchTo().window(secondWin);

        driver.findElement(By.partialLinkText("Alabama")).click();
        driver.quit();


        //how to switch to the second, get the second by removing the first win

        //document.querySelector("input[type='button']").click()

        //using javaExecutor to execute the javascript window.Scroll tool


    }
}
