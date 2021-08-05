package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class ModalTests extends BaseTests {

    @Test
    public void modalWindowTests() throws InterruptedException {
      var modalWindowPage = homePage.clickEntryAds();
      modalWindowPage.closeModalWindow();
    }
}
