Feature: US2002 Webdriver Universty Testi

  Scenario: popUptesti
    Given Kullanici "WevbdriveuniverstyURL" sayfasına gider
    Then Login Portal a kadar asagi iner
    Then Login Portal" a tiklar
    Then Diger window'a gecer
    Then UsarName  kutusuna "qdGecerliUsername" deger yazdirir
    Then Password  kutusuna "qdGecerliPassword" deger yazdirir
    Then login butonuna basar
    Then Popup'ta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    Then Ilk sayfaya geri doner
    Then Ilk sayfaya donuldugunu test eder


