Feature: Amazon payment flow
  Scenario: Amazon PayLater flow
    Given user navigates to Amazon URL
    When user search product name "iphone 15 pro max case" in search bar
    And user click on search button
    And click on the product
    And Add to cart
    And Proceed to checkout
    And place your order
    Then user validates order confirmation