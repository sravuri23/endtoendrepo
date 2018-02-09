Feature: This feature is verify the calendar on travel site

  Scenario: Verify the user is able to navigate and select a date from the calendar
    Given the user is on the "Home" page
    When the user select date from the calendar dropdown
    And the user selects month from the calendar
    Then the calendar date and month selected successfully
