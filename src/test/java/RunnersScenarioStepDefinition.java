import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


/***
 * Test Runner
 */

@RunWith(Cucumber.class)
@CucumberOptions(

        format = {"json:target/cucumber.json",
                "html:target/site/cucumber-pretty",
                "pretty"
        },

        features = {"src/test/resources"},

        glue = "steps",

        plugin = { "html:target/cucumber",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        },

        tags = {"~@disable_this_scenario","@RegressionTest,@SmokeTest"},

        monochrome = false
)

public class RunnersScenarioStepDefinition {

        /***
         * Add ENV information on extent report
         */
        @AfterClass
        public static void writeExtentReport() {

                Reporter.loadXMLConfig("src/main/resources/extent-config.xml");
                Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
                Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
                Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
                Reporter.setSystemInfo("Selenium", "3.7.0");
                Reporter.setSystemInfo("Maven", "3.5.2");
                Reporter.setSystemInfo("Java Version", "1.8.0_151");
        }

        /***
         * Sending E-mail notification after build job is finish
         */
        /*
        @AfterClass
        public static void sendEmail() throws EmailException {

                SendEmailJava.sendEmail();
        }
        */
}