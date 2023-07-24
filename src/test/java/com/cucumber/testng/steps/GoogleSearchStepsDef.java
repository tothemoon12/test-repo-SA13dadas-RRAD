package com.cucumber.testng.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.google.GoogleSearchMainPage;
import pages.google.GoogleSearchResultsPage;

public class GoogleSearchStepsDef {
    GoogleSearchMainPage googleSearchMainPage = new GoogleSearchMainPage();
    GoogleSearchResultsPage googleSearchResultsPage = new GoogleSearchResultsPage();

    @Given("User has opened Google Search start page")
    public void openGoogleSearchStartPage() {
        googleSearchMainPage.openPage();
    }

    @When("User enter {string} search keyword")
    public void userEnterKeywordSearchKeyword(String keyword) {
        googleSearchMainPage.enterSearchKey(keyword);
    }

    @Then("User should get list of hints")
    public void userShouldGetListOfHints() {
//        googleSearchMainPage.verifyThatHintsDivIsDisplayed
    }

    @When("User clicks on first hint from the list")
    public void userClicksOnFirstHintFromTheList() {
        googleSearchMainPage.selectFirstResultFromListBox();
    }

    @Then("System displays search results")
    public void systemDisplaysSearchResults() {

    }

    @When("User click first search result")
    public void userClickFirstSearchResult() {
        googleSearchResultsPage.initElementObjects();
        googleSearchResultsPage.openSearchResultByNumber(1);
    }

    @Then("the page open accordingly to link")
    public void thePageOpenAccordinglyToLink() {
    }

    @And("the title is shown")
    public void theTitleIsShown() {
    }

}
