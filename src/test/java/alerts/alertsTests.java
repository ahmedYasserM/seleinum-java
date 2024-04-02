package alerts;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import org.openqa.selenium.Alert;

import base.BaseTests;
import pages.AlertsPage;

public class alertsTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickButton(1);
        alertsPage.acceptAlert();
        assertTrue(alertsPage.getAlertResult().contains("You successfully clicked an alert"),
                "Alert result is not displayed");
    }

    @Test
    public void testConfirmAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickButton(2);
        String alertText = alertsPage.getAlertText();
        assertEquals(alertText, "I am a JS Confirm", "alert text is incorrect");
        alertsPage.dismissAlert();
        String alertResult = alertsPage.getAlertResult();
        assertEquals( alertResult, "You clicked: Cancel", "alert result is incorrect");
    }
    
    @Test
    public void testPromptAlert() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickButton(3);
        String inputText = "This is text from seleinum";
        alertsPage.enterText(inputText);
        alertsPage.acceptAlert();
        String alertResult = alertsPage.getAlertResult();
        assertTrue(alertResult.contains(inputText), "prompt is incorrect");
    }

}
