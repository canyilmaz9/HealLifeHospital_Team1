package stepdefinitions;

import com.github.javafaker.Faker;
import config.ConfigReader;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utilities.ReusableMethods;
import utils.ExcelDataReader_Seren;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import stepdefinitions.Hooks;
import pages.DoctorPanelPage;

import java.time.Duration;

public class DoctorPanelSteps {
    private static final Logger logger = LogManager.getLogger(DoctorPanelSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    DoctorPanelPage doctorPanelPage;
    Actions action;
    JavascriptExecutor js;
    Faker faker = new Faker();

    //DoctorIDPPage doctorIpdPage = new DoctorIDPPage(driver);

    public DoctorPanelSteps() {
        this.doctorPanelPage = new DoctorPanelPage(this.driver);
        this.action = new Actions(this.driver);
        this.js = (JavascriptExecutor) this.driver;
    }

    @Given("Go to the admin login page")
    public void go_to_the_admin_login_page() {

        driver.get(ConfigReader.getProperty("adminURL"));
    }

    @Then("Display the Admin Login window on the right and the Latest New information on the left.")
    public void display_the_admin_login_window_on_the_right_and_the_latest_new_information_on_the_left() {

        WebElement element1 = driver.findElement(By.xpath("//*[@class='loginbg']"));
        WebElement element2 = driver.findElement(By.xpath("//*[@class='mCSB_container']"));

        Point position1 = element1.getLocation();
        Point position2 = element2.getLocation();


        int element1X = position1.getX();
        int element2X = position2.getX();


        if (element1X < element2X) {
            Assert.assertTrue(element1X < element2X);
            logger.error("login butonu solda");

        } else if (element1X > element2X) {
            Assert.assertFalse(element1X > element2X);
            logger.info("login butonu sagda");
        } else {
            System.out.println("Element1 ve Element2 yatay olarak aynı hizada.");
        }


    }


    @Then("Log out the page")
    public void logOutThePage() {

        doctorPanelPage.dropDownDoctorMenu.click();
        doctorPanelPage.logOutButton.click();

        Assert.assertTrue(doctorPanelPage.adminLoginFormBox.isDisplayed());


    }

    @When("Verify that is not possible to log in the doctor panel by entering incorrect or incomplete information")
    public void verify_that_is_not_possible_to_log_in_to_the_doctor_panel_by_entering_incorrect_or_incomplete_information_incorrect_incomplete_or_not_previously_reg() {

        String emailAddress = faker.internet().emailAddress();
        String incorrectPassword = faker.internet().password();

        doctorPanelPage.userNameBox.sendKeys(ConfigReader.getProperty("doctorIncorrectUserName"));
        doctorPanelPage.passwordBox.sendKeys(ConfigReader.getProperty("doctorIncorrectPassword"));
        doctorPanelPage.signInButton.click();

        Assert.assertTrue(doctorPanelPage.invalidDataAlert.isDisplayed());
        ReusableMethods.bekle(2);

    }


    @Given("Display the forget password link on the login page")
    public void displayTheForgetPasswordLinkOnTheLoginPage() {

        Assert.assertTrue(doctorPanelPage.forgotPasswordLink.isDisplayed());
    }

    @When("Click on the link and verify that forget password page opens")
    public void clickOnTheLinkAndVerifyThatForgetpasswordPageOpens() {

        doctorPanelPage.forgotPasswordLink.click();
        ReusableMethods.bekle(2);
        String expectedUrl = ConfigReader.getProperty("forgotPasswordUrl");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("Enter an valid e-mail address in the textbox and reset password and verify that an email is sent")
    public void enterAnValidEMailAddressInTheTextboxAndResetPasswordAndVerifyThatAnEmailIsSent() {


        String emailAddress = faker.internet().emailAddress();
        doctorPanelPage.forgotPasswordEmailBox.sendKeys(emailAddress);
        ReusableMethods.bekle(1);
        doctorPanelPage.forgotPasswordSubmitBox.click();

        Assert.assertTrue(doctorPanelPage.sentEmailAlert.isDisplayed());
        ReusableMethods.bekle(3);

    }


    @And("Display the admin login link on the forget password page")
    public void displayTheAdminLoginLink() {

        doctorPanelPage.returnToAdminLoginPage.isDisplayed();
    }


    @Given("Log in the doctor panel by entering the information \\(previously registered in the system) on the login page.")
    public void logInTheDoctorPanelByEnteringTheInformationPreviouslyRegisteredInTheSystemOnTheLoginPage() {

        doctorPanelPage.userNameBox.sendKeys(ConfigReader.getProperty("doctorUserName"));
        doctorPanelPage.passwordBox.sendKeys(ConfigReader.getProperty("doctorPassword"));
        doctorPanelPage.signInButton.click();
        ReusableMethods.bekle(1);
        String expectedUrl = "https://qa.heallifehospital.com/admin/admin/dashboard";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        ReusableMethods.bekle(1);


    }

    @And("Click on the link and return to the admin login page")
    public void clickOnTheLinkAndReturnToTheAdminLoginPage() {

        doctorPanelPage.returnToAdminLoginPage.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(doctorPanelPage.returnToAdminLoginPage.isDisplayed());
    }
}












