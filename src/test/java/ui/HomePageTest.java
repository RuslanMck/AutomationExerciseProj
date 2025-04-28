package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import steps.HomePageSteps;

public class HomePageTest extends TestConfig {
    private final HomePageSteps HOME_PAGE_STEPS = new HomePageSteps();

    @BeforeClass
    public void initTest() {
        setUp(HomePage.BASE_URL);
    }

    @Test(description = "Verify the hero slider")
    public void verifyHeroSlider() {

        Assert.assertTrue(HOME_PAGE_STEPS.checkHeroSliderVisibility());
    }
}
