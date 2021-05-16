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
    public static void main(String[] args) {
        getDriver("chrome");

    }

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            //WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("https://google.com");
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return new FirefoxDriver();
        } else {
            System.out.println("browser type not exist");
            return null;
        }
    }


}