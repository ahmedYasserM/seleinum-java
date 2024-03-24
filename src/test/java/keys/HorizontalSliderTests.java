package keys;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void TestArrowKey() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();

        horizontalSliderPage.pressRightKey(8);

        assertEquals(horizontalSliderPage.getRangeOutputText(), "4", "Invalid range output...");
    }

}
