Feature: US1011 Kullanıcı web tablosundaki şirketleri yazdırır
  Scenario: TC17 Kullanici listeyi yazdirir ve arana sirketin valıgini test eder

    Given user "guruUrl" sayfasina gider
    Then Company listesini consola yazdirir
    And DCB Bank’in listede oldugunu test eder