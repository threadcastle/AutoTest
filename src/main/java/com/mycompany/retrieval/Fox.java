package com.mycompany.retrieval;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Fox {


    static String clist_1 = "//h2[contains(@class, \"headline__3DHeu\") and text() =\"Drama Day & Night\"]";

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.of(60, ChronoUnit.SECONDS));
        driver.manage().timeouts().implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));

        driver.navigate().to("https://www.fox.com/");

        // //div[@id="6191b01b0345ba002030a829"]//a
        List<WebElement> rows = driver.findElements(By.xpath("//div[@id=\"6191b01b0345ba002030a829\"]//a"));

        rows.forEach(r->{
            String title = r.getAttribute("aria-label");

            System.out.println(title);
        });



        /*

            9-1-1: Lone Star, new
            Accused, new
            Alert: Missing Persons Unit, new
            The Resident, new
            9-1-1, new
            Fantasy Island, new
            The Cleaning Lady, new
            Monarch, new

         */















    }
}
