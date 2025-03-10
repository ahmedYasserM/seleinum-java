package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private WebDriver driver;

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  public LoginPage clickFormAuthentication() {
    clickLink("Form Authentication");
    return new LoginPage(driver);
  }

  public DropDownPage clickDropDown() {
    clickLink("Dropdown");
    return new DropDownPage(driver);
  }

  public ForgetPasswordPage clickForgetPassword() {
    clickLink("Forgot Password");
    return new ForgetPasswordPage(driver);
  }

  public HoversPage clickHovers() {
    clickLink("Hovers");
    return new HoversPage(driver);
  }

  public KeyPressesPage clickKeyPresses() {
    clickLink("Key Presses");
    return new KeyPressesPage(driver);
  }

  public HorizontalSliderPage clickHorizontalSlider() {
    clickLink("Horizontal Slider");

    return new HorizontalSliderPage(driver);
  }

  public AlertsPage clickJavaScriptAlerts() {
    clickLink("JavaScript Alerts");
    return new AlertsPage(driver);
  }

  public FileUploadPage clickFileUpload() {
    clickLink("File Upload");
    return new FileUploadPage(driver);
  }

  public EntryAdPage clickEntryAd() {
    clickLink("Entry Ad");
    return new EntryAdPage(driver);
  }

  private void clickLink(String linkText) {
    driver.findElement(By.linkText(linkText)).click();
  }

}
