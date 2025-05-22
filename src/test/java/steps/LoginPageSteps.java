package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

import java.awt.desktop.PreferencesEvent;

public class LoginPageSteps {

    private final LoginPage loginPage = new LoginPage();

    @Step("Verify if the login form is displayed on page")
    public boolean verifyLoginFormVisibility() {
        return loginPage.isLoginFormDisplayed();
    }

    @Step("Verify if the signup form is displayed on page")
    public boolean verifySignupFormVisibility() {
        return loginPage.isSignupFormDisplayed();
    }

    @Step("Verify if the data can be populated to the signup username input field with: {userName}")
    public void verifySignupUsernameInput(String userName) {
        loginPage.populateSignupUsernameInputField(userName);
    }

    @Step("Verify if the data can be populated to the signup email input field with: {email}")
    public void verifySignupEmailInput(String email) {
        loginPage.populateSignupEmailInputField(email);
    }

    @Step("Click the Signup button")
    public void clickSignupButton() {
        loginPage.clickSignupButton();
    }

    @Step("Verify if the data can be populated to the login email input field with: {email}")
    public void verifyLoginEmailInput(String email) {
        loginPage.populateLoginEmailInputField(email);
    }

    @Step("Verify if the data can be populated to the login password input field with: {password}")
    public void verifyLoginPasswordInput(String password) {
        loginPage.populateLoginPasswordInputField(password);
    }

    @Step("Click the login button}")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
}
