
@complain
Feature: Home Page Complain Link Test

  Background: Common Steps
  Given Go to the home page
  When Scroll the page down to the bottom


  Scenario: US_010 > TC_01 and TC_02 Test for displaying the icon and title of Complain on the home page.
    Given Display the title of Complain
    And Display the icon of pencil


  Scenario: US_010 > TC_02 Test for displaying the icon and title of Complain on the home page.
    Given Click on the title of Complain
    And Verify that the Complain Page is opened
    Then Go back to the home page
    And Scroll the page down
    Then Click on the icon of Complain
    And Verify that the Complain Page is opened