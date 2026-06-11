package com.Testing.TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;

    // Runs before every test method
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser opened");
    }

    // Test Method 1
    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Google opened");
    }

    // Test Method 2
    @Test
    public void openAmazon() {
        driver.get("https://www.amazon.in");
        System.out.println("Amazon opened");
    }

    // Test Method 3
    @Test
    public void openFacebook() {
        driver.get("https://www.facebook.com");
        System.out.println("Facebook opened");
    }

    // Runs after every test method
    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed");
    }
}

