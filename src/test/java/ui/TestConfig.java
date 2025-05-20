package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import helpers.ReadPropsHelper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public abstract class TestConfig {

    private ReadPropsHelper readPropsHelper = new ReadPropsHelper();

    /**
     *  <p>The <b>setUp</b> method applies browser configurations and responsible for initial page opening using <b>Selenide.open()</b> method</p>
     * @param pageUrlKey can be taken from the <i>src/test/resources/testconfig/urls.properties</i> file
     */
    public void setUp(String pageUrlKey){

        String pageUrl = readPropsHelper.getPropertyByKey("src/test/resources/testconfig/urls.properties", pageUrlKey);

        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Selenide.open(pageUrl);
    }

    public void allureResultsClean(){
        try {
            FileUtils.deleteDirectory(new File("allure-results"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
