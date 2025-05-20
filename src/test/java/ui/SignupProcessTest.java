package ui;

import helpers.DateOfBirthHelper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountCreatedPage;
import pages.generalElements.GeneralModals;
import pages.generalElements.Header;
import steps.LoginPageSteps;
import steps.SignupPageSteps;
import testData.User;
import testData.UserFactory;

public class SignupProcessTest extends TestConfig {
    private final LoginPageSteps LOGIN_PAGE_STEPS = new LoginPageSteps();
    private final Header HEADER = new Header();
    private final GeneralModals GENERAL_MODALS = new GeneralModals();
    private final SignupPageSteps SIGNUP_PAGE_STEPS = new SignupPageSteps();
    private final DateOfBirthHelper DATE_OF_BIRTH_HELPER = new DateOfBirthHelper();
    private final AccountCreatedPage ACCOUNT_CREATED_PAGE =  new AccountCreatedPage();

    @BeforeClass
    public void testSetUp() {
        allureResultsClean();
        setUp("login.page");
    }

    @Test(description = "Verify that the user can populate signup input fields and proceed to the next signup page",
            testName = "Verify the signup process")
    public void verifySignup() {
        GENERAL_MODALS.clickConsentButton();
        User user = UserFactory.get("val-user-01");

        Assert.assertTrue(LOGIN_PAGE_STEPS.verifySignupFormVisibility(), "Signup form is not visible");
        LOGIN_PAGE_STEPS.verifySignupUsernameInput(user.getFirst_name());
        LOGIN_PAGE_STEPS.verifySignupEmailInput(user.getEmail());
        LOGIN_PAGE_STEPS.clickSignupButton();

        Assert.assertTrue(SIGNUP_PAGE_STEPS.verifyRegistrationFormVisibility());

        String dayOfBirth = DATE_OF_BIRTH_HELPER.validateDay(user.getDate_of_birth());
        String monthOfBirth = DATE_OF_BIRTH_HELPER.validateMonth(user.getDate_of_birth());
        String yearOfBirth = DATE_OF_BIRTH_HELPER.validateYear(user.getDate_of_birth());
        String gender = user.getGender();
        String password = user.getPassword();
        String firstName = user.getFirst_name();
        String lastName = user.getLast_name();
        String street = user.getStreet();
        String country = user.getCountry();
        String state = user.getSate();
        String city = user.getCity();
        String zipcode = user.getZipcode();
        String phoneNumber = user.getPhone_number();


        SIGNUP_PAGE_STEPS.selectGender(gender);
        SIGNUP_PAGE_STEPS.selectDayOfBirth(dayOfBirth);
        SIGNUP_PAGE_STEPS.selectMonthOfBirth(monthOfBirth);
        SIGNUP_PAGE_STEPS.selectYearOfBirth(yearOfBirth);
        SIGNUP_PAGE_STEPS.populatePassword(password);
        SIGNUP_PAGE_STEPS.populateFirstName(firstName);
        SIGNUP_PAGE_STEPS.populateLastName(lastName);
        SIGNUP_PAGE_STEPS.populateStreet(street);
        SIGNUP_PAGE_STEPS.populateCountry(country);
        SIGNUP_PAGE_STEPS.populateState(state);
        SIGNUP_PAGE_STEPS.populateCity(city);
        SIGNUP_PAGE_STEPS.populateZipcode(zipcode);
        SIGNUP_PAGE_STEPS.populatePhone(phoneNumber);
        SIGNUP_PAGE_STEPS.clickCreateAccountButton();

        Assert.assertEquals(ACCOUNT_CREATED_PAGE.getConfirmationTitle(), "ACCOUNT CREATED!");

    }
    @AfterTest
    public void cleanUp(){
        setUp("base.url");
        HEADER.clickDeleteAccountButton();
    }

}
