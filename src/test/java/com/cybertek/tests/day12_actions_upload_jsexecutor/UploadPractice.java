package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test() {
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        String path = "/Users/waynelysenko/Desktop/pizzza.jpg";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        //sending the file path to the chooseFile WebElement
        BrowserUtils.sleep(3);

        chooseFile.sendKeys(path);

        //click to upload button
        uploadButton.click();

        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        Driver.closeDriver();
    }

}
