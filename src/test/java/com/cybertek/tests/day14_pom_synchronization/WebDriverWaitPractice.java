package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.DynamicLoad1Page;
import com.cybertek.pages.DynamicLoad7Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {

    @Test
    public void dynamic_loading_7_test() {

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        // use the object to wait for the explicit condition
        wait.until(ExpectedConditions.titleIs("Dynamic title"));



        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());
    }

    @Test
    public void dynamic_loading_1_test() {
        //TC#41 : Dynamically Loaded Page Elements 1
        //1. Go to http://practice.cybertekschool.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        // 2. Click to start
        dynamicLoad1Page.startButton.click();

        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.inputUsername.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoad1Page.inputUsername.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoad1Page.inputPassword.sendKeys("incorrectPassword");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());

        //Note: Follow POM Design Pattern
    }
}
