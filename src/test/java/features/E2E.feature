Feature: End-to-End Test : Patient Appointment, Patient Payment, as Doctor Patient- Admission, and as Doctor Medication Order

  Scenario: Patient schedules an appointment, makes a payment, and doctor admits the patient and orders a medication


    Given Kullanici Anasayfa adresine gider
    When Patient clicks the login button
    And Patient logins to patient dashboard
    Then Patient clicks to my appointments
    Then Checking informations about patient

      | Patient Id      |
      | Gender          |
      | Marital Status  |
      | Phone           |
      | Email           |
      | Address         |
      | Age             |
      | Guardian Name   |
      | Username        |
      | Password        |
    Then Make a new appointment
    Then Click on show, pay
    * Enters the "adminURL"
    And  Login as doctor
    Then As a doctor, click on the IPD menu in the dashboard.
    * As a doctor, verify that the Add Patient button is accessible.
    * Click on the dropdown menu in the pop-up page.
    * Enter Patient ID as "79" in the dropdown menu.
    * Click on the Height box.
    * Enter "180" in the Height box,"90" in the Weight box, "120-70" in the Blood Pressure box,"72" in the Pulse box,"36" in the Temperature box,"22" in the Respiration box.
    * Enter Cramps and injuries in the Symptoms Title field.
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
    * Clicking on the IPD No 61 navigates to the patient's details page.
    * Navigate to the Medication button.
    * Click on the Add Medication Dose button.
    * Enter "29.11.2024" into the Date field.
    * Enter 14:45 into the Time field by increment Button.
    * Select "Tablet" from the Medicine Category dropdown.
    * Select "Panto" from the Medicine Name dropdown.
    * Select "1 Hour" from the Dosage dropdown.
    * Click the Save button on the Add Medication form.
    * Verify that the Medication data table's row 1 , column 2 matches the entered "Panto" .



