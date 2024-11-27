package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.HomePageHeaderPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;




public class HomeSteps {

    private static final Logger logger = LogManager.getLogger(HomeSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();

    HomePage homePage = new HomePage(driver);


    @Given("Hasta anasayfaya gider")
    public void hasta_anasayfaya_gider() {
        driver.get(ConfigReader.getProperty("url"));
        driver.get(driver.getCurrentUrl());
        logger.info("Ana Sayfa'ya gidildi");
    }
    @Given("Sayfaya erisebildigini test eder")
    public void sayfaya_erisebildigini_test_eder() {
        Assert.assertTrue(homePage.anaSayfaInsurancePlansYazisi.isDisplayed());
        logger.info("Kullanici ana sayfada 'Insurance Plans' yazisi goruldu");
    }

    @Given("Hasta anasayfaya ulasir")
    public void hasta_anasayfaya_ulasir() {
        driver.get(ConfigReader.getProperty("url"));
        driver.get(driver.getCurrentUrl());
        logger.info("Ana Sayfa'ya gidildi");
    }
    @Given("{string} yazisinin gorundugunu test eder.")
    public void yazisinin_gorundugunu_test_eder(String string) {
        Assert.assertTrue(homePage.anaSayfaInsurancePlansYazisi.isDisplayed());
        logger.info("Kullanici ana sayfada 'Insurance Plans' yazisi goruldu");
    }



}
