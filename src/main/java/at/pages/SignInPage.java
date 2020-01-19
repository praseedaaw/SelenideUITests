package at.pages;

import at.base.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SignInPage extends BasePage {

    private final By email = By.xpath("//div[@id='main']/div/div[@class='auth-page']/div[@class='container page']//form//input[@type='email']");
    private final By password = By.xpath("//div[@id='main']/div/div[@class='auth-page']/div[@class='container page']//form//input[@type='password']");
    private final By signIn = By.cssSelector("button");


    public void enterEmail(String emailId){
        $(email).setValue(emailId);
    }

    public void enterPassword(String pwd){
        $(password).setValue(pwd);
    }

    public YourFeedPage clickOnSignIn(){
        $(signIn).click();
        sleep(3000);
        return new YourFeedPage();
    }
}
