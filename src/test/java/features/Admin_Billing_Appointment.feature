Feature: Admin Appointment Page
  @appointments
  Scenario: US_034_TC_001
    Given Admin, Admin Login sayfasinda
    Then Onceden belirlenmis admin bilgileri ile sisteme giris yapar
    And Sisteme giris yaptigini dogruladiktan sonra, sidebar'da Appointment basligini goruntuler ve tiklar.
    Then Appointment sayfasindaki Appointment Details List'te(Patient Name, Appointment No, Appointment Date, Phone, Gender, Doctor, Source, Priorty, Fees, Status) basliklari olmali.
    And Appointment sayfasindaki Appointment Details List'te basliklar üzerinden siralama yapilabilmeli.
    And Appointment sayfasindaki Appointment Details List'te arama yapabilmek icin sayfada searchBox olmali.
    And Appointment sayfasindaki Appointment Details List'te Action basligi altinda appointment detayi görüntülenmeli.

  Scenario: US_034_TC_002 Appointments sayfasi Doctor Wise sayfasi islev testi
    Given Admin, Admin Login sayfasinda
    Then Onceden belirlenmis admin bilgileri ile sisteme giris yapar
    And Sisteme giris yaptigini dogruladiktan sonra, sidebar'da Appointment basligini goruntuler ve tiklar.
    When Appointment sayfasindan doktor secerek ilgili doktordan alinmis randevularinin görüntülenebilecegi bir sayfaya (ilgili islemleri yapabilmek icin) yönlendirme olmali.
    Then Doctor Wise Appointment sayfasinda Doctor ve Date secilerek filtrelemeye uygun randevu verileri listelenebilmeli.

  Scenario: US_034_TC_003 Appointments sayfasi Queue sayfasi islev testi
    Given Admin, Admin Login sayfasinda
    Then Onceden belirlenmis admin bilgileri ile sisteme giris yapar
    And Sisteme giris yaptigini dogruladiktan sonra, sidebar'da Appointment basligini goruntuler ve tiklar.
    When Appointment sayfasindan (doktor vardiya gün ve slot secilerek) randevu almis hastalari filtreleyebilecegim bir sayfaya (ilgili islemleri yapabilmek icin) yönlendirme olmali.
    Then Patient Queue sayfasinda doktor vardiya gün ve slot secildiginde ( filtrelemeye uygun ) randevular listenebilmeli.