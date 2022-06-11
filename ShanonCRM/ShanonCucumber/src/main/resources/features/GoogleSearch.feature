Feature: Google Search Textbox

  Scenario: Verify Google search Textbox
    Given user on Google Page
    When user enters data
    And user press enter key
    Then user should navigate to search results page
