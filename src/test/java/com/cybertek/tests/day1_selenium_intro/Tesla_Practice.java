package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tesla_Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");

        String expectedTitle = "Electric Cars, Solar & Clean Energy | Tesla";
        System.out.println("expectedTitle = " + expectedTitle);

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title expected >>> Verification Passed");
        }else{
            System.out.println("Title not expected >>> Verification Failed");
        }
        driver.close();
    }
}
