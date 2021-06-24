package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void p2_double_click_test() {
        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch to iframe.
        //3. Double click on the text “Double-click me to change my text color.”
        //4. Assert: Text’s “style” attribute value contains “red”.


    }
}
