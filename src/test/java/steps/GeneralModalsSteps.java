package steps;

import io.qameta.allure.Step;
import pages.generalElements.GeneralModals;

public class GeneralModalsSteps {
    public CheckoutSignupModalSteps checkoutSignupModalSteps = new CheckoutSignupModalSteps();
    public AddToCartConfirmationModalSteps addToCartConfirmationModalSteps = new AddToCartConfirmationModalSteps();
    private final GeneralModals GENERAL_MODALS = new GeneralModals();

    public class AddToCartConfirmationModalSteps{

        @Step("Verify if the add to cart confirmation modal is displayed")
        public boolean verifyModalDisplaying(){
            return GENERAL_MODALS.getAddToCartConfirmation().isModalDisplayed();
        }

        @Step("Verify the modal body text")
        public String verifyModalBodyText(){
            return GENERAL_MODALS.getAddToCartConfirmation().getBodyText();
        }

        @Step("Verify the modal title text")
        public String verifyModalTitleText(){
            return GENERAL_MODALS.getAddToCartConfirmation().getModalTitle();
        }

        @Step("Click the view cart button")
        public void clickViewCartButton(){
            GENERAL_MODALS.getAddToCartConfirmation().clickViewCartButton();
        }
    }

    public class CheckoutSignupModalSteps{

        @Step("Verify if the error modal is displayed while trying to place order as guest user")
        public boolean verifyModalDisplaying(){
            return GENERAL_MODALS.getCheckoutSignup().isModalDisplayed();
        }
    }
}
