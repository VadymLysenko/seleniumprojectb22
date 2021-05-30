package com.cybertek.tests.day7_alerts_iframes_widows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void tc1_simple_dropdown_test() {

        /*
        Verify “Simple dropdown” default selected value is correctExpected:
        “Please select an option”
        */
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));


        //doing everything in one line
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(),"Please select an option");

        /*
        4.Verify“State selection” default selected
        value is correctExpected: “Select a State”
         */
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdownText = "Select a State";

        Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);

    }

    @Test
    public void tc2_state_dropdown_test() {

        //locating state dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));


        //3.Select Illinois

        stateDropdown.selectByVisibleText("Illinois");

        //4.Select Virginia

        stateDropdown.selectByValue("VA");

        //5.Select California
        //6. Verify final selected option is California.Use all Select options.(visible text, value, index)


    }
    @AfterClass
    public void teardownClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();

    }


}
