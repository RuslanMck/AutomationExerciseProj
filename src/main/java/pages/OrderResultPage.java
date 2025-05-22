package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class OrderResultPage {
    private SelenideElement orderStatus = Selenide.$("h2.title");
    private SelenideElement continueButton = Selenide.$x("//a[@data-qa='continue-button']");

    public String getOrderStatusText(){
        orderStatus.shouldBe(Condition.visible);
        return orderStatus.text();
    }

    public void clickContinueButton(){
        continueButton.shouldBe(Condition.visible);
        continueButton.click();
    }

}
