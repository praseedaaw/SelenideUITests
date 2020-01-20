package at.pages;

import org.openqa.selenium.By;
import at.utils.RandomUtils;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * This class is the page class for New post page.
 */

public class NewPostPage {

    private final By articleTitle = By.cssSelector("[placeholder='Article Title']");
    private final By aboutArticle = By.cssSelector("[placeholder='What\\'s this article about\\?']");
    private final By article = By.cssSelector("[rows]");
    private final By enterTags = By.cssSelector("[placeholder='Enter tags']");
    private final By publishArticle = By.cssSelector(("button"));
    private Long randomNumber;

    public void enterArticleDetails(Long randomNumber){
        $(articleTitle).setValue("e2e test article " +randomNumber);
        $(aboutArticle).setValue("e2e test");
        $(article).setValue("e2e test");
        $(enterTags).setValue("test");
    }

    public WriteCommentPage clickOnPublishArticle(){
        $(publishArticle).click();
        sleep(3000);
        return new WriteCommentPage();
    }
}
