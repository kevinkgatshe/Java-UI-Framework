# JavaFramework — Selenium Test Automation Framework

---

## Overview

This is a Java-based UI test automation framework built with Selenium WebDriver and JUnit 5. The framework is designed to automate end-to-end browser interactions on web applications in a structured, maintainable, and scalable way. It follows the **Page Object Model (POM)** design pattern, separating page logic from test logic to ensure clean, reusable, and easy-to-maintain code.

The framework is currently being developed and tested against the [The Internet - Herokuapp](https://the-internet.herokuapp.com/), a publicly available web application commonly used for practising automation testing.

---

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| Selenium WebDriver 4.41.0 | Browser automation |
| JUnit 5 (5.10.2) | Test execution and assertions |
| WebDriverManager 6.3.3 | Automatic browser driver management |
| Maven | Dependency management and build tool |
| IntelliJ IDEA | Development IDE |
| Git & GitHub | Version control and collaboration |

---

## Framework Design

The framework is built around three core principles:

**1. Page Object Model (POM)**
Each web page has its own dedicated Java class that contains the page's locators and interaction methods. This keeps test code clean and ensures that any UI changes only need to be updated in one place.

**2. Base Class Inheritance**
- `BasePage` — contains all reusable Selenium action methods (click, sendKeys, getText, dropdown selection, navigation) that all page classes inherit from.
- `BaseTest` — handles browser setup and teardown using JUnit `@BeforeEach` and `@AfterEach` annotations. All test classes extend this, eliminating repeated setup code. It also initialises `AssertionUtils` so assertions are available across all tests.

**3. Separation of Concerns**
- Page classes handle **how** to interact with a page
- Test classes handle **what** to test
- `AssertionUtils` handles **verifying** outcomes
- `BaseTest` handles **setup and teardown**

---

## Project Structure

```
JavaFramework
 └── src
      ├── main
      │    └── java
      │         ├── basePage
      │         │    └── BasePage.java
      │         └── pages
      │              ├── authentication_Form.java
      │              ├── dropDown.java
      │              ├── fileUpload.java
      │              ├── homePage.java
      │              └── multipleWindows.java
      └── test
           └── java
                ├── baseTestPage
                │    └── BaseTest.java
                ├── utils
                │    └── AssertionUtils.java
                └── unitTests
                     ├── AuthenticatorTest.java
                     └── DropDownTest.java
```

---

## Current Test Coverage

| Test Class | Page Under Test | Scenario |
|---|---|---|
| `AuthenticatorTest` | Authentication Form | Login using valid credentials and assert redirect to secure area |
| `DropDownTest` | Dropdown | Select Option 2 from dropdown and assert element is displayed |

---

## How to Run

**Prerequisites:**
- Java JDK 24 installed
- Maven configured (or use IntelliJ's built-in Maven)
- Google Chrome installed (WebDriverManager handles the driver automatically)

**Steps:**

1. Clone the repository:
```bash
git clone https://github.com/kevinkgatshe/JavaFramework.git
```

2. Open the project in IntelliJ IDEA

3. Reload Maven dependencies:
   - Open the **Maven** panel on the right → click the **Reload** icon

4. Run all tests:
   - Right click the `unitTests` package → **Run Tests**

5. Run a specific test:
   - Open the test class → click the green play button next to the `@Test` method

---

## Key Features

- **Page Object Model** — clean separation between page interactions and test logic
- **Reusable Base Classes** — `BasePage` and `BaseTest` eliminate code duplication across the framework
- **AssertionUtils** — centralised assertion methods that wrap JUnit assertions with descriptive failure messages
- **Automatic Driver Management** — WebDriverManager removes the need to manually download or configure browser drivers
- **Branch-based Git Workflow** — changes are developed on feature branches and merged into `master` via Pull Requests
- **Descriptive Test Naming** — `@DisplayName` annotations make test results easy to read and understand

---

## Future Improvements

- **Extent Reports** — integrate HTML test reporting using Extent Reports to generate visual pass/fail dashboards with logs and screenshots after each test run
- **Screenshots on Failure** — automatically capture and attach screenshots to the report when a test fails for easier debugging
- **CI/CD Pipeline Integration** — configure a GitHub Actions pipeline to automatically trigger and run the full test suite on every push or Pull Request to `master`
- **Data Driven Testing** — use JUnit 5 `@ParameterizedTest` and `@CsvSource` to run the same test with multiple sets of data
- **Cross Browser Testing** — extend `BaseTest` to support Firefox and Edge in addition to Chrome
- **Test Grouping and Tagging** — use JUnit 5 `@Tag` to group tests by type (smoke, regression) and run specific suites on demand
- **Config File** — move environment URLs, credentials, and browser settings into a `config.properties` file to avoid hardcoded values in the code

---

*Framework developed by Omphemetse Kgatshe — ongoing development as part of a test automation learning journey.*
