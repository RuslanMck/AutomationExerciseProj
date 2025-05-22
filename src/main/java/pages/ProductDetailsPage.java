package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ProductDetailsPage {
    private SelenideElement addToCartButton = Selenide.$x("//button[contains(normalize-space(), 'Add to cart')]");

    public boolean isAddToCartButtonVisible(){
        return addToCartButton.isDisplayed();
    }

    public void clickAddToCartButton(){
        addToCartButton.shouldBe(Condition.visible);
        addToCartButton.click();
    }
}


