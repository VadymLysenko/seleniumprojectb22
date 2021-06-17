package com.cybertek.tests.day10_webtable_properties_review;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Task3 {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        String browser = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }

    @Test
    public void task3_return_tims_due_amount() {
        String url = ConfigurationReader.getProperty("dataTableUrl");
        driver.get(url);

        //table[@id='table1']//td[.='Tim']/../td[4]
        //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";
        Assert.assertEquals(actualTimResult, expectedTimResult,
                "Tim's cell is not returning as expected");


    }
    @Test
    public void task4_verify_order_method() {
        TableUtils.verifyOrder(driver,"Tim");
    }
}
