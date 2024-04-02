package pages;

import java.io.Console;
import java.time.Duration;

import javax.swing.RowFilter.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EntryAdPage {

    private WebDriver driver;
    WebElement modalWindow;
    private By closeModalButton = By.cssSelector("#modal > div.modal > div.modal-footer > p");
    private By modalWindowText = By.cssSelector("#modal > div.modal > div.modal-body > p");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCloseModalButton() {
        modalWindow.findElement(closeModalButton).click();
    }

    public String getModalWindowText() {
        return modalWindow.findElement(modalWindowText).getText();
    }
}
