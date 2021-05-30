package com.cybertek.utilities;

// Task: new method creation
// Method name : getDriver
// Static method
// Accepts String argument: browserType
// - This arg will determine what type of browser is opened
// - if "chrome" passed --> it will open chrome browser
// - is firefox passed  --> it will open firefox browser
// Return Type: "webdriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();

        }else{
            System.out.println("Given browser type does not exist.  Driver = null");
            return null;
        }

    }







}
