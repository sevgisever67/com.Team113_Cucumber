Feature: US1003 Amazonda aranan ürün dogrulamasi

  Scenario: TC12 Ararnan urunun dogru oldugu test edilebilmeli
    Given Kullanici "amazonUrl" anasayfaya gider
    Then "Nutella" icin arama yapar
    And ilk urune click yapar
    And acilan urun isminin "Nutella" icerdeğini testeder
    And Sayfayi kapatir