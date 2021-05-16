package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement amazonSearchBar = driver.findElement(By.cssSelector
                ("input#twotabsearchtextbox"));

        amazonSearchBar.sendKeys("wooden plate"+ Keys.ENTER);

        if(driver.getTitle().contains("wooden plate")){
            System.out.println("Test passing wooden plate found and YAY");
        }else{
            System.out.println("Test failed!!!");
        }
    }
}
