package com.cybertek.tests.day3_reviews_prctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement header = driver.findElement(By.className("_8eso"));
        // short cut for auto-generating variable type
        //option + enter --> mac
        //alt + enter    --> windows

        Thread.sleep(3000);
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();
        // create webelement getting the text

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed!");
        }else{
            System.out.println("Header verification failed!!!");
        }



    }
}
