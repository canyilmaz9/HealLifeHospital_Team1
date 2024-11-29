
  Feature: US_054: As a doctor, I want to be able to access patient data on the Pathology test in the Dashboard SideBar and view Pathology tests.

    Background: Common Steps
      Given Enters the "adminURL"
      When  Login as doctor
      And   Verifies that it is Doctor Dashboard Page

    @deneme
    Scenario: US_054 > TC_MY010: Doctor Dashboard Page Pathology link visibility and accuracy test

      Then  Verifies that Doctor Dashboard Pathology button is visible
      And   Clicks on the Doctor Dashboard Pathology button
      Then  Verifies that it is Doctor Dashboard Pathology Page


    Scenario: US_054 > TC_MY011:

