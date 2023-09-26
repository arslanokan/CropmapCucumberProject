Feature: Cropmap Web Sitesine Gitme

  Scenario: Cropmap web sitesine gitmek ve siteye giris yapmak istiyorum
    Given Cropmap web sitesine git
    When Cropmap welcome sayfasinin yuklendiginin kontrolunu yap
    And Start demo butonuna tikla
    And Sign in butonuna tikla
    And Email alanina tikla
    And Eposta adresini yaz
    And Password alanina tikla
    And Sifreni yaz
    And Sign in butonuna basin
    Then Plantation sekmesini sol menude kontrol et
    Then Report sekmesini sol menude kontrol et
    Then Profile sekmesini sol menude kontrol et
    Then Logout sekmesini sol menude kontrol et
    Then Plantation ekranının acildigini kontrol et
    When Locations Dropdown Menu Açmak
    When All Turkey Secimini Kaldirmak
    When Ilk Sehir Secimini Yap
    When Ikinci Sehir Secimini Yap
    When Ucuncu Sehir Secimini Yap
    When Dorduncu Sehir Secimini Yap


