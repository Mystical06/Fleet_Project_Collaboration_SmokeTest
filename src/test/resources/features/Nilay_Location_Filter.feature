@PER10-216
Feature: Validate location filter methods
  User Story: As a user, I should be able to use location filter methods

  @PER10-442
  Scenario: User sees location filter methods under location
    Given User logs in as a "driver"
    When user lands on Quick Launchpad
    Then user selects Vehicle under Fleet menu
    Then user lands on Cars page
    Then user clicks on filter icon
    Then user clicks on manage filters and selects location checkbox
    Then user clicks on location button to see various methods
    Then User should see below methods
      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |

  @PER10-443
  Scenario: user selects the "Contains" method with a keyword, the results should contain the specified keyword
    Given User logs in as a "driver"
    When user lands on Quick Launchpad
    Then user selects Vehicle under Fleet menu
    Then user lands on Cars page
    Then user clicks on filter icon
    Then user clicks on manage filters and selects location checkbox
    Then user clicks on location button to see various methods
    Then user enters keyword in the search box and click update button
    Then user verifies the results

  @@PER10-444
  Scenario: user selects the "Does Not Contain" method with a keyword, the results should not contain the specified keyword
    Given User logs in as a "driver"
    When user lands on Quick Launchpad
    Then user selects Vehicle under Fleet menu
    Then user lands on Cars page
    Then user clicks on filter icon
    Then user clicks on manage filters and selects location checkbox
    Then user clicks on location button to see various methods
    Then user selects does not contain method
    Then user enters keyword in the search box and clicks on update button
    Then user clicks on the view per page button and select last option
    Then user verifies the results on WebTable
    Then user clicks on the second page
    Then user verifies the results on WebTable