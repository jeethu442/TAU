package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResultText(),"You entered: BACK_SPACE","Incorrect result");
    }

    @Test
    public void testPi(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResultText(),"You entered: 4","Incorrect result");
    }
}
