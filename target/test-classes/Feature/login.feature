Feature: Login functionality

  Scenario: Successful Sign In with Valid Credentials
    Given User is on Home Page
    When User Navigate to Sign In Page
    And User enters UserName and Password
    Then User is redirected to landing page
