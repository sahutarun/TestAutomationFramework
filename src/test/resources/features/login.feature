Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given User is one the home page
    And User navigate to the login page
    And I enter the username and password
    And I click login button
    Then I should see the userform page