
Feature: Countries
  Scenario: Add One country
    Given User-navigate-to-country-tab
    When User-Click-on-the-country
    Then User-save-the-new-changes

  Scenario: remove three items form country list
    Given User-navigate-to-country-tab
    When User-Click-on-the-country
    Then User-remove-items-from-the-list

  Scenario: Add three country to the list
    Given User-navigate-to-country-tab
    When User-Click-on-the-country
    Then Add three items to the list
