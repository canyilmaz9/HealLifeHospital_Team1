package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashboardPage;
import pages.DoctorIDPPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import config.ConfigReader;
import utilities.ReusableMethods;


public class AdminDashboardSteps {
    private static final Logger logger = LogManager.getLogger(AdminDashboardSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
    Actions action;
    JavascriptExecutor js = (JavascriptExecutor) driver;




    DoctorIDPPage doctorIpdPage= new DoctorIDPPage(driver);
    public AdminDashboardSteps() {
        this.adminDashboardPage = new AdminDashboardPage(this.driver);
        this.action = new Actions(this.driver);
        this.js = (JavascriptExecutor)this.driver;
    }


    @Given("Go to the admin page")
    public void goToTheAdminPage() {

        String url = ConfigReader.getProperty("adminURL");
        this.driver.get(url);
        logger.info("AdminPage is opened " + url);


    }


    @When("Click on the title of Dashboard")
    public void clickOnTheTitleOfDashboard() {

        adminDashboardPage.dashboardTitle.click();
        String actualUrl= driver.getCurrentUrl();

    }

    @Then("Verify that the admin panel is refreshed")
    public void verifyThatTheAdminPanelIsRefreshed() {
        String expectedUrl=driver.getCurrentUrl();
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }



    @When("Wait for a second")
    public void waitForASecond() {

        ReusableMethods.bekle(2);
    }


    @When("Log in the page with correct admin name and password")
    public void logInThePageWithCorrectAdminnameAndPassword() {

        //doctorIpdPage.adminLogin(11);


    }


    @Then("Verify that the dashboard is for admin role")
    public void verifyThatTheDashboardIsForAdminRole() {

    }

    @Given("Move to the titles")
    public void moveToTheTitles() {
    }


    @Then("Verify that {string} are displayed")
    public void verifyThatAreDisplayed(String Titles) {
    }













}
