Feature: Create a new post in Conduit application

  Scenario: A user known to the application can add a new post/feed
    Given user is on landing page
    And user logs in to conduit application successfully
    When creates a new post
    And navigates to Global Feed
    Then the newly added post must be displayed as a feed

  Scenario: An anonymous cannot add a new post/feed
    Given user is on landing page
    When user has not logged in to application
    Then create new post option must not be available