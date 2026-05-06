package baseTestPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.AssertionUtils;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver;
    protected AssertionUtils assertUtils;

    @BeforeEach
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }

}
