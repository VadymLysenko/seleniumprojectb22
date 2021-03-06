package com.cybertek.OfficeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MoneyGamingTask {

    @Test
    public void Task1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://moneygaming.qa.gameaccount.com/");



        WebElement joinButton = driver.findElement(By.xpath("a//[@class='newUser green]"));
        joinButton.click();

        WebElement titleElement = driver.findElement(By.id("title"));

        Select titleDropDown = new Select(titleElement);

        titleDropDown.selectByVisibleText("Mr");

        String expectedTitle = "Mr";
        String actualTitle = titleDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualTitle,expectedTitle,"verify the title");

        WebElement firstName = driver.findElement(By.xpath("//input[@name='map(firstName)']"));

        WebElement lastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));

        firstName.sendKeys("Mike");
        lastName.sendKeys("Smith");

        WebElement termBox = driver.findElement(By.xpath("//input[@name='map(terms)']"));
        termBox.click();

        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Join Now!']"));
        submitButton.click();

        String expectedError = "This field is required";
        String actualError = driver.findElement(By.xpath("//label[@for='dob']")).getText();

        Assert.assertEquals(actualError,expectedError,"verify DOB error message");



    }
}
