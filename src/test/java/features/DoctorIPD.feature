Feature:As a doctor, they should be able to list data about inpatients from the IPD page and perform IPD patient procedures.
  Background: Common Steps
    Given Enters the "adminURL"
    And  Login as doctor
    Then As a doctor, click on the IPD menu in the dashboard.




  Scenario:(US_053_US01_TC01) Verify that the patient list on the IPD page displayed

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





    Scenario:(US_053_US02_TC01) Verify that clicking on a patient's IPD No navigates to the detailed patient page.
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


    Scenario:(US_053_US02_TC02)Add Medication Dose
    * Clicking on the IPD No 47 navigates to the patient's details page.
    * Navigate to the Medication button.
    * Click on the Add Medication Dose button.
    * Enter "29.11.2024" into the Date field.
    * Enter 14:45 into the Time field by increment Button.
    * Select "Tablet" from the Medicine Category dropdown.
    * Select "Panto" from the Medicine Name dropdown.
    * Select "1 Hour" from the Dosage dropdown.
    * Click the Save button on the Add Medication form.
    * Verify that the Medication data table's row 1 , column 2 matches the entered "Panto" .



    Scenario:(US_053_US02_TC03) Add Operation(Bug)
    *  Clicking on the IPD No 47 navigates to the patient's details page.
    *  Click the Operation button.
    *  Click the Add Operation button.
    *  Click the OP Category dropdown
    *  Select the "Gynaecology".
    *  Enter the Operation Name as "Dilation and curettage".
    *  Enter the Operation Date as 29.11.2024 10:30.
    *  Click the Save button.
    *  Verify the last entered operation from the "Dilation and curettage" Operation Name column.


  Scenario:(US_053_US02_TC04) Nurse Notes
    * Clicking on the IPD No 47 navigates to the patient's details page.
    * As a doctor, verify that the page displays and click the Nurse Notes.
    * The user clicks the Add Nurse Note button as a doctor.
    * The Nurse box is not clickable.
    * The user closes the opened pop-up page.
    * The user verifies the visibility of the most recently added note in the Nurse Notes list.


  Scenario: (US_053_US02_TC05)

    * Click on the Excel File Download button.
    * Verify that the Excel file containing the patient list is downloaded successfully.
    * Verify that the first patient name in the downloaded Excel file equals the first patient name displayed in the IPD Patient List.


    Scenario: (US_053_US02_TC06) Add Prescription Func
    * Clicking on the IPD No 47 navigates to the patient's details page.
    * The Prescription page displays patient prescriptions.
    * Click on Add Prescription.
    * Select Doctor Name from the Prescribe By dropdown menu.
    * Select "Cardiac MRI" from the Pathology dropdown menu.
    * Select MRI from the Radiology dropdown menu.
    * Click the Pathologist and Radiologist radio buttons.
    * Click the Save button on Prescription Page.
    * Verify that the Prescription number is displayed on the Prescription Page.




  Scenario:(US_053_US02_TC07) Verify that the doctor can add patient notes using the Timeline button on the IPD page.
    * Clicking on the IPD No 47 navigates to the patient's details page.
    * The Timeline page displays future timeline plans.
    * Add a new element to the timeline that the patient cannot see using the "Add Timeline" button,and verify that the last added element is visible on the doctor's timeline.


  @ac
Scenario: (US_053_US03_TC01) Verify that the doctor can admit a new patient to an appropriate ward on the IPD page.
    * As a doctor, verify that the Add Patient button is accessible.


    * Click on the New Patient button.
    * Click on the Name box.
    * Enter "Emily Houston" in the Name box.
    * Click on the Gender button.
    * Select "Female" from the Gender dropdown.
    * Click on the Date of Birth box.
    * Enter "18.05.1972" in the Date of Birth box.
    * Click on the Save button on the Add Patient Page.
    * Click on the Admission Date box.
    * Enter today's date in the Admission Date box.
    * Verify that the Credit Limit box text is not null.
    * Verify that the Consultant Doctor box text is not null.
    * Click on the Bed Group box.
    * Select "2" as the patient private ward in the Bed Group box.
    * Click on the Bed Number box.
    * Select 151 as the bed number.
    * Click on the Save button.
    * Verify that the Patient Added Successfully message is displayed.
    * Verify that the data in row 1, column 3 of the IPD Patient table equals the name of the last registered patient.







