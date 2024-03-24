package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;

    private By keyPressInput = By.id("target");
    private By keyPressResult = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendText(String text) {
        driver.findElement(keyPressInput).sendKeys(text);
    }

    public void insertPi() {
        sendText(Keys.chord(Keys.SHIFT, "p") + " = 3.14");
    }

    public String getKeyPressResultText() {
        return driver.findElement(keyPressResult).getText();
    }

}
