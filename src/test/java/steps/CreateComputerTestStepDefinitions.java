package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AddPage;
import pages.HomePage;
import pages.MainPage;

public class CreateComputerTestStepDefinitions extends BaseTest {

    /**
     * Page instances for pages in whitch test methods are situated.
     */
    HomePage homePage ;
    MainPage mainPage ;
    AddPage addPage ;

    @Before
    public void setUp(){
        setup();
        homePage = new HomePage(driver, wait);
        mainPage = new MainPage(driver, wait);
        addPage = new AddPage(driver, wait);
        homePage = new HomePage(driver, wait);
    }

    @Given("^open home page$")
    public void openHomepage(){
        navigateToHomePage();
    }

    @And("^click to add a new computer$")
    public void clickToAddANewComputer() {
        homePage.validateHomePage();
        mainPage.addNewComputer();
    }

    @And("^input correct ([^\"]*) to create new computer$")
    public void inputCorrectDataToCreateNewComputer(String computerName) {
        addPage.createNewComputer(computerName);
    }

    @Then("^Validate that computer is successfuly created$")
    public void validateThatComputerIsSuccessfulyCreated() {

        mainPage.addNewComputerValidation();
    }

    @And("^click to add new computer with invalid name$")
    public void clickToAddNewComputerWithInvalidName() {
        homePage.validateHomePage();
        mainPage.addNewComputer();

    }

    @And("^add data containing ([^\"]*) in computer name$")
    public void addDataContainingSpecialCharactersInComputerName(String specialCharactersComputerName) {
        addPage.createNewComputerInvalidName(specialCharactersComputerName);

    }

    @Then("^Validate computer is added with special characters in computer name$")
    public void validateComputerIsAddedWithSpecialCharactersInComputerName() {
        mainPage.addNewComputerValidation();
    }

    @And("^click to add new computer with boundary values for introduced date and discontinued date$")
    public void clickToAddNewComputerWithBoundaryValuesForIntroducedDateAndDiscontinuedDate() {
        homePage.validateHomePage();
        mainPage.addNewComputer();
    }

    @And("^enter data for ([^\"]*) and ([^\"]*) and ([^\"]*)$")
    public void enterDataForIntroducedDateAndDiscontinuedDate(String introducedDate, String discontniuedDate, String computerName) {
        addPage.createNewComputerInvalidDate(introducedDate, discontniuedDate, computerName);

    }

    @Then("^validate that computer is added with boundary values for ([^\"]*) and ([^\"]*)$$")
    public void validateThatComputerIsAddedWithBoundaryValues(String invalidIntroducedDate, String invalidDiscontinuedDate) {
        mainPage.invalidDateValidation(invalidIntroducedDate,invalidDiscontinuedDate);
    }

    @And("^click to add new computer with same computer name$")
    public void clickToAddNewComputerWithSameComputerName() {
        homePage.validateHomePage();
        mainPage.addNewComputer();

    }

    @And("^add computer with the same ([^\"]*)$")
    public void addComputerWithTheSameComputerName(String computerName) {
        addPage.createNewComputer(computerName);
    }

    @Then("^validate that computer is added with the same computer name$")
    public void validateThatComputerIsAddedWithTheSameComputerName() {
        mainPage.addNewComputerValidation();
    }

    @And("^click to add new computer with blank computer name$")
    public void clickToAddNewComputerWithBlankComputerName() {
        homePage.validateHomePage();
        mainPage.addNewComputer();


    }

    @And("^add ([^\"]*) and ([^\"]*) for the computer details$")
    public void addDataForTheComputerDetails(String invalidIntroducedDate, String invalidDiscontinuedDate) {
        addPage.createNewComputerBlankName(invalidIntroducedDate,invalidDiscontinuedDate);
    }

    @Then("^validate that computer cannot be created with blank computer name$")
    public void validateThatComputerCannotBeCreatedWithBlankComputerName() {
        mainPage.blankNameValidation();
    }


}
