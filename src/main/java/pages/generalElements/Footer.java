package pages.generalElements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Footer {

    private SelenideElement footer = Selenide.$("#footer");
    private SelenideElement subscriptionEmailInput = Selenide.$x("//input[@id='susbscribe_email']");
    private SelenideElement copyrightBlock = Selenide.$x("//p[contains(text(),'Copyright')]");
    private SelenideElement newsletterSubscribeButton = Selenide.$x("//button[@id='subscribe']");


    public boolean footerIsVisible() {
        return footer.isDisplayed();
    }

    public boolean subscriptionEmailInputIsVisible() {
        return subscriptionEmailInput.isDisplayed();
    }

    public boolean copyrightBlockIsVisible() {
        return copyrightBlock.isDisplayed();
    }

    public String getCopyrightYear() {
        copyrightBlock.shouldBe(Condition.visible);
        String copyrightText = copyrightBlock.text();
        String copyrightYear = null;
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(copyrightText);

        if (matcher.find()) {
            copyrightYear = matcher.group();
        }

        return copyrightYear;
    }

    public boolean newsletterSubscribeButtonIsVisible() {
        return newsletterSubscribeButton.isDisplayed();
    }

    public void clickNewsletterSubscribeButton() {
        newsletterSubscribeButton.shouldBe(Condition.visible);
        newsletterSubscribeButton.click();
    }
}
