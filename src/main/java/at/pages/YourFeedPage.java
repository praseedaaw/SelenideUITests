package at.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

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
