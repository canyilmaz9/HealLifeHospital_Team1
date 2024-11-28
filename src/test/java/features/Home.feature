Feature: US_001 Hasta verilen (URL) ile anasayfaya gidebilmeliyim
  @anasayfa
  Scenario: US_001 > TC_01  Anasayfaya ulasim testi
    Given Hasta anasayfaya gider
    And   Sayfaya erisebildigini test eder

  Scenario: US_001 > TC_02 Anasayfaya ulasim testi
    Given Hasta anasayfaya ulasir
    And   "Insurance Plans" yazisinin gorundugunu test eder.



Scenario:  US012  heallifehospital.com About Us menusunun olmasi testi
TC01 bir kullanıcı olarak hastaneye ait bilgilere ulasabılmem için about us menusunun oldugu testi

Given kullanici url adresine gider
Then   kullanici About Us butonuna tiklar
Then   kullanici About Hospital  basligini gorur
When    kullanici Meet Our Doctors  basligini gorur
When   kullanici FAQ's   basligini gorur
Then    kullanici Departments  basligini gorur
And    kullanici Testimonials  basligini gorur



  Scenario:      US012  heallifehospital.com About Us menusunun olmasi testi
  TC02 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden about hospital sayfsına yonlendırme testi

    Given kullanici url adresine gider
    Then   kullanici About Us butonuna tiklar
    Then   kullanici About Hospital  basligini gorur
    Then  kullanici about hospital yazisina tiklar ve sayfaya ulasir.
    Then kullanici sayfada some words about us ve our mission basligini gordugunu dogrular
    Then kullanici sayfada openin hours bilgilerini gordugunu dogrular
    When  kullanici sayfanin our specialist kisminda hastane doktorlarin resimlerini isimlerini ve title larını gorur


  Scenario: US012  heallifehospital.com About Us menusunun olmasi testi TC03 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden meert our doctor sayfasına yonlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici meet our doctors yazisina tiklyarak sayfaya ulasir
    Then kullanici  general practitioner yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    Then kullanici ophthalmologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    Then  kullanici paediatrician yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    When kullanici cardiologist yazisina tiklayarak bu bolumde calısan doktorlari ve bilgilerini gorur
    When kullanici gynaecologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    And kullanici neurologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur


  Scenario:  US012  heallifehospital.com About Us menusunun olmasi testi TC04  Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden FAQ sayfasına yonlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici FAQ yazisina tiklayarak sayfaya ulasir
    When kullanici bu sayfada what our clients say ve what our doctor say basliklarini  gorur
    And  kullanici sayfadaki sorulardan herhangi birini tikladiginda cevabini gorur

   @mervenur
  Scenario:  US012  heallifehospital.com About Us menusunun olmasi testi TC05 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden departments sayfasına yönlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    When kullanici departments yazisina tiklayarak sayfaya ulasir
    And kullanici sayfada hastahane departmanlarini resimleri ve kucuk aciklama yazisiyla birlikte gorur


  Scenario: US012  heallifehospital.com About Us menusunun olmasi testi TC06 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden testimonials sayfasına yonlendirme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici testimonials yazisina tiklayarak sayfaya ulasir
    And kullanici sayfada hastahanede tedavi gormus kisilerin yorumlarini gorur


  Scenario: TC_001 Accessibility to the homepage
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir

  Scenario:TC_002 Featured services title visibility
    Given Kullanici browser acar ve url girer
    Then Anasayfanin tamamina basarili bir sekilde erisir
    When Anasayfada Featurerd Services başlığını görür


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


