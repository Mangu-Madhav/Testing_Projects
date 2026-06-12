# Google Search Automation using Selenium

## 📌 Project Overview

This project is a **basic Selenium WebDriver automation project** built using **Java**. It automates a simple **Google Search operation** by launching Chrome browser, opening Google, searching for a keyword, and displaying the page title in the console.

This project is useful for beginners who want to learn:

* Selenium WebDriver basics
* Browser automation using Java
* Web element handling
* Google search automation
* Selenium locators (`By.name()`)

---

## 🛠️ Technologies Used

* **Java**
* **Selenium WebDriver**
* **ChromeDriver**
* **Maven**
* **Eclipse IDE**

---


## 🚀 Features

✅ Launches Chrome browser automatically

✅ Opens Google website

✅ Maximizes browser window

✅ Searches for a keyword automatically

✅ Submits search request

✅ Displays page title in console

✅ Closes browser automatically

---

## 🧪 Automated Test Flow

The automation script performs the following steps:

1. Launch Chrome browser
2. Open Google website (`google.com`)
3. Maximize browser window
4. Locate search box using `By.name("q")`
5. Enter search keyword
6. Submit search automatically
7. Print page title in console
8. Close browser

---


## ⚙️ Prerequisites

Before running the project, ensure the following are installed:

### 1. Java JDK

Install Java JDK (8 or above)

### 2. Maven

Install Maven and configure environment variables.

Verify installation:

```bash id="mg5jz0"
mvn -version
```

### 3. Google Chrome Browser

Install the latest version of Google Chrome.

### 4. ChromeDriver

Ensure ChromeDriver version matches your installed Chrome browser version.

---

## 📦 Maven Dependency

Add Selenium dependency in your `pom.xml` file:

```xml id="0q3w77"
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
```
---

## 🔮 Future Improvements

You can improve this project by adding:

* Explicit waits (`WebDriverWait`)
* Multiple search keywords
* Screenshot capture
* Search result validation
* TestNG integration
* Page Object Model (POM)

---

## 👨‍💻 Author

**Madhav**
Java Full Stack Developer | Selenium Automation Learner

---

⭐ If you found this project useful, consider giving it a star on GitHub!
