Feature: User Management page scenarios
  Scenario: Verify title of the page
    Given I navigate to homepage
    When I open User-Mgt page
    Then Title of the page should be Register New User

  Scenario: Verify Login button is present
    Given I navigate to homepage
    When I open User-Mgt page
    Then I should see Login button

  Scenario: Verify Access DB button is present
    Given I navigate to homepage
    When I open User-Mgt page
    Then I should see Access DB button

  Scenario: Verify title of Data Page
    Given I navigate to homepage
    When I open User-Mgt page
    And I click Access DB button
    Then Title of the page should be User DB

  Scenario: Verify title of Login Page
    Given I navigate to homepage
    When I open User-Mgt page
    And I click LOGIN button
    Then Title of the page should be Login Page
    Then I should see TLA image loaded