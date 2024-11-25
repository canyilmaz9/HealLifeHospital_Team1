Feature: US_005 "Featured Services" section on the home page of the site
  Scenario: TC_001 Accessibility to the homepage
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir

  Scenario:TC_002 Featured services title visibility
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir
    When Anasayfada Featurerd Services başlığını görür

  Scenario: TC_003 Access to relevant Medical Treatment board under the "Featured services" title
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir
    When Anasayfada Featurerd Services başlığını görür
    And Featured Services başlığının altında Medical Treatment panosuna erişir

  Scenario: TC_004 Access to relevant Emergency help board under the "Featured services" title
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir
    When Anasayfada Featurerd Services başlığını görür
    And Features Services başlığının altında Emergency help panosuna erişir

  Scenario: TC_005 Access to relevant Qualified Doctors board under the "Featured services" title
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir
    When Anasayfada Featurerd Services başlığını görür
    And Featured Services başlığının altında Qualified doctors panosuna erişir

  Scenario: TC_006 Access to relevant Medical professionals board under the "Featured services" title
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir
    When Anasayfada Featurerd Services başlığını görür
    And Featured Services başlığının altında Medical professionals panosuna erişir

