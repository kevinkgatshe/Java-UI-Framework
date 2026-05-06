package utilities;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssertionUtils {
    private WebDriver driver;

    public AssertionUtils(WebDriver driver)
    {
        this.driver = driver;
    }




    // Assert page title
    public void assertPageTitle(String expectedTitle) {
        Assertions.assertEquals(expectedTitle, driver.getTitle(), "Page title mismatch");
    }

    // Assert current URL
    public void assertCurrentUrl(String expectedUrl) {
        Assertions.assertEquals(expectedUrl, driver.getCurrentUrl(), "URL mismatch");
    }

    // Assert element text
    public void assertElementText(By locator, String expectedText) {
        String actual = driver.findElement(locator).getText();
        Assertions.assertEquals(expectedText, actual, "Element text mismatch");
    }

    // Assert element is displayed
    public void assertElementDisplayed(By locator) {
        Assertions.assertTrue(driver.findElement(locator).isDisplayed(), "Element is not displayed");
    }

    // Assert element is enabled
    public void assertElementEnabled(By locator) {
        Assertions.assertTrue(driver.findElement(locator).isEnabled(), "Element is not enabled");
    }
}
