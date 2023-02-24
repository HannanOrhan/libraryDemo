Feature:Library login function

  Background:
    Given librarian on the login page

  Scenario: verify librarian log in with valid credentials and launch to the homepage
    When librarian enter valid username
    And librarian enter valid password
    And librarian click login button
    Then librarian should see the "Library" title

  Scenario: Verify user can not logged in with invalid credentials
    When librarian enter invalid username
    And librarian enter invalid password
    And librarian click login button
    Then librarian should see the error message


  #AC2: users should see a ""Sorry, Wrong Email or Password"" error pop-up message if any users try to log in with invalid credentials.
  #AC3: users should see a “This field is required.” error pop-up message when they attempt to log in without any credentials.

