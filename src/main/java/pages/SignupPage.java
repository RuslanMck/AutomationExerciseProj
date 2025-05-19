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

    public void clickYearOfBirth(String year){
        expandBirthYearSelector();
        birthYearSelector.selectOptionByValue(year);
    }


}
