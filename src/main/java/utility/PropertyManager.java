package utility;

import java.io.IOException;
import java.util.Properties;


public class PropertyManager {

    private static PropertyManager cInstance = null;

    private String APPLICATION_ENVIRONMENT;
    private String BROWSER_TYPE;
    private String ENV_HUB_URL;
    private String GRID_ACTIVE;
    private String OS_TYPE;
    private String USERNAME;
    private String PASSWORD;
    private String EMAIL_ADDRESS_SET_FROM;
    private String EMAIL_ADDRESS_SET_TO;
    private String EMAIL_ACCOUNT_USERNAME;
    private String EMAIL_ACCOUNT_PASSWORD;

    private PropertyManager() {
        loadData();
    }

    public static PropertyManager getInstance() {
        if (cInstance == null) {
            cInstance = new PropertyManager();
        }

        return cInstance;
    }

    private void loadData() {


        /**
         * Declare a properties object
         */
        Properties prop = new Properties();

        try {
            prop.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }

        // *** Get properties from configuration.properties ***

        /**
         * Get URL of application environment and set browser type
         */
        APPLICATION_ENVIRONMENT = prop.getProperty("application-environment-url");
        BROWSER_TYPE = prop.getProperty("select-browser-type");

        /**
         * Get credentials for username and password
         */
        USERNAME = prop.getProperty("credentials-username");
        PASSWORD = prop.getProperty("credentials-password");

        /**
         * Properties for Selenium Grid
         */
        ENV_HUB_URL = prop.getProperty("environment-hub-url");
        GRID_ACTIVE = prop.getProperty("selenium-grid-active");
        OS_TYPE = prop.getProperty("select-os-type");

        /**
         * Properties for Email notification
         */
        EMAIL_ADDRESS_SET_FROM = prop.getProperty("email-address-set-from");
        EMAIL_ADDRESS_SET_TO = prop.getProperty("email-address-set-to");
        EMAIL_ACCOUNT_USERNAME = prop.getProperty("username-for-email-account");
        EMAIL_ACCOUNT_PASSWORD = prop.getProperty("password-for-email-account");
    }

    public String getBrowserType() {
        return BROWSER_TYPE;
    }

    public String getApplicationEnv() {
        return APPLICATION_ENVIRONMENT;
    }

    public String getGridActive() {
        return GRID_ACTIVE;
    }

    public String getEnvHubUrl() {
        return ENV_HUB_URL;
    }

    public String getOsType() {
        return OS_TYPE;
    }

    public String getUsername() {
        return USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public String setEmailAddressFrom() {
        return EMAIL_ADDRESS_SET_FROM;
    }

    public String setEmailAddressTo() {
        return EMAIL_ADDRESS_SET_TO;
    }

    public String setUsernameEmailAccount() {
        return EMAIL_ACCOUNT_USERNAME;
    }

    public String setPasswordEmailAccount() {
        return EMAIL_ACCOUNT_PASSWORD;
    }
}
