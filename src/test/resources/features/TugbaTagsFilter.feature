@tugba
Feature: Use "Tags" filter under the 'Fleet-Vehicles' page

  As a user, I want to be able to use the "Tags" filter under the 'Fleet-Vehicles' page to filter vehicles based on tags.

  Background:
    Given the user is on the Quick Launchpad page
    Then  the user hovers over the Fleet menu and clicks the Vehicle button
    And   the user is on the Cars page
    Then  the user clicks on the filters icon
    And   the user clicks on the manage filter
    And   the user selects the Tags filter
    And   the user click Tags selector


  Scenario: User selects "Tags" filter under 'Fleet-Vehicles' page
    Then  the user click the Is Any Of method
    And   User sees all methods in the filter
      | Is Any Of     |
      | Is Not Any Of |

    Then  the user click Is Any Of method
    Then the user click choose values box
    And  the user click the Compact option
    Then the user click update button
    Then the table should display the corresponding value.

  Scenario: User selects "Is Not Any Of" method with "Compact" option

    Then  the user click the Is Any Of method
    Then  the user click Is Not Any Of method
    Then the user click choose values box
    And   the user click the Compact option
    Then the user click update button
    Then  the table should not include the corresponding value.