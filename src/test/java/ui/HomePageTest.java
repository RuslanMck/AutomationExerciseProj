package ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageSteps;

public class HomePageTest extends TestConfig {
    private final HomePageSteps HOME_PAGE_STEPS = new HomePageSteps();

    @BeforeClass
    public void initTest() {
        setUp("base.url");
    }

    @Test(description = "Verify the hero slider")
    public void verifyHeroSlider() {

        Assert.assertTrue(HOME_PAGE_STEPS.checkHeroSliderVisibility());
    }
}
