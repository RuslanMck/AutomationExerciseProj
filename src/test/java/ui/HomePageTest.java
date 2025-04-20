package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
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

    ChromeOptions options = new ChromeOptions();

    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--disable-gpu");
    options.addArguments("--headless=new");
    options.addArguments("--window-size=1920,1080");
    options.addArguments("--user-data-dir=/tmp/profile-" + System.currentTimeMillis());


    Configuration.browser = "chrome";
    Configuration.headless = true;
    Configuration.browserSize = "1920x1080";
    Configuration.holdBrowserOpen = false;

    Configuration.browserCapabilities = options;
    System.out.println("Opening URL: " + HomePage.BASE_URL);
    Selenide.open(HomePage.BASE_URL);

    WebDriver driver = WebDriverRunner.getWebDriver();
    String title = driver.getTitle();
    System.out.println("Page title: " + title);
}

    @Test(description = "Verify the hero slider")
    public void verifyHeroSlider() {
        Assert.assertTrue(HOME_PAGE_STEPS.checkHeroSliderVisibility());
    }


}
