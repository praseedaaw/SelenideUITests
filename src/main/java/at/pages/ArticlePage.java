package at.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ArticlePage {
    private final By home = By.linkText("Home");

    public HomePage clickOnHome(){
        $(home).click();
        return new HomePage();
    }
}
