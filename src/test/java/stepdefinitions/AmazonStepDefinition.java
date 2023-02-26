package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
        AmazonPage amazonPage=new AmazonPage();

        @Given("amazon sayfasina gidilir")
        public void amazon_sayfasina_gidilir() {
            Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        }
        @Then("amazon sayfasinda selenium aratilir")
        public void amazon_sayfasinda_selenium_aratilir() {
                amazonPage.searchBox.sendKeys("Selenium"+ Keys.ENTER);

        }
        @Then("sonuclarin selenium icerdigi dogrulanir")
        public void sonuclarin_selenium_icerdigi_dogrulanir() {
                Assert.assertTrue(amazonPage.sonucYazisi.isDisplayed());

        }
        @Then("sayfa kapatilir")
        public void sayfa_kapatilir() {
                Driver.closeDriver();

    }

}
