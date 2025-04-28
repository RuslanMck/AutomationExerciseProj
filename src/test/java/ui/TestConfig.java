package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public abstract class TestConfig {
    public void setUp(String baseUrl){

        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Selenide.open(baseUrl);
    }
}
