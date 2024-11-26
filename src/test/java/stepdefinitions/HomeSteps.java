package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import config.ConfigReader;
import pages.HomePageHeaderPage;
import utilities.ReusableMethods;

public class HomeSteps {
    private static final Logger logger = LogManager.getLogger(HomeSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePage homePage = new HomePage(driver);
    Actions action = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Given("Kullanici browser acar ve url girer")
    public void kullanici_browser_acar_ve_url_girer() {
        String url= ConfigReader.getProperty("homePageUrl");
        driver.get(url);
        ReusableMethods.bekle(2);
    }
    @Then("Anasayfada Featured Services başlığını görür")
    public void anasayfada_featured_services_başlığını_görür() throws InterruptedException {
        js.executeScript("window.scrollBy(1920,1080)", "");

        //action.scrollByAmount(2500,2500);
        ReusableMethods.bekle(2);
        String expectedFeaturedServices = "Featured Services";
        String actualFSYazisi = homePage.featuredServicesTitle.getText();
        Assert.assertEquals(expectedFeaturedServices, actualFSYazisi);
        System.out.println(actualFSYazisi);
        Thread.sleep(3000);
    }

    @When("Featured Services başlığının altında Medical Treatment panosuna erişir")
    public void featured_services_başlığının_altında_medical_treatment_panosuna_erişir() throws InterruptedException {
        String expectedMedicalTreatment = "Medical Treatment";
        String actualMTYazisi = homePage.medicalTreatment.getText();
        Assert.assertEquals(expectedMedicalTreatment, actualMTYazisi);
        System.out.println(actualMTYazisi);
        Thread.sleep(3000);
    }
    @When("Features Services başlığının altında Emergency help panosuna erişir")
    public void featured_services_başlığının_altında_emergency_help_panosuna_erişir() throws InterruptedException {
        String expectedEmergencyHelp = "Emergency Help";
        String actualEHYazisi = homePage.emergencyHelpTitle.getText();
        Assert.assertEquals(expectedEmergencyHelp, actualEHYazisi);
        System.out.println(actualEHYazisi);
        Thread.sleep(3000);
    }
    @When("Featured Services başlığının altında Qualified doctors panosuna erişir")
    public void featured_services_başlığının_altında_qualified_doctors_panosuna_erişir() throws InterruptedException {
        String expectedQualifiedDoctors = "Qualified Doctors";
        String actualQDYazisi = homePage.qualifiedDoctorsTitle.getText();
        Assert.assertEquals(expectedQualifiedDoctors, actualQDYazisi);
        System.out.println(actualQDYazisi);
        Thread.sleep(3000);
    }

    @When("Featured Services başlığının altında Medical professionals panosuna erişir")
    public void featured_services_başlığının_altında_medical_professionals_panosuna_erişir() throws InterruptedException {
        String expectedMedicalProfessionals = "Medical Professionals";
        String actualMPYazisi = homePage.medicalProfessionalsTitle.getText();
        Assert.assertEquals(expectedMedicalProfessionals, actualMPYazisi);
        System.out.println(actualMPYazisi);
        Thread.sleep(3000);
    }
}






