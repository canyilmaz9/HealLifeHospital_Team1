package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.AdminDashboardPage;
import pages.Admin_Pharmacy_Pathology_RadiologyPage;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class Admin_Pharmacy_Pathology_RadiologySteps {
    private static final Logger logger = LogManager.getLogger(Admin_Pharmacy_Pathology_RadiologySteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_Pharmacy_Pathology_RadiologyPage admin_Pharmacy_Pathology_RadiologyPage = new Admin_Pharmacy_Pathology_RadiologyPage(driver);

    AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);

    @Given("Hasta admin Dashboard URL'ine gider")
    public void hasta_admin_dashboard_url_ine_gider() {
        String url = ConfigReader.getProperty("adminURL");
        driver.get(url);

        logger.info("Admin sayfasina giris yapildi");

        ReusableMethods.bekle(3);
    }

    @Given("Hasta Username kutucuguna mailini girer")
    public void hasta_username_kutucuguna_mailini_girer() {
        adminDashboardPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("adminFatmaUsername"));
        ReusableMethods.bekle(1);
        logger.info("Username girildi");
    }

    @Then("Passwordunu girer")
    public void passwordunu_girer() {
        adminDashboardPage.adminLoginPassword.sendKeys(ConfigReader.getProperty("adminFatmaPassword"));
        ReusableMethods.bekle(1);
        logger.info("Password girildi");
    }

    @Then("Sign In butonunu tiklar ve Login olur")
    public void sign_in_butonunu_tiklar_ve_login_olur() {
        adminDashboardPage.adminLoginSignIn.click();
        ReusableMethods.bekle(1);
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
        ReusableMethods.bekle(1);
        Assert.assertTrue(admin_Pharmacy_Pathology_RadiologyPage.PathologyBillTexti.isDisplayed());
        logger.info("Pathology butonuna tikladi ve sayfaya gittigini dogruladi");
    }


    @Given("Pathology sayfasinda Pathology Test Reports basliklarini test eder")
    public void pathology_sayfasinda_pathology_test_reports_basliklarini_test_eder(io.cucumber.datatable.DataTable dataTable) {

        String url = ConfigReader.getProperty("adminURL");
        driver.get(url);
        adminDashboardPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("adminFatmaUsername"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginPassword.sendKeys(ConfigReader.getProperty("adminFatmaPassword"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginSignIn.click();
        ReusableMethods.bekle(1);
        admin_Pharmacy_Pathology_RadiologyPage.PathologyButonu.click();
        ReusableMethods.bekle(1);

        List<String> expectedHeaders = Arrays.asList(
                "Bill No",
                "Reporting Date",
                "Patient Name",
                "Reference Doctor"
        );
        for (int i = 0; i < admin_Pharmacy_Pathology_RadiologyPage.PathologyBasliklar.size(); i++) {
            String headerText = admin_Pharmacy_Pathology_RadiologyPage.PathologyBasliklar.get(i).getText();

            Assert.assertTrue("Beklenen: " + expectedHeaders.get(i) + ", Bulunan: " + headerText + "",
                    headerText.contains(expectedHeaders.get(i)));

        }
        ReusableMethods.bekle(1);

        List<String> expectedAmountHeaders = Arrays.asList(
                "Amount ($)",
                "Paid Amount($)"
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
        String url = ConfigReader.getProperty("adminURL");
        driver.get(url);
    }
    @Given("Username ve Password girer ve Sign In olur")
    public void username_ve_password_girer_ve_sign_ın_olur() {
        adminDashboardPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("adminFatmaUsername"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginPassword.sendKeys(ConfigReader.getProperty("adminFatmaPassword"));
        ReusableMethods.bekle(1);
        adminDashboardPage.adminLoginSignIn.click();
        ReusableMethods.bekle(1);
    }
    @Then("Pathology butonuna tiklar ve searchBox kutusunda arama yapar")
    public void pathology_butonuna_tiklar_ve_search_box_kutusunda_arama_yapar() {
        admin_Pharmacy_Pathology_RadiologyPage.PathologyButonu.click();
        ReusableMethods.bekle(1);

    }
    @When("Test Reports List'te siralama yapar")
    public void test_reports_list_te_siralama_yapar() {

    }
    @Then("Test Reports List'te Action basligi altinda \\(View Payments, View Reports ve Pay) islemler yapar")
    public void test_reports_list_te_action_basligi_altinda_view_payments_view_reports_ve_pay_islemler_yapar() {

    }

}






