package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findElements {

    public static void main(String[] args) {


        /*
        Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_password
        3. Print out the texts of all links
        4. Print out how many total link
        */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password ");

        List<WebElement> linksOfLinks = driver.findElements(By.xpath("a"));

        for (WebElement each : linksOfLinks) {

            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));


        }

        int numberOfLinks = linksOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);




    }
}
