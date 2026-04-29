package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class authentication_Form extends BasePage {

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public authentication_Form(WebDriver driver)
    {
        super(driver);
    }

    public void captureUsername()
    {
        Click(usernameField);
        Send(usernameField,"tomsmith");
    }

    public void capturePassword()
    {
       Click(passwordField);
       Send(passwordField,"SuperSecretPassword!");
    }

    public void clickOnLoginButton()
    {
        Click(loginButton);
    }

}
