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

    public void type(By by, int value)
    {
        try
        {
            getElement(by).sendKeys(new CharSequence[] { Integer.toString(value) });
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
    }

    public void type(By by, int index, String value)
    {
        try
        {
            ((WebElement)getAllElements(by).get(index)).sendKeys(new CharSequence[] { value });
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void type(By by, int index, int value)
    {
        try
        {
            ((WebElement)getAllElements(by).get(index)).sendKeys(new CharSequence[] { Integer.toString(value) });
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

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

    public void clear(By by, int index)
    {
        try
        {
            ((WebElement)getAllElements(by).get(index)).clear();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
