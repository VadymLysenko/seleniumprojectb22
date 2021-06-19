package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsExecutor_test1() {

        // get the page http://practice.cybertekschool.com/infinite_scroll

        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        BrowserUtils.sleep(2);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are aloud to pass JavaScript functions.
        // this method is capable of accepting JS functions and apply that info our Java+Selenium code
        for (int i = 0; i < 10 ; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");
        }
        //this would go 750 pixels up
        js.executeScript("window.scrollBy(0, -750)");


    }
}
