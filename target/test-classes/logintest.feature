Feature: validation of login

  Scenario: login with valid id and passcode
    Given launch the browser
    And load browser
    When enter valid user name and password
    Then Click the login button
    And validate whether application loged in
