package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover() {


        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //locating all of the images here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        BrowserUtils.sleep(2);


        //we must create object of actions class to use method coming from there
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(img1).perform();

        Assert.assertTrue(user1.isDisplayed(),"User1 text is not displayed. FAIL!!!");

        BrowserUtils.sleep(1);

        actions.moveToElement(img2).perform();

        Assert.assertTrue(user2.isDisplayed(),"User2 text is not displayed. FAIL!!!");

        //command + d : for copy pasting current line
        //command + shift + d up/down arrow : move up and down
        BrowserUtils.sleep(1);

        actions.moveToElement(img3).perform();

        Assert.assertTrue(user3.isDisplayed(),"User3 text is not displayed. FAIL!!!");

    }
    @Test
    public void scrolling_test(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");

        //scroll down to "Cybertek School"
        Actions actions = new Actions(Driver.getDriver());

        // locate "Powered by Cybertek School"
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        //Scroll using actions objects
        BrowserUtils.sleep(2);
        actions.moveToElement(cybertekSchoolLink).perform();



    }
}
