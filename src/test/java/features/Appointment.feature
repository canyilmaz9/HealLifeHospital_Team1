Feature: Making an appointment

  Scenario: US11 > TC 001 Making an appointment with unregistered patient

    Given Launch Browser
    Then Go to HealLifeHospital
    And Click on Appointment
    And Select Specialist, Doctor, Shift and Date
    Then Message is entered
    And Select proper time slot
    Then Dashboard should be seen

  Scenario: US42 > TC 001 Some processes in Income, Finance

    Given Launch Browser
    Then Go to the admin page
    Then Onceden belirlenmis admin bilgileri ile sisteme giris yapar
    And Click on Finance then Income
    And Check page titles
    And Check Search Box
    And Add Income, enter data and save

  Scenario: US42 > TC 002 Some processes in Expense, Finance

    Giick on Expense
    And Check Search Box for Expense
    And Add Expense, enter data and save

  Scenario: US50 > TC 001 Viewing patient information in doctor page

    Given Launch Browser
    Then Go to the admin page
    And Enter the valid doctor username and password
    And Click on Appointment
    And Check (the titles Patient Name, Appointment No, Appointment Date, Phone, Gender Doctor, Source, Priority, Live Consultant, Fess, Status
    Then Search in appointments
    And Check wheter "100" or All should be chosen
    And Click Show and print

  Scenario: US 50 > TC 002 Going to Doctor Wise Page
    Given Launch Browser
    Then Enter the valid doctor username and password
    And Click on Appointment
    Then Click on Doctor Wise
    And List Appointments
    And Click on Queue
    Then Click on Doctor, Shift, Date, Slotven Launch Browser
    Then Go to the admin page
    Then Onceden belirlenmis admin bilgileri ile sisteme giris yapar
    And Cl
