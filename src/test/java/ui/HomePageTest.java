package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import steps.HomePageSteps;

public class HomePageTest {
    private final HomePageSteps HOME_PAGE_STEPS = new HomePageSteps();
@BeforeClass
public void setUp(){
    Configuration.browserSize = "1920x1080";
    Configuration.holdBrowserOpen = true;
    Selenide.open(HomePage.BASE_URL);
}

    @Test(description = "Verify the hero slider")
    public void verifyHeroSlider() {
        Assert.assertTrue(HOME_PAGE_STEPS.checkHeroSliderVisibility());
    }


}
