package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class AccountCreatedPage {
    private SelenideElement createdPageTitle = Selenide.$x("//h2[@data-qa='account-created']");

    public String getConfirmationTitle(){
        createdPageTitle.shouldBe(Condition.visible);
        String title = createdPageTitle.text();
        return title;
    }
}
