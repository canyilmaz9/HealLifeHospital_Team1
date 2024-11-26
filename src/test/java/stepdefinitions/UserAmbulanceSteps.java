package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePageGeneralPage;
import pages.HomePageHeaderPage;
import pages.UserAmbulancePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class UserAmbulanceSteps {

    private static final Logger logger = LogManager.getLogger(UserAmbulanceSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    UserAmbulancePage userAmbulancelPage = new UserAmbulancePage(driver);
    HomePageHeaderPage homePageHeaderPage = new HomePageHeaderPage(driver);


    @Given("Hasta browser acar ve url girer")
    public void hasta_browser_acar_ve_url_girer() throws InterruptedException {

        driver.get(ConfigReader.getProperty("loginPageUrl"));
        logger.info("User Login sayfasına gidildi");

    }


    @Then("Acilan sayfada dogru name ve password girerek login yapar")
    public void acilan_sayfada_dogru_name_ve_password_girerek_login_yapar() {
        driver.findElement(By.id("email")).sendKeys("pat93");
        driver.findElement(By.id("password")).sendKeys("hui0up");
    }


     @When("Login butonuna tiklar")
        public void loginButonunaTiklar() {
        logger.info("User Login sayfasında geçerli kullanıcı adı ve şifresi girildi");
        driver.findElement(By.className("btn")).click();
        logger.info("User Login sayfasında Login butonuna tıklandı");
     ;}


    @Then("Anasayfanin tamamina basarili bir sekilde erisir")
    public void anasayfaninTamaminaBasariliBirSekildeErisir() {

    String expUrl = "https://qa.heallifehospital.com/patient/dashboard";
    String actUrl = driver.getCurrentUrl();
    Assert.assertEquals(expUrl, actUrl);
    logger.info("Hasta Dashboard sayfasına basarili sekilde erisdi");
    ReusableMethods.bekle(2);}


    @Then("Anasayfa Dashboard sidebarda Ambulance bolumunu gorur")
    public void anasayfa_dashboard_sidebarda_ambulance_bolumunu_gorur() {
        Assert.assertTrue(userAmbulancelPage.userAmbulanceButton.isDisplayed());
        logger.info("Dashboardda Ambulance butonunun görünür olduğu test edildi");
        ReusableMethods.bekle(2);}


    @Then("Ambulance bolumune tiklar")
    public void ambulance_bolumune_tiklar() {
        userAmbulancelPage.userAmbulanceButton.click();
        logger.info("Dashboardda Ambulance butonuna tıklandı");
        ReusableMethods.bekle(2);



    }







    }





