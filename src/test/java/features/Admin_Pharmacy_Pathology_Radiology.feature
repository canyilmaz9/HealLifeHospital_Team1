Feature: US_022 Dashboard sidebar'da Pathology butonunun islevselligini kontrol etmeliyim
@team
  Scenario: US_022 > TC_001 Hasta Dashboard sidebar'da Pathology menusunu tiklayabilmeli testi
    Given Hasta admin Dashboard URL'ine gider
    And   Hasta Username kutucuguna mailini girer
    Then  Passwordunu girer
    And   Sign In butonunu tiklar ve Login olur
    When  Pathology basliginin gorundugunu test eder
    And   Pathology butonuna tiklar

  Scenario: US_022 > TC_002 Pathology sayfasinda Pathology Test Reports List testi
    Given Pathology sayfasinda Pathology Test Reports basliklarini test eder
  | Bill No          |
  | Reporting Date   |
  | Patient Name     |
  | Reference Doctor |
  | Amount($)        |
  | Balance Amount($)|
  | Paid Amount($)   |

  Scenario: US_022 > TC_003 Pathology sayfasinda 'searchTextBox', ReportList ve Action basliklari bulunmasi testi
    Given Hasta admin Dashboard sayfasina gider.
    And   Username ve Password girer ve Sign In olur
    #Then  Pathology butonuna tiklar ve searchBox kutusunda arama yapar
    When  Test Reports List'te siralama yapar
    Then  Test Reports List'te Action basligi altinda (View Payments, View Reports ve Pay) islemler yapar



  Scenario:  US_023 Hasta) olarak Radiology islemleri icin Dashboard'imda Radiology sayfasinin olmasini istiyorum
    Given Hasta Dashboard sidebar'inda Radiology menü basligi bulur ve tiklaninca "radiology" sayfasina gider
    Then  Radiology sayfasinda Radiology Test Reports List'te basliklari test eder
    And   Radiology Test Reports List'te arama yapabilmek icin searchTextBox'i ve dogru arama yapmasini test eder
    When  Radiology Test Reports List'te basliklar uzerinden listeyi test eder
    Then  Radiology Test Reports List'teki Action basligi altinda (View Payments, View Reports ve Pay) islemleri yapilabilmeli.



