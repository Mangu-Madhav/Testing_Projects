# Selenium TestNG Website Automation Project

## 📌 Project Overview

This project is developed using **Java, Selenium WebDriver, and TestNG** to automate testing of the **Hiking IT website**.

The test suite verifies different sections of the website and performs basic form interactions in the Contact section.

Website Tested:

https://www.hiking-it.com/

---

# 🚀 Technologies Used

* Java
* Selenium WebDriver
* TestNG
* ChromeDriver
* Eclipse IDE

---

# ✅ Test Cases Implemented

### Test Case 1: About Section Verification

**Method:**

```java
testAboutSection()
```

**Steps:**

1. Open the Hiking IT website.
2. Click on the **About** section.
3. Verify navigation.

---

### Test Case 2: Services Section Verification

**Method:**

```java
testServicesSection()
```

**Steps:**

1. Open the website.
2. Click on the **Services** section.
3. Verify navigation.

---

### Test Case 3: Contact Section Verification

**Method:**

```java
testContactSection()
```

**Steps:**

1. Open the website.
2. Navigate to the **Contact** section.
3. Enter:

   * Name
   * Email
   * Message
4. Verify that the fields accept user input successfully.

---

# 🔄 Test Execution Flow

### Before Every Test

```java
@BeforeMethod
```

* Launch Chrome browser.
* Maximize the browser window.
* Open:

```
https://www.hiking-it.com/
```

---

### Execute Test Methods

```java
@Test
```

The following tests are executed based on priority:

1. About Section Test
2. Services Section Test
3. Contact Section Test

---

### After Every Test

```java
@AfterMethod
```

* Close the browser using:

```java
driver.quit();
```


---

# Future Enhancements

* Implement Explicit Waits instead of Thread.sleep().
* Add Assertions for validation.
* Generate Extent Reports.
* Capture screenshots for failed test cases.
* Integrate with Maven and Jenkins for CI/CD.
* Follow the Page Object Model (POM) design pattern.

---

# Author

Developed using Java, Selenium WebDriver, and TestNG for learning and automation practice.
