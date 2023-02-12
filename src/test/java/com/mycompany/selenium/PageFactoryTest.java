
package com.mycompany.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class PageFactoryTest {

    private WebElement driver;

    @FindBy(id="ma")
    private WebElement pp;

    @FindBy(xpath="")
    private WebElement ir;

    @BeforeMethod
    public void beforeMethod(){

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        //implicitly wait: waiting for all the web ele for this max time is 20


        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.mlcalc.com/");

    }
    @Test
    public void demoPageFactory(){

        PageFactory.initElements(driver,this);
        pp.clear();
        pp.sendKeys("60000");
    }
}

//