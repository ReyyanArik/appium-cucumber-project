@Football
Feature: Football Feature

  Scenario: Successfully selection of football on main page
    Given I have skipped Splash page and I am on the main page
    When I click Football button
    Then I should see Football page
    And I click filter button
    And I click league selection menu
    And I choose first league
    And I get activity count from filter page
    And I click okey button
    And I get activity count from bulletin page and I compare counts
    And I choose rate from bulletin page    