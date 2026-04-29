package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends BasePage {

   private final String url = "https://the-internet.herokuapp.com/";

   private By dropdownMenu = By.xpath("//a[@href='/dropdown']");
   private By auth_Form = By.xpath("//a[@href='/login']");
   private By windowHandle = By.xpath("//a[@href='/windows']");
   private By fileUpload = By.xpath("//a[@href='/upload']");

    public homePage(WebDriver driver)
    {
        super(driver);
    }

    public void navToHomePage()
    {
        navigateTo(url);
    }

    public void ClickDropdownMenu()
    {
        Click(dropdownMenu);
    }

    public void ClickOnAuthenticatorForm()
    {
        Click(auth_Form);
    }

    public void ClickOnWindow()
    {
        Click(windowHandle);
    }

    public void ClickOnFileUpload()
    {
        Click(fileUpload);
    }
}

