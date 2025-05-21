package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import java.util.Random;

public class ProductListPage {
    private ElementsCollection listOfProducts = Selenide.$$(".choose");
    private SelenideElement categorySidebar = Selenide.$(".category-products");
    private SelenideElement productListTitle = Selenide.$(".title");


    /**
     * <p>This method collects all available products on the page using ElementsCollection. Then by using Random and
     * .size() of ElementsCollection object the method selects a random products from the ElementsCollection</p>
     */
    public int selectRandomProduct(){
        int listSize = listOfProducts.size();
        Random r = new Random();
        return r.nextInt(listSize);
    }

    public void clickRandomViewProductButton(){
        int randomProductId = selectRandomProduct();
        Selenide.$x("(//div[@class='choose'])["+randomProductId+"]//a").scrollIntoView(true).click();
    }

    public boolean isCategorySidebarVisible(){
        return categorySidebar.isDisplayed();
    }

    public String getTitleText(){
        productListTitle.shouldBe(Condition.visible);
        return productListTitle.text();
    }


}
