Feature: Semesters-Academic year

  Scenario: Create two semesters without conflict in dates
    Given Open website and Login
    When Click on Academic year and select one of the academic years
    Then Create First Semester
    Then Create Second Semester

