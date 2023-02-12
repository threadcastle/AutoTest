package com.mycompany.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;


public class MLCalc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        //implicitly wait: waiting for all the web ele for this max time is 20


        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.mlcalc.com/");

        //locator:

        //id, name, linktext, partial linktext, tagname, classname, xpath, css selector

        //clear the purchase price field;

        WebElement purchasePrice = driver.findElement(By.id("ma"));

        purchasePrice.clear();
        purchasePrice.sendKeys("60000");


        driver.findElement(By.xpath("//form[@id='mortgageForm']//*[text()='Show advanced options']"));

        //new Select(driver.findElement(By.cssSelector("[name='sm']"))).selectByVisibleText("Mar");


        //new Select(driver.findElement(By.cssSelector("[name='sm']"))).("5");

        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("#mortgageForm [value='Calculate']")));

        driver.findElement(By.cssSelector("#mortgageForm [value='Calculate']")).click();

        //table[@id='summary']//tr//td//tbody//tr[1]//td[1]//div[@style='font-size: 32px']

        String payment = driver.findElement(
                By.xpath("//table[@id='summary']//tr//td//tbody//tr[1]//td[1]//div[@style='font-size: 32px']")).getText();
        double p = Double.parseDouble(payment.replaceAll("[$,]", ""));

        // System.out.println(monthlyPayment);

        if (p < 2000.00) {
            System.out.println("fail");
        } else {
            System.out.println("pass");
        }


        //get monthly intallment from the page;
        //check if the monthly installment is less than 2000.00, print fail else pass;
    }
}
