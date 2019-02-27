package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }


    /**
     * Wrappers used for locating web elements
     * @param by
     */
    protected WebElement getElement(By by)
    {
        try
        {
            return (WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    protected List<WebElement> getAllElements(By by)
    {
        try
        {
            return (List)wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        }
        catch (NoSuchElementException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * date formater and methods for date generation to be used in the automation process
     *
     */
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date currentDate = new Date();
    Calendar cal = Calendar.getInstance();
    String presentDate = dateFormat.format(cal.getTime());

    public String futureDate(){
        cal.getTime();
        cal.add(Calendar.YEAR,10);
        return dateFormat.format(cal.getTime());
    }

    public String pastDate(){
        cal.getTime();
        cal.add(Calendar.YEAR,-10);
        return dateFormat.format(cal.getTime());
    }
}
