package steps;

import utility.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    private static PropertiesFile properties = new PropertiesFile();

    public static String baseURL = properties.getPropertyValue(PropertiesFile.PropertyKey.TEST_APPLICATION_ENVIRONMENT);

    @BeforeClass
    public static void setup() {

        DOMConfigurator.configure("src/main/resources/log4j.xml");


        String browser = properties.getPropertyValue(PropertiesFile.PropertyKey.BROWSER_TYPE);

        if (driver == null) {
            switch (browser) {
                case "CHROME":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "FIREFOX":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "OPERA":
                    driver = new OperaDriver();
                    break;

                case "SAFARI":
                    System.setProperty("webdriver.safari.noinstall", "true");
                    driver = new SafariDriver();
                    break;

                case "EDGE":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
            }

            wait = new WebDriverWait(driver, 15);
            driver.manage().window().maximize();

        }

    }

    public void navigateToHomePage(){
        //Navigate to Homepage
        driver.get(baseURL);
    }

        @AfterClass
        public void teardown () {
            driver.quit();

        }


    }

