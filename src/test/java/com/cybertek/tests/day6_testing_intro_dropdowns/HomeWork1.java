package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomeWork1 {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));


        //WebElement option1 = driver.findElement(By.xpath(""));

        Select option1 = new Select(simpleDropdown);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        option1.selectByVisibleText("Option 1");

        WebElement selectOption = driver.findElement(By.id("Please select an option"));
        selectOption.click();






    }
}
