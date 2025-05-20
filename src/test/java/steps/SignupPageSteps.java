package steps;

import io.qameta.allure.Step;
import pages.SignupPage;

public class SignupPageSteps {
    private final SignupPage SIGNUP_PAGE = new SignupPage();

    @Step("Verify that the registration form is displayed")
    public boolean verifyRegistrationFormVisibility() {
        return SIGNUP_PAGE.isRegistrationFormVisible();
    }

    @Step("Select the day of birth")
    public void selectDayOfBirth(String day) {
        SIGNUP_PAGE.clickDayOfBirth(day);
    }

    @Step("Select the month of birth")
    public void selectMonthOfBirth(String month) {
        SIGNUP_PAGE.clickMonthOfBirth(month);
    }

    @Step("Select the year of birth")
    public void selectYearOfBirth(String year) {
        SIGNUP_PAGE.clickYearOfBirth(year);
    }

    @Step("Select the gender")
    public void selectGender(String gender) {
        switch (gender) {
            case "male":
                SIGNUP_PAGE.clickMrTitle();
                break;
            case "female":
                SIGNUP_PAGE.clickMrsTitle();
                break;
        }
    }

    @Step("Populate password")
    public void populatePassword(String password) {
        SIGNUP_PAGE.inputDataToPasswordInputField(password);
    }

    @Step("Populate first name")
    public void populateFirstName(String firstName) {
        SIGNUP_PAGE.inputDataToFirstNameInputField(firstName);
    }

    @Step("Populate last name")
    public void populateLastName(String lastName) {
        SIGNUP_PAGE.inputDataToLastNameInputField(lastName);
    }

    @Step("Populate street")
    public void populateStreet(String street) {
        SIGNUP_PAGE.inputDataToStreetInputField(street);
    }

    @Step("Populate country")
    public void populateCountry(String country) {
        SIGNUP_PAGE.selectCountry(country);
    }

    @Step("Populate state")
    public void populateState(String state) {
        SIGNUP_PAGE.inputDataToStateInputField(state);
    }

    @Step("Populate city")
    public void populateCity(String city) {
        SIGNUP_PAGE.inputDataToCityInputField(city);
    }

    @Step("Populate zipcode")
    public void populateZipcode(String zipcode) {
        SIGNUP_PAGE.inputDataToZipcodeInputField(zipcode);
    }

    @Step("Populate phone number")
    public void populatePhone(String phoneNumber) {
        SIGNUP_PAGE.inputDataToPhoneInputField(phoneNumber);
    }

    @Step("Click the account creation button")
    public void clickCreateAccountButton() {
        SIGNUP_PAGE.clickCreateAccountButton();
    }
}
