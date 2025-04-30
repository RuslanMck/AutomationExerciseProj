package ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageSteps;
import testData.User;
import testData.UserFactory;

public class HomePageTest extends TestConfig {
    private final HomePageSteps HOME_PAGE_STEPS = new HomePageSteps();

    @BeforeClass
    public void initTest() {
        setUp("base.url");
    }

    @Test(description = "Verify the hero slider")
    public void verifyHeroSlider() {
        User user = UserFactory.get("val-user-01");
        System.out.println(user.getEmail() + "; " + user.getFirst_name() + "; " + user.getLast_name() + ";");
        Assert.assertTrue(HOME_PAGE_STEPS.checkHeroSliderVisibility());
    }
}
