
Feature:


Scenario:  US_012 > TC_01 bir kullanıcı olarak hastaneye ait bilgilere ulasabılmem için about us menusunun oldugu testi

Given kullanici url adresine gider
Then   kullanici About Us butonuna tiklar
Then   kullanici About Hospital  basligini gorur
When    kullanici Meet Our Doctors  basligini gorur
When   kullanici FAQ's   basligini gorur
Then    kullanici Departments  basligini gorur
And    kullanici Testimonials  basligini gorur



  Scenario:      US_012  >  TC_02 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden about hospital sayfsına yonlendırme testi

    Given kullanici url adresine gider
    Then   kullanici About Us butonuna tiklar
    Then   kullanici About Hospital  basligini gorur
    Then  kullanici about hospital yazisina tiklar ve sayfaya ulasir.
    Then kullanici sayfada some words about us ve our mission basligini gordugunu dogrular
    Then kullanici sayfada openin hours bilgilerini gordugunu dogrular
    When  kullanici sayfanin our specialist kisminda hastane doktorlarin resimlerini isimlerini ve title larını gorur


  Scenario: US_012  > TC_03 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden meert our doctor sayfasına yonlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici meet our doctors yazisina tiklyarak sayfaya ulasir
    Then kullanici  general practitioner yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    Then kullanici ophthalmologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    Then  kullanici paediatrician yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    When kullanici cardiologist yazisina tiklayarak bu bolumde calısan doktorlari ve bilgilerini gorur
    When kullanici gynaecologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur
    And kullanici neurologist yazisina tiklayarak bu bolumde calisan doktorlari ve bilgilerini gorur


  Scenario:  US_012  > TC_04  Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden FAQ sayfasına yonlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici FAQ yazisina tiklayarak sayfaya ulasir
    When kullanici bu sayfada what our clients say ve what our doctor say basliklarini  gorur
    And  kullanici sayfadaki sorulardan herhangi birini tikladiginda cevabini gorur


  Scenario:  US_012 > TC_05 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden departments sayfasına yönlendırme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    When kullanici departments yazisina tiklayarak sayfaya ulasir
    And kullanici sayfada hastahane departmanlarini resimleri ve kucuk aciklama yazisiyla birlikte gorur


  Scenario: US_012  > TC_06 Bir kullanici olarak hastaneye ait bilgilere erisebilmek icin bir About Us menusunden testimonials sayfasına yonlendirme testi

    Given kullanici url gelir
    Then kullanici about us menusunun uzerine gelerek acilan pencerede about hospitals, meet our doctors, FAQ'S ,departments, testimonials sayfalarinin oldugunu dogrular
    Then kullanici testimonials yazisina tiklayarak sayfaya ulasir
    And kullanici sayfada hastahanede tedavi gormus kisilerin yorumlarini gorur


    Scenario: US_03 > TC_ 01  bır kullanıcı olarak anasayfa slider ınde hastane fotograflarının olup olmadığı testi

      Given kullanici url gelir
      Then  kullanici gallery butununa tiklar
      And  gallery sayfasinda hastane resimlerinin oldugunu dogrular



  Scenario: US_03 > TC_ 02 bır kullanıcı olarak anasayfa slider inde hastane fotograflarında resim gecişlerinin dogrulnması testi

    Given kullanici url gelir
    Then  kullanici gallery butununa tiklar
    Then  gallery sayfasinda hastane resimlerinin oldugunu dogrular
    When gallery sayfasindaki herhangi bir resmin uzerine gelerek ortasindaki mercek kismina tıklar ve resmin sayfada buyudugunu gorur
    Then buyuyen resmin sag ok kismini tiklayarak slider in oldugunu görür ve bir sonraki resme gectigini dogrular









