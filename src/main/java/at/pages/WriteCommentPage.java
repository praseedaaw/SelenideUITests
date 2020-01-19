package at.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class WriteCommentPage {

    private final By writAComment = By.cssSelector(".form-control");
    private final By postComment = By.cssSelector("[type='submit']");

    public void enterComment(){
        $(writAComment).setValue("sample comment");
    }
    public ArticlePage clickOnPostComment(){
        $(postComment).click();
        sleep(10000);
        return new ArticlePage();
    }
}
