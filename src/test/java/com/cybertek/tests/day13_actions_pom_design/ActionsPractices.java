package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void p2_double_click_test() {
        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame("iframeResult");
        //Locating the text "Double-click" me to change me text color."
        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));
        //3. Double click on the text “Double-click me to change my text color.”
        Actions actions = new Actions(Driver.getDriver());
        //use the 'actions' object double click to already located web element
        BrowserUtils.sleep(2);
        actions.doubleClick(textToDoubleClick);
        actions.perform();

        //4. Assert: Text’s “style” attribute value contains “red”.


    }
}