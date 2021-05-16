package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1-setup thr browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of selenium web driver
        //tjis line open the browser
        WebDriver driver  = new ChromeDriver();

        driver.manage().window().maximize();

        //3 - get the page Tesla.com
        driver.get("http://www.tesla.com");
        System.out.println("Current title:" + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        Thread.sleep(3000);
        //putting 3 sec
        Thread.sleep(3000);
        //Going back using navigations

        driver.navigate().back();

        // Going forward using navigations
        driver.navigate().forward();
        Thread.sleep(3000);

        //refreshing the page
        driver.navigate().refresh();

        //Going to another URL .to() method
        driver.navigate().to("https://www.google.com");


        System.out.println("Current title:" + driver.getTitle());
        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        // this line basically maximize page size

        // this method will close currently opened browser
        //1 browser or one code
        driver.close();

        //driver().quit();
        driver.quit();




    }
}
