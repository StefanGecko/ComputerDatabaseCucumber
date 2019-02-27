package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.EditPage;
import pages.MainPage;

public class DeleteComputerTestStepDefinitions extends BaseTest {

    /**
     * Page instances for pages in whitch test methods are situated.
     */

    MainPage mainPage;
    EditPage editPage;

    @Before()
    public void setUp(){
        setup();
        mainPage = new MainPage(driver, wait);
        editPage = new EditPage(driver, wait);

    }

     @And("^access ([^\"]*) that will be removed$")
    public void accessComputerThatWillBeRemoved(String computerName) {
        mainPage.accessComputer(computerName);
        editPage.deleteComputer();

    }

    @Then("^validate that computer has been deleted successfully$")
    public void validateThatComputerHasBeenDeletedSuccessfully() {
        editPage.validateDeletedComputer();
    }
}
