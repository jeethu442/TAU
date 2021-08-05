package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalWindowPage {
    private WebDriver driver;
    private By closeOption = By.className("modal-footer");

    ModalWindowPage(WebDriver driver){
      this.driver = driver;
    }

    public void closeModalWindow() throws InterruptedException {
        driver.findElement(closeOption).click();
        Thread.sleep(3000);
    }

}
