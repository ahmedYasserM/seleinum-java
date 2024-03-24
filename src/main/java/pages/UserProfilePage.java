package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfilePage {
    private WebDriver driver;
    private By statusMessage = By.tagName("h1");
    
    
    public UserProfilePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getStatusMessage() {
        return driver.findElement(statusMessage).getText();
    }
    
}
