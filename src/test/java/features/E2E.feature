Feature: Appointment olusturma
  @path
  Scenario: Hasta appointment olusturur


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
