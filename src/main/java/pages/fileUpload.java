package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileUpload extends BasePage {

    private By fileUpload = By.id("file-upload");
    private By fileUploadbutton = By.id("file-submit");


    public fileUpload(WebDriver driver)
    {
        super(driver);
    }

    public void uploadFile()
    {
        Send(fileUpload,"C:\\Users\\G997583\\OneDrive - Sanlam Life Insurance Limited\\Pictures\\1.png");
    }

    public void ClickUploadButton()
    {
        Click(fileUploadbutton);
    }

}
