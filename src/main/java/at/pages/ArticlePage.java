package at.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

/**
 * This class is the page class for View Article or post page.
 */

public class ArticlePage {
    private final By home = By.linkText("Home");

    public HomePage clickOnHome(){
        $(home).click();
        return new HomePage();
    }
}
