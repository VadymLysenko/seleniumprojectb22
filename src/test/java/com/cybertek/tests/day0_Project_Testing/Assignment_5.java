package com.cybertek.tests.day0_Project_Testing;

import com.cybertek.pages.Vytrack_Assignment_5;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_5 {

    @Test(priority = 1)
    public void Vytrack_Login() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        Vytrack_Assignment_5 login = new Vytrack_Assignment_5();
        login.usernameInput.sendKeys("User177");
        login.passwordInput.sendKeys("UserUser123");
        login.submitButton.click();
        BrowserUtils.sleep(3);
    }

    @Test(priority = 2)
    public void test_Grid() {
        Vytrack_Assignment_5 grid = new Vytrack_Assignment_5();
        grid.fleet.click();
        grid.vehicle.click();
        grid.gridButtonClickable.click();
        BrowserUtils.sleep(2);


        System.out.println(grid.gridButtonClickable.getText());
        Assert.assertTrue(grid.gridButtonClickable.isEnabled());
    }
    @Test(priority = 3)
    public void refresh_button() {
        Vytrack_Assignment_5 refresh = new Vytrack_Assignment_5();
        refresh.refreshButton.click();
        Assert.assertTrue(refresh.refreshButton.isEnabled());
        BrowserUtils.sleep(2);

    }
    @Test(priority = 4)
    public void reset_button() {
        Vytrack_Assignment_5 reset = new Vytrack_Assignment_5();
        reset.resetButton.click();
        Assert.assertTrue(reset.resetButton.isEnabled());
        BrowserUtils.sleep(2);
    }
    @Test(priority = 5)
    public void grid_settings_button() {
        Vytrack_Assignment_5 gridSettings = new Vytrack_Assignment_5();
        gridSettings.gridSettings.click();
        Assert.assertTrue(gridSettings.gridSettings.isEnabled());
        BrowserUtils.sleep(2);
        
    }

}
