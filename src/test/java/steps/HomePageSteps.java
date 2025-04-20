package steps;

import io.qameta.allure.Step;
import pages.HomePage;

public class HomePageSteps {
    private final HomePage HOME_PAGE = new HomePage();

    @Step("Verify if the hero slider is visible")
    public boolean checkHeroSliderVisibility() {
        return HOME_PAGE.heroCarouselSliderVisibility();
    }
}
