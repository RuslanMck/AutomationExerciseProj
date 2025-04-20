package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;

public class GeneralElements {
    private SelenideElement welcomeModal = Selenide.$(".fc-dialog-container");
    private SelenideElement consentButton = Selenide.$(".fc-cta-consent");

    public boolean isWelcomeModalVisible(){
        return welcomeModal.isDisplayed();
    }

    public void clickConsentButton(){
        if (welcomeModal.exists()&&consentButton.exists()) {
            consentButton.should(appear).click();
        }
    }
}
