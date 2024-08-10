
Feature: Login Page

  @Sanity
  Scenario Outline: Invalid login
    Given user open website and login to the system
    When User fill email as "<email>" and "<password>" and click login
    Then Error message should appear

    Examples:
    |         email       |         password        |
    |     owner@app.com   |         12345679        |
    |     owner2@app.com  |         12345678        |
    |     owner2@app.com  |         12345679        |

  Scenario: valid login
    Given user open website and login to the system
    When user fill the data
    Then Validate you are in the dashboard

