package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By statusMessage = By.cssSelector("body > h1");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getStatusMessage() {
        return driver.findElement(statusMessage).getText();
    }

}
