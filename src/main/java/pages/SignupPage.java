package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SignupPage {
    private SelenideElement registrationForm = Selenide.$(".login-form");

    public boolean isRegistrationFormVisible(){
        registrationForm.shouldBe(Condition.visible);
        return registrationForm.isDisplayed();
    }
}
