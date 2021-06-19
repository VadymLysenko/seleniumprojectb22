package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test() {
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        String path = "/Users/waynelysenko/Desktop/pizzza.jpg";


    }

}
