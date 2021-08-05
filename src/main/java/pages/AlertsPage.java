package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By result = By.id("result");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");

    AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void triggerConfirm(){
       driver.findElement(triggerConfirmButton).click();
    }

    public void dismissConfirm(){
        driver.switchTo().alert().dismiss();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void setInputInPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
