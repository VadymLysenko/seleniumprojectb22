package com.cybertek.pages;


import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Vytrack_Assignment_5 {
    public Vytrack_Assignment_5() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleet;

    @FindBy(xpath = "//span[@class='title title-level-2']")
    public WebElement vehicle;

    @FindBy(xpath = "//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public WebElement gridButtonClickable;

    @FindBy(xpath = "//i[@class=\"fa-repeat\"]/..")
    public WebElement refreshButton;

    @FindBy(xpath = "//a[contains(@class,'reset-action')]")
    public WebElement resetButton;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettings;


}
