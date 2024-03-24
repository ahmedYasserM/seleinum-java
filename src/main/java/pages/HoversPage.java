package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param index starts at 1
     */
    public FigureCaption hover(int index) {
        Actions action = new Actions(driver);
        WebElement figure = driver.findElements(By.className("figure")).get(index - 1);

        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(By.className("figcaption")));
    }

    public class FigureCaption {
        private WebElement caption;
        private By title = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getHeaderText() {
            return caption.findElement(title).getText();
        }

        public UserProfilePage clickLink() {
            caption.findElement(link).click();

            return new UserProfilePage(driver);
        }

    }

}