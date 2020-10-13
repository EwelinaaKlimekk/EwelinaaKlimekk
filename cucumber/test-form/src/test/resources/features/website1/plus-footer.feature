Feature: Kup przez telefon! site website1

  Background:
    Given User is on site http://www.website1.pl/

  Scenario Outline: User applies correct phone number in lead
    When User marks at least one checkbox which concerns the offer
    And  When User enters the <phone number>
    And  User marks checkbox 'Zaznacz wszystkie zgody'
    And  User clicks 'Wyślij' button
    Then Lead sends to the server
    And  Thank you message appears on-screen
    Examples:
      |phone number|
      |123123123   |

  Scenario Outline: User applies incorrect phone number in lead
    When User marks at least one checkbox which concerns the offer
    And  When User enters the <incorrect phone number>
    And  User marks checkbox 'Zaznacz wszystkie zgody'
    And  User clicks 'Wyślij' button
    Then The thank you text isn't displayed
    And  Validation message appears on-screen
    Examples:
      |incorrect phone number|
      |456                   |

  Scenario Outline: User doesn't mark checkbox 'Zaznacz wszystkie zgody'
    When User marks at least one checkbox which concerns the offer
    And  When User enters the <phone number>
    And  User clicks 'Wyślij' button
    But  'Zaznacz wszystkie zgody' checkbox isn't marked
    Then The thank you text isn't displayed
    And  Validation message appears on-screen
    Examples:
      |phone number|
      |123123123   |

  Scenario Outline: All fields on lead are empty
    When User clicks 'Wyślij' button
    But  'Zaznacz wszystkie zgody' checkbox isn't marked
    But  The phone number fieldgit status is empty
    Then The thank you text isn't displayed
    And  Validation message appears on-screen
    Examples:
      |  |