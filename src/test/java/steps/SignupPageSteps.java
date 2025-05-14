package steps;

import io.qameta.allure.Step;
import pages.SignupPage;

public class SignupPageSteps {
    private final SignupPage SIGNUP_PAGE = new SignupPage();

    @Step("Verify that the registration form is displayed")
    public boolean verifyRegistrationFormVisibility(){
        return SIGNUP_PAGE.isRegistrationFormVisible();
    }
}
