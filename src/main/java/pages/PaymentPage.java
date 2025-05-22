package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class PaymentPage {
    private SelenideElement cardNameInputField = Selenide.$x("//input[@data-qa='name-on-card']");
    private SelenideElement cardNumberInputField = Selenide.$(".card-number");
    private SelenideElement cardCvcInputField = Selenide.$(".card-cvc");
    private SelenideElement cardExpMonthInputField = Selenide.$(".card-expiry-month");
    private SelenideElement cardExpYearInputField = Selenide.$(".card-expiry-year");
    private SelenideElement placeAnOrderButton = Selenide.$("#submit");

    public void populateCardNameInputField(String name) {
        cardNameInputField.shouldBe(Condition.visible);
        cardNameInputField.val(name);
    }

    public void populateCardNumberInputField(String number) {
        cardNumberInputField.shouldBe(Condition.visible);
        cardNumberInputField.val(number);
    }

    public void populateCardCvcInputField(String cvc) {
        cardCvcInputField.shouldBe(Condition.visible);
        cardCvcInputField.val(cvc);
    }

    public void populateCardExpMonthInputField(String expMonth) {
        cardExpMonthInputField.shouldBe(Condition.visible);
        cardExpMonthInputField.val(expMonth);
    }


    public void populateCardExpYearInputField(String expYear) {
        cardExpYearInputField.shouldBe(Condition.visible);
        cardExpYearInputField.val(expYear);
    }


    public void clickPlaceAnOrderButton() {
        placeAnOrderButton.shouldBe(Condition.visible);
        placeAnOrderButton.click();
    }

}
