@PER10-449
Feature: Validate Filter Management Functionality

  As a user, I should be able to filter the vehicle table,
  in the Fleet-Vehicle page
  @PER10-446
  Scenario:the user clicks on the filter icon than sees the "Manage Filter"
    Given the user is on the Quick Launchpad page
    Then the user hovers over the fleet menu and clicks the vehicle button
    When the user clicks on the filter icon
    Then the Manage Filters button should be visible
    Then the user clicks on the Manage Filters button
    Then User should see Manage Filters menu contains the following filters
      | License Plate             |
      | Tags                      |
      | Driver                    |
      | Location                  |
      | Chassis Number            |
      | Model Year                |
      | Last Odometer             |
      | Immatriculation Date      |
      | First Contract Date       |
      | Catalog Value (VAT Incl.) |
      | Seats Number              |
      | Doors Number              |
      | Color                     |
      | Transmission              |
      | Fuel Type                 |
      | CO2 Emissions             |
      | Horsepower                |
      | Horsepower Taxation       |
      | Power (KW)                |

  @PER10-447
  Scenario:the user can find filters by typing the filter name
    Given the user is on the Quick Launchpad page
    Then the user hovers over the Fleet menu and clicks the Vehicle button
    When the user clicks on the filter icon
    Then the user clicks on the Manage Filters button
    Then the user types the filter name in the search bar and presses enter
    Then the corresponding filter type should be displayed on the page

  @PER10-448
  Scenario:the user can apply multiple filters at the same time(Driver and Location)
    Given the user is on the Quick Launchpad page
    Then the user hovers over the Fleet menu and clicks the Vehicle button
    When the user clicks on the filter icon
    Then the user clicks on the Manage Filters button
    Then the user selects multiple filters
    Then the corresponding filter types should be displayed on the page





