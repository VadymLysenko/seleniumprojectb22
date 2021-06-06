package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P1_Library_Login {

    WebDriver driver;
    @Test
    public void login_link_count_test() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");
    }
}
