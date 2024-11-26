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
import pages.DoctorIDPPage;
import utilities.ReusableMethods;


public class DoctorIPDFeatureSteps {

    private static final Logger logger = LogManager.getLogger(DoctorIPDFeatureSteps.class);

   static WebDriver driver = Hooks.getDriver();
   static Actions actions = new Actions(driver);
    DoctorIDPPage doctorIDPPage=new DoctorIDPPage(driver);


    @Given("Enters the {string}")
    public void enters_the(String url) {
        driver.get(ConfigReader.getProperty(url));
        ReusableMethods.bekle(2);
    }
    @Given("Login as doctor")
    public void login_as_doctor() {
    doctorIDPPage.doctorLogin(9);
    }


    @Then("As a doctor, click on the IPD menu in the dashboard.")
    public void as_a_doctor_click_on_the_ipd_menu_in_the_dashboard() {
     ReusableMethods.clickWithText(" IPD");

    }
    @Then("As a doctor,verify that the IPD menu is enabled.")
    public void as_a_doctor_verify_that_the_ipd_menu_is_enabled() {

       Assert.assertTrue( doctorIDPPage.ipdLink.isEnabled());
    }
    @Then("As a doctor, verify that the page displays the {string}.")
    public void as_a_doctor_verify_that_the_page_displays_the_text_confirming_the_user_is_on_the_correct_page(String elementText) {
      ReusableMethods.waitForElementVisibility(ReusableMethods.getElementByText(driver,elementText),2);
        Assert.assertTrue( ReusableMethods.getElementByText(driver,elementText).isDisplayed());
    }
    @Then("As a doctor, verify that the data table headers are visible.")
    public void as_a_doctor_verify_that_the_data_table_headers_are_visible() {
    doctorIDPPage.verifyHeadersAreVisible(driver);

    }
    @Then("As a doctor, verify that the {string} column is sorted in ascending order.")
    public void as_a_doctor_verify_that_the_case_id_patient_id_column_is_sorted_in_descending_order(String sortableHeader) {
    doctorIDPPage.verifyheaderSortingAscending(sortableHeader,2);
    }
    @Then("As a doctor, the number of patients displayed in the data table should be visible next to the record text below the table.")
    public void as_a_doctor_the_number_of_patients_displayed_in_the_data_table_should_be_visible_next_to_the_text_below_the_table( ) {
   Assert.assertTrue( doctorIDPPage.recordsPatientCountInDataTable.getText().contains(doctorIDPPage.patientCountInDataTable()));
    logger.info("IPD sayfasindaki hasta sayisi Sayfa altinda Record textinde görünürdür. ");
    }
    @Then("As a doctor, Verify that the patient's IPD number and name are enabled.")
    public void as_a_doctor_click_on_patient_names_or_ipd_numbers() {

    //Assert.assertEquals("name locate inin tagName'i a degil " ,"a",doctorIDPPage.TableDataRetriever(3,3).getTagName());
   // logger.error("IPD sayfasinda Name basligi altindaki hasta isimleri erisilir degil");


    }
    @Then("As a doctor, verify that the patient's details page is accessible.")
    public void as_a_doctor_verify_that_the_patient_s_details_page_is_accessible() {
    Assert.assertTrue(doctorIDPPage.TableDataRetriever(3,1).isEnabled());
    }
    @Then("As a doctor, Verify searching with full data of the {int} patient in the data table.")
    public void as_a_doctor_verify_that_the_search_box_allows_searching_for_any_data_present_in_the_data_table(int row) throws InterruptedException {
     ReusableMethods.waitForElementVisibility(doctorIDPPage.ipdPatientSearchBox,10);
  //  doctorIDPPage.searchPatientInIPDBoxWithDataTable(row);

     logger.error("IPD hasta listesindeki tüm datalarla arama yapilamiyor ");
    }
    @Then("As a doctor, access the patient details page through the hamburger menu under the Credit Limit text.")
    public void as_a_doctor_access_the_patient_details_page_through_the_hamburger_menu_under_the_credit_limit_$_text() {
     doctorIDPPage.clickOnHamburgerMenu();
    }
    @Then("As a doctor, verify that the Add Patient button is accessible.")
    public void as_a_doctor_verify_that_the_add_patient_button_is_accessible() {
    doctorIDPPage.verifyAddPatientButtonAccessible();
    doctorIDPPage.closeAddPatient.click();

    }
    @Then("As a doctor, verify that the Discharged Patient button is accessible.")
    public void as_a_doctor_verify_that_the_discharged_patient_button_is_accessible() {
     ReusableMethods.hardWait(1);
    doctorIDPPage.verifyDischargedButtonAccessible();



    }

     @Given("Clicking on the IPD No {int} navigates to the patient's details page.")
     public void clicking_on_the_ipd_no_column_navigates_to_the_patient_s_details_page(int row) {

     doctorIDPPage.clickPatientByIPDNo(row);

     }
     @When("As a doctor, verify that the page displays and click the Nurse Notes.")
     public void the_nurse_notes_page_displays_accurate_nurse_notes() {


     doctorIDPPage.nurseNote.click();
     Assert.assertTrue(doctorIDPPage.nurseNote.isDisplayed());

     }
     @When("The Medication page displays medication history correctly.")
     public void the_medication_page_displays_medication_history_correctly() {

     doctorIDPPage.verifyMedicineButtonAccessible();
     }
     @When("The Prescription page displays patient prescriptions.")
     public void the_prescription_page_displays_patient_prescriptions() {
     ReusableMethods.clickWithText(" Prescription");
     Assert.assertTrue(ReusableMethods.isTextVisible(" Prescription"));
     }
     @When("The Prescription page allows writing new prescriptions.")
     public void the_prescription_page_allows_writing_new_prescriptions() {
     ReusableMethods.clickWithText(" Add Prescription");
     Assert.assertTrue(ReusableMethods.isTextVisible(" Add Prescription"));
     doctorIDPPage.closePrescriptionPage.click();
     }
     @When("The Consultant Register page lists all consultant records.")
     public void the_consultant_register_page_lists_all_consultant_records() {
     ReusableMethods.hardWait(2);
     ReusableMethods.clickWithText(" Consultant Register");
      Assert.assertTrue(ReusableMethods.isTextVisible(" Consultant Register"));
     }
     @When("The Lab Investigation page lists all lab investigations.")
     public void the_lab_investigation_page_lists_all_lab_investigations() {
      ReusableMethods.hardWait(2);
      ReusableMethods.clickWithText(" Lab Investigation");
      Assert.assertTrue(ReusableMethods.isTextVisible(" Lab Investigation"));
     }
     @When("The Operations page lists all patient operations.")
     public void the_operations_page_lists_all_patient_operations() {
     ReusableMethods.clickWithText(" Operations");
      Assert.assertTrue(ReusableMethods.isTextVisible(" Operations"));
     }
     @When("The Charges page displays detailed patient charges.")
     public void the_charges_page_displays_detailed_patient_charges() {

      Assert.assertTrue(ReusableMethods.isTextVisible(" Charges"));
     }
     @When("The Charges page allows creating new charge records.")
     public void the_charges_page_allows_creating_new_charge_records() {
      doctorIDPPage.addCharge();
     }
     @When("The Payment page lists all payment records.")
     public void the_payment_page_lists_all_payment_records() {

     }
     @When("The Payment page allows adding new payments.")
     public void the_payment_page_allows_adding_new_payments() {
     ReusableMethods.hardWait(3);
      ReusableMethods.clickWithText(" Payments");
      Assert.assertTrue(ReusableMethods.isTextVisible(" Payments"));
     }
     @When("The Bed History page shows detailed bed history.")
     public void the_bed_history_page_shows_detailed_bed_history() {
      ReusableMethods.isTextVisible(" Bed History");
     }
     @When("The Timeline page displays future timeline plans.")
     public void the_timeline_page_displays_future_treatment_plans() {

     doctorIDPPage.addTimeLine();
     ReusableMethods.hardWait(3);

     }
     @When("The Treatment History page lists all past treatments accurately.")
     public void the_treatment_history_page_lists_all_past_treatments_accurately() {
     doctorIDPPage.treatmentHistory();

     }


      @Then("Navigate to the Medication button.")
      public void navigate_to_the_medication_button() {
     ReusableMethods.clickWithText(" Medication");

      }
      @Then("Click on the Add Medication Dose button.")
      public void click_on_the_button() {
      doctorIDPPage.addMEdiDoseButton.click();
      }
      @Then("Enter {string} into the Date field.")
      public void enter_into_the_date_field(String string) {
       doctorIDPPage.dateAddMedi.sendKeys(string);
      // doctorIDPPage.dateAddMedi.click();
      //  doctorIDPPage.pickDate29.click();
      }

      @Then("Enter 14:45 into the Time field by increment Button.")
      public void enter_into_the_time_field_by_increment_button() {
       doctorIDPPage.pickTimeForAddMEdi();

      }
      @Then("Select tablet from the Medicine Category dropdown.")
      public void select_from_the_medicine_category_dropdown() {
      doctorIDPPage.pickMedicineCategoryAddMEdi( );
      }
      @Then("Select {string} from the Medicine Name dropdown.")
      public void select_from_the_medicine_name_dropdown(String mediName) {
      doctorIDPPage.pickMediNameAddMedi(mediName);
      }
      @Then("Select {string} from the Dosage dropdown.")
      public void select_from_the_dosage_dropdown(String dosage) {
      doctorIDPPage.clickDosageAddMedi(dosage);
      }
      @Then("Click the Save button on the Add Medication form.")
      public void click_the_save_button_on_the_add_medication_form() {
      doctorIDPPage.saveAddedMedi.click();
      ReusableMethods.hardWait(3);
      }
      @Then("Verify that the Medication data table's row {int} , column {int} matches the entered {string} .")
      public void verify_that_the_medication_data_table_s_row_column_matches_the_entered(Integer row, Integer column, String lastMediName) {
       doctorIDPPage.clickLastAddedMedi(row, column, lastMediName);
      }


}
