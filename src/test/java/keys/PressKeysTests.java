package keys;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.KeyPressesPage;

public class PressKeysTests extends BaseTests {

    private KeyPressesPage keyPressesPage;

    @Test
    public void testShiftKey() {
        keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.sendText("" + Keys.SHIFT);
        assertTrue(keyPressesPage.getKeyPressResultText().contains("SHIFT"), "Invalid key press");
    }

    public void testPi() {
        keyPressesPage.insertPi();
        assertTrue(keyPressesPage.getKeyPressResultText().contains("4"), "Invalid Key Press...");
    }

}
