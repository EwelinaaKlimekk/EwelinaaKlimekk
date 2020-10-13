Feature: Sending zostaw kontakt lead  website1

  Background:
    Given User is on zostaw kontakt plus site

  Scenario Outline: User applies correct phone number and email in lead
    When User enters the "<phone number>","<email>" zostaw kontakt plus
    And  User select dropdown zostaw kontakt plus
    And  User marks checkbox Zaznacz wszystkie zgody zostaw kontakt plus
    And  User clicks Wyslij button zostaw kontakt plus
    Then Thank you message appears on-screen zostaw kontakt plus
    Examples:
      |phone number|email|
      |123123123   |test@test.com|

  Scenario Outline: User applies incorrect phone number and email in lead
    When User enters the "<phone number>","<email>" zostaw kontakt plus
    And  User select dropdown zostaw kontakt plus
    And  User marks checkbox Zaznacz wszystkie zgody zostaw kontakt plus
    And  User clicks Wyslij button zostaw kontakt plus
    But  Data aren't correct plus footer zostaw kontakt plus
    Then The thank you text isn't displayed zostaw kontakt plus
    And  The error messages about data are displayed zostaw kontakt plus
    Examples:
      |phone number|email|
      |123 |@test.com|

  Scenario Outline: User doesn't mark checkbox 'Zaznacz wszystkie zgody'
    When User enters the "<phone number>","<email>" zostaw kontakt plus
    And  User select dropdown zostaw kontakt plus
    And  User clicks Wyslij button zostaw kontakt plus
    But  Zaznacz wszystkie zgody checkbox isn't marked zostaw kontakt plus
    Then The thank you text isn't displayed zostaw kontakt plus
    And  The error message about agreement is displayed zostaw kontakt plus
    Examples:
      |phone number|email|
      |123123123   |test@test.com|

  Scenario: All fields on lead are empty
    When User select dropdown zostaw kontakt plus
    And  User marks checkbox Zaznacz wszystkie zgody zostaw kontakt plus
    And  User clicks Wyslij button zostaw kontakt plus
    But  Data aren't entered zostaw kontakt plus
    Then The thank you text isn't displayed zostaw kontakt plus
    And  The error message about empty data are displayed zostaw kontakt plus
