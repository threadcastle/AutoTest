package com.mycompany.retrieval;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class AmzCart {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));
        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.amazon.com/");


        WebElement item1 = driver.findElement(By.id("twotabsearchtextbox"));

        item1.clear();
        item1.sendKeys("toy");

        WebElement ser1 = driver.findElement(By.id("nav-search-submit-button"));

        ser1.click();
        // nav-search-submit-button


        // //div[@data-asin="B09RQ67B4T" and @data-index="1"]
        // //div[@class="s-main-slot s-result-list s-search-results sg-row"]//div[@data-index="1"]

        WebElement ser1_enter = driver.findElement(By.xpath("//div[@class=\"s-main-slot s-result-list s-search-results sg-row\"]//div[@data-index=\"3\"]"));

        ser1_enter.click();



        WebElement item1_add = driver.findElement(By.id("add-to-cart-button"));
        item1_add.click();




        WebElement item2 = driver.findElement(By.id("twotabsearchtextbox"));

        item2.clear();
        item2.sendKeys("doll");

        WebElement ser2 = driver.findElement(By.id("nav-search-submit-button"));

        ser2.click();
        // nav-search-submit-button


        // //div[@data-asin="B09RQ67B4T" and @data-index="1"]
        // //div[@class="s-main-slot s-result-list s-search-results sg-row"]//div[@data-index="1"]

        WebElement ser2_enter = driver.findElement(By.xpath("//div[@class=\"s-main-slot s-result-list s-search-results sg-row\"]//div[@data-index=\"3\"]"));

        ser2_enter.click();



        WebElement item2_add = driver.findElement(By.id("add-to-cart-button"));
        item2_add.click();


        WebElement cart = driver.findElement(By.id("nav-cart-count-container"));
        cart.click();

        // //span[@class="a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold"]
        List<WebElement> allitems = driver.findElements
                (By.xpath("//span[@class=\"a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold\"]"));


        int number = allitems.size();

        for (int i=0; i<number; i++){
            String p = allitems.get(i).getText();
            System.out.println("the price of "+i+"is: "+p);
        }


        WebElement total = driver.findElement(By.xpath("//span[@id=\"sc-subtotal-amount-buybox\"]//span"));
        String pricetotal = total.getText();

        System.out.println("the total price is: "+ pricetotal);

        // nav-search-submit-button

        /*
        the price of 0is: $25.99
the price of 1is: $6.99
the total price is: $32.98
         */

    }
}
