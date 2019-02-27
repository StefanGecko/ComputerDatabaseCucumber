package pages;

import utility.PropertiesFile;
import elementActions.Button;
import elementActions.Input;
import elementActions.Validate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditPage extends BasePage {


    //*********Constructor*********
    public EditPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    /**
     * Page instances for actions that are going to be used.
     */
    public Button button = new Button(driver, wait);
    public Validate validate = new Validate(driver, wait);
    public Input input = new Input(driver, wait);

    /**
     * Web element locators
     */

    By computerNameInput = By.id("name");
    By introducedDate = By.id("introduced");
    By discontinuitedDate = By.id("discontinued");
    By saveCompButton = By.className("primary");
    By cancelButton = By.linkText("Cancel");
    By deleteCompButton = By.className("danger");
    By deleteConfirmation = By.className("alert-message");
    By introducedColumn = By.cssSelector(".computers > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > em:nth-child(1)");
    By discontinuedColumn = By.cssSelector(".computers > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > em:nth-child(1)");
    By introducedDateAlert = By.className("error");
     By blankNamefield = By.className("help-inline");

    public void editComputerDates(String editedComputerName){

        //*********Page Methods*********
        validate.isElementPresent(computerNameInput);
        input.clear(computerNameInput);
        input.type(computerNameInput,editedComputerName);
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        button.click(saveCompButton);
        }



    public void cancelEditComputer(){
        validate.isElementPresent(computerNameInput);
        input.clear(computerNameInput);
        input.type(computerNameInput,"Lenovo X1 ThinkPad Carbon 3rd Generation");
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        button.click(cancelButton);

    }

    public void deleteComputer(){
        validate.isElementPresent(computerNameInput);
        validate.isElementPresent(introducedDate);
        validate.isElementPresent(discontinuitedDate);
        button.click(deleteCompButton);
    }

    public void validateDeletedComputer(){
        validate.textContains(deleteConfirmation,"Computer has been deleted");

    }

    public void editComputerBlankComputerName(){

        //*********Page Methods*********
        validate.isElementPresent(computerNameInput);
        input.clear(computerNameInput);
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        button.click(saveCompButton);
        validate.isElementPresent(blankNamefield);
        validate.textEquals(blankNamefield, "Required");
        button.click(cancelButton);

    }

    public void editComputerInvalidDate(String invalidDate,String editedComputerName){
        validate.isElementPresent(computerNameInput);
        input.clear(computerNameInput);
        input.type(computerNameInput,editedComputerName);
        validate.isElementPresent(introducedDate);
        input.clear(introducedDate);
        input.type(introducedDate,invalidDate);
        validate.isElementPresent(discontinuitedDate);
        input.clear(discontinuitedDate);
        button.click(saveCompButton);

    }
    public void validateInvalidDateEdit(){
        validate.isElementPresent(introducedDateAlert);
        button.click(cancelButton);
    }

}
