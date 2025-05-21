package steps;

import io.qameta.allure.Step;
import pages.ProductDetailsPage;

public class ProductDetailsPageSteps {
    private final ProductDetailsPage PRODUCT_DETAILS_PAGE = new ProductDetailsPage();

    @Step("Verify if the add to cart button is visible on the page")
    public boolean verifyIfAddToCartButtonIsVisible(){
        return PRODUCT_DETAILS_PAGE.isAddToCartButtonVisible();
    }

    @Step("Click the add to cart button")
    public void clickAddToCartButton(){
        PRODUCT_DETAILS_PAGE.clickAddToCartButton();
    }
}
