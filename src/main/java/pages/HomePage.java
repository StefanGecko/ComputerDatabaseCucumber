package pages;

import elementActions.Button;
import elementActions.Input;
import elementActions.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.PropertyManager;

public class HomePage extends BasePage {

    //*********Constructor*********
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    /**
     * Page instances for actions that are going to be used.
     */
    public Validate validate = new Validate(driver, wait);

    /**
     * property file instance for url parameter.
     */




    /**
     * Web element locators
     */
    By pageTitle = By.className("fill");
    By mainTable = By.className("computers");



    /**
     * Page Methods
     */


    public void validateHomePage(){
        validate.textContains(pageTitle, "Computer database");
        validate.isElementPresent(mainTable);
    }

}
