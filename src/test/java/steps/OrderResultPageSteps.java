package steps;

import io.qameta.allure.Step;
import pages.OrderResultPage;

public class OrderResultPageSteps {
    private final OrderResultPage ORDER_RESULT_PAGE = new OrderResultPage();

    @Step("Verify the text of the order placement status")
    public String verifyResultStatusTest(){
        return ORDER_RESULT_PAGE.getOrderStatusText();
    }

    @Step("Exit the order result page by clicking \"Continue\" button")
    public void clickContinueButton(){
        ORDER_RESULT_PAGE.clickContinueButton();
    }

}
