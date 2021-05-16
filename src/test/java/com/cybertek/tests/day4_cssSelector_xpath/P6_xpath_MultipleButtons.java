package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MultipleButtons {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //System.out.println(button1);

        String actualText = resultText.getText();
        String expectedText = "Clicked on button one!";

        if(actualText.equals(expectedText)){
            System.out.println("Button one is displayed as expected");
        }else{
            System.out.println("It is not displayed as expected");
        }



    }
}
