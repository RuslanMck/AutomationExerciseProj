package steps;

import io.qameta.allure.Step;
import pages.PaymentPage;

public class PaymentPageSteps {
    private final PaymentPage PAYMENT_PAGE = new PaymentPage();

    @Step("Populate data into the Card Name input field {name}")
    public void populateCardName(String name) {
        PAYMENT_PAGE.populateCardNameInputField(name);
    }

    @Step("Populate data into the Card Number input field {number}")
    public void populateCardNumber(String number) {
        PAYMENT_PAGE.populateCardNumberInputField(number);
    }

    @Step("Populate data into the Card CVC input field {cvc}")
    public void populateCardCvc(String cvc) {
        PAYMENT_PAGE.populateCardCvcInputField(cvc);
    }

    @Step("Populate data into the Card expiration month input field {expMonth}")
    public void populateCardExpMonth(String expMonth) {
        PAYMENT_PAGE.populateCardExpMonthInputField(expMonth);
    }

    @Step("Populate data into the Card expiration year input field {expYear}")
    public void populateCardExpYear(String expYear) {
        PAYMENT_PAGE.populateCardExpYearInputField(expYear);
    }

    @Step("Complete the order placement by clicking the Pay and Confirm Order button")
    public void placeAnOrder(){
        PAYMENT_PAGE.clickPlaceAnOrderButton();
    }
}
