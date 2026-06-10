# Amazon Login Automation Testing Project

## 📌 Overview

This project is a **Selenium WebDriver automation testing project** built using **Java** and **Maven**. It automates the **Amazon login workflow** by launching Chrome, opening Amazon India, navigating to the Sign-In page, entering credentials, and performing login actions.

The project is created for learning and practicing:

* Selenium WebDriver
* Browser automation testing
* Java automation scripting
* Maven project structure
* Element locators in Selenium

---

## 🛠️ Technologies Used

* **Java**
* **Selenium WebDriver**
* **ChromeDriver**
* **Maven**
* **Eclipse IDE**

---

## 📂 Project Structure

```plaintext
AmazonLogin/
│── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── Testing/
│   │               └── AmazonLogin/
│   │                   ├── AmazonLoginTest.java
│   │                   └── App.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── Testing/
│                   └── AmazonLogin/
│                       └── AppTest.java
│
│── target/
│── pom.xml
│── README.md
```

---

## 🚀 Features

✅ Opens Chrome Browser automatically

✅ Maximizes browser window

✅ Navigates to Amazon India website

✅ Clicks on **Sign In**

✅ Enters mobile number/email

✅ Clicks Continue button

✅ Enters password

✅ Performs Sign In action

✅ Closes browser automatically

---

## 🧪 Automated Test Flow

The automation script performs the following steps:

1. Launch Chrome browser
2. Maximize browser window
3. Open Amazon website (`amazon.in`)
4. Click on **Sign-In**
5. Enter email/mobile number
6. Click **Continue**
7. Enter password
8. Click **Sign In**
9. Close browser

---

## ⚙️ Prerequisites

Before running the project, make sure you have installed:

### 1. Java JDK

Install Java (JDK 8 or above)

### 2. Maven

Ensure Maven is installed and configured.

Check version:

```bash
mvn -version
```

### 3. Google Chrome Browser

Install the latest Chrome browser.

### 4. ChromeDriver

Make sure ChromeDriver version matches your Chrome browser version.

---

## 📦 Maven Dependency

Add Selenium dependency in `pom.xml`:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
```

---

## ▶️ How to Run the Project

### Clone the Repository

```bash
git clone https://github.com/your-username/AmazonLogin.git
```

### Open in Eclipse

* Open **Eclipse IDE**
* Import the project as **Existing Maven Project**

### Install Dependencies

Maven will automatically download dependencies.

Or run:

```bash
mvn clean install
```

### Run the Automation Script

Navigate to:

```plaintext
src/main/java/com/Testing/AmazonLogin/
```

Run:

```plaintext
AmazonLoginTest.java
```

## 🎯 Learning Outcomes

By building this project, you will learn:

* Selenium WebDriver basics
* Browser automation using Java
* Handling web elements using `By.id()`
* Browser actions and navigation
* Maven project management
* Automated testing workflow

---

## 👨‍💻 Author

**Madhav**
Java Full Stack Developer | Selenium Testing Learner

---

### ⭐ If you found this project useful, give it a star on GitHub!
