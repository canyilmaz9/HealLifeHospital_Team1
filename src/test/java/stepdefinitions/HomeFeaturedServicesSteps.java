package stepdefinitions;

import config.ConfigReader;
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
import utilities.ReusableMethods;


public class HomeFeaturedServicesSteps {
    private static final Logger logger = LogManager.getLogger(HomeFeaturedServicesSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    HomePage homePage = new HomePage(driver);
    Actions action = new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;


    @Given("Kullanici browser acar ve url ile anasayfaya gider")
public void kullanici_browser_acar_ve_url_ile_anasayfaya_gider() {
        String url= ConfigReader.getProperty("homePageUrl");
        driver.get(url);
        ReusableMethods.bekle(2);


    }
    @When("Anasayfada Featured Services basliginin bulundugunu dogrular")
    public void anasayfada_featured_services_basliginin_bulundugunu_dogrular() throws InterruptedException {
        js.executeScript("window.scrollBy(0,600)", "");
        ReusableMethods.bekle(2);
        String expectedFeaturedServices = "Featured Services";
        String actualFSYazisi = homePage.featuredServicesTitle.getText();
        Assert.assertEquals(expectedFeaturedServices, actualFSYazisi);
        System.out.println(actualFSYazisi);
        Thread.sleep(3000);
    }
    @When("Featured Services basliginin altinda Medical treatment panosuna erisir")
    public void featured_services_basliginin_altinda_medical_treatment_panosuna_erisir() throws InterruptedException {
        String expectedMedicalTreatment = "Medical Treatment";
        String actualMTYazisi = homePage.medicalTreatment.getText();
        Assert.assertEquals(expectedMedicalTreatment, actualMTYazisi);
        System.out.println(actualMTYazisi);
        Thread.sleep(3000);


    }

    @Then("Featured Services basliginin altinda Emergency Help panosuna erisir")
    public void featuredServicesBasligininAltindaEmergencyHelpPanosunaErisir() throws InterruptedException {
        String expectedEmergencyHelp = "Emergency Help";
        String actualEHYazisi = homePage.emergencyHelpTitle.getText();
        Assert.assertEquals(expectedEmergencyHelp, actualEHYazisi);
        System.out.println(actualEHYazisi);
        Thread.sleep(3000);

    }

    @Then("Featured Services basliginin altinda Qualified Doctors panosuna erisir")
    public void featuredServicesBasligininAltindaQualifiedDoctorsPanosunaErisir() throws InterruptedException {
        String expectedQualifiedDoctors = "Qualified Doctors";
        String actualQDYazisi = homePage.qualifiedDoctorsTitle.getText();
        Assert.assertEquals(expectedQualifiedDoctors, actualQDYazisi);
        System.out.println(actualQDYazisi);
        Thread.sleep(3000);

    }

    @Then("Featured Services basliginin altinda Professionals panosuna erisir")
    public void featuredServicesBasligininAltindaProfessionalsPanosunaErisir() throws InterruptedException {
        String expectedMedicalProfessionals = "Medical Professionals";
        String actualMPYazisi = homePage.medicalProfessionalsTitle.getText();
        Assert.assertEquals(expectedMedicalProfessionals, actualMPYazisi);
        System.out.println(actualMPYazisi);
        Thread.sleep(3000);

    }
}
