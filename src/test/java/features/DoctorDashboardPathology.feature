
  Feature: US_054: As a doctor, I want to be able to access patient data on the Pathology test in the Dashboard SideBar and view Pathology tests.

    Background: Common Steps
      Given Enters the "adminURL"
      When  Login as doctor
      And   Verifies that it is Doctor Dashboard Page


    Scenario: US_054 > TC_MY010: Doctor Dashboard Page Pathology link visibility and accuracy test

      Then  Verifies that Doctor Dashboard Pathology button is visible
      And   Clicks on the Doctor Dashboard Pathology button
      Then  Verifies that it is Doctor Dashboard Pathology Page


    Scenario: US_054 > TC_MY011: Doctor Dashboard Pathology page Bill List headings visibility test

      Then  Clicks on the Doctor Dashboard Pathology button
      Then  Verifies that Doctor Dashboard Pathology Page Bill No heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Case ID - Patient ID heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Reporting Date heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Patient Name heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Reference Doctor heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Amount heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Paid Amount heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Balance Amount heading is visible

    @deneme
    Scenario: US_054 > TC_MY012: Doctor Dashboard Pathology page Bill List contents sorting with column headings test

      Then  Clicks on the Doctor Dashboard Pathology button
      Then  Clicks on the Doctor Dashboard Pathology page Bill No header and verifies that sorts the content
      Then  Clicks on the Doctor Dashboard Pathology page Case ID - Patient ID header and verifies that sorts the content


    Scenario: US_054 > TC_MY013: Doctor Dashboard Pathology page Search Box visibility test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Verifies that Doctor Dashboard Pathology Page Search Box button is visible


    Scenario: US_054 > TC_MY014: Doctor Dashboard Pathology page Bill List content number selection test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Verifies that Doctor Dashboard Pathology Page Bill List content number select option is visible
      When  Clicks on the Doctor Dashboard PathologyPage Bill List content number select option
      Then  Verifies that Doctor Dashboard Pathology Page Bill List content number select option -100- is visible
      Then  Verifies that Doctor Dashboard Pathology Page Bill List content number select option All is visible


    Scenario: US_054 > TC_MY015: Doctor Dashboard Pathology page Balance Amount, View Reports link visibility and accuracy test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Navigates to the Doctor Dashboard Pathology page Balance Amount element.
      And   Verifies that Doctor Dashboard Pathology page Balance Amount, View Reports button is visible
      Then  Clicks on the Doctor Dashboard Pathology page Balance Amount, View Reports button
      And   Verifies that it is Doctor Dashboard Pathology page Balance Amount, View Reports page


    Scenario: US_054 > TC_MY016: Doctor Dashboard Pathology page Balance Amount, Add/View Payments link visibility and accuracy test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Navigates to the Doctor Dashboard Pathology page Balance Amount element.
      And   Verifies that Doctor Dashboard Pathology page Balance Amount, Add-View Payments button is visible
      Then  Clicks on the Doctor Dashboard Pathology page Balance Amount, Add-View Payments button
      And   Verifies that it is Doctor Dashboard Pathology page Balance Amount, Add-View Payments page


    Scenario: US_054 > TC_MY017: Doctor Dashboard Pathology page test of redirect to Pathology Test List

      When  Clicks on the Doctor Dashboard Pathology button
      And   Verifies that Doctor Dashboard Pathology page Pathology Test button is visible
      Then  Clicks on the Doctor Dashboard Pathology page Pathology Test button
      And   Verifies that it is Doctor Dashboard Pathology page Pathology Test Page


    Scenario: US_054 > TC_MY018: Doctor Dashboard Pathology page Pathology Test List headings visibility test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Clicks on the Doctor Dashboard Pathology page Pathology Test button
      And   Verifies that Doctor Dashboard Pathology Page Pathology Test, Test Name heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Short Name heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Test Type heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Category heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Sub-Category heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Method heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Report Days heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Tax heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Charge heading is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test, Amount heading is visible


    Scenario: US_054 > TC_MY019: Doctor Dashboard Pathology page Pathology Test List contents sorting with column headings test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Clicks on the Doctor Dashboard Pathology page Pathology Test button
      And   Clicks on the Doctor Dashboard Pathology Test page Test Name header and verifies that sorts the content
      Then  Clicks on the Doctor Dashboard Pathology Test page Short Name header and verifies that sorts the content
      Then  Clicks on the Doctor Dashboard Pathology Test page Test Type header and verifies that sorts the content
      Then  Clicks on the Doctor Dashboard Pathology Test page Category header and verifies that sorts the content
      Then  Clicks on the Doctor Dashboard Pathology Test page Sub-Category header and verifies that sorts the content
      Then  Clicks on the Doctor Dashboard Pathology Test page Method header and verifies that sorts the content
      Then  Clicks on the Doctor Dashboard Pathology Test page Report Days header and verifies that sorts the content


    Scenario: US_054 > TC_MY020: Doctor Dashboard Pathology page Pathology Test list Search Box visibility test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Clicks on the Doctor Dashboard Pathology page Pathology Test button
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test list Search Box button is visible


    Scenario: US_054 > TC_MY021: Doctor Dashboard Pathology page Pathology Test List content number selection test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Clicks on the Doctor Dashboard Pathology page Pathology Test button
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test List content number select option is visible
      When  Clicks on the Doctor Dashboard Pathology Page Pathology Test List content number select option
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test List content number select option -100- is visible
      Then  Verifies that Doctor Dashboard Pathology Page Pathology Test List content number select option All is visible


    Scenario: US_054 > TC_MY022: Doctor Dashboard Pathology page Pathology Test List content Amount, Show link visibility and accuracy test

      When  Clicks on the Doctor Dashboard Pathology button
      Then  Clicks on the Doctor Dashboard Pathology page Pathology Test button
      Then  Navigates to the Doctor Dashboard Pathology page Pathology Test List content Amount element.
      And   Verifies that Doctor Dashboard Pathology page Pathology Test page Amount, Show link button is visible
      Then  Clicks on the Doctor Dashboard Pathology page Pathology Test page Amount, Show link button
      And   Verifies that it is Doctor Dashboard Pathology page Pathology Test page Amount, Show details page




