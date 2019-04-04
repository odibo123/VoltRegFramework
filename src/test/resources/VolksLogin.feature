Feature: Registration

  Scenario: As a user I want to check  to if a vehicle exists
    Given User is on HomePage
    When user enters his data  in the Reg input box
    And user clicks the Find Vehicle box
    Then user should see the start and end result date of his vehicle registration

  # And user close the Browser
  Scenario Outline: As a user I want to see error message displayed when I enter an invalid data
    Given User is on HomePage
    When user enters "<inaccurateValue>"  in the Reg input box
    And user clicks the Find Vehicle box
    Then user should see "<errorMessage>" displayed
    And user close the Browser

    Examples: 
      | inaccurateValue | errorMessage                          |
      | OV12UYK         | Sorry record not found                |
      | OV12UY#         | Please enter a valid car registration |
      |                 | Please enter a valid car registration |
