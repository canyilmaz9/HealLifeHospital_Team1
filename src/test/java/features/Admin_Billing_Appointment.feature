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
