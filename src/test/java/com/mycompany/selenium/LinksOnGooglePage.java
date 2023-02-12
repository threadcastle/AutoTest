package com.mycompany.selenium;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.*;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.List;


public class LinksOnGooglePage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));

        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.google.com/");


        List<WebElement> links = driver.findElements(By.tagName("a"));


        int len = links.size();
        System.out.println(len);


        LinkedList<String> validurl = new LinkedList<>();

        //create a arraylist to store all the urls
        links.forEach(webElement -> {
            String url = webElement.getAttribute("href");

            //System.out.println(url);

            HttpURLConnection huc = null;

            try {
                huc = (HttpURLConnection) (new URL(url).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                int respCode = huc.getResponseCode();

                if (respCode >= 400) {
                    System.out.println(url + " is broken ");
                    validurl.add(url);
                } else {
                    System.out.println(url + " is valid ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        });

        if (validurl.isEmpty()) {
            System.out.println("there is no related broken link");
        } else {

            System.out.println("The Broken links are:");
            validurl.forEach((temp) -> {
                System.out.println(temp);
            });
        }


        //return the list of webelement


        //find all the broken link in google.com


        //driver.switchTo().alert().accept();

        //a page within a page i.e. a html within a html


        //driver.switchTo().frame().

        //jump to the original oage

        //driver.switchTo().defaultContent();

        //driver.findElement(By.id("")).sendKeys(Keys.);


    }
}
