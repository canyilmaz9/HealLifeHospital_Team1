package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AboutUsPage;
import pages.AppointmentPage;
import utilities.ReusableMethods;

import java.security.Key;
import java.time.Duration;

import static stepdefinitions.DoctorIPDFeatureSteps.actions;

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

    @And("Click on Finance then Income")
    public void clickOnFinanceThenIncome() {

        utilities.ReusableMethods.bekle(3);

        appointmentPage.FinanceButton.click();
        utilities.ReusableMethods.bekle(3);
        //actions.moveToElement(appointmentPage.Income).perform();
        appointmentPage.Income.click();
        utilities.ReusableMethods.bekle(3);

    }

    @And("Check page titles")
    public void checkPageTitles() {
        String exceptedUrl = "https://qa.heallifehospital.com/admin/income";
        Assert.assertEquals(exceptedUrl,driver.getCurrentUrl());
    }

    @And("Check Search Box")
    public void checkSearchBox() {
        utilities.ReusableMethods.bekle(3);
        appointmentPage.SearchBoxIncome.sendKeys("aaa" + Keys.ENTER);
        utilities.ReusableMethods.bekle(3);
        appointmentPage.AddIncome.click();
        utilities.ReusableMethods.bekle(3);

    }

    @And("Add Income, enter data and save")
    public void addIncomeEnterDataAndSave() {

        appointmentPage.IncomeHead.click();
        utilities.ReusableMethods.bekle(3);
        Select select = new Select(appointmentPage.IncomeHead);
        String selectedOption = select.getFirstSelectedOption().getText();
        utilities.ReusableMethods.bekle(3);
        appointmentPage.IncomeName.sendKeys("marcus" + Keys.ENTER);
        utilities.ReusableMethods.bekle(2);
        appointmentPage.IncomeAmount.sendKeys("100" + Keys.ENTER);
        utilities.ReusableMethods.bekle(2);
        appointmentPage.IncomeSave.click();
    }

    @And("Click on Expense")
    public void clickOnExpense() {
        appointmentPage.FinanceButton.click();
        utilities.ReusableMethods.bekle(4);
        appointmentPage.Expence.click();
        utilities.ReusableMethods.bekle(3);
    }

    @And("Check Search Box for Expense")
    public void checkSearchBoxForExpense() {
        utilities.ReusableMethods.bekle(3);
        appointmentPage.SearchBoxIncome.sendKeys("For intensive care units" + Keys.ENTER);
        utilities.ReusableMethods.bekle(3);
        appointmentPage.AddExpence.click();
        utilities.ReusableMethods.bekle(3);
    }

    @And("Add Expense, enter data and save")
    public void addExpenseEnterDataAndSave() {

        appointmentPage.ExpenceHead.click();
        utilities.ReusableMethods.bekle(3);
        appointmentPage.ExpenceSelect.click();
        utilities.ReusableMethods.bekle(3);
        appointmentPage.IncomeName.sendKeys("marcus" + Keys.ENTER);
        utilities.ReusableMethods.bekle(2);
        appointmentPage.IncomeAmount.sendKeys("100" + Keys.ENTER);
        utilities.ReusableMethods.bekle(2);
        appointmentPage.ExpenceSave.click();
    }


    @And("Enter the valid doctor username and password")
    public void enterTheValidDoctorUsernameAndPassword() {
    }

    @And("Check \\(the titles Patient Name, Appointment No, Appointment Date, Phone, Gender Doctor, Source, Priority, Live Consultant, Fess, Status")
    public void checkTheTitlesPatientNameAppointmentNoAppointmentDatePhoneGenderDoctorSourcePriorityLiveConsultantFessStatus() {
    }

    @And("Check wheter {int} or All should be chosen")
    public void checkWheterOrAllShouldBeChosen(int arg0) {
    }

    @And("Click Show and print")
    public void clickShowAndPrint() {
    }

    @Then("Click on Doctor Wise")
    public void clickOnDoctorWise() {
    }

    @And("List Appointments")
    public void listAppointments() {
    }

    @And("Click on Queue")
    public void clickOnQueue() {
    }

    @Then("Click on Doctor, Shift, Date, Slot")
    public void clickOnDoctorShiftDateSlot() {
    }

    @And("Check wheter {string} or All should be chosen")
    public void checkWheterOrAllShouldBeChosen(String arg0) {
        //100
    }
}
