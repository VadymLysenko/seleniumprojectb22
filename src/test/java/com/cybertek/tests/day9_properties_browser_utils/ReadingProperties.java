package com.cybertek.tests.day9_properties_browser_utils;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() {

        //#1 - Create object of properties class (coming from java lib)

        Properties properties = new Properties();

        //#2 - Open the file using FileInputStream
        FileInputStream file = new FileInputStream();
    }

}
