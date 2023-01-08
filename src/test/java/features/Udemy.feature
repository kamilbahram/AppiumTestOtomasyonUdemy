Feature: Udemy Mobil App
  Scenario: Udemy Uygulamasinda Yazilim kurslari Arama
    Given Udemy Uygulamasini Ac
    When Arama Kutucuguna Tikla
    When Yazilim Testi Yaz ve Arama Iconuna Tikla
    Then Yazilim Testi Kurslarinin Geldiğini Kontrol Et