Feature: Login Functionality

  Scenario: Valid Login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should see the home page



      Scenario:Dashboard panele dogru bilgilerle login olma
        Given kullanici anasayfada
        When login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir
        And user login sayfasinda sagda login penceresi solda latest new bilgileri bulunur
        Then user login sayfasinda (sisteme daha önceden kayitli) bilgiler girilerek dashboard panele login olunur.


        Scenario: Dashboard panele yanlis bilgilerle login olamama
          Given kullanici anasayfada
          When login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir
          And username kutusuna dogru email, password kutusuna yanlis sifre girilerek sign in butonuna tiklanir.
          Then Kullanicinin giris yapamadigi dogrulanir
          And username kutusuna yanlis email, password kutusuna dogru sifre girilerek sign in butonuna tiklanir.
          Then Kullanicinin giris yapamadigi dogrulanir
          And username kutusuna yanlis email, password kutusuna yanlis sifre girilerek sign in butonuna tiklanir.
          Then Kullanicinin giris yapamadigi dogrulanir

          @login3
          Scenario:
            Given kullanici anasayfada
            When login butonu gorunur ve tiklanabilir oldugu dogrulanir ve tiklanir. tiklandiktan sonra userlogin sayfasinda oldugu dogrulanir
            Then User Login sayfasinda forget password linki bulunmali ve bu linke tiklaninca ufpassword sayfasina yönlendirmeli.
            And Forgot password sayfasinda parola sifirlama islemi icin ilgili textBox'a mail adresi girilebilmeli
            And Forgot password sayfasindaki textBox'a girilen mail adresine sifre gönderilmeli.
            Then Forgot password sayfasinda login sayfasina dönmek icin user login linki bulunmali ve bu linke tiklaninca userlogin sayfasina yönlendirmeli.


        Scenario: US_26 >TC_01 Bir kullanici (hasta) olarak Dashboard sayfasinın header bolumunde bilgi boardlarının gorunur oldugu  ve sayfaya yonlendırıldıgı testi
          Given kullanici url ye gelir
          Then  kullanicihome sayfasinda login butonunu tiklar
          Then kullanici login sayfasinda usarname kismina pat79 password kismina  w2c4u8 datalarini girer ve sing in butonuna tiklar ve sayfasina gelir
          Then kullanici sayfasinda OPD board a tiklayarak sayfaya gider
          When kullanici IPD boarda tiklayarak sayfaya gider
          When kullanici Pharmacy boarda tiklayarak sayfaya gider
              Then kullanici Patology boarda tiklayarak sayfaya gider
          Then kullanici Radiology boarda tiklayarak sayfaya gider
          When kullanici Ambulance  boarda tiklayarak sayfaya gider
          And kullanici Blood Bankboarda tiklayarak sayfaya gider




          Scenario: US_26 >TC_02 Bir kullanici (hasta) olarak Dashboard sayfasinın body  bolumunde OPD, IPD, Pharmacy, Pathology, Radiology, Blood Bank, Ambulance
          degerlerini kullanarak grafik olusturabıldığı testi

            Given kullanici url ye gelir
            Then  kullanicihome sayfasinda login butonunu tiklar
            Then kullanici login sayfasinda usarname kismina pat79 password kismina  w2c4u8 datalarini girer ve sing in butonuna tiklar ve sayfasina gelir
            And kullanici dasboard butonuna tıklar




            Scenario: US_26 > TC_03 Bir kullanici (hasta) olarak Dashboard sayfasinın body  bolumunde  bulgu ve semptomlar ile ilgii
            grafıklerın oldugunun olup olmadıgının dogrulandıgı  testi

              Given kullanici url ye gelir
              Then  kullanicihome sayfasinda login butonunu tiklar
              Then kullanici login sayfasinda usarname kismina pat79 password kismina  w2c4u8 datalarini girer ve sing in butonuna tiklar ve sayfasina gelir
              Then kullanici sayfayi body bolumune gelir
              When kullanici sayfanin body bolumunda top 10 findings grafigini gordugunu dogrular
              And kullanici sayfanin body bolumunde top 10 Symptoms grafiğini gorur



  @language
  Scenario: US_016> TC_001 Dashboard navbar'ındaki heallifehospital logosuna tıklandığında anasayfasına yönlendirmeli ve bayrak simgesine tıklandığında panelin dilini değiştirebilmesi
    Given kullanici anasayfada
    And Hasta girisini yapar
    And Dashboard navbar'indaki HealLifeHospital logosuna tiklar ve tekrar Dashboard's geldigini dogrular
    Then Dashboard navbar'indaki bayrak simgesine tiklar ve dili degistirir mandarin dilin degistigini dogrular