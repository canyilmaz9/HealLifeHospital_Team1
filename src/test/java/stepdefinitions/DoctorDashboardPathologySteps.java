package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.DoctorDashboardPathologyPage;
import pages.HomePageHeaderPage;
import pages.UserDashboardPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class DoctorDashboardPathologySteps {

    private static final Logger logger = LogManager.getLogger(HomePageHeaderSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();

    HomePageHeaderPage homePageHeaderPage = new HomePageHeaderPage(driver);
    UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
    DoctorDashboardPathologyPage doctorDashboardPathologyPage = new DoctorDashboardPathologyPage(driver);

    @When("Verifies that it is Doctor Dashboard Page")
    public void verifies_that_it_is_doctor_dashboard_page() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorDashboardPageDocImg.isDisplayed());
        logger.info("Doctor Dashboard sayfasının açıldığı test edildi");
    }
    @Then("Verifies that Doctor Dashboard Pathology button is visible")
    public void verifies_that_doctor_dashboard_pathology_button_is_visible() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorDashboardPathologyButton.isDisplayed());
        logger.info("Doctor Dashboard Pathology butonunun görünür olduğu test edildi");
    }
    @Then("Clicks on the Doctor Dashboard Pathology button")
    public void clicks_on_the_doctor_dashboard_pathology_button() {
        doctorDashboardPathologyPage.DoctorDashboardPathologyButton.click();
        logger.info("Doctor Dashboard Pathology butonuna tıklandı");
    }
    @Then("Verifies that it is Doctor Dashboard Pathology Page")
    public void verifies_that_it_is_doctor_dashboard_pathology_page() {
        Assert.assertTrue(doctorDashboardPathologyPage.DoctorPathologyPagePatholoyBillText.isDisplayed());
        logger.info("Doctor Dashboard Pathology sayfasının açıldığı test edildi");
    }






}
