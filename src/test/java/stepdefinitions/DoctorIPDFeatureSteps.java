package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DoctorIDPPage;
import utilities.ReusableMethods;
import utils.ExcelDataReader_Seren;
import utils.JSUtilities;

import javax.print.Doc;
import java.awt.*;
import java.time.Duration;
import java.util.Set;


public class DoctorIPDFeatureSteps {


   static WebDriver driver = Hooks.getDriver();
   static Actions actions = new Actions(driver);
    DoctorIDPPage doctorIDPPage=new DoctorIDPPage(driver);


 //  static ExcelDataReader_Seren excelDataReaderSeren=new ExcelDataReader_Seren(ConfigReader.getProperty("IPDPatient"),"Sheet1");
 private static final Logger logger = LogManager.getLogger(DoctorIPDFeatureSteps.class);

    @Given("Enters the {string}")
    public void enters_the(String url) {
        ((JavascriptExecutor) driver).executeScript("window.open();"); // Yeni sekme aç
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().equals("about:blank")) { // Yeni açılan pencereyi bul
                driver.get(ConfigReader.getProperty(url)); // Hedef URL'yi yükle
                break;
            }
        }

        //ReusableMethods.switchWindowByUrl(driver,ConfigReader.getProperty(url));
       // driver.get(ConfigReader.getProperty(url));
        ReusableMethods.bekle(2);
    }
    @Given("Login as doctor")
    public void login_as_doctor() {
    doctorIDPPage.doctorLogin(8);
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


    }
    @Then("As a doctor, verify that the Discharged Patient button is accessible.")
    public void as_a_doctor_verify_that_the_discharged_patient_button_is_accessible() {
     doctorIDPPage.closeAddPatient.click();

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
     utils.ReusableMethods.clickWithText(" Timeline");
     Assert.assertTrue(doctorIDPPage.addTimelineButton.isDisplayed());

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
      @Then("Select {string} from the Medicine Category dropdown.")
      public void select_from_the_medicine_category_dropdown(String tb) {
      doctorIDPPage.pickMedicineCategoryAddMEdi( tb);
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


       @Then("Click the Operation button.")
       public void click_the_add_operation_button() {
       driver.findElement(By.xpath("//*[text()=' Operations']")).click();

       }
       @Then("Click the Add Operation button.")
       public void click_the_operation_button() {
        driver.findElement(By.xpath("//*[text()=' Add Operation']")).click();

       }
       @Then("Click the OP Category dropdown")
       public void click_the_op_category_dropdown() {
       doctorIDPPage.opCategoryDDM.click();
       }
       @Then("Select the {string}.")
       public void select_the(String string) {
       doctorIDPPage.clickContainsTextWE(string);
       }
       @Then("Enter the Operation Name as {string}.")
       public void enter_the_operation_name_as(String string) {
       doctorIDPPage.opNameAddOP.click();

       WebElement opName= doctorIDPPage.containsTextWE(string);
        ReusableMethods.waitForElementVisibility(opName,20);
       actions.sendKeys(opName).perform();
       ReusableMethods.hardWait(2);

       }
       @Then("Enter the Operation Date as 29.11.2024 10:30.")
       public void enter_the_operation_date_as() {
       doctorIDPPage.OPDateAddOP.click();
       ReusableMethods.waitForElementToBeClickable(doctorIDPPage.selectOPDate,20);
       doctorIDPPage.selectOPDate.click();
        ReusableMethods.hardWait(2);
       }
       @Then("Click the Save button.")
       public void click_the_save_button() {
        doctorIDPPage.saveOP.click();
        ReusableMethods.hardWait(2);
       }
       @Then("Verify the last entered operation from the {string} Operation Name column.")
       public void verify_the_last_entered_operation_from_the_op_name_column(WebElement opName) {
       Assert.assertTrue(opName.isDisplayed());
       logger.error("Doktor olarak IPD hasta icin yeni ameliyat kaydi (Add Operation) yapilamiyor. ");
       }

       @Then("The user clicks the Add Nurse Note button as a doctor.")
       public void the_user_clicks_the_add_nurse_note_button_as_a_doctor() {
        ReusableMethods.clickWithText(" Add Nurse Note");
       }
       @Then("The Nurse box is not clickable.")
       public void the_nurse_box_is_not_clickable() {
        try {

         doctorIDPPage.nurseNoteBox.sendKeys("Test Input");
         Assert.fail("Test Failed: The Nurse box should not be writable, but it is writable.");
        } catch (InvalidElementStateException e) {

        } catch (NoSuchElementException e) {

        }

       }

       @Then("The user closes the opened pop-up page.")
       public void the_user_closes_the_opened_pop_up_page() {
       doctorIDPPage.closeNurseNotPopUp.click();
       }
       @Then("The user verifies the visibility of the most recently added note in the Nurse Notes list.")
       public void the_user_verifies_the_visibility_of_the_most_recently_added_note_in_the_nurse_notes_list() {
       Assert.assertTrue( doctorIDPPage.nurseNotesNoteText.isDisplayed());

       }

       @Then("Click on the Excel File Download button.")
       public void click_on_the_excel_file_download_button() {
     ReusableMethods.waitForElementToBeClickable(doctorIDPPage.excelFileUploadButton,20);
        doctorIDPPage.excelFileUploadButton.click();
        ReusableMethods.hardWait(3);
       }
       @Then("Verify that the Excel file containing the patient list is downloaded successfully.")
       public void verify_that_the_excel_file_containing_the_patient_list_is_downloaded_successfully() {
        doctorIDPPage.isExcelFileDownloaded(ConfigReader.getProperty("IPDPatient"));
       }
       @Then("Verify that the first patient name in the downloaded Excel file equals the first patient name displayed in the IPD Patient List.")
       public void verify_that_the_first_patient_name_in_the_downloaded_excel_file_equals_the_first_patient_name_displayed_in_the_ipd_patient_list() {
            ExcelDataReader_Seren excelDataReaderSeren=new ExcelDataReader_Seren(ConfigReader.getProperty("IPDPatient"),"Sheet1");
       Assert.assertEquals(excelDataReaderSeren.getCellData(2,2),doctorIDPPage.patientDataFromIPDList(1,3).getText());

       }


        @Then("Click on Add Prescription.")
        public void click_on_add_prescription() {
        doctorIDPPage.addPrescriptionButton.click();
        }
        @Then("Select Doctor Name from the Prescribe By dropdown menu.")
        public void select_from_the_prescribe_by_dropdown_menu() {

         ReusableMethods.waitForElementVisibility(doctorIDPPage.prescriptByBox,20);
         doctorIDPPage.prescriptByBox.click();
          ReusableMethods.waitForElementVisibility(doctorIDPPage.containsTextWE("1021"),20);
          doctorIDPPage.clickContainsTextWE("1021");
        }
        @Then("Select {string} from the Pathology dropdown menu.")
        public void select_from_the_pathology_dropdown_menu(String string) {
        doctorIDPPage.pathologyDDM.click();
        ReusableMethods.waitForElementVisibility(doctorIDPPage.containsTextWE(string),20);
        doctorIDPPage.clickContainsTextWE(string);

        }
        @Then("Select MRI from the Radiology dropdown menu.")
        public void select_from_the_radiology_dropdown_menu() {

         doctorIDPPage.radiologyDDM.click();

         doctorIDPPage.MRIOption.click();
         doctorIDPPage.nursePresc.click();
         ReusableMethods.hardWait(3);


        }
        @Then("Click the Pathologist and Radiologist radio buttons.")
        public void click_the_and_radio_buttons() {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.patho,20);
        doctorIDPPage.patho.click();
        ReusableMethods.waitForElementVisibility(doctorIDPPage.radio,20);
        doctorIDPPage.radio.click();
        ReusableMethods.hardWait(3);

        }
        @Then("Click the Save button on Prescription Page.")
        public void click_the_save_button_on_prescription_page() {
         doctorIDPPage.savePrescription.click();
         ReusableMethods.hardWait(3);
        }
        @Then("Verify that the Prescription number is displayed on the Prescription Page.")
        public void verify_that_the_prescription_number_is_displayed_on_the_prescription_page() {
        Assert.assertEquals(doctorIDPPage.lastPrescriptionDate.getText(),doctorIDPPage.getTodayDate("dd.MM.yyyy"));
         System.out.println(doctorIDPPage.getTodayDate("dd.MM.yyyy"));
        }

        @Then("Add a new element to the timeline that the patient cannot see using the {string} button,and verify that the last added element is visible on the doctor's timeline.")
        public void add_a_new_element_to_the_timeline_that_the_patient_cannot_see_using_the_button_and_verify_that_the_last_added_element_is_visible_on_the_doctor_s_timeline(String string) {
         doctorIDPPage.addTimeLine();
        }

        @Then("Click on the Name box.")
        public void click_on_the_name_box() {
         doctorIDPPage.name.click();
        }
        @Then("Click on the New Patient button.")
        public void click_on_the_new_patient_button() {
        ReusableMethods.clickWithText("New Patient");
        }
        @Then("Enter {string} in the Name box.")
        public void enter_in_the_name_box(String string) {
         doctorIDPPage.name.sendKeys(string);
        }
        @Then("Click on the Gender button.")
        public void click_on_the_gender_button() {
        doctorIDPPage.genderDDM.click();
        }
        @Then("Select {string} from the Gender dropdown.")
        public void select_from_the_gender_dropdown(String string) {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.femaleGenderNewPat,20);
        doctorIDPPage.femaleGenderNewPat.click();
        }
        @Then("Click on the Date of Birth box.")
        public void click_on_the_date_of_birth_box() {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.dateOfBirthAddPAt,20);
        doctorIDPPage.dateOfBirthAddPAt.click();
        ReusableMethods.hardWait(2);
        }
        @Then("Enter {string} in the Date of Birth box.")
        public void enter_in_the_date_of_birth_box(String string) {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.dateOfBirthAddPAt,20);

        doctorIDPPage.dateOfBirthAddPAt.sendKeys(string);
        }
        @Then("Click on the Save button on the Add Patient Page.")
        public void click_on_the_save_button_on_the_add_patient_page() {
         doctorIDPPage.saveAddPAt.click();
         Assert.assertTrue(doctorIDPPage.successAddPatMessage.isDisplayed());
        }
        @Then("Click on the Admission Date box.")
        public void click_on_the_admission_date_box() {
          doctorIDPPage.admissionDateAddPAt.click();


        }
        @Then("Enter today's date in the Admission Date box.")
        public void enter_today_s_date_in_the_admission_date_box() {
     ReusableMethods.waitForElementVisibility(doctorIDPPage.admissionDate29AddPAt,20);
          doctorIDPPage.admissionDate29AddPAt.click();


         actions.sendKeys(Keys.TAB).perform();
          ReusableMethods.hardWait(5);
         System.out.println("buraya yazdim    "+doctorIDPPage.consultantDocAddPAtText.getText());


        }
        @Then("Verify that the Credit Limit box text is not null.")
        public void verify_that_the_credit_limit_box_text_is_not_null() {
            ReusableMethods.waitForElementVisibility(doctorIDPPage.creditLimitAddPat20000,20);
            Assert.assertTrue(doctorIDPPage.creditLimitAddPat20000.isDisplayed());
        }
        @Then("Verify that the Consultant Doctor box text is not null.")
        public void verify_that_the_consultant_doctor_box_text_is_not_null() {
         Assert.assertFalse(doctorIDPPage.consultantDocAddPAtText.getText().isEmpty());
        }
        @Then("Click on the Bed Group box.")
        public void click_on_the_bed_group_box() {
          doctorIDPPage.bedGroupAddPAt.click();


        }
        @Then("Select {string} as the patient private ward in the Bed Group box.")
        public void select_as_the_patient_ward_private_ward_in_the_bed_group_box(String string) {
         Select select =new Select(doctorIDPPage.bedGroupAddPAt);
         select.selectByValue(string);
         utils.ReusableMethods.hardWait(3);
        }
        @Then("Click on the Bed Number box.")
        public void click_on_the_bed_number_box() {
     ReusableMethods.waitForElementVisibility(doctorIDPPage.bedNumberAddPAt,20);
          doctorIDPPage.bedNumberAddPAt.click();
        }
        @Then("Select 151 as the bed number.")
        public void select_as_the_bed_number() {
     ReusableMethods.waitForElementVisibility(doctorIDPPage.option151BedNumAddPAt,20);
          doctorIDPPage.option151BedNumAddPAt.click();
         ReusableMethods.hardWait(3);
        }
        @Then("Click on the Save button.")
        public void click_on_the_save_button() {
        doctorIDPPage.saveAddPAt2.click();
        }
        @Then("Verify that the Patient Added Successfully message is displayed.")
        public void verify_that_the_patient_added_successfully_message_is_displayed() {
     ReusableMethods.waitForElementVisibility(doctorIDPPage.successAddPatMessage,20);
          Assert.assertTrue( doctorIDPPage.successAddPatMessage.isDisplayed());
        }


        @Then("Verify that the data in row {int}, column {int} of the IPD Patient table equals the name of the last registered patient.")
        public void verify_that_the_data_in_row_column_of_the_ipd_patient_table_equals_the_name_of_the_last_registered_patient(Integer int1, Integer int2) {
       ReusableMethods.hardWait(3);
     Assert.assertTrue( doctorIDPPage.TableDataRetriever(1,3).getText().contains("Emily Houston"));
        }


    @Then("Click on the dropdown menu in the pop-up page.")
    public void click_on_the_dropdown_menu_in_the_pop_up_page() {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.addOldPatientDDM,20);
        doctorIDPPage.addOldPatientDDM.click();
        ReusableMethods.hardWait(2);
    }
    @Then("Enter Patient ID as {string} in the dropdown menu.")
    public void enter_patient_id_as_in_the_dropdown_menu(String string) {
        ReusableMethods.waitForElementToBeClickable(doctorIDPPage.addOldPatientDDM,20);
        actions.click(doctorIDPPage.addOldPatientDDM).perform();
         actions.sendKeys(doctorIDPPage.addOldPatientDDM,string).perform();
          ReusableMethods.waitForElementVisibility(doctorIDPPage.addedPAtIDText,20);
          actions.click(doctorIDPPage.addedPAtIDText).perform();
    }
    @Then("Click on the Height box.")
    public void click_on_the_height_box() {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.heightBox,20);
            doctorIDPPage.heightBox.click();
            ReusableMethods.hardWait(5);
    }
    @Then("Enter {string} in the Height box,{string} in the Weight box, {string} in the Blood Pressure box,{string} in the Pulse box,{string} in the Temperature box,{string} in the Respiration box.")
    public void enter_in_the_height_box(String string1, String string2, String string3, String string4,String string5,String string6) {
            actions.click(doctorIDPPage.heightBox).sendKeys(string1).sendKeys(Keys.TAB).sendKeys(string2).sendKeys(Keys.TAB)
                    .sendKeys(string3).sendKeys(Keys.TAB).sendKeys(string4).sendKeys(Keys.TAB).sendKeys(string5).sendKeys(Keys.TAB)
                    .sendKeys(string6).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
                    .sendKeys(Keys.ENTER).sendKeys(Keys.TAB).perform();
    }

    @Then("Enter Cramps and injuries in the Symptoms Title field.")
    public void enter_in_the_symptoms_title_field() {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.symptomsTitleAddPat,20);
            doctorIDPPage.symptomsTitleAddPat.click();
            ReusableMethods.hardWait(5);
            ReusableMethods.waitForElementVisibility(doctorIDPPage.symptomTitleCheckBoxAddPAt,20);
            actions.click(doctorIDPPage.symptomTitleCheckBoxAddPAt).perform();
    }


    @Then("Click on the Guardian Name box.")
    public void click_on_the_guardian_name_box() {
            ReusableMethods.waitForElementVisibility(doctorIDPPage.guardianNameAddPat,20);
            actions.click(doctorIDPPage.guardianNameAddPat).perform();
            ReusableMethods.hardWait(1);

    }
    @Then("Enter {string} in the Guardian Name box.")
    public void enter_in_the_guardian_name_box(String string) {
            actions.sendKeys(doctorIDPPage.guardianNameAddPat,string).perform();
            ReusableMethods.hardWait(2);
    }
    @Then("Click on the Blood Group dropdown menu.")
    public void click_on_the_blood_group_dropdown_menu() {
        ReusableMethods.waitForElementVisibility(doctorIDPPage.bloodGroupDDMAddPat,20);
        actions.click(doctorIDPPage.bloodGroupDDMAddPat).perform();
        ReusableMethods.hardWait(2);


    }
    @Then("Select AB+ from the Blood Group dropdown menu.")
    public void select_from_the_blood_group_dropdown_menu() {


        for (int i = 0; i <4 ; i++) {
            actions.sendKeys(Keys.DOWN).perform();
        }

        utils.ReusableMethods.hardWait(1);
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.hardWait(2);

    }

    @Then("Select {string} from the Marital Status dropdown menu.")
    public void select_from_the_marital_status_dropdown_menu(String string) {
       actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
       ReusableMethods.waitForElementVisibility(  doctorIDPPage.marriedAddPAt,20);
       doctorIDPPage.marriedAddPAt.click();
       ReusableMethods.hardWait(3);
       actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
       ReusableMethods.hardWait(5);
    }

    @Then("Upload {string} from the PC.")
    public void select_from_the_pc(String string) throws AWTException {
        String filePath = "C:\\Users\\User\\Desktop\\Heal Life Project\\PatientPhoto.jpg";
                 ReusableMethods.uploadFileWithRobot(filePath);

    }
    @Then("Click on the Any Known Allergies box.")
    public void click_on_the_any_known_allergies_box() {
        for (int i = 0; i <5 ; i++) {
            actions.sendKeys(Keys.TAB).perform();
        }
        ReusableMethods.hardWait(2);

    }
    @Then("Enter {string} in the Any Known Allergies box.")
    public void enter_in_the_any_known_allergies_box(String string) {
        actions.sendKeys(string).perform();
        ReusableMethods.hardWait(2);
    }

    @Then("Click on the Save button on the Add Patient.")
    public void click_on_the_save_button_on_the_add_patient() {
            ReusableMethods.waitForElementVisibility(doctorIDPPage.saveButtonAddPAt,20);
            doctorIDPPage.saveButtonAddPAt.click();

    }





}
