Feature:Doctor Panel Tests


  Background:
    Given Go to the admin login page

  @doctorLoginPanelVisibility
  Scenario: Test for displaying doctor panel

    Given Display the Admin Login window on the right and the Latest New information on the left.

  @doctorLoginLogoutFunction
  Scenario: Test for login and logout the doctor panel

    Given Log in the doctor panel by entering the information (previously registered in the system) on the login page.
    Then Log out the page
    And Verify that is not possible to log in the doctor panel by entering incorrect or incomplete information

  @forgotPasswordFunction
  Scenario: Test for forgetting password

    Given Display the forget password link on the login page
    When Click on the link and verify that forget password page opens
    Then Enter an valid e-mail address in the textbox and reset password and verify that an email is sent
    And Return to the login page
    And Display the admin login link on the forget password page
    And Click on the link and verify that admin login page opens



