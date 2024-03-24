package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    
    private By sliderInput = By.cssSelector("div > input[type=range]");
    private By rangeOutput = By.id("range");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void pressRightKey(int count) {
        for(int i = 0; i < count; i++) {
            driver.findElement(sliderInput).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    
    public String getRangeOutputText() {
        return driver.findElement(rangeOutput).getText();
    }
    
}
