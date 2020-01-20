package at.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class is the page class for Global Feed page.
 */

public class GlobalFeedPage {
    private final By articleHead = By.cssSelector("h1");

    public boolean isNewArticleDisplayed(Long randomNumber){
        return $(articleHead).shouldHave(Condition.text("e2e test article "+randomNumber)).isDisplayed();

    }
}
