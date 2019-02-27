package elementActions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class Validate
        extends BasePage {


    public Validate(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Wrapper used for validation if web element is present
     * @param by
     */
    public boolean isElementPresent(By by) {
        try {
            getElement(by).getText();
            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * Wrapper used for validation if text of web element equals test data
     * @param by
     */
    public boolean textEquals(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();
            Assert.assertEquals(expectedValue, actualValue);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Wrapper used for validation if text of web element is contained in test data
     * @param by
     */
    public boolean textContains(By by, String expectedValue) {
        isElementPresent(by);
        try {
            String actualValue = getElement(by).getText();
            Assert.assertTrue(actualValue.contains(expectedValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}