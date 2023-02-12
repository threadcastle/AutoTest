package com.mycompany.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class GoogleResult {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.google.com/");

        WebElement searchtxt = driver.findElement(By.cssSelector("input[class=\"gLFyf\"]"));
        searchtxt.clear();
        searchtxt.sendKeys("bangalore");
        searchtxt.sendKeys(Keys.ENTER);


        String total = driver.findElement(By.id("result-stats")).getText();

        System.out.println(total);

        String result = driver.findElement(By.xpath("//div[@class=\"hlcw0c\"]//div[@class='VwiC3b yXK7lf MUxGbd yDYNvb lyLwlc']//span[1]"))
                .getText();

        System.out.println(result);

        ////div[@class="hlcw0c"]//div[@class='VwiC3b yXK7lf MUxGbd yDYNvb lyLwlc']//span[1]

    }
}
