Feature: US1010 Automation Exercise
  Scenario:

  - Given user web sayfasina gider
  - And user sign in linkine tiklar
  - And email kutusuna @isareti olmayan email adresi yazar ve enter’a tiklar
  - Then egit statusrror mesajinin “Invalid email address” oldugunu dogrulayin