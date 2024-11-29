package stepdefinitions;

import config.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AboutUsPage;
import pages.AdminDashboardPage;
import pages.Admin_Pharmacy_Pathology_RadiologyPage;
import utilities.ReusableMethods;
import io.cucumber.core.exception.CucumberException;

import java.util.Arrays;
import java.util.List;

public class Admin_Pharmacy_Pathology_RadiologySteps {
    private static final Logger logger = LogManager.getLogger(Admin_Pharmacy_Pathology_RadiologySteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_Pharmacy_Pathology_RadiologyPage admin_Pharmacy_Pathology_RadiologyPage = new Admin_Pharmacy_Pathology_RadiologyPage(driver);

    AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);

    Actions actions = new Actions(driver);

    @Given("Hasta admin Dashboard URL'ine gider")
    public void hasta_admin_dashboard_url_ine_gider() {
        String url = ConfigReader.getProperty("hastaURL");
        driver.get(url);

        logger.info("Admin sayfasina giris yapildi");

        ReusableMethods.bekle(3);
    }

    @Given("Hasta Username kutucuguna mailini girer")
    public void hasta_username_kutucuguna_mailini_girer() {
        adminDashboardPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("fatmaHastaUsername"));
        ReusableMethods.bekle(1);
        logger.info("Username girildi");
    }

    @Then("Passwordunu girer")
    public void passwordunu_girer() {
        adminDashboardPage.adminLoginPassword.sendKeys(ConfigReader.getProperty("fatmaHastaPassword"));
        ReusableMethods.bekle(1);
        logger.info("Password girildi");
    }

    @Then("Sign In butonunu tiklar ve Login olur")
    public void sign_in_butonunu_tiklar_ve_login_olur() {
        adminDashboardPage.adminLoginSignIn.click();
        ReusableMethods.bekle(3);
        logger.info("Admin Dashboard sayfasina gidildi: ");
    }

    @When("Pathology basliginin gorundugunu test eder")
    public void pathology_basliginin_gorundugunu_test_eder() {
        Assert.assertTrue(admin_Pharmacy_Pathology_RadiologyPage.PathologyButonu.isDisplayed());

        logger.info("Hasta Pathology sayfasina giris yapabildi");
        ReusableMethods.bekle(3);

    }

    @When("Pathology butonuna tiklar")
    public void pathology_butonuna_tiklar() {
        admin_Pharmacy_Pathology_RadiologyPage.PathologyButonu.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(admin_Pharmacy_Pathology_RadiologyPage.PathologyBillTexti.isDisplayed());
        logger.info("Pathology butonuna tikladi ve sayfaya gittigini dogruladi");
    }


    @Given("Pathology sayfasinda Pathology Test Reports basliklarini test eder")
    public void pathology_sayfasinda_pathology_test_reports_basliklarini_test_eder() {

        String url = ConfigReader.getProperty("hastaURL");
        driver.get(url);
        ReusableMethods.bekle(2);
        adminDashboardPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("fatmaHastaUsername"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginPassword.sendKeys(ConfigReader.getProperty("fatmaHastaPassword"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginSignIn.click();
        ReusableMethods.bekle(1);
        admin_Pharmacy_Pathology_RadiologyPage.PathologyButonu.click();
        ReusableMethods.bekle(3);

        List<String> expectedHeaders = Arrays.asList(
                "Bill No",
                "Reporting Date",
                "Reference Doctor",
                "Note"
        );
        for (int i = 0; i < admin_Pharmacy_Pathology_RadiologyPage.PathologyBasliklar.size(); i++) {
            String headerText = admin_Pharmacy_Pathology_RadiologyPage.PathologyBasliklar.get(i).getText();

            Assert.assertTrue("Beklenen: " + expectedHeaders.get(i) + ", Bulunan: " + headerText + "",
                    headerText.contains(expectedHeaders.get(i)));

        }
        ReusableMethods.bekle(1);

        List<String> expectedAmountHeaders = Arrays.asList(
                "Amount ($)",
                "Paid Amount($)",
                "Balance Amount ($)"
        );
        for (int i = 0; i < admin_Pharmacy_Pathology_RadiologyPage.AmountBasliklar.size(); i++) {
            String headerText = admin_Pharmacy_Pathology_RadiologyPage.AmountBasliklar.get(i).getText();

            Assert.assertTrue("Beklenen: " + expectedAmountHeaders.get(i) + ", Bulunan: " + headerText + "",
                    headerText.contains(expectedAmountHeaders.get(i)));

        }
        ReusableMethods.bekle(1);

    }


    @Given("Hasta admin Dashboard sayfasina gider.")
    public void hasta_admin_dashboard_sayfasina_gider() {
        String url = ConfigReader.getProperty("loginPageUrl");
        driver.get(url);
    }

    @Given("Username ve Password girer ve Sign In olur")
    public void username_ve_password_girer_ve_sign_ın_olur() {
        adminDashboardPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("fatmaHastaUsername"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginPassword.sendKeys(ConfigReader.getProperty("fatmaHastaPassword"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginSignIn.click();
        ReusableMethods.bekle(1);
    }

    @Then("Pathology butonuna tiklar ve searchBox kutusunda arama yapar")
    public void pathology_butonuna_tiklar_ve_search_box_kutusunda_arama_yapar() {
        admin_Pharmacy_Pathology_RadiologyPage.PathologyButonu.click();
        ReusableMethods.bekle(3);
        actions.moveToElement(admin_Pharmacy_Pathology_RadiologyPage.PathologySearch).perform();
        ReusableMethods.bekle(7);
        admin_Pharmacy_Pathology_RadiologyPage.PathologySearch.sendKeys("APPNO223");
        ReusableMethods.bekle(10);
        String expectedResult="No data available in table ";
        String actualResult=admin_Pharmacy_Pathology_RadiologyPage.SearchResult.getText();
        ReusableMethods.bekle(3);
        Assert.assertEquals(expectedResult,actualResult);

    }
    @When("Test Reports List'te siralama yapar")
    public void test_reports_list_te_siralama_yapar() {
    Assert.assertTrue(admin_Pharmacy_Pathology_RadiologyPage.siralamaButonu.isEnabled());
    }

    @Then("Test Reports List'te Action basligi altinda \\(View Payments, View Reports ve Pay) islemler yapar")
    public void test_reports_list_te_action_basligi_altinda_view_payments_view_reports_ve_pay_islemler_yapar() {

        Assert.assertFalse(admin_Pharmacy_Pathology_RadiologyPage.ActionButonu.isEnabled());
    }



    @Given("Hasta Dashboard sidebar'inda Radiology menü basligi bulur ve tiklaninca {string} sayfasina gider")
    public void hasta_dashboard_sidebar_inda_radiology_menü_basligi_bulur_ve_tiklaninca_sayfasina_gider(String string) {
        String url = ConfigReader.getProperty("loginPageUrl");
        driver.get(url);
        adminDashboardPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("fatmaHastaUsername"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginPassword.sendKeys(ConfigReader.getProperty("fatmaHastaPassword"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginSignIn.click();
        ReusableMethods.bekle(1);
        admin_Pharmacy_Pathology_RadiologyPage.RadiologyButonu.click();
    }
    @Then("Radiology sayfasinda Radiology Test Reports List'te basliklari test eder")
    public void radiology_sayfasinda_radiology_test_reports_list_te_basliklari_test_eder() {
        List<String> expectedHeaders = Arrays.asList(
                "Bill No",
                "Case ID / Patient ID",
                "Reporting Date",
                "Reference Doctor",
                "Note"
        );
        for (int i = 0; i < admin_Pharmacy_Pathology_RadiologyPage.PathologyBasliklar.size(); i++) {
            String headerText = admin_Pharmacy_Pathology_RadiologyPage.PathologyBasliklar.get(i).getText();

            Assert.assertTrue("Beklenen: " + expectedHeaders.get(i) + ", Bulunan: " + headerText + "",
                    headerText.contains(expectedHeaders.get(i)));

        }
        ReusableMethods.bekle(1);

        List<String> expectedAmountHeaders = Arrays.asList(
                "Paid Amount($)",
                "Balance Amount ($)"
        );
        for (int i = 0; i < admin_Pharmacy_Pathology_RadiologyPage.AmountBasliklar.size(); i++) {
            String headerText = admin_Pharmacy_Pathology_RadiologyPage.AmountBasliklar.get(i).getText();

            Assert.assertTrue("Beklenen: " + expectedAmountHeaders.get(i) + ", Bulunan: " + headerText + "",
                    headerText.contains(expectedAmountHeaders.get(i)));

        }
        ReusableMethods.bekle(1);

        admin_Pharmacy_Pathology_RadiologyPage.AmountButonu.isDisplayed();
        ReusableMethods.bekle(1);
        admin_Pharmacy_Pathology_RadiologyPage.RadyologyAction.isDisplayed();
        ReusableMethods.bekle(1);
    }
    @Then("Radiology Test Reports List'te arama yapabilmek icin searchTextBox'i ve dogru arama yapmasini test eder")
    public void radiology_test_reports_list_te_arama_yapabilmek_icin_search_text_box_i_ve_dogru_arama_yapmasini_test_eder() {
    admin_Pharmacy_Pathology_RadiologyPage.PathologySearch.sendKeys("260");
    ReusableMethods.bekle(2);
    }
    @When("Radiology Test Reports List'te basliklar uzerinden listeyi test eder")
    public void radiology_test_reports_list_te_basliklar_uzerinden_listeyi_test_eder() {
    admin_Pharmacy_Pathology_RadiologyPage.PathologyBasliklar.size();
    }
    @Then("Radiology Test Reports List'teki Action basligi altinda \\(View Payments, View Reports ve Pay) islemleri yapilabilmeli.")
    public void radiology_test_reports_list_teki_action_basligi_altinda_view_payments_view_reports_ve_pay_islemleri_yapilabilmeli() {
        admin_Pharmacy_Pathology_RadiologyPage.RadyologyAction.isDisplayed();

    }




}





