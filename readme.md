# Computer Database Automation Framework built

Tools used: Intelij IDE, Chrome Browser (execution), Firefox Developer edition for location of elements.


# Description:
This automation framework is build to automate the computer database assignment with the cucumber framework.
It follows the Page Object Model pattern and from the project structure you can see that the elementActions(validate,button,dropdown and input) are in a package that is called common under main folder 
and also there is a Pages package present that is used to locate the elements and write the methods that are going to be used in the tests later.
In the test folder we have 2 packages that are tests(BasePage that has the setup for starting the tests) and 
Utils(classes that take a screenshot when error in validation or test occurs and to send email to the client)
The BaseTest class has existing implementation with the web driver manager via maven so the project can be downsized and there is no need to download and import the driver.exe files.

# TestCase coverage in the automation process:
	    1. Adding a computer to the database;
		2. Filtering a computer from the database;
		3. Editing a computer in the computer database;
		4. Cancelling the edit on the computer in the computer database;
		5. Deleting the computer from the computer database;
		6. Edit a computer by deleting the computer name and save.
		7. Test case covering creation of computer with invalid dates as boundary values(0000 and 9999)
		8. Test case covering the input of special chars in the computer name field.
		9. Test case covering creation of computer in the computer database with invalid date format.
		
# Tech
Automatic Basic Framework in order to work properly uses a number of dependencies:

* [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
* [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) - For Java Developers. Includes a complete JRE plus tools for developing, debugging, and monitoring Java applications.
* [Cucmber](https://docs.cucumber.io/) - Behaviour-Driven Development (BDD).
* [Selenium](https://www.seleniumhq.org/download/) - Selenium has the support of some of the largest browser
* [Selenium Grid](https://www.seleniumhq.org/docs/07_selenium_grid.jsp) - Selenium-Grid allows you run your tests on different machines against different browsers in parallel.
* [Log4j](https://logging.apache.org/log4j/2.x/) - Almost every large application includes its own logging or tracing API.
	
# User Guide: 
1. Unzip the project file in a location on your hard drive
2. Start InteliJ IDE and Import project 
3. Click add as a Maven Project.
4. On the right side of the ide select Maven and download sources and documentation to add the dependencies from the pom.xml.
We can run this automatic test on local machine or you can use Selenium Grid to run test on virtual machines.

Open your favorite Terminal and run these commands.

Command for execution:
```sh
CHROME BROWSER - mvn clean -Dtest=RunnersScenarioStepDefinition verify
FIREFOX BROWSER - mvn clean -Dtest=RunnersScenarioStepDefinition verify
```

# Report
Once the build has finished in the project structure under target folder a report will be created named report.html.
Open the report in browser to review the results.
Also a copy of generated report will be available in the zip folder.
	