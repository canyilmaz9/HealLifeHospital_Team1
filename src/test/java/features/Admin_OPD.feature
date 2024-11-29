Feature:

  Scenario: US_35 >TC_01 Bir yönetici (admin) olarak Opd hastalari (detaylariyla) görüldüğü i testi

    Given  admin adminURL ye giris yapar
    Then sayfada usarname kismina mervenur.admin@heallifehospital.com password kismina o6*d@fko3PXL1 verisini girer ve sing in butonunu tiklar
    When admin OPD butonuna tiklar
    And OPD sayfasinda hastalara ait basliklari gorur


    Scenario: US_35 > TC_02 bir yonetici olarak OPD patient lıstte sıralama yapabidiği testi


      Given  admin adminURL ye giris yapar
      Then sayfada usarname kismina mervenur.admin@heallifehospital.com password kismina o6*d@fko3PXL1 verisini girer ve sing in butonunu tiklar
      When admin OPD butonuna tiklar
      Then OPD sayfasinda hastalara ait basliklari gorur
      And OPD sayfasinda basliklar uzerinden siralama yapar


    Scenario: US_35 >TC_03 bir yonetici olarak OPD patient list de searchbox oldugu testi

      Given  admin adminURL ye giris yapar
      Then sayfada usarname kismina mervenur.admin@heallifehospital.com password kismina o6*d@fko3PXL1 verisini girer ve sing in butonunu tiklar
      When admin OPD butonuna tiklar
      And OPD sayfasinda serchbox butonunu gorur


  Scenario: US_35 >TC_04 bir yonetici olarak OPD patient list de liste elemanlarını all veya 100 olarak secebıldıgı testi

    Given  admin adminURL ye giris yapar
    Then sayfada usarname kismina mervenur.admin@heallifehospital.com password kismina o6*d@fko3PXL1 verisini girer ve sing in butonunu tiklar
    When admin OPD butonuna tiklar
    Then OPD sayfasinda liste elemanlarini all ve 100 olarak secer




  Scenario: US_35 >TC_05 Bir yönetici (admin) olarak yeni hasta kaydının yapılabılmesı testi

    Given  admin adminURL ye giris yapar
    Then sayfada usarname kismina mervenur.admin@heallifehospital.com password kismina o6*d@fko3PXL1 verisini girer ve sing in butonunu tiklar
    When admin OPD butonuna tiklar
    When OPD sayfasinda yeni hasta ekleyebilmek icin Add Patient butonuna tiklar.
    Then gelinen sayfada new patient butonuna tiklar
    When name ,age zorunlu alanlarini doldurur ve save butonuna tiklar succesfully penceresini gorur
    And patient sayfasinda  Appointment Date, Consultant doctor, Charge zorunlu alanlarini doldurur ve save butonuna tiklayarak succesfully penceresini gorerek kaydinin basarili oldugunu anlar






