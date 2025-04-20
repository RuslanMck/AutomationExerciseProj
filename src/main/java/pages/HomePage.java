package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;


public class HomePage {
    public static final GeneralElements GENERAL_ELEMENTS = new GeneralElements();
    public static final String BASE_URL = "https://automationexercise.com/";
    private SelenideElement heroCarouselSlider = Selenide.$x("//*[@id='slider-carousel']");

    public boolean heroCarouselSliderVisibility(){
        GENERAL_ELEMENTS.clickConsentButton();
        return heroCarouselSlider.isDisplayed();
    }
}
