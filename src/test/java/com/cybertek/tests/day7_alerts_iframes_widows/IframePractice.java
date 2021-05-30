package com.cybertek.tests.day7_alerts_iframes_widows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }
    @Test
    public void iframe_test() {

        //#1 - changing to iframe by index: we pass index number
        //driver.switchTo().frame(0);

        //#2 - locating web element to switch
        //we find and locate < iframe> web element from the page

        //#3 - if <iframe> tag has id or name attribute, we can pass its attribute value as a string into
        //.switch().frame() method directly

        //WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        driver.switchTo().frame("mce_0_ifr");

        //locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4. Assert: “Your content goes here.” Text is displayed.

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
    }
}