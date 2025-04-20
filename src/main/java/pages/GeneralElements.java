package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class GeneralElements {
    private SelenideElement welcomeModal = Selenide.$(".fc-dialog-container");
    private SelenideElement consentButton = Selenide.$(".fc-cta-consent");

    public boolean isWelcomeModalVisible(){
        return welcomeModal.isDisplayed();
    }

    public void clickConsentButton(){
        welcomeModal.shouldBe(Condition.visible);
        consentButton.shouldBe(Condition.visible);
        consentButton.click();
    }
}
