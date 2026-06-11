
				//			Task 4: TestNG Practice

package com.Testing.TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebsiteTest {

    WebDriver driver;

    // Runs before every test
    @BeforeMethod
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // To open hiking it website
        driver.get("https://www.hiking-it.com/");

        System.out.println("Website opened");
        Thread.sleep(2000);
    }

    // Test Case 1 - To test "About-section" of Hiking IT website
    @Test(priority = 1)
    public void testAboutSection() throws InterruptedException {

        driver.findElement(By.id("comp-l6g2zxyo1label")).click();
        System.out.println("About section clicked");
        Thread.sleep(2000);
    }

    // Test Case 2 - To test "Services section" of Hiking IT website
    @Test(priority = 2)
    public void testServicesSection() throws InterruptedException {
    	
    	Thread.sleep(2000);
        driver.findElement(By.id("comp-l6g2zxyo2label")).click();
        System.out.println("Services section clicked");
        Thread.sleep(2000);
    }

    // Test Case 3 - To test "contact-Section" of Hiking IT Website
    @Test(priority = 3)
    public void testContactSection() throws InterruptedException {

        Thread.sleep(2000);

        // Click Contact section
        driver.findElement(By.id("comp-l6g2zxyo3label")).click();   
        System.out.println("Contact section opened");

        Thread.sleep(2000);

        // Enter Name
        driver.findElement(By.id("input_comp-l6g32lta")).sendKeys("Ram");  
        System.out.println("Name entered");

        // Enter Email
        driver.findElement(By.id("input_comp-l6g32ltp")).sendKeys("practice@test.com");  

        // Enter Message
        driver.findElement(By.id("textarea_comp-l6g32lu4")).sendKeys("Hello, I need more information."); 
        System.out.println("Message entered");

       
        Thread.sleep(2000);
    }

    // Runs after every test
    @AfterMethod
    public void tearDown() {

        driver.quit();
        System.out.println("Browser closed");
    }
}