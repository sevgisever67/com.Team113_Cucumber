package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebDriverUniverstyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WebdriverUniverstyStepDefination {

    WebDriverUniverstyPage webDriverUniverstyPage = new WebDriverUniverstyPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} sayfasına gider")
    public static void kullanici_sayfasına_gider(String istenilenURL) {
        Driver.getDriver().get(ConfigReader.getProperty(istenilenURL));
        String whd1 = Driver.getDriver().getWindowHandle();

    }

    String whd1 = Driver.getDriver().getWindowHandle();

    @Then("Login Portal a kadar asagi iner")
    public void loginPortalAKadarAsagiIner() {
        actions.scrollToElement(webDriverUniverstyPage.loginPortalButton).perform();
    }


    @Then("Login Portal\" a tiklar")
    public void loginPortalATiklar() {
        webDriverUniverstyPage.loginPortalButton.click();


    }

    @Then("Diger window'a gecer")
    public void digerWindowAGecer() {
        for (String eachHandle : Driver.getDriver().getWindowHandles()) {
            if (!(eachHandle.equalsIgnoreCase(whd1))) {
                Driver.getDriver().switchTo().window(eachHandle);
            }
        }
    }

    @Then("UsarName  kutusuna {string} deger yazdirir")
    public void kutularinaDegerYazdirir(String gecerliUsarname) {
        webDriverUniverstyPage.userNameButton.sendKeys(ConfigReader.getProperty(gecerliUsarname));
    }

    @Then("Password  kutusuna {string} deger yazdirir")
    public void passwordKutusunaDegerYazdirir(String gecerliPassword) {
        webDriverUniverstyPage.passWordButton.sendKeys(ConfigReader.getProperty(gecerliPassword));
    }


    @Then("login butonuna basar")
    public void loginButonunaBasar() {
        webDriverUniverstyPage.logInButton.click();
    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popupTaCikanYazininOldugunuTestEder(String expectedAlertText) {
       String actualAlertText= Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedAlertText,actualAlertText);
    }

    @Then("Ok diyerek Popup'i kapatir")
    public void okDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Ilk sayfaya geri doner")
    public void ilkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(whd1);
    }

    @Then("Ilk sayfaya donuldugunu test eder")
    public void ilkSayfayaDonuldugunuTestEder() {
        Assert.assertTrue(webDriverUniverstyPage.webUniverstyComTexti.isDisplayed());
    }
}