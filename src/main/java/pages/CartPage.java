package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class CartPage {
    private SelenideElement proceedToCheckoutButton = Selenide.$(".btn.check_out");
    private ElementsCollection listOfProducts = Selenide.$$(".cart_product");

    public int getNumberOfUniqueProductsInCart(){
        return listOfProducts.size();
    }

    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.shouldBe(Condition.visible);
        proceedToCheckoutButton.click();
    }
}
