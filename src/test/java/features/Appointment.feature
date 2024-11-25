Feature: Making an appointment

  Scenario: Making an appointment with unregistered patient

    Given Launch Browser
    Then Go to HealLifeHospital
    And Click on Appointment
    And Select Specialist, Doctor, Shift and Date
    Then Message is entered
    And Select proper time slot
    Then Dashboard should be seen