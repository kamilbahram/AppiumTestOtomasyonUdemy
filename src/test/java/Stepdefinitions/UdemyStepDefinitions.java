package Stepdefinitions;

import Pages.UdemyPages;
import Util.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UdemyStepDefinitions {
    UdemyPages udemyPages = new UdemyPages((AppiumDriver) DriverFactory.getDriver());
    @Given("Udemy Uygulamasini Ac")
    public void udemyUygulamasiniAc() {
        udemyPages.udemyUygulamasiniAc();
    }

    @When("Arama Kutucuguna Tikla")
    public void aramaKutucugunaTikla() {
        udemyPages.aramaKutucugunaTikla();
    }

    @When("Yazilim Testi Yaz ve Arama Iconuna Tikla")
    public void yazilimTestiYazVeAramaIconunaTikla() {
        udemyPages.yazilimTestiYazVeAramaIconunaTikla();
    }

    @Then("Yazilim Testi Kurslarinin Geldiğini Kontrol Et")
    public void yazilimTestiKurslarininGeldiğiniKontrolEt() {
        udemyPages.yazilimTestiKurslarininGeldiğiniKontrolEt();
    }
}
