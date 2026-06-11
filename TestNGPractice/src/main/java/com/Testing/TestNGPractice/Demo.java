package com.Testing.TestNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	WebDriver driver;
	
	@BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser opened");
	}
        
	 @Test
	    public void openGoogle() {
	        driver.get("https://www.google.com");
	        System.out.println("Google opened");
	    }
	
	
	
	
	 @AfterMethod
	    public void tearDown() {
			driver.quit();
	        System.out.println("Browser closed");
	    }
}
