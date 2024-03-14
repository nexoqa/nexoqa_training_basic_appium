Feature: Android Appium Example

  @Android
  Scenario: Close message initial
    Given the alert message is present
    When the user clicks on ok button
    Then the alert message is closed

  @Android
  Scenario: Display Message
    Given The user is on HomePage
    When the user clicks on Display text view button
    Then the text "Text is sometimes displayed" is displayed
