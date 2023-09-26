package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.CropmapLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class CropmapLoginSteps {

    CropmapLoginPage cropmapLoginPage = new CropmapLoginPage();
    Actions actions = new Actions(getDriver());


    @Given("Cropmap web sitesine git")
    public void cropmapWebSitesineGit() {


    }

    @When("Cropmap welcome sayfasinin yuklendiginin kontrolunu yap")
    public void cropmapWelcomeSayfasininYuklendigininKontrolunuYap() {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle: " + actualTitle);
        String expectedTitle = "CropMap | Doktar";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @And("Start demo butonuna tikla")
    public void startDemoButonunaTikla() {
        cropmapLoginPage.buttonStartDemo.click();

    }

    @And("Sign in butonuna tikla")
    public void signInButonunaTikla() {
        cropmapLoginPage.buttonSignin.click();
    }

    @And("Email alanina tikla")
    public void emailAlaninaTikla() {
        cropmapLoginPage.clickEmail.click();
    }

    @And("Eposta adresini yaz")
    public void epostaAdresiniYaz() {
        cropmapLoginPage.clickEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Password alanina tikla")
    public void passwordAlaninaTikla() {
        cropmapLoginPage.clickPassword.click();
    }

    @And("Sifreni yaz")
    public void sifreniYaz() {
        cropmapLoginPage.clickPassword.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @And("Sign in butonuna basin")
    public void signInButonunaBasin() {
        cropmapLoginPage.btnSignin.click();
    }

    @Then("Plantation sekmesini sol menude kontrol et")
    public void plantationSekmesiniSolMenudeKontrolEt() {
        String actualText1 = "Plantation";
        System.out.println("actualText1: " + actualText1);
        assertTrue(cropmapLoginPage.checkPlantationText.getText().contains(actualText1));

    }

    @Then("Report sekmesini sol menude kontrol et")
    public void reportSekmesiniSolMenudeKontrolEt() {
        String actualText2 = "Report";
        System.out.println("actualText2: " + actualText2);
        assertTrue(cropmapLoginPage.checkReportText.getText().contains(actualText2));
    }

    @Then("Profile sekmesini sol menude kontrol et")
    public void profileSekmesiniSolMenudeKontrolEt() {
        String actualText3 = "Profile";
        System.out.println("actualText3: " + actualText3);
        assertTrue(cropmapLoginPage.checkProfileText.getText().contains(actualText3));
    }

    @Then("Logout sekmesini sol menude kontrol et")
    public void logoutSekmesiniSolMenudeKontrolEt() {
        String actualText4 = "Logout";
        System.out.println("actualText4: " + actualText4);
        assertTrue(cropmapLoginPage.checkLogoutText.getText().contains(actualText4));
    }

    @Then("Plantation ekranının acildigini kontrol et")
    public void plantationEkranınınAcildiginiKontrolEt() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println("actualUrl: " + actualUrl);
        String expectedUrl = "http://test.cropmap.com/#/pages/home/plantation?filter=standart";

        assertEquals(actualUrl, expectedUrl);

    }

    @When("Locations Dropdown Menu Açmak")
    public void locationsDropdownMenuAcmak() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cropmapLoginPage.clickLocations.click();
    }

    @When("All Turkey Secimini Kaldirmak")
    public void allTurkeySeciminiKaldirmak() {
        cropmapLoginPage.unselectAllTurkey.click();
    }

    @When("Ilk Sehir Secimini Yap")
    public void ilkSehirSeciminiYap() {
        cropmapLoginPage.firstCitySelect.click();
    }

    @When("Ikinci Sehir Secimini Yap")
    public void ikinciSehirSeciminiYap() {
        cropmapLoginPage.secondCitySelect.click();
    }

    @When("Ucuncu Sehir Secimini Yap")
    public void ucuncuSehirSeciminiYap() {
        cropmapLoginPage.thirdCitySelect.click();
    }

    @When("Dorduncu Sehir Secimini Yap")
    public void dorduncuSehirSeciminiYap() {
        cropmapLoginPage.fourthCitySelect.click();

    }
}
