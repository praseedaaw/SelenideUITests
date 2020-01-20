package at.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class is the page class for Your feed page.
 */

public class YourFeedPage {

    private final By newPost = By.linkText("New Post");

    public NewPostPage clickOnNewPost(){
        $(newPost).click();
        return new NewPostPage();
    }

    public boolean isYourFeedPageNotDisplayed(){
        return $(newPost).shouldNotBe(Condition.visible).isDisplayed();
    }
}
