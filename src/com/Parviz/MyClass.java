package com.Parviz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/parvizalasgarov/Documents/SeleniumDependecies/drivers/chromedriver");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com/");
//
//        System.setProperty("webdriver.gecko.driver","/Users/parvizalasgarov/Documents/SeleniumDependecies/drivers/geckodriver");
//        WebDriver driver =new FirefoxDriver();
//
//        driver.get("https://www.google.com/");

    }
}

