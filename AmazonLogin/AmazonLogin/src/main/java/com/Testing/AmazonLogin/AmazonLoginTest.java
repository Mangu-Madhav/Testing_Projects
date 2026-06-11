			
						//Basic script(java)

package com.Testing.AmazonLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginTest {

    public static void main(String[] args) throws InterruptedException {

        // 1. Open Chrome using object of ChromeDriver
        WebDriver driver = new ChromeDriver();

        System.out.println("opening");
        
     // once browser is opened Maximize it
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        // 2. open Amazon website using url
        driver.get("https://www.amazon.in");
        
        System.out.println("sign");
        Thread.sleep(3000);
   
        // 3. Click Sign-In to sign-in into amazon
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        System.out.println("Clicked on sign");
        Thread.sleep(4000);
        System.out.println("enter mail");

        // 4. Then enter Username (Email or Mobile)
        driver.findElement(By.id("ap_email_login")).sendKeys("9392374751");
        System.out.println("Entered username");

        // Click Continue
        driver.findElement(By.id("continue")).click();
        System.out.println("password");
        Thread.sleep(3000);
        
        // Enter Password
        driver.findElement(By.id("ap_password")).sendKeys("A1b2c3d4");
        System.out.println("Entered Password");

        // 5. Click Submit (Sign In)
        driver.findElement(By.id("signInSubmit")).click();
        // Wait for few seconds
        Thread.sleep(3000);
        
        System.out.println("Exiting...");
        // 6. Close Browser
        driver.quit();
    }
}