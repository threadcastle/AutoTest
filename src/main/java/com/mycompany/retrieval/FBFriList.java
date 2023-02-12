package com.mycompany.retrieval;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class FBFriList {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));
        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));


        driver.navigate().to("https://www.facebook.com/");


        WebElement e = driver.findElement(By.id("email"));

        e.clear();
        e.sendKeys("threadcart@outlook.com");


        WebElement p = driver.findElement(By.id("pass"));

        p.clear();
        p.sendKeys("fekzeG-1cojbu-gakcug");



        WebElement login = driver.findElement(By.xpath("//button[@value=\"1\"]"));

        login.click();


        driver.navigate().to("https://www.facebook.com/friends/list");

        // //div[@class="x135pmgq"]//div[@data-visualcompletion="ignore-dynamic"]



        List<WebElement> friends = driver.findElements(By.xpath("//div[@class=\"x135pmgq\"]//div[@data-visualcompletion=\"ignore-dynamic\"]"));

        for(int i = 0; i<friends.size(); i++){


            WebElement info = friends.get(i);

            System.out.println(info.getText());
        }




    }
}
