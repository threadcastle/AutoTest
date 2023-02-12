package com.mycompany;

import com.mycompany.config.configs;
import com.mycompany.driver_factory.DriverFactory;
import com.mycompany.pages.MLCalcHome;
import com.mycompany.pages.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestBase {


    //common codes can be used everywhere

    protected WebDriver driver; //accessible for a sub class
    private String originalWin;
    private String browser;
    protected MLCalcHome mlCalcHome;
    protected Result result;

    @BeforeMethod
    public void setUp(){

        driver = DriverFactory.getWebDriver(configs.BROWSER);
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(configs.MEDIUM_WAIT, ChronoUnit.SECONDS));
        driver.manage().window().maximize();
        driver.navigate().to(configs.URL);
        originalWin = driver.getWindowHandle();

        createObjPage();
    }

    @AfterMethod
    public void afterTest(){
        driver.quit();
    }

    public void clearandSenKeys(By by, String toType){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(toType);

    }


    public void explicitWAIT(ExpectedCondition<WebElement> by){
        new WebDriverWait(driver, Duration.ofSeconds(configs.MEDIUM_WAIT)).until(by);
    }


    public void createObjPage(){
        mlCalcHome = new MLCalcHome(driver);
        result = new Result(driver);
    }

}















