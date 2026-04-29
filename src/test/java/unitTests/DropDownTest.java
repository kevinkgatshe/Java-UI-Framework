package unitTests;
import baseTestPage.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.dropDown;
import pages.homePage;

public class DropDownTest extends BaseTest {

    private homePage HomePage;
    private dropDown DropDown;

    @BeforeEach
    public void pageSetUp()
    {
        HomePage = new homePage(driver);
        DropDown = new dropDown(driver);
    }

    @Test
    @DisplayName("Select option 2 from the dropdown")
    public void setDropDown()
    {
        HomePage.navToHomePage();
        HomePage.ClickDropdownMenu();
        DropDown.selectDropdownOption();
    }

}
