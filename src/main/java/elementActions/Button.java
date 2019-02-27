package elementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class Button
        extends BasePage
{
    public Button(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    /**
     * Wrapper used for button action click
     * @param by
     */

    public void click(By by)
    {
        try
        {
            getElement(by).click();
        }
        catch (Exception localException) {}
    }


}