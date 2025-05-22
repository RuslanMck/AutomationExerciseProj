package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class CheckoutPage {

   private SelenideElement checkoutButton = Selenide.$(".btn.check_out");


   public void clickCheckoutButton(){
       checkoutButton.shouldBe(Condition.visible);
       checkoutButton.scrollIntoView(true).click();
   }

}
