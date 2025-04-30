package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import helpers.ReadPropsHelper;

public abstract class TestConfig {

    private ReadPropsHelper readPropsHelper = new ReadPropsHelper();

    /**
     *  <p>The <b>setUp</b> method applies browser configurations and responsible for initial page opening using <b>Selenide.open()</b> method</p>
     * @param pageUrlKey can be taken from the <i>src/test/resources/testconfig/urls.properties</i> file
     */
    public void setUp(String pageUrlKey){

        String pageUrl = readPropsHelper.getPropertyByKey("src/test/resources/testconfig/urls.properties", pageUrlKey);

        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Selenide.open(pageUrl);
    }
}
