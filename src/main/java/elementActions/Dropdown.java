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

    public void select(By by, int option) {
        try {
            this.select = new Select(getElement(by));
            this.select.selectByIndex(option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void select(By by, int option, int index) {
        try {
            this.select = new Select((WebElement) getAllElements(by).get(index));
            this.select.selectByIndex(option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void select(By by, String visibleText) {
        try {
            this.select = new Select(getElement(by));
            this.select.selectByVisibleText(visibleText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void select(By by, String visibleText, int index) {
        try {
            this.select = new Select((WebElement) getAllElements(by).get(index));
            this.select.selectByVisibleText(visibleText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
