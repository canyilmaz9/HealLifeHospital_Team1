package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePageFooterPage;
import pages.HomePageGeneralPage;
import utilities.ReusableMethods;

import javax.sound.midi.Soundbank;
import java.security.Key;

public class HomePageFooterSteps {

    private static final Logger logger = LogManager.getLogger(HomePageFooterSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePageFooterPage homePageFooterPage = new HomePageFooterPage(driver);
    Actions action = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;



    @Given("Go to the home page")
    public void goToTheHomePage() {
        String url= ConfigReader.getProperty("homePageUrl");
        driver.get(url);
        ReusableMethods.bekle(2);
    }

    @When("Scroll the page down to the bottom")
    public void scrollThePageDownToTheBottom() {


        js.executeScript("window.scrollBy(0,2100)", "");

        //action.scrollByAmount(2500,2500);
        ReusableMethods.bekle(2);

    }

    @Then("Display the title of Complain")
    public void displayTheTitleOfComplain() {

        action.moveToElement(homePageFooterPage.complainTitleLink);
        String actualTitle= homePageFooterPage.complainTitleLink.getText();

        String expectedTitle= "Complain";

        Assert.assertEquals(expectedTitle,actualTitle);
        ReusableMethods.bekle(2);

    }

    @And("Display the icon of pencil")
    public void displayTheIconOfPencil() {

        action.moveToElement(homePageFooterPage.complainIconLink);
        Assert.assertTrue(homePageFooterPage.complainIconLink.isDisplayed());
        ReusableMethods.bekle(2);


    }

    @Then("Click on the title of Complain")
    public void clickOnTheTitleOfComplain() {

        ReusableMethods.bekle(2);
        //action.click(homePage.complainTitleLink);
        homePageFooterPage.complainTitleLink.click();

    }

    @Then("Verify that the Complain Page is opened")
    public void verifyThatTheComplainPageIsOpened() {

        String expectedUrl = "https://qa.heallifehospital.com/page/complain";
        String actualUrl= driver.getCurrentUrl();


        //DriverManager.getDriver().get("complainPageUrl");
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Then("Go back to the home page")
    public void goBackToTheHomePage() {

        ReusableMethods.bekle(2);
        driver.navigate().back();
        //DriverManager.getDriver().navigate().back();

    }

    @And("Scroll the page down")
    public void scrollThePageDown() {

        action.scrollByAmount(6500, 6500);
        ReusableMethods.bekle(1);
    }


    @Then("Click on the icon of Complain")
    public void clickOnTheIconOfComplain() {
        homePageFooterPage.complainIconLink.click();

    }














}
