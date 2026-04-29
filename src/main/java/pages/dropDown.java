package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dropDown extends BasePage {


    private final By dropdown = By.id("dropdown");


    public dropDown(WebDriver driver)
    {
        super(driver);
    }

    public void selectDropdownOption()
    {
        SelectByValue(dropdown, "2");
    }





}
