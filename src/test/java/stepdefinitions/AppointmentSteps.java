package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.AboutUsPage;
import pages.AppointmentPage;
import utilities.ReusableMethods;

import java.security.Key;

public class AppointmentSteps {
    private static final Logger logger = LogManager.getLogger(AppointmentSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    AppointmentPage appointmentPage = new AppointmentPage(driver);


    @Given("Launch Browser")
    public void launch_browser() {

    }
    @Then("Go to HealLifeHospital")
    public void go_to_heal_life_hospital() {
        driver.get("https://qa.heallifehospital.com/");
        ReusableMethods.bekle(2);
    }
    @Then("Click on Appointment")
    public void click_on_appointment() {
        utilities.ReusableMethods.bekle(2);
        appointmentPage.AppointmentButton.click();
        utilities.ReusableMethods.bekle(2);
    }
    @Then("Select Specialist, Doctor, Shift and Date")
    public void select_specialist_doctor_shift_and_date() {
        utilities.ReusableMethods.bekle(2);
        appointmentPage.SpecialistButton.click();
        utilities.ReusableMethods.bekle(2);
        appointmentPage.CardiologistButton.click();
        utilities.ReusableMethods.bekle(2);
        appointmentPage.DoctorButton.click();
        utilities.ReusableMethods.bekle(2);
        appointmentPage.SoniaButton.click();
        utilities.ReusableMethods.bekle(2);
        appointmentPage.ShifttButton.click();
        utilities.ReusableMethods.bekle(2);
        appointmentPage.EveningButton.click();
        utilities.ReusableMethods.bekle(3);
        appointmentPage.DateButton.click();
        utilities.ReusableMethods.bekle(3);
        appointmentPage.DateButton.click();
        utilities.ReusableMethods.bekle(3);
        appointmentPage.DateButton.clear();
        utilities.ReusableMethods.bekle(2);
        appointmentPage.DateButton.sendKeys("29.11.2024" + Keys.ENTER);
        utilities.ReusableMethods.bekle(3);
        appointmentPage.Message.click();
        appointmentPage.Message.click();
        appointmentPage.Message.sendKeys("I have a problem with my heart" + Keys.ENTER);
    }
    @Then("Message is entered")
    public void message_is_entered() {
        utilities.ReusableMethods.bekle(3);
        appointmentPage.Message.click();
        utilities.ReusableMethods.bekle(3);
        appointmentPage.Message.click();
        appointmentPage.Message.sendKeys("I have a problem with my heart" + Keys.ENTER);
    }
    @Then("Select proper time slot")
    public void select_proper_time_slot() {
      appointmentPage.slot.click();
        utilities.ReusableMethods.bekle(3);
      appointmentPage.timeSelection.click();
      appointmentPage.patientName.sendKeys("marcus" + Keys.ENTER);
        utilities.ReusableMethods.bekle(3);
      appointmentPage.email.sendKeys("marcus@gmail.com" + Keys.ENTER);
        utilities.ReusableMethods.bekle(3);
      appointmentPage.phone.sendKeys("+905457894589");
        utilities.ReusableMethods.bekle(3);

    }
    @Then("Dashboard should be seen")
    public void dashboard_should_be_seen() {
        //appointmentPage.submitButton.click();
    }
}
