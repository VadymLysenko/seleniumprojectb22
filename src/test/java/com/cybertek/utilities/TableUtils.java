package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TableUtils {

    public static void verifyOrder(WebDriver driver, String name) {

        //locate all the names and store them in a List of WebElements
        driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));


    }
}
