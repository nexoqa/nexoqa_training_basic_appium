Feature: iOS Appium Example

  @iOS
  Scenario: Compute Sum
    Given the user adds the first number 4
    And the user adds the second number 4
    When the user clicks on the button
    Then the app show the operation result 8

  @iOS2
  Scenario Outline: Compute Sum 2
    Given the user adds the first number <numberA>
    And the user adds the second number <numberB>
    When the user clicks on the button
    Then the app show the operation result <result>

    Examples: 
      | numberA | numberB | result |
      |       2 |       2 |      4 |
      |       3 |       2 |      5 |

  @iOS
  Scenario: Open and close alert message
    Given the alert message is Open
    When the ok button is clicked
    Then the alert message is Closed
