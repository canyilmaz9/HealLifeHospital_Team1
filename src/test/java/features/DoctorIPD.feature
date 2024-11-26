

Feature:As a doctor, they should be able to list data about inpatients from the IPD page and perform IPD patient procedures.
  Background: Common Steps
    Given Enters the "adminURL"
    And  Login as doctor
    Then As a doctor, click on the IPD menu in the dashboard.




  Scenario: Verify that the patient list on the IPD page displayed



    * As a doctor,verify that the IPD menu is enabled.
    * As a doctor, verify that the page displays the " IPD Patient".
    * As a doctor, verify that the data table headers are visible.
    * As a doctor, verify that the " Case ID / Patient ID" column is sorted in ascending order.
    * As a doctor, the number of patients displayed in the data table should be visible next to the record text below the table.
    * As a doctor, Verify that the patient's IPD number and name are enabled.
    * As a doctor, verify that the patient's details page is accessible.
    * As a doctor, Verify searching with full data of the 1 patient in the data table.
    * As a doctor, verify that the Add Patient button is accessible.
    * As a doctor, verify that the Discharged Patient button is accessible.
    * As a doctor, access the patient details page through the hamburger menu under the Credit Limit text.





    Scenario: Verify that clicking on a patient's IPD No navigates to the detailed patient page.
    *  Clicking on the IPD No 47 navigates to the patient's details page.
    *  As a doctor, verify that the page displays and click the Nurse Notes.
    *  The Medication page displays medication history correctly.
    *  The Prescription page displays patient prescriptions.
    *  The Prescription page allows writing new prescriptions.
    *  The Consultant Register page lists all consultant records.
    *  The Lab Investigation page lists all lab investigations.
    *  The Operations page lists all patient operations.
    *  The Charges page displays detailed patient charges.
    *  The Charges page allows creating new charge records.
    *  The Payment page lists all payment records.
    *  The Payment page allows adding new payments.
    *  The Bed History page shows detailed bed history.
    *  The Timeline page displays future timeline plans.
    *  The Treatment History page lists all past treatments accurately.

  @ac
    Scenario:Verify that a medication order can be successfully added to a patient's record.
    * Clicking on the IPD No 47 navigates to the patient's details page.
    * Navigate to the Medication button.
    * Click on the Add Medication Dose button.
    * Enter "29.11.2024" into the Date field.
    * Enter 14:45 into the Time field by increment Button.
    * Select tablet from the Medicine Category dropdown.
    * Select "Panto" from the Medicine Name dropdown.
    * Select "1 Hour" from the Dosage dropdown.
    * Click the Save button on the Add Medication form.
    * Verify that the Medication data table's row 1 , column 2 matches the entered "Panto" .























