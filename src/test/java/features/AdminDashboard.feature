Feature: Admin Panel Tests

  Background:
    Given Go to the admin page
    When Log in the page with correct admin name and password


  @adminDashboardTitle
  Scenario: [US_029>TC_01] Test for displaying the main title of Dashboard on the admin panel and refreshing the panel.

    Given Display the title of Dashboard on the admin panel
    When Click on the title of Dashboard
    Then Verify that the admin panel is refreshed


  @adminPanelLinks
  Scenario Outline: [US_029>TC_02] Test for displaying page links under the title of Dashboard

    Given Move to the titles
    When Wait for a second
    Then Verify that "<titles>" are displayed


    Examples:
      | titles               |
      | Billing              |
      | Appointment          |
      | OPD                  |
      | IPD                  |
      | Pharmacy             |
      | Pathology            |
      | Radiology            |
      | Ambulance            |
      | Front Office         |
      | Birth & Death Record |
      | TPA Management       |
      | Finance              |
      | Messaging            |
      | Inventory            |
      | Certificate          |