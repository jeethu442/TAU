package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickOnLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
      clickOnLink("Dropdown");
      return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        clickOnLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickOnLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickOnLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUploads(){
        clickOnLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ModalWindowPage clickEntryAds(){
        clickOnLink("Entry Ad");
        return new ModalWindowPage(driver);
    }

    private void clickOnLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
