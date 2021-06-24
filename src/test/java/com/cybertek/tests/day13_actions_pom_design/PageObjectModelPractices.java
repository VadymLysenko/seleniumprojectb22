package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {

@Test
    public void negative_login_to_library(){

    //1- Go to library
    Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
    LibraryLoginPage loginPage = new LibraryLoginPage();


    //2- Enter incorrect username
   loginPage.inputEmail.sendKeys("wrong@gmail.com");

    //3- Enter incorrect password
   loginPage.inputPassword.sendKeys("wrong password");

    //4- Verify error message is displayed
    loginPage.signInButton.click();
    Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());
}

}
