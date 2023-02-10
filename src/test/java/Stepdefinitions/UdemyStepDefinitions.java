package Stepdefinitions;

import Pages.UdemyPages;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UdemyStepDefinitions {
    UdemyPages udemyPages = new UdemyPages( DriverFactory.getDriver());
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

    @Then("Yazilim Testi Kurslarinin Geldigini Kontrol Et")
    public void yazilimTestiKurslarininGeldiginiKontrolEt() {
        udemyPages.yazilimTestiKurslarininGeldiginiKontrolEt();
    }
}
