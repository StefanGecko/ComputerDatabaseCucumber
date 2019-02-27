package elementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public class Input
        extends BasePage
{
    public Input(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    /**
     * Wrappers used for input web elements
     * @param by
     */
    public void type(By by, String value)
    {
        try
        {
            getElement(by).sendKeys(new CharSequence[] { value });
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Wrappers used for clearing input web elements
     * @param by
     */
    public void clear(By by)
    {
        try
        {
            getElement(by).clear();
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
    }

}
