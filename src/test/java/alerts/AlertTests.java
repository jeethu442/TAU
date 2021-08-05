package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Incorrect message");
        alertsPage.triggerPrompt();
        String text = "Jeethu";
        alertsPage.setInputInPrompt(text);
    }

    @Test
    public void testDismissConfirm(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        alertsPage.dismissConfirm();
        assertEquals(alertsPage.getResult(),"You clicked: Cancel","Incorrect Confirm message");
    }

    @Test
    public void testSetIput(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text ="Hello";
        alertsPage.setInputInPrompt(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You entered: "+text,"Incorrect result");
    }
}
