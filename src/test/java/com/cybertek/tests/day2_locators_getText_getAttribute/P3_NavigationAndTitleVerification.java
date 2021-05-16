package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Gmail")).click();

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
        driver.navigate().back();
        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle = "Google";

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Title Passed!");
        }else{
            System.out.println("Title Failed!");

        }
    }
}
