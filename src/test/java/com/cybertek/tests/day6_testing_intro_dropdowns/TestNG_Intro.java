package com.cybertek.tests.day6_testing_intro_dropdowns;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @BeforeMethod
    public void setupMethod() {
        System.out.println("---> before method is running...");
    }

    @Test
    public void test1() {
        System.out.println("Running test 1...");
    }

    @Test
    public void test2() {
        System.out.println("Running test 2...");
    }

}
