Feature: login page of salesforce

  @Am01
   # Scenario Outline: multi test data

  Scenario:  Error message validation
    Given user navigates to salesforce
    When user enters username "<username>" and password "<password>"
    And user clicks the login button
    Then user validate the error message
    Examples:
      | username | password |
      | abc      | 123      |


