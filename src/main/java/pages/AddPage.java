package pages;

import elementActions.Button;
import elementActions.Dropdown;
import elementActions.Input;
import elementActions.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddPage extends BasePage {


    //*********Constructor*********
    public AddPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    /**
     * Page instances for actions that are going to be used.
     */
    public Button button = new Button(driver, wait);
    public Validate validate = new Validate(driver, wait);
    public Input input = new Input(driver, wait);
    public Dropdown dropdown = new Dropdown(driver, wait);

    /**
     * Web element locators
     */

    By computerName = By.id("name");
    By introducedDate = By.id("introduced");
    By discontinuitedDate = By.id("discontinued");
    By companyName = By.id("company");
    By createButton = By.className("primary");
    By cancelButton = By.linkText("Cancel");
    By computerNameAlert = By.className("help-inline");

    /**
     * Page methods used for testing
     */
    public void createNewComputer(String computerNameTestData){

        validate.isElementPresent(computerName);
        input.clear(computerName);
        input.type(computerName, computerNameTestData);
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        input.type(introducedDate,presentDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        input.type(discontinuitedDate, futureDate());
        dropdown.select(companyName,"Lenovo Group");
        button.click(createButton);

    }


    public void createNewComputerInvalidName(String specialCharactersComputerName){

        validate.isElementPresent(computerName);
        input.clear(computerName);
        input.type(computerName,specialCharactersComputerName);
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        input.type(introducedDate,presentDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        input.type(discontinuitedDate, futureDate());
        dropdown.select(companyName,"Lenovo Group");
        button.click(createButton);

    }

    public void createNewComputerInvalidDate(String invalidIntroducedDate, String invalidDiscontinuedDate, String computerNameTestData){

        validate.isElementPresent(computerName);
        input.clear(computerName);
        input.type(computerName, computerNameTestData);
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        input.type(introducedDate,invalidIntroducedDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        input.type(discontinuitedDate, invalidDiscontinuedDate);
        dropdown.select(companyName,"Lenovo Group");
        button.click(createButton);

    }


    public void createNewComputerBlankName(String invalidIntroducedDate, String invalidDiscontinuedDate){

        validate.isElementPresent(computerName);
        input.clear(computerName);
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        input.type(introducedDate,invalidIntroducedDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        input.type(discontinuitedDate, invalidDiscontinuedDate);
        dropdown.select(companyName,"Lenovo Group");
        button.click(createButton);
        validate.textEquals(computerNameAlert,"Required");


    }

}
