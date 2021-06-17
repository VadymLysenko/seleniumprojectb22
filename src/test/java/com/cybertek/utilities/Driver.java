package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    /*
    Creating the private constructor so this class object
    is not reachable from outside
     */
    private Driver() {}

    /*
    Making our driver instance private so that it is not reachable from outside of the class
    We make it static, because we want it run it before everything else, and we will use it in static method
     */
    private static WebDriver driver;
}
