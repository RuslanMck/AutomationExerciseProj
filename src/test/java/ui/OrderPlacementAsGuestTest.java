package ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.generalElements.GeneralModals;
import steps.*;
import testData.User;
import testData.UserFactory;

public class OrderPlacementAsGuestTest extends TestConfig {

    private final GeneralElementsSteps GENERAL_ELEMENTS_STEPS = new GeneralElementsSteps();
    private final ProductListPageSteps PRODUCT_LIST_PAGE_STEPS = new ProductListPageSteps();
    private final GeneralModals GENERAL_MODALS = new GeneralModals();
    private final ProductDetailsPageSteps PRODUCT_DETAILS_PAGE_STEPS = new ProductDetailsPageSteps();
    private final GeneralModalsSteps GENERAL_MODAL_STEPS = new GeneralModalsSteps();
    private final CartPageSteps CART_PAGE_STEPS = new CartPageSteps();


    @BeforeClass
    public void setUp(){
        setUp("base.url");
        GENERAL_MODALS.getWelcome().clickConsentButton();
    }

    @Test(description = "As a guest user add product to the cart and place an order")
    public void orderPlacementAsGuestUser(){
        GENERAL_ELEMENTS_STEPS.clickProductsButton();
        Assert.assertTrue(PRODUCT_LIST_PAGE_STEPS.verifyCategorySidebarVisibility());
        String actualTitle = PRODUCT_LIST_PAGE_STEPS.verifyProductListTitle().toLowerCase();
        String expectedTitle = "All Products".toLowerCase();
        Assert.assertEquals(actualTitle, expectedTitle);

        PRODUCT_LIST_PAGE_STEPS.selectAndClickARandomProduct();
        Assert.assertTrue(PRODUCT_DETAILS_PAGE_STEPS.verifyIfAddToCartButtonIsVisible());

        PRODUCT_DETAILS_PAGE_STEPS.clickAddToCartButton();
        Assert.assertTrue(GENERAL_MODAL_STEPS.addToCartConfirmationModalSteps.verifyModalDisplaying());
        Assert.assertEquals(GENERAL_MODAL_STEPS.addToCartConfirmationModalSteps.verifyModalTitleText(), "Added!");
        Assert.assertEquals(GENERAL_MODAL_STEPS.addToCartConfirmationModalSteps.verifyModalBodyText(), "Your product has been added to cart.");

        GENERAL_MODAL_STEPS.addToCartConfirmationModalSteps.clickViewCartButton();
        Assert.assertTrue(CART_PAGE_STEPS.verifyThatCartIsNotEmpty());

        CART_PAGE_STEPS.proceedWithCheckout();
        Assert.assertTrue(GENERAL_MODAL_STEPS.checkoutSignupModalSteps.verifyModalDisplaying());
        Assert.assertEquals(GENERAL_MODAL_STEPS.checkoutSignupModalSteps.getErrorMessageText(), "Register / Login account to proceed on checkout.");
    }


}
