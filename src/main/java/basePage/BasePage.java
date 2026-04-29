package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    protected final WebDriver driver;
    protected final Actions actions;

//Constructor
    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.actions = new Actions(driver);
    }

//Re-usable methods

    public void navigateTo(String url)
    {
        driver.get(url);
 //       driver.navigate().to(url);
    }

    public void Click(By locator)
    {
        driver.findElement(locator).click();
    }

    public void Send(By locator, String text)
    {
        driver.findElement(locator).sendKeys(text);
    }

    public String getText(By locator)
    {
        return driver.findElement(locator).getText();
    }

    public String getTitle(By locator)
    {
        return driver.getTitle();
    }

    public void SelectByText(By locator, String text)
    {
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(text);
    }

    public void SelectByValue(By locator, String value)
    {
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByValue(value);
    }

    public void SelectByIndex(By locator, int index)
    {
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByIndex(index);
    }
}
