package com.mycompany.pages;

import com.mycompany.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Result extends TestBase {

    private By monthlyPayment = By.xpath("//*[@id=\"summary\"]/tbody/tr/td/table/tbody/tr[1]/td[1]/div[1]");

    @FindBy
    WebElement result;
    public Result(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMonthyPayment(){
        explicitWAIT(ExpectedConditions.presenceOfElementLocated(monthlyPayment));

        return driver.findElement(monthlyPayment).getText();
    }

}
