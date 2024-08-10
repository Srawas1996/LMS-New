

Feature: Academic year
  Scenario: Create new academic year
    Given user navigate to the acadmic year tab
    When open the calander
    Then Select start date
    Then select the end date
    Then save the academic year

  Scenario: Create duplicate academic year
    Given user navigate to the acadmic year tab
    When open the calander
    Then saveing Duplicate academic year

  Scenario: remove record from the list
    Given user navigate to the acadmic year tab
    When user click the check box for on of the records
    Then Click on the delete button

  Scenario: Edit one of the records
    Given user navigate to the acadmic year tab
    When user click on the three dots
    Then user click on update
    Then update the data and click save

  Scenario: open semesters tab
    Given user navigate to the acadmic year tab
    When user click on the three dots
    Then user click on Semesters

  Scenario: go to the second tab
    Given user navigate to the acadmic year tab
    Then Click on the next tab

  Scenario: go to the last tab then go to the first page
    Given user navigate to the acadmic year tab
    Then Click on the last tab
    Then Click on the first page

