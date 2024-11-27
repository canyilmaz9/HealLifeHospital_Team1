Feature: US_001 Hasta verilen (URL) ile anasayfaya gidebilmeliyim

  @anasayfa
  Scenario: US_001 > TC_01  Anasayfaya ulasim testi
    Given Hasta anasayfaya gider
    And   Sayfaya erisebildigini test eder

  Scenario: US_001 > TC_02 Anasayfaya ulasim testi
    Given Hasta anasayfaya ulasir
    And   "Insurance Plans" yazisinin gorundugunu test eder.