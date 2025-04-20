package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
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
    Configuration.holdBrowserOpen = false; // Headless = no need to hold open
    Configuration.headless = true;         // Run in headless mode for CI
    Configuration.browser = "chrome";
    Configuration.browserCapabilities = new ChromeOptions()
            .addArguments("--disable-dev-shm-usage")
            .addArguments("--no-sandbox")
            .addArguments("--disable-gpu")
            .addArguments("--remote-allow-origins=*")
            .addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis());

    Selenide.open(HomePage.BASE_URL);
}

    @Test(description = "Verify the hero slider")
    public void verifyHeroSlider() {
        Assert.assertTrue(HOME_PAGE_STEPS.checkHeroSliderVisibility());
    }


}
