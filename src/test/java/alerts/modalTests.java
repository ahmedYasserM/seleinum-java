package alerts;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.EntryAdPage;
import static org.testng.Assert.*;

public class modalTests extends BaseTests {

    // This test is faild and I don't know until now how to fix it
    @Test
    public void testModalWindow() {
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        String modalWindowText = entryAdPage.getModalWindowText();
        entryAdPage.clickCloseModalButton();

        assertTrue(modalWindowText.contains("It's commonly used to encourage a user to take an action (e.g., give their e-mail"), "Wrong modal window text");
    }

}
