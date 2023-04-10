Feature:
  User Story: As a user, I should be able to use the Driver filter under the Fleet-Vehicle page

  @wip111
  Scenario: User sees the all the methods below the Driver
    Given User logs in as a "driver"
    When User clicks on Fleet tab on quick launchpad page
    And User clicks on Vehicles option under fleet tab
    Then User clicks on the filter icon
    Then User clicks on the Manage Filters button
    Then User clicks the Driver from the dropdown
    Then User clicks the Driver:All button
    Then User clicks the Contains button
    Then User sees all methods in the filter
      | Contains         |
      | Does Not Contain |
      | Is Equal To      |
      | Starts With      |
      | Ends With        |
      | Is Any Of        |
      | Is Not Any Of    |
      | Is Empty         |
      | Is Not Empty     |


  @wip222
  Scenario: User selects the "Starts-with" method with a keyword, the results should start with the specified keyword
    Given User logs in as a "driver"
    When User clicks on Fleet tab on quick launchpad page
    And User clicks on Vehicles option under fleet tab
    Then User clicks on the filter icon
    Then User clicks on the Manage Filters button
    Then User clicks the Driver from the dropdown
    Then User clicks the Driver:All button
    Then User clicks the Contains button
    Then User clicks the StartsWith button
    Then User send the valid key "Ke"
