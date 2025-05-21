package steps;

import io.qameta.allure.Step;
import pages.ProductListPage;

public class ProductListPageSteps {

    private final ProductListPage PRODUCTS_LIST_PAGE = new ProductListPage();

    @Step("Select and click a random product from the list")
    public void selectAndClickARandomProduct(){
        PRODUCTS_LIST_PAGE.clickRandomViewProductButton();
    }

    @Step("Verify if the category sidebar is visible")
    public boolean verifyCategorySidebarVisibility(){
        return PRODUCTS_LIST_PAGE.isCategorySidebarVisible();
    }

    @Step("Verify if the correct title of the product list is displayed")
    public String verifyProductListTitle(){
        return PRODUCTS_LIST_PAGE.getTitleText();
    }
}
