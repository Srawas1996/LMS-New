Feature: Semesters-Academic year
  Scenario: Create two semesters without conflict in dates
    Given Open website
    When userFillTheData
    When Click on Academic year and select one of the academic years
    Then Add First semester
    Then Add second semester
