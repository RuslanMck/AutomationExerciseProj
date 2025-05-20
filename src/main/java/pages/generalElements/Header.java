package pages.generalElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Header {
    private SelenideElement headerLogo = Selenide.$(".logo");
    private SelenideElement headerHomeButton = Selenide.$x("//li[a[contains(text(), 'Home') and contains(@href, '/')]]");
    private SelenideElement headerProductsButton = Selenide.$x("//li[a[contains(text(), 'Products') and contains(@href, '/products')]]");
    private SelenideElement headerLoginButton = Selenide.$x("//li[a[contains(text(), ' Signup / Login') and contains(@href, '/login')]]");
    private SelenideElement headerCartButton = Selenide.$x("//li[a[contains(text(), 'Cart') and contains(@href, '/view_cart')]]");
    private SelenideElement deleteAccountButton = Selenide.$x("//a[text()=' Delete Account']");


    public boolean headerLogoIsVisible() {
        return headerLogo.isDisplayed();
    }

    public void clickHeaderLogo() {
        headerLogo.shouldBe(Condition.visible);
        headerLogo.click();
    }

    public boolean headerHomeButtonIsVisible() {
        return headerHomeButton.isDisplayed();
    }

    public void clickHeaderHomeButton() {
        headerHomeButton.shouldBe(Condition.visible);
        headerHomeButton.click();
    }

    public boolean headerProductsButtonIsVisible() {
        return headerProductsButton.isDisplayed();
    }

    public void clickHeaderProductsButton() {
        headerProductsButton.shouldBe(Condition.visible);
        headerProductsButton.click();
    }

    public boolean headerLoginButtonIsVisible() {
        return headerLoginButton.isDisplayed();
    }

    public void clickHeaderLoginButton() {
        headerLoginButton.shouldBe(Condition.visible);
        headerLoginButton.click();
    }

    public boolean headerCartButtonIsVisible() {
        return headerCartButton.isDisplayed();
    }

    public void clickHeaderCartButton() {
        headerCartButton.shouldBe(Condition.visible);
        headerCartButton.click();
    }

    public void clickDeleteAccountButton(){
        deleteAccountButton.shouldBe(Condition.visible);
        deleteAccountButton.click();
    }
}
