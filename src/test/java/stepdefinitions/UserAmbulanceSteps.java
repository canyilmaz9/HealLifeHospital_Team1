package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePageHeaderPage;
import pages.UserAmbulancePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class UserAmbulanceSteps {

    private static final Logger logger = LogManager.getLogger(HomePageHeaderSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();

    HomePageHeaderPage homePageHeaderPage = new HomePageHeaderPage(driver);
    UserAmbulancePage userAmbulancePage = new UserAmbulancePage(driver);

    @Given("Hasta browser acar ve url girer")
    public void hasta_browser_acar_ve_url_girer() {
        driver.get(ConfigReader.getProperty("loginPageUrl"));
        logger.info("User Login sayfasına gidildi");
        ReusableMethods.bekle(2);}


    @Then("Acilan sayfada dogru name ve password girerek login yapar")
    public void acilan_sayfada_dogru_name_ve_password_girerek_login_yapar() {
        driver.findElement(By.id("email")).sendKeys("pat93");
        driver.findElement(By.id("password")).sendKeys("hui0up");
        ReusableMethods.bekle(2);}


     @When("Login butonuna tiklar")
        public void loginButonunaTiklar() {
        logger.info("User Login sayfasında geçerli kullanıcı adı ve şifresi girildi");
        driver.findElement(By.className("btn")).click();
        logger.info("User Login sayfasında Login butonuna tıklandı");
        ReusableMethods.bekle(2);}



    @Then("Anasayfanin tamamina basarili bir sekilde erisir")
    public void anasayfaninTamaminaBasariliBirSekildeErisir() {

    String expUrl = "https://qa.heallifehospital.com/patient/dashboard";
    String actUrl = driver.getCurrentUrl();
    Assert.assertEquals(expUrl, actUrl);
    logger.info("Hasta Dashboard sayfasına basarili sekilde erisdi");
    ReusableMethods.bekle(2);}


    @Then("Anasayfa Dashboard sidebarda Ambulance bolumunu gorur")
    public void anasayfa_dashboard_sidebarda_ambulance_bolumunu_gorur() {
        Assert.assertTrue(userAmbulancePage.userAmbulanceButton.isDisplayed());
        logger.info("Dashboardda Ambulance butonunun görünür olduğu test edildi");
        ReusableMethods.bekle(2);}


    @Then("Ambulance bolumune tiklar")
    public void ambulance_bolumune_tiklar() {
        userAmbulancePage.userAmbulanceButton.click();
        logger.info("Dashboardda Ambulance butonuna tıklandı");
        ReusableMethods.bekle(2);}


    @Then("Acilan sayfada Bill No basligini gorur")
   public void acilan_sayfada_bill_no_basligini_gorur() {
    ReusableMethods.bekle(2);}


    @Then("Acilan sayfadaVehicle Number basligini gorur")
    public void acilan_sayfada_vehicle_number_basligini_gorur() {
  userAmbulancePage.vehicleNumberTitle.isDisplayed();
   logger.info("Vehicle number basligi goruldu");
   ReusableMethods.bekle(2);}


    @When("Acilan sayfadaDriver Name basligini gorur")
    public void acilan_sayfada_driver_name_basligini_gorur() {
   userAmbulancePage.driverNameTitle.isDisplayed();
   logger.info("Driver name basligi goruldu");
   ReusableMethods.bekle(2);}


   @Then("Acilan sayfadaDriver Contact  basligini gorur")
    public void acilan_sayfada_driver_contact_basligini_gorur() {
    userAmbulancePage.driverContactNumber.isDisplayed();
   logger.info("Driver Contact Number basligi goruldu");
    ReusableMethods.bekle(2);}

    @Then("Acilan sayfadaAmount($) basligini gorur")
   public void acilan_sayfada_amount_$_basligini_gorur() {
   userAmbulancePage.amountTitle.isDisplayed();
    logger.info("Amount basligi goruldu");
    ReusableMethods.bekle(2);}


    @Then("Acilan sayfadaTax(%) basligini gorur")
    public void acilan_sayfada_tax_basligini_gorur() {
     userAmbulancePage.taxTitle.isDisplayed();
    logger.info("Tax basligi goruldu");
    ReusableMethods.bekle(2);}


    @When("Acilan sayfadaNet Amount($) basligini gorur")
    public void acilan_sayfada_net_amount_$_basligini_gorur() {
    userAmbulancePage.netAmountTitle.isDisplayed();
    logger.info("Net Amount basligi goruldu");
    ReusableMethods.bekle(2);}


    @When("Acilan sayfada Paid Amount basligini gorur")
    public void acilanSayfadaPaidAmountBasliginiGorur() {
    userAmbulancePage.paidAmountTitle.isDisplayed();
    logger.info("Paid Amount basligi goruldu");
    ReusableMethods.bekle(2);}


    @Then("Acilan sayfadaBalance Amount  basligini gorur")
    public void acilanSayfadaBalanceAmountBasliginiGorur() {
   userAmbulancePage.balanceAmountTitle.isDisplayed();
   logger.info("Balance amount basligi goruldu");
 ReusableMethods.bekle(2);}

  @When("Acilan sayfadaAction basligini gorur")
   public void acilan_sayfada_action_basligini_gorur() {
    userAmbulancePage.actionButton.isDisplayed();
    logger.info("Action basligi goruldu");
        ReusableMethods.bekle(2); }

}


