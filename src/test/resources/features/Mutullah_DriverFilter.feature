@PER10-441
Feature:
  User Story: User should be able to use the Driver filter under the Fleet-Vehicle page

  Background:
    Given User logs in as a "driver"
    When User clicks on Fleet tab on quick launchpad page
    Then User clicks on Vehicles option under fleet tab
    Then User clicks on the filter icon
    Then User clicks on the Manage Filters button
    Then User clicks the Driver from the dropdown
    Then User clicks the Driver:All button
    Then User clicks the Contains button

  @PER10-431
  Scenario: User sees the all the methods below the Driver
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

  @PER10-432
  Scenario: User selects the "Starts-with" method with a keyword,
            the results should start with the specified keyword
    Then User clicks the Starts With button
    Then User enter valid keyword "Ke"
    Then User sees the driver names start with entered keyword

  @PER10-433
  Scenario: User selects the "Starts-with" method with a keyword,
            the results should start with the specified keyword
    Then User clicks the Ends With button
    Then User enter valid keyword "ner"
    Then User sees the driver names end with entered keyword