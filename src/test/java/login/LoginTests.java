package login;


import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage securityPage = loginPage.clickLoginButton();
        assertTrue(securityPage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect");
    }

    @Test
    public void testResetPassword() {
        ForgetPasswordPage forgetPassowrdPage = homePage.clickForgetPassword();
        forgetPassowrdPage.setEmail("ahmed@example.com");
        EmailSentPage emailSentPage = forgetPassowrdPage.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getStatusMessage().contains("Internal Server Error"), "Status message is incorrect");
    }

}