package com.cybertek.tests.day3_reviews_prctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        //Locating the web element using id locator and storing it in WebElement type.
        WebElement inputUsername = driver.findElement(By.id("email"));

        inputUsername.sendKeys("semothing@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));

        inputPassword.sendKeys("Some wrong password " + Keys.ENTER);

        //freezing the code for 5 seconds so that Chrome browser can catch up with loading the page
        Thread.sleep(5000);

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!!!");

        }
    }
}
