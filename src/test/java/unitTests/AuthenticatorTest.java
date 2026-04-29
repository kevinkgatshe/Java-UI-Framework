package unitTests;

import baseTestPage.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.authentication_Form;
import pages.homePage;

public class AuthenticatorTest extends BaseTest {
    private homePage HomePage;
    private authentication_Form AuthenticationForm;

    @BeforeEach
    public void pageSetUp()
    {
        HomePage = new homePage(driver);
        AuthenticationForm = new authentication_Form(driver);
    }

    @Test
    @DisplayName("Login using valid credentials")
    public void loginForm()
    {
        HomePage.navToHomePage();
        HomePage.ClickOnAuthenticatorForm();
        AuthenticationForm.captureUsername();
        AuthenticationForm.capturePassword();
        AuthenticationForm.clickOnLoginButton();
    }
}
