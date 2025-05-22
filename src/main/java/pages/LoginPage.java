package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LoginPage {

    private SelenideElement loginForm = Selenide.$(".login-form");
    private SelenideElement loginEmailInputField = Selenide.$x("//input[@data-qa='login-email']");
    private SelenideElement loginPasswordInputField = Selenide.$x("//input[@data-qa='login-password']");
    private SelenideElement loginButton = Selenide.$x("//button[@data-qa='login-button']");
    private SelenideElement signupForm = Selenide.$(".signup-form");
    private SelenideElement signupUsername = Selenide.$x("//input[@data-qa='signup-name']");
    private SelenideElement signupEmail = Selenide.$x("//input[@data-qa='signup-email']");
    private SelenideElement signupButton = Selenide.$x("//button[@data-qa='signup-button']");

    public boolean isLoginFormDisplayed(){
        return loginForm.isDisplayed();
    }

    public void populateLoginEmailInputField(String loginInputData){
        loginEmailInputField.shouldBe(Condition.visible);
        loginEmailInputField.val(loginInputData);
    }

    public void populateLoginPasswordInputField(String passInputData){
        loginPasswordInputField.shouldBe(Condition.visible);
        loginPasswordInputField.val(passInputData);
    }

    public void clickLoginButton(){
        loginButton.shouldBe(Condition.visible);
        loginButton.click();
    }

    public boolean isSignupFormDisplayed(){
        return signupForm.isDisplayed();
    }

    public void populateSignupUsernameInputField(String usernameInputData){
        signupUsername.shouldBe(Condition.visible);
        signupUsername.val(usernameInputData);
    }

    public void populateSignupEmailInputField(String emailInputData){
        signupEmail.shouldBe(Condition.visible);
        signupEmail.val(emailInputData);
    }

    public void clickSignupButton(){
        signupButton.shouldBe(Condition.visible);
        signupButton.click();
    }
}
