package elementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class Dropdown
        extends BasePage {
    private Select select = null;

    public Dropdown(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Wrappers used for dropdown web elements by visible text
     * @param by
     */

    public void select(By by, String visibleText) {
        try {
            this.select = new Select(getElement(by));
            this.select.selectByVisibleText(visibleText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
