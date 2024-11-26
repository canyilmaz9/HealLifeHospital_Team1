@us24
Feature: US_024 As a Patient Accessibility to Ambulance Page
  Background: Common Steps
    Given Hasta browser acar ve url girer
    Then Acilan sayfada dogru name ve password girerek login yapar
    When Login butonuna tiklar
    Then Anasayfanin tamamina basarili bir sekilde erisir

    Scenario: TC_002 Visibility of "Ambulance" section in Dashboard sidebar
      And Anasayfa Dashboard sidebarda Ambulance bolumunu gorur
      Then Ambulance bolumune tiklar

   Scenario: TC_003 Availability of relevant titles in Ambulance Bill list
    And Acilan sayfada Bill No basligini gorur
   Then Acilan sayfadaVehicle Number basligini gorur
   When Acilan sayfadaDriver Name basligini gorur
   Then Acilan sayfadaDriver Contact  basligini gorur
   Then Acilan sayfadaAmount basligini gorur
   And Acilan sayfadaTax basligini gorur
   When Acilan sayfadaNet Amount basligini gorur
   When Acilan sayfada Paid Amount basligini gorur
   Then Acilan sayfadaBalance Amount  basligini gorur
   When Acilan sayfadaAction basligini gorur
