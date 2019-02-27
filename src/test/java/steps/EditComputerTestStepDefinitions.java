package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AddPage;
import pages.EditPage;
import pages.HomePage;
import pages.MainPage;

public class EditComputerTestStepDefinitions extends BaseTest {



    HomePage homePage ;
    MainPage mainPage ;
    AddPage addPage ;
    EditPage editPage;

    @Before()
    public void setUp(){
        setup();
        homePage = new HomePage(driver, wait);
        mainPage = new MainPage(driver, wait);
        addPage = new AddPage(driver, wait);
        editPage = new EditPage(driver, wait);
    }

    @And("^access the ([^\"]*) from database$")
    public void accessTheComputerFromDatabase(String computerName) {
        mainPage.accessComputer(computerName);
    }


    @And("^edit ([^\"]*) and clear date fields$")
    public void editEditedComputerNameAndClearDateFields(String editedComputerName) {
        editPage.editComputerDates(editedComputerName);

    }

    @Then("^validate that computer name is ([^\"]*) and dates are removed$")

    public void validateThatComputerNameIsEditedComputerNameAndDatesAreRemoved(String editedComputerName) {
        mainPage.filterByComputerName(editedComputerName);

    }

    @And("^navigate to ([^\"]*) that is edited$")
    public void navigateToComputerThatIsEdited(String computerName) {
        mainPage.accessComputer(computerName);

    }

    @And("^edit the date with ([^\"]*) and ([^\"]*)$")
    public void editTheDateWithInvalidDateAndEditedComputerName(String invalidDate, String editedComputerName) {
        editPage.editComputerInvalidDate(invalidDate, editedComputerName);
    }

    @Then("^verify that computer cannot be saved$")
    public void verifyThatComputerCannotBeSaved() {
        editPage.validateInvalidDateEdit();
    }


    @And("^navigate to ([^\"]*)$")
    public void navigateToComputer(String computerName) {
        mainPage.accessComputer(computerName);

    }

    @Then("^validate that computer cannot be edited if computer name is removed$")
    public void validateThatComputerCannotBeEditedIfComputerNameIsRemoved() {
        editPage.editComputerBlankComputerName();
    }

}
