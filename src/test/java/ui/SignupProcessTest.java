package ui;

import helpers.DateOfBirthHelper;
import helpers.ReadPropsHelper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.generalElements.GeneralModals;
import steps.LoginPageSteps;
import steps.SignupPageSteps;
import testData.User;
import testData.UserFactory;

public class SignupProcessTest extends TestConfig {
    private final LoginPageSteps LOGIN_PAGE_STEPS = new LoginPageSteps();
    private final GeneralModals GENERAL_MODALS = new GeneralModals();
    private final SignupPageSteps SIGNUP_PAGE_STEPS = new SignupPageSteps();
    private ReadPropsHelper readPropsHelper = new ReadPropsHelper();
    private final DateOfBirthHelper DATE_OF_BIRTH_HELPER = new DateOfBirthHelper();

    @BeforeClass
    public void testSetUp(){
        setUp("login.page");
    }

    @Test(description = "Verify that the user can populate signup input fields and proceed to the next signup page",
            testName = "Verify the signup process")
    public void verifySignup(){
        GENERAL_MODALS.clickConsentButton();
        User user = UserFactory.get("val-user-01");

        Assert.assertTrue(LOGIN_PAGE_STEPS.verifySignupFormVisibility(),"Signup form is not visible");
        LOGIN_PAGE_STEPS.verifySignupUsernameInput(user.getFirst_name());
        LOGIN_PAGE_STEPS.verifySignupEmailInput(user.getEmail());
        LOGIN_PAGE_STEPS.clickSignupButton();

        Assert.assertTrue(SIGNUP_PAGE_STEPS.verifyRegistrationFormVisibility());

        String dayOfBirth = DATE_OF_BIRTH_HELPER.validateDay(user.getDate_of_birth());
        String monthOfBirth = DATE_OF_BIRTH_HELPER.validateMonth(user.getDate_of_birth());
        String yearOfBirth = DATE_OF_BIRTH_HELPER.validateYear(user.getDate_of_birth());


        SIGNUP_PAGE_STEPS.selectDayOfBirth(dayOfBirth);
        SIGNUP_PAGE_STEPS.selectMonthOfBirth(monthOfBirth);
        SIGNUP_PAGE_STEPS.selectYearOfBirth(yearOfBirth);


    }


}
