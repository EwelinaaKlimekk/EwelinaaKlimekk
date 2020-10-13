Feature: Kup przez telefon! site website1

  Background:
    Given User is on site.

  Scenario Outline: User applies correct phone number and email in lead
    When User enters the phone number "<phone number>"
    And  User enters the email "<email>"
    And  User select dropdown
    And  Accepts all required agreements
    And  User clicks submit button
    Then Thank you message appears on-screen
    Examples:
      |phone number|email|
      |123123123   |test@test.test|

  Scenario Outline: User applies incorrect phone number and email in lead
    When User enters the incorrect phone number "<incorrect phone number>"
    And  User enters the incorrect email "<incorrect email>"
    And  User clicks submit button
    And  Validation message appears on-screen
    Then The thank you text isn't displayed

    Examples:
      |incorrect phone number|incorrect email|
      |456                   |pl           |

  Scenario Outline: User doesn't mark checkbox 'Zaznacz wszystkie zgody'
    When User enters the phone number "<phone number>"
    And  User enters the email "<email>"
    And  User select dropdown
    And  User clicks submit button
    And  Validation messages appears on-screen


    Examples:
      |phone number|email|
      |123123123   |test@test.test|

  Scenario: All fields on lead are empty
    When User clicks submit button
    But  The phone number field status is empty
    Then The thank you text isn't displayed
    And  Validation message appears on-screen when the fields are empty
