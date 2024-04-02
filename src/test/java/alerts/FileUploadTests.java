package alerts;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.FileUploadPage;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/home/ahmed/dev/selenium/seleinum-java/resources/chromedriver");
        fileUploadPage.clickUploadButton();
        assertEquals(fileUploadPage.getUploadFiles(), "chromedriver", "Faild to upload the file");
    }

}
