package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TelerikPage {

    public TelerikPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
