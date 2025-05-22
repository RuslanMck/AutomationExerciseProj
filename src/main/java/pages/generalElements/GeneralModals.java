package pages.generalElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Condition.appear;

@Getter
public class GeneralModals {

    private WelcomeModal welcome = new WelcomeModal();
    private AddToCartConfirmationModal addToCartConfirmation = new AddToCartConfirmationModal();
    private CheckoutSignupModal checkoutSignup = new CheckoutSignupModal();


    public class WelcomeModal {
        private SelenideElement welcomeModal = Selenide.$(".fc-dialog-container");
        private SelenideElement consentButton = Selenide.$(".fc-cta-consent");

        public void clickConsentButton() {
            if (welcomeModal.exists() && consentButton.exists()) {
                consentButton.should(appear).click();
            }
        }
    }

    public class AddToCartConfirmationModal {
        private SelenideElement addToCartConfirmationModal = Selenide.$("#cartModal");
        private SelenideElement modalTitle = Selenide.$("#cartModal .modal-title");
        private SelenideElement viewCartLink = Selenide.$("#cartModal .modal-body a");
        private SelenideElement contiueShoppingButton = Selenide.$("#cartModal .modal-footer button");
        private SelenideElement modalBodyText = Selenide.$("#cartModal .modal-body p");

        public boolean isModalDisplayed() {
            addToCartConfirmationModal.shouldBe(Condition.visible);
            return addToCartConfirmationModal.isDisplayed();
        }

        public String getModalTitle() {
            modalTitle.shouldBe(Condition.visible);
            return modalTitle.text();
        }

        public void clickViewCartButton() {
            viewCartLink.shouldBe(Condition.visible);
            viewCartLink.click();
        }

        public void clickContinueShoppingButton() {
            contiueShoppingButton.shouldBe(Condition.visible);
            contiueShoppingButton.click();
        }

        public String getBodyText(){
            modalBodyText.shouldBe(Condition.visible);
            return modalBodyText.text();
        }
    }

    public class CheckoutSignupModal {
        private SelenideElement checkoutSignupModal = Selenide.$("#checkoutModal");
        private SelenideElement signupLoginLink = Selenide.$("#checkoutModal .modal-body a");
        private SelenideElement continueToCartButton = Selenide.$("#checkoutModal .modal-footer button");
        private SelenideElement errorMessageText = Selenide.$("#checkoutModal .modal-body p");

        public boolean isModalDisplayed(){
            return checkoutSignupModal.isDisplayed();
        }

        public void clickSignupLoginLink(){
            signupLoginLink.shouldBe(Condition.visible);
            signupLoginLink.click();
        }

        public void clickContinueToCartButton(){
            continueToCartButton.shouldBe(Condition.visible);
            continueToCartButton.click();
        }

        public String getErrorMessageText(){
            errorMessageText.shouldBe(Condition.visible);
            return errorMessageText.text();
        }
    }


}
