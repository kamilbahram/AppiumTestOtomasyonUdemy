package Pages;

import util.ElementHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdemyPages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By gozAt = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Gözat\")");
    By appOpen = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Udemy\")");
    By searcButoon = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ara\")");
    public UdemyPages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void udemyUygulamasiniAc() {
        driver.findElement(gozAt).click();
    }

    public void aramaKutucugunaTikla() {
        driver.findElement(searcButoon).click();
    }

    public void yazilimTestiYazVeAramaIconunaTikla() {
        driver.findElement(searcButoon).click();
    }

    public void yazilimTestiKurslarininGeldiginiKontrolEt() {
        driver.findElement(searcButoon).click();
    }
}
