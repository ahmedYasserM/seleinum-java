package hover;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.HoversPage;
import pages.UserProfilePage;
import pages.HoversPage.FigureCaption;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverOnImage() {
        HoversPage hoversPage = homePage.clickHovers();
        FigureCaption caption = hoversPage.hover(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertTrue(caption.getHeaderText().contains("name: user1"), "Image header is incorrect");
        UserProfilePage profile = caption.clickLink();
        assertTrue(profile.getStatusMessage().contains("Not Found"), "Status message is incorrect");
    }

}