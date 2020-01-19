package at.pages;

import at.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LandingPage extends BasePage {
    private final By logo = By.cssSelector(".navbar-brand");
    private final By signIn = By.linkText("Sign in");
    private final By newPost = By.linkText("New Post");

    public LandingPage open(){
        Selenide.clearBrowserCookies();
        Selenide.open(url);
        return this;
    }

    public boolean isLogoDisplayed() {
        return $(logo).shouldBe(Condition.visible).isDisplayed();
    }
    public SignInPage clickSignIn() {
         $(signIn).click();
         return new SignInPage();
    }

    public boolean isSignInDisplayed(){
        return $(signIn).shouldBe(Condition.visible).isDisplayed();
    }
    public boolean isNotNewPostDisplayed(){
        return $(newPost).shouldNotBe(Condition.visible).isDisplayed();
    }

}
