package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AboutUsPage;
import pages.Admin_OPDPage;
import utilities.ReusableMethods;

public class Admin_OPDSteps {
    private static final Logger logger = LogManager.getLogger(Admin_OPDSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_OPDPage admin_OPDPage = new Admin_OPDPage(driver);

    @Given("admin adminURL ye giris yapar")
    public void admin_admin_url_ye_giris_yapar() {
        driver.get(ConfigReader.getProperty("adminURL"));
        String exceptedUrl = ConfigReader.getProperty("adminURL");
        Assert.assertEquals(exceptedUrl,driver.getCurrentUrl());

    }

    @Then("sayfada usarname kismina mervenur.admin@heallifehospital.com password kismina o6*d@fko3PXL1 verisini girer ve sing in butonunu tiklar")
    public void sayfada_usarname_kismina_mervenur_admin_heallifehospital_com_password_kismina_o6_d_fko3pxl1_verisini_girer_ve_sing_in_butonunu_tiklar() {

        admin_OPDPage.adminloginusername.sendKeys("mervenur.admin@heallifehospital.com");
        admin_OPDPage.adminloginpassword.sendKeys("o6*d@fko3PXL1");
        admin_OPDPage.adminloginsingin.click();


    }
    @When("admin OPD butonuna tiklar")
    public void admin_opd_butonuna_tiklar() {

        admin_OPDPage.adminOPD.click();
        ReusableMethods.bekle(2);
    }

    @Then("OPD sayfasinda hastalara ait basliklari gorur")
    public void opd_sayfasinda_hastalara_ait_basliklari_gorur() {


        Assert.assertTrue(admin_OPDPage.adminOPDname.isDisplayed());
        Assert.assertTrue(admin_OPDPage.adminOPDpatient.isDisplayed());
        Assert.assertTrue(admin_OPDPage.adminOPDguardianname.isDisplayed());
        Assert.assertTrue(admin_OPDPage.adminOPDgender.isDisplayed());
        Assert.assertTrue(admin_OPDPage.adminOPDphone.isDisplayed());
        Assert.assertTrue(admin_OPDPage.adminOPDconsultant.isDisplayed());
        Assert.assertTrue(admin_OPDPage.adminOPDlastvisit.isDisplayed());
        Assert.assertTrue(admin_OPDPage.adminOPDtotalrecheckup.isDisplayed());


    }
    @Then("OPD sayfasinda basliklar uzerinden siralama yapar")
    public void opd_sayfasinda_basliklar_uzerinden_siralama_yapar() {

        admin_OPDPage.adminOPDname.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDnameAbraham.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDname.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDnameteam1.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDpatient.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDpatient137.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDpatient.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDpatient1.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDguardianname.click();
        ReusableMethods.bekle(2);
       Assert.assertTrue(admin_OPDPage.adminOPDguardiannamebosluk.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDguardianname.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDguardiannameyeohs.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDgender.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDgenderbosluk.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDgender.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDgendermale.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDphone.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDPhonebosluk.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDphone.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDphonenumara.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDconsultant.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminconcultantamitsingh.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDconsultant.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminconsultantsoniabush.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDlastvisit.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDlastvisittarih1.isDisplayed());
        ReusableMethods.bekle(2);
        admin_OPDPage.adminOPDlastvisit.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_OPDPage.adminOPDlastvisittarih2.isDisplayed());


    }
    @When("OPD sayfasinda serchbox butonunu gorur")
    public void opd_sayfasinda_serchbox_butonunu_gorur() {
        Assert.assertTrue(admin_OPDPage.adminOPDSearch.isDisplayed());
    }

    @Then("OPD sayfasinda liste elemanlarini all ve {int} olarak secer")
    public void opd_sayfasinda_liste_elemanlarini_all_ve_olarak_secer(Integer int1) {


        admin_OPDPage.adminOPDlist.click();
        ReusableMethods.bekle(1);
        Select select=new Select(admin_OPDPage.adminOPDlist);
        ReusableMethods.bekle(1);
        select.selectByValue("-1");
        admin_OPDPage.adminOPDlist.click();
        ReusableMethods.bekle(1);
        Select select1=new Select(admin_OPDPage.adminOPDlist);
        select.selectByValue("100");






    }

    @When("OPD sayfasinda yeni hasta ekleyebilmek icin Add Patient butonuna tiklar.")
    public void opd_sayfasinda_yeni_hasta_ekleyebilmek_icin_add_patient_butonuna_tiklar() {

        admin_OPDPage.adminOPDAddpatient.click();
    }
    @Then("gelinen sayfada new patient butonuna tiklar")
    public void gelinen_sayfada_new_patient_butonuna_tiklar() {

        admin_OPDPage.adminOPDNewpatient.click();
    }
    @When("name ,age zorunlu alanlarini doldurur ve save butonuna tiklar succesfully penceresini gorur")
    public void name_age_zorunlu_alanlarini_doldurur_ve_save_butonuna_tiklar_succesfully_penceresini_gorur() {

        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDNewpatientName.sendKeys("ömer");
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDNewpatientyear.sendKeys("2000");
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDNewpatientmonth.sendKeys("05");
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDNewpatientday.sendKeys("12");
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDNewpatientsave.click();
        ReusableMethods.bekle(1);
        Assert.assertTrue(admin_OPDPage.adminOPDNewpatientsuccesfully.isDisplayed());

    }
    @When("patient sayfasinda  Appointment Date, Consultant doctor, Charge zorunlu alanlarini doldurur ve save butonuna tiklayarak succesfully penceresini gorerek kaydinin basarili oldugunu anlar")
    public void patient_sayfasinda_appointment_date_consultant_doctor_charge_zorunlu_alanlarini_doldurur_ve_save_butonuna_tiklayarak_succesfully_penceresini_gorerek_kaydinin_basarili_oldugunu_anlar() {


        Actions actions=new Actions(driver);
        ReusableMethods.bekle(1);
        admin_OPDPage.ADDpatientappointmentdate.click();
        ReusableMethods.bekle(1);
        admin_OPDPage.ADDpatientappointmentdate30.click();
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientconsulttantdoctor.click();
        ReusableMethods.bekle(2);
        //Select select=new Select(admin_OPDPage.adminOPDAddpatientconsulttantdoctor);
       // select.selectByValue("1005");
        admin_OPDPage.adminOPDAddpatientconsulttantdoctortextbox.sendKeys("1002");
        admin_OPDPage.adminOPDAddpatientconsulttantdoctortextbox.sendKeys(Keys.ENTER);

        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientchargecategory.click();
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientchargecategorytextbox.sendKeys("OPD Service");
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientchargecategorytextbox.sendKeys(Keys.ENTER);



        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientcharge.click();
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientchargetextbox.sendKeys("OPD Service");
        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientchargetextbox.sendKeys(Keys.ENTER);

        admin_OPDPage.Addpatientappliedcharge.sendKeys("120.00");


        ReusableMethods.bekle(3);
        admin_OPDPage.Addpatientamount.sendKeys("144");
        ReusableMethods.bekle(3);

        admin_OPDPage.Addpatientpaidamount.clear();
        admin_OPDPage.Addpatientpaidamount.sendKeys("144.00");

        ReusableMethods.bekle(1);
        admin_OPDPage.adminOPDAddpatientsave.click();










    }



}
