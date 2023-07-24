Feature: Search

  Scenario: Counting beer cans
    Given User has opened Google Search start page
    When User enter "selenium" search keyword
    Then User should get list of hints
    When User clicks on first hint from the list
    Then System displays search results
    When User click first search result
    Then the page open accordingly to link
    And the title is shown