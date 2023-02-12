package com.mycompany.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Espncricinfo {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        //driver.navigate().to("https://www.amazon.com/");

        driver.navigate().to("https://www.espncricinfo.com/");

        driver.findElement(
                By.xpath("//a[@class=\"ds-inline-flex ds-items-start ds-leading-none ds-mr-4\"]//span[contains(string(), \"Table\")][1]")).click();


////tbody[@class="ds-text-center"]//tr[@class="ds-text-tight-s"]
//tbody[@class="ds-text-center"]//tr[@class="ds-text-tight-s"]|//tbody[@class="ds-text-center"]//tr[@class="ds-text-tight-s ds-bg-ui-fill-hover"]
////tbody[@class="ds-text-center"]//tr[starts-with(@class, "ds-text-tight-s")]

        ////tbody[@class="ds-text-center"]//tr[starts-with(@class, "ds-text-tight-s")][2]//td
        int len = driver.findElements(By.xpath("//tbody[@class=\"ds-text-center\"]//tr[starts-with(@class, \"ds-text-tight-s\")]")).size();


        System.out.println(len);

        List<WebElement> row = driver.findElements(By.xpath("//tbody[@class=\"ds-text-center\"]//tr[starts-with(@class, \"ds-text-tight-s\")]"));

        String cf = "//tbody[@class=\"ds-text-center\"]//tr[starts-with(@class, \"ds-text-tight-s\")][";
        String cl = "]//td";
        String c;

        List<WebElement> tc;
        for (int i = 1; i <= len; i++) {

            c = cf + i + cl;
            tc = driver.findElements(By.xpath(c));

            for (int j = 0; j < tc.size(); j++) {
                System.out.print(tc.get(j).getText() + " ");

            }
            System.out.println();


        }


    }
}
