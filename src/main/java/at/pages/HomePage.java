package at.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final By globalFeed = By.linkText("Global Feed");

    public GlobalFeedPage clickOnGlobalFeed(){
        $(globalFeed).click();
        return new GlobalFeedPage();
    }
}
