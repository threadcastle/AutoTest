package com.mycompany.pages;
import com.mycompany.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MLCalcHome extends TestBase {


    private By purchasePrice = By.id("ma");
    private By submit = By.xpath("//form[@id='mortgageForm']//*[text()='Show advanced options']");
    //
    public MLCalcHome(WebDriver driver){
        this.driver = driver;
    }


    public Result fillDetails(String pp){
        clearandSenKeys(purchasePrice, pp);

        //explicitWAIT(ExpectedConditions.elementToBeClickable(submit));
        driver.findElement(submit).click();

        return new Result(driver);

        //        ExpectedConditions.elementToBeClickable(By.id(""));
    }














}
