package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniuTest {

    public static void main(String[] args) {

        // 1 - ste up web driver
        WebDriverManager.chromedriver().setup();

        // 2 - create the instance of chrome driver
        WebDriver driver = new ChromeDriver();

        // 3 - test if driver is working
        driver.get("https://www.facebook.com");


    }


}
