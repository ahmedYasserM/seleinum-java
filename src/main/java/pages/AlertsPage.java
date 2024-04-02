package pages;

import javax.crypto.AEADBadTagException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.utility.nullability.NeverNull.ByDefault;

public class AlertsPage {
    private WebDriver driver;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    
    private By alertResult = By.id("result");
    
    private By buttonLocator(int idx) {
        return By.cssSelector(String.format("#content > div > ul > li:nth-child(%d) > button", idx));
    }

    public void clickButton(int idx) {
        driver.findElement(buttonLocator(idx)).click();
    }

    public String getAlertResult() {
        return driver.findElement(alertResult).getText();
    }
    

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
       driver.switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
    
    public void enterText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    

}
