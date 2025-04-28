package ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import steps.GeneralElementsSteps;

import java.time.Year;

public class GeneralElementsTest extends TestConfig {
    private GeneralElementsSteps generalElementsSteps = new GeneralElementsSteps();

    @BeforeClass
    public void initTest() {
        setUp(HomePage.BASE_URL);
    }

    @Test(description = "Verify if the copyright year matches the current year")
    public void verifyCopyrightYear() {
        String actualCopyrightYear = generalElementsSteps.getCopyrightYear();
        String expectedCopyrightYear = Year.now().toString();
        Assert.assertEquals(actualCopyrightYear, expectedCopyrightYear, "Copyright year on footer: \"" + actualCopyrightYear + "\" does not match current year.");
    }

    @Test(description = "Verify if key header elements are visible")
    public void verifyKeyHeaderElementsVisibility() {
        Assert.assertTrue(generalElementsSteps.checkLogoVisibility());
        Assert.assertTrue(generalElementsSteps.checkHomeButtonVisibility());
        Assert.assertTrue(generalElementsSteps.checkCartButtonVisibility());
        Assert.assertTrue(generalElementsSteps.checkLoginButtonVisibility());
        Assert.assertTrue(generalElementsSteps.checkProductsButtonVisibility());
    }

    @Test(description = "Verify if key footer elements are visible")
    public void verifyKetFooterElementsVisibility() {
        Assert.assertTrue(generalElementsSteps.checkNewsletterSubscription());
    }
}
