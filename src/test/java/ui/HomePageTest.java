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
    Configuration.browser = "chrome";
    Configuration.headless = true;
    Configuration.browserSize = "1920x1080";
    Configuration.holdBrowserOpen = false;

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-gpu");
    options.addArguments("--remote-allow-origins=*");
    options.addArguments("--window-size=1920,1080");
    options.addArguments("--user-data-dir=/tmp/profile-" + System.currentTimeMillis()); // Unique profile
    Configuration.browserCapabilities = options;

    Selenide.open(HomePage.BASE_URL);
}

    @Test(description = "Verify the hero slider")
    public void verifyHeroSlider() {
        Assert.assertTrue(HOME_PAGE_STEPS.checkHeroSliderVisibility());
    }


}
