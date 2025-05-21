package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.generalElements.GeneralModals;


public class HomePage {
    public static final GeneralModals GENERAL_ELEMENTS = new GeneralModals();
    public static final String BASE_URL = "https://automationexercise.com/";
    private SelenideElement heroCarouselSlider = Selenide.$x("//*[@id='slider-carousel']");

    public boolean heroCarouselSliderVisibility() {
        GENERAL_ELEMENTS.welcomeModal.clickConsentButton();
        return heroCarouselSlider.isDisplayed();
    }
}
