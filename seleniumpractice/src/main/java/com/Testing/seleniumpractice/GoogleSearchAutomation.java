package com.Testing.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutomation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Software Testing Interview Questions");
        searchBox.submit();

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}