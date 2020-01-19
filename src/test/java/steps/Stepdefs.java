package steps;

import at.pages.*;
import at.utils.RandomUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Test;

public class Stepdefs {

    private LandingPage landingPage = new LandingPage();
    private SignInPage signInPage = new SignInPage();
    private YourFeedPage yourFeedPage = new YourFeedPage();
    private NewPostPage newPostPage = new NewPostPage();
    private WriteCommentPage writeCommentPage = new WriteCommentPage();
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();
    private GlobalFeedPage globalFeedPage = new GlobalFeedPage();
    private Long randomNumber = RandomUtils.getRandomNumericByCharLength(3);

    @Given("user is on landing page")
    public void userIsOnLandingPage() {
        landingPage.open();
    }

    @And("user logs in to conduit application successfully")
    public void userLogsInToConduitApplicationSuccessfully() {
        signInPage = landingPage.clickSignIn();
        signInPage.enterEmail("e2etester1@gmaile2e.com");
        signInPage.enterPassword("Password1");
        yourFeedPage = signInPage.clickOnSignIn();
    }

    @When("creates a new post")
    public void createsANewPost() {
        newPostPage = yourFeedPage.clickOnNewPost();
        newPostPage.enterArticleDetails(randomNumber);
        writeCommentPage = newPostPage.clickOnPublishArticle();
        writeCommentPage.enterComment();
        articlePage = writeCommentPage.clickOnPostComment();
    }

    @And("navigates to Global Feed")
    public void navigatesToGlobalFeed() {
        homePage = articlePage.clickOnHome();
        globalFeedPage = homePage.clickOnGlobalFeed();
    }

    @Then("the newly added post must be displayed as a feed")
    public void theNewlyAddedPostMustBeDisplayedAsAFeed() {
        globalFeedPage.isNewArticleDisplayed(randomNumber);
    }

    @When("user has not logged in to application")
    public void userHasNotLoggedInToApplication() {
        landingPage.isSignInDisplayed();
    }

    @Then("create new post option must not be available")
    public void createNewPostOptionMustNotBeAvailable() {
        landingPage.isNotNewPostDisplayed();
    }

    @And("navigates to Sign In page")
    public void navigatesToSignInPage() {
        signInPage = landingPage.clickSignIn();
    }

    @When("user enters ([^\"]*)")
    public void userEntersEmail(String email) {
      signInPage.enterEmail(email);
    }

    @And("enters ([^\"]*)")
    public void entersPassword(String password) {
        signInPage.enterPassword(password);
    }

    @And("clicks on Sign In")
    public void clicksOnSignIn() {
        yourFeedPage = signInPage.clickOnSignIn();
    }

    @Then("user must not be signed in")
    public void userMustNotBeSignedIn() {
        yourFeedPage.isYourFeedPageNotDisplayed();

    }
}
