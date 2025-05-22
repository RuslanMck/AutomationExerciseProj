package steps;

import io.qameta.allure.Step;
import pages.CartPage;

public class CartPageSteps {
    private final CartPage CART_PAGE = new CartPage();


    @Step("Verify that the cart is not empty")
    public boolean verifyThatCartIsNotEmpty() {
        return CART_PAGE.getNumberOfUniqueProductsInCart() > 0;
    }

    @Step("Verify that the user can proceed with checkout process")
    public void proceedWithCheckout(){
        CART_PAGE.clickProceedToCheckoutButton();
    }
}
