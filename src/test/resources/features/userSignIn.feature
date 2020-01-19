Feature: Existing users can sign in to Conduit application

  Scenario Outline: User cannot authenticate using invalid credentials
    Given user is on landing page
    And navigates to Sign In page
    When user enters <email>
    And enters <password>
    And clicks on Sign In
    Then user must not be signed in

    Examples:
      | email                   | password    |
      | e2etester1@gmaile2e.com | Password123 |
      | e2etester1@gmaile2e.com |             |
      | e2etester1              | Password1   |
