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

    public void submit(By by)
    {
        try
        {
            getElement(by).submit();
        }
        catch (NoSuchElementException localNoSuchElementException) {}
    }

    public void submit(By by, int index)
    {
        try
        {
            ((WebElement)getAllElements(by).get(index)).submit();
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
    }

    public void click(By by)
    {
        try
        {
            getElement(by).click();
        }
        catch (Exception localException) {}
    }

    public void click(By by, int index)
    {
        try
        {
            ((WebElement)getAllElements(by).get(index)).click();
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
    }

    public void doubleClick(By by)
    {
        try
        {
            new Actions(driver).doubleClick(getElement(by)).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void doubleClick(By by, int index)
    {
        try
        {
            new Actions(driver).doubleClick((WebElement)getAllElements(by).get(index)).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void rightClick(By by)
    {
        try
        {
            new Actions(driver).contextClick(getElement(by)).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void rightClick(By by, int index)
    {
        try
        {
            new Actions(driver).contextClick((WebElement)getAllElements(by).get(index)).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void mouseOver(By by)
    {
        try
        {
            new Actions(driver).moveToElement(getElement(by)).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void mouseOver(By by, int index)
    {
        try
        {
            new Actions(driver).moveToElement((WebElement)getAllElements(by).get(index)).perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}