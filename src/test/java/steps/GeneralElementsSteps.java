package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import pages.generalElements.Footer;
import pages.generalElements.Header;

public class GeneralElementsSteps {
    private Footer footer = new Footer();
    private Header header = new Header();

    @Step("Verify that the header logo is visible")
    public boolean checkLogoVisibility() {
        return header.headerLogoIsVisible();
    }

    @Step("Click the logo image")
    public void clickLogoImage() {
        header.clickHeaderLogo();
    }

    @Step("Verify that the Home button is visible")
    public boolean checkHomeButtonVisibility() {
        return header.headerHomeButtonIsVisible();
    }

    @Step("Click the Home button")
    public void clickHomeButton() {
        header.clickHeaderHomeButton();
    }

    @Step("Verify that the Products button is visible")
    public boolean checkProductsButtonVisibility() {
        return header.headerProductsButtonIsVisible();
    }


    @Step("Click the Products button")
    public void clickProductsButton() {
        header.clickHeaderProductsButton();
    }

    @Step("Verify that the Login button is visible")
    public boolean checkLoginButtonVisibility() {
        return header.headerLoginButtonIsVisible();
    }

    @Step("Click the Login button")
    public void clickLoginButton() {
        header.clickHeaderLoginButton();
    }

    @Step("Verify that the Cart button is visible")
    public boolean checkCartButtonVisibility() {
        return header.headerCartButtonIsVisible();
    }

    @Step("Click the Cart button")
    public void clickCartButton() {
        header.clickHeaderCartButton();
    }

    @Step("Verify that the newsletter subscription elements are visible")
    public boolean checkNewsletterSubscription() {
        return footer.subscriptionEmailInputIsVisible() & footer.newsletterSubscribeButtonIsVisible();
    }

    @Step("Verify year in the copyright block")
    public String getCopyrightYear() {
        return footer.getCopyrightYear();
    }

}
