package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class multipleWindows extends BasePage {

    private By newWindow = By.xpath("//a[@href='/windows/new']");

    String mainWindow = driver.getWindowHandle();

    public multipleWindows(WebDriver driver)
    {
        super(driver);
    }

    public void ClickOnNewWindow()
    {
        Click(newWindow);

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
    }


    }

}
