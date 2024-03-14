Feature: iOS Appium Example

  Scenario: Compute Sum
    Given the user adds the first number 4
    And the user adds the second number 4
    When the user clicks on the button
    Then the app show the operation result 8

  Scenario Outline: Compute Sum 2
    Given the user adds the first number <numberA>
    And the user adds the second number <numberB>
    When the user clicks on the button
    Then the app show the operation result <result>

    Examples: 
      | numberA | numberB | result |
      |       2 |       2 |      4 |
      |       3 |       2 |      5 |
      |       1 |       2 |      5 |
