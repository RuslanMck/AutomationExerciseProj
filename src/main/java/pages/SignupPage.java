package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SignupPage {
    private SelenideElement registrationForm = Selenide.$(".login-form");
    private SelenideElement mrTitleSelector = Selenide.$("#uniform-id_gender1");
    private SelenideElement mrsTitleSelector = Selenide.$("#uniform-id_gender2");
    private SelenideElement passwordInputField = Selenide.$("#password");
    private SelenideElement birthDaySelector = Selenide.$("#days");
    private SelenideElement birthMonthSelector = Selenide.$("#months");
    private SelenideElement birthYearSelector = Selenide.$("#years");
    private SelenideElement firstNameInputField = Selenide.$("#first_name");
    private SelenideElement lastNameInputField = Selenide.$("#last_name");
    private SelenideElement streetInputField = Selenide.$("#address1");
    private SelenideElement countryDropdown = Selenide.$("#country");
    private SelenideElement stateInputField = Selenide.$("#state");
    private SelenideElement cityInputField = Selenide.$("#city");
    private SelenideElement zipcodeInputField = Selenide.$("#zipcode");
    private SelenideElement phoneInputField = Selenide.$("#mobile_number");
    private SelenideElement createAccountButton = Selenide.$x("//button[@data-qa='create-account']");

    public boolean isRegistrationFormVisible() {
        registrationForm.shouldBe(Condition.visible);
        return registrationForm.isDisplayed();
    }

    public void clickMrTitle() {
        mrTitleSelector.shouldBe(Condition.visible);
        mrTitleSelector.click();
    }

    public void clickMrsTitle() {
        mrsTitleSelector.shouldBe(Condition.visible);
        mrsTitleSelector.click();
    }

    public void inputDataToPasswordInputField(String password) {
        passwordInputField.shouldBe(Condition.visible);
        passwordInputField.val(password);
    }

    public void expandBirthDaysSelector() {
        birthDaySelector.shouldBe(Condition.visible);
        birthDaySelector.click();

    }

    public void clickDayOfBirth(String day) {
        expandBirthDaysSelector();
        birthDaySelector.selectOptionByValue(day);
    }

    public void expandBirthMonthSelector() {
        birthMonthSelector.shouldBe(Condition.visible);
        birthMonthSelector.click();
    }

    public void clickMonthOfBirth(String month) {
        expandBirthMonthSelector();
        birthMonthSelector.selectOptionByValue(month);
    }

    public void expandBirthYearSelector() {
        birthYearSelector.shouldBe(Condition.visible);
        birthYearSelector.click();
    }

    public void clickYearOfBirth(String year) {
        expandBirthYearSelector();
        birthYearSelector.selectOptionByValue(year);
    }

    public void inputDataToFirstNameInputField(String name) {
        firstNameInputField.shouldBe(Condition.visible);
        firstNameInputField.val(name);
    }

    public void inputDataToLastNameInputField(String lastName) {
        lastNameInputField.shouldBe(Condition.visible);
        lastNameInputField.val(lastName);
    }

    public void inputDataToStreetInputField(String street) {
        streetInputField.shouldBe(Condition.visible);
        streetInputField.val(street);
    }

    public void selectCountry(String country) {
        countryDropdown.shouldBe(Condition.visible);
        countryDropdown.selectOptionByValue(country);
    }

    public void inputDataToStateInputField(String state) {
        stateInputField.shouldBe(Condition.visible);
        stateInputField.val(state);
    }

    public void inputDataToCityInputField(String city) {
        cityInputField.shouldBe(Condition.visible);
        cityInputField.val(city);
    }

    public void inputDataToZipcodeInputField(String zipcode) {
        zipcodeInputField.shouldBe(Condition.visible);
        zipcodeInputField.val(zipcode);
    }

    public void inputDataToPhoneInputField(String phoneNumber) {
        phoneInputField.shouldBe(Condition.visible);
        phoneInputField.val(phoneNumber);
    }

    public void clickCreateAccountButton() {
        createAccountButton.shouldBe(Condition.visible);
        createAccountButton.scrollIntoView(true).click();
    }

}
