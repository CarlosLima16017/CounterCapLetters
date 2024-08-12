Feature: Counter Capital Letters

  Scenario: Count capital letters in a mixed-case text
    Given I have the text "HeLlo WorLd"
    When I count capital letters
    Then The result should be 4

  Scenario: Count capital letters in a lower-case text
    Given I have the text "hello world"
    When I count capital letters
    Then The result should be 0

  Scenario: Count capital letters in an empty text
    Given I have the text ""
    When I count capital letters
    Then The result should be 0