package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Admin_Billing_AppointmentPage;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class Admin_Billing_AppointmentSteps {
    private static final Logger logger = LogManager.getLogger(Admin_Billing_AppointmentSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    Admin_Billing_AppointmentPage adminBillingAppointmentPage = new Admin_Billing_AppointmentPage(driver);

    @Given("Admin, Admin Login sayfasinda")
    public void admin_admin_login_sayfasinda() {
        driver.get(ConfigReader.getProperty("adminURL"));
        String exceptedUrl = ConfigReader.getProperty("adminURL");
        Assert.assertEquals(exceptedUrl,driver.getCurrentUrl());
    }
    @Then("Onceden belirlenmis admin bilgileri ile sisteme giris yapar")
    public void onceden_belirlenmis_admin_bilgileri_ile_sisteme_giris_yapar() {
        adminBillingAppointmentPage.adminSignin(ConfigReader.getProperty("testData"),0,7,3,
                0,7,2);
        logger.info("Sisteme giris yapildi.");
        String exceptedUrl = "https://qa.heallifehospital.com/admin/admin/dashboard";
        Assert.assertEquals(exceptedUrl,driver.getCurrentUrl());
        logger.info("Giris yapildigi URL uzerinden dogrulandi.");
    }
    @And("Sisteme giris yaptigini dogruladiktan sonra, sidebar'da Appointment basligini goruntuler ve tiklar.")
    public void sisteme_giris_yaptigini_dogruladiktan_sonra_sidebar_da_appointment_basligini_goruntuler_ve_tiklar() {
        adminBillingAppointmentPage.sidebarAppointmentLink.isDisplayed();
        logger.info("Sidebar'da Appointment basligini goruntulendi");
        adminBillingAppointmentPage.sidebarAppointmentLink.click();
        logger.info("Appointment basligini tiklandi");
        String exceptedUrl = "https://qa.heallifehospital.com/admin/appointment/index";
        Assert.assertEquals(exceptedUrl,driver.getCurrentUrl());
        logger.info("Dogru sayfaya gidildigi URL uzerinden dogrulandi.");
    }
    @Then("Appointment sayfasindaki Appointment Details List'te\\(Patient Name, Appointment No, Appointment Date, Phone, Gender, Doctor, Source, Priorty, Fees, Status) basliklari olmali.")
    public void appointment_sayfasindaki_appointment_details_list_te_patient_name_appointment_no_appointment_date_phone_gender_doctor_source_priorty_fees_status_basliklari_olmali() {

        List<String> expectedHeaders = Arrays.asList(
                "Patient Name",
                "Appointment No",
                "Appointment Date",
                "Phone",
                "Gender",
                "Doctor",
                "Source",
                "Priority",
                "Live Consultant",
                "Fees"
        );
        for (int i = 0; i < adminBillingAppointmentPage.appointmentBasliklarList.size(); i++) {
            String headerText = adminBillingAppointmentPage.appointmentBasliklarList.get(i).getText();

            Assert.assertTrue(" Beklenen: '" + expectedHeaders.get(i) + "', Bulunan: '" + headerText + "'",
                    headerText.contains(expectedHeaders.get(i)));
        }

        Assert.assertTrue(adminBillingAppointmentPage.appointmentStatusTitle.getText().contains("Status"));

        logger.info("Appointment sayfasindaki Appointment Details List'te " +
                "(Patient Name, Appointment No, Appointment Date, Phone, Gender, Doctor," +
                " Source, Priorty, Fees, Status) basliklari oldugu dogrulandi. ");
    }

    @And("Appointment sayfasindaki Appointment Details List'te basliklar üzerinden siralama yapilabilmeli.")
    public void appointment_sayfasindaki_appointment_details_list_te_basliklar_üzerinden_siralama_yapilabilmeli() {
        for (int i = 0; i < adminBillingAppointmentPage.appointmentBasliklarList.size(); i++) {
            WebElement header = adminBillingAppointmentPage.appointmentBasliklarList.get(i);
            Assert.assertTrue(header.isEnabled());
            logger.info("Basliklar siralama yapmak icin tiklanilabilir.");
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        adminBillingAppointmentPage.appointmentBasliklarList.get(4).click();

        String genderText = adminBillingAppointmentPage.appointmentDetailsTable.findElements(By.tagName("tr")).get(1)
                .findElements(By.tagName("td")).get(4).getText();

        wait.until(ExpectedConditions.visibilityOfAllElements(adminBillingAppointmentPage.appointmentBasliklarList));
        wait.until(ExpectedConditions.elementToBeClickable(adminBillingAppointmentPage.appointmentBasliklarList.get(4))).click();

        String genderText1 = adminBillingAppointmentPage.appointmentDetailsTable.findElements(By.tagName("tr")).get(1)
                .findElements(By.tagName("td")).get(4).getText();

        Assert.assertNotEquals(genderText,genderText1);

        logger.info("Siralamanin degistigi Gender basligina tiklanmasi ile en ustteki cinsiyetin degisimi ile dogrulandi.");

    }

    @And("Appointment sayfasindaki Appointment Details List'te arama yapabilmek icin sayfada searchBox olmali.")
    public void appointment_sayfasindaki_appointment_details_list_te_arama_yapabilmek_icin_sayfada_search_box_olmali() {
        adminBillingAppointmentPage.appointmentSearchBox.isDisplayed();
        adminBillingAppointmentPage.appointmentSearchBox.sendKeys("veri girilebilir");
        String enteredText = adminBillingAppointmentPage.appointmentSearchBox.getAttribute("value");
        Assert.assertEquals(enteredText,"veri girilebilir");

        logger.info("Search box'a yazilan deger saglamasi yapildi.");

    }

    @And("Appointment sayfasindaki Appointment Details List'te Action basligi altinda appointment detayi görüntülenmeli.")
    public void appointment_sayfasindaki_appointment_details_list_te_action_basligi_altinda_appointment_detayi_görüntülenmeli() {
adminBillingAppointmentPage.appointmentStatusShowBtn.click();
    }

    @When("Appointment sayfasindan doktor secerek ilgili doktordan alinmis randevularinin görüntülenebilecegi bir sayfaya \\(ilgili islemleri yapabilmek icin) yönlendirme olmali.")
    public void appointmentSayfasindanDoktorSecerekIlgiliDoktordanAlinmisRandevularininGörüntülenebilecegiBirSayfayaIlgiliIslemleriYapabilmekIcinYönlendirmeOlmali() {
    }

    @Then("Doctor Wise Appointment sayfasinda Doctor ve Date secilerek filtrelemeye uygun randevu verileri listelenebilmeli.")
    public void doctorWiseAppointmentSayfasindaDoctorVeDateSecilerekFiltrelemeyeUygunRandevuVerileriListelenebilmeli() {
    }

    @When("Appointment sayfasindan \\(doktor vardiya gün ve slot secilerek) randevu almis hastalari filtreleyebilecegim bir sayfaya \\(ilgili islemleri yapabilmek icin) yönlendirme olmali.")
    public void appointmentSayfasindanDoktorVardiyaGünVeSlotSecilerekRandevuAlmisHastalariFiltreleyebilecegimBirSayfayaIlgiliIslemleriYapabilmekIcinYönlendirmeOlmali() {
    }

    @Then("Patient Queue sayfasinda doktor vardiya gün ve slot secildiginde \\( filtrelemeye uygun ) randevular listenebilmeli.")
    public void patientQueueSayfasindaDoktorVardiyaGünVeSlotSecildigindeFiltrelemeyeUygunRandevularListenebilmeli() {
    }
}