

Feature: Academic year
  Scenario: Create new academic year
    Given Open website and login
    When Click on setting and AcademicYear
    Then Fill the data

  Scenario: remove record from the list
    Given Open website and login
    When Click on setting and AcademicYear
    When user Delete one record using the three dots
    Then Click on the delete button

  Scenario: Edit one of the records
    Given Open website and login
    When Click on setting and AcademicYear
    Then user click on update
    Then update the data and click save

  Scenario: remove record from the list
    Given Open website and login
    When Click on setting and AcademicYear
    Then Fill the data
    Then Click on the delete button



