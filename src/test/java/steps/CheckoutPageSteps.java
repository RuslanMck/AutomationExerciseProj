package steps;

import io.qameta.allure.Step;
import pages.CheckoutPage;

public class CheckoutPageSteps {
    private final CheckoutPage CHECKOUT_PAGE = new CheckoutPage();

    @Step("Click the Checkout button")
    public void clickCheckoutButton(){
        CHECKOUT_PAGE.clickCheckoutButton();
    }
}
