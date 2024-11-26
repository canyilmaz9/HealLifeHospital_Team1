Feature: US_005 "Featured Services" section on the home page of the site
  Background: Common Steps
    Given Kullanici browser acar ve url girer


  Scenario:TC_002 Featured services title visibility
    And Anasayfada Featured Services başlığını görür

  Scenario: TC_003 Access to relevant Medical Treatment board under the "Featured services" title
    When Anasayfada Featured Services başlığını görür
    And Featured Services başliğinin altında Medical Treatment panosuna erişir

  Scenario: TC_004 Access to relevant Emergency help board under the "Featured services" title
    When Anasayfada Featured Services başlığını görür
    And Featured Services başliğinin altinda Emergency help panosuna erişir

  Scenario: TC_005 Access to relevant Qualified Doctors board under the "Featured services" title
    When Anasayfada Featured Services başlığını görür
    And Featured Services başliğinin altında Qualified doctors panosuna erişir

  Scenario: TC_006 Access to relevant Medical professionals board under the "Featured services" title
    When Anasayfada Featured Services başlığını görür
    And Featured Services başliğinin altında Medical professionals panosuna erişir



