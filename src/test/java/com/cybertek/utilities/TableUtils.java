package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtils {

    public static void verifyOrder(WebDriver driver, String name) {

        //locate all the names and store them in a List of WebElements
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));

        //to introduce local variable
        //mac: option+enter
        //windows : alt+enter

        for(WebElement each : allNames) {
            if(each.getText().equals(name)){
                Assert.assertTrue(true);
                return;
            }
        }
        Assert.assertTrue(false, "name does not exist in the list");


    }
}
