package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFile = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String pathOfFile){
        driver.findElement(chooseFile).sendKeys(pathOfFile);
        clickUploadButton();
    }

    public String getUploadedFileName(){
        return driver.findElement(uploadedFile).getText();

    }

}
