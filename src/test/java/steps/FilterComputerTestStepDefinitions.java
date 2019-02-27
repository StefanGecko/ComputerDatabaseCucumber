package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

import pages.MainPage;

public class FilterComputerTestStepDefinitions extends BaseTest {


    /**
     * Page instances for pages in whitch test methods are situated.
     */
    MainPage mainPage ;

    @Before()
    public void setUp(){
        setup();
        mainPage = new MainPage(driver, wait);

    }


    @And("^validate that filtering is done by ([^\"]*)$")
    public void validateThatFilteringIsDoneByComputerName(String computerName) {
        mainPage.filterByComputerName(computerName);

    }

    @After("@feature_filter")
    public void tearDown(){
        driver.close();
    }
}
