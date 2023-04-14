Feature: Selecting Chassis Number filter under the Manage Filter on the All Car page

  User Story :
  As a store manager, I should be able to use the "Chassis Number" filter under the 'Manage Filter' on the All Car page
  Acceptance Criteria:

  1- The user can select the "Chassis Number" filter under the 'Fleet-Vehicles' module

  2- "Chassis Number" filter should provide the methods shown below:
  -> Between
  -> Not Between
  -> Equals
  -> Not Equals
  -> More Than
  -> Less Than
  -> Equals or More Than
  -> Equals or Less Than
  -> Is Empty
  -> Is Not Empty

  3- When the user selects the "Between" method with numeric values, the results should be between the specified values

  4- When the user selects the "Equals" method with numeric values, the results should match the specified value exactly

  @1
  Scenario: The user select the Chassis Number filter under the Fleet-Vehicles module
   Given user is on login page
    Given User logs in as a store manager
    When the user lands on Dashboard
    And the user clicks on Fleet tab
    And the user clicks on Vehicles option under fleet tab
    And the user clicks on filters icon
    And the user clicks on manage filters and selects Chassis number
    Then the user should see Chassis number button


@2
  Scenario: The user should see filter methods under the Chassis Number
  Given user is on login page
     Given User logs in as a store manager
    When the user lands on Dashboard
    And the user clicks on Fleet tab
    And the user clicks on Vehicles option under fleet tab
    And the user clicks on filters icon
    And the user clicks on manage filters and selects Chassis number
    Then the user should see Chassis number button
    Then the user clicks on Chassis number button to see various methods
    Then the user validate Between method is displayed
    Then the user validate Not Between method is displayed
    Then the user validate Equals method is displayed
    Then the user validate Not Equals with method is displayed
    Then the user validate More Than method is displayed
    Then the user validate Less Than method is displayed
    Then the user validate Equals or More Than method is displayed
    Then the user validate Equals or Less Than method is displayed
    Then the user validate Is Empty method is displayed
    Then the user validate Is Not Empty method is displayed


@3
  Scenario: The user selects the Between method with numeric values, the results should be between the specified values
    Given user is on login page
    Given User logs in as a store manager
    When the user lands on Dashboard
    And the user clicks on Fleet tab
    And the user clicks on Vehicles option under fleet tab
       And the user clicks on filters icon
    And the user clicks on manage filters and selects Chassis number
    Then the user should see Chassis number button
    Then the user clicks on Chassis number button to see various methods
    Then the user select Between method
    Then the user enters numeric values in the search box and clicks update button
    Then the user verifies the results based on the values entered

  Scenario: The user selects the Equals method with numeric values, the results should match the specified value exactly
    Given user is on login page
    Given User logs in as a store manager
    When the user lands on Dashboard
    And the user clicks on Fleet tab
    And the user clicks on Vehicles option under fleet tab
    And the user clicks on filters icon
    And the user clicks on manage filters and selects Chassis number
    Then the user should see Chassis number button
    Then the user clicks on Chassis number button to see various methods
    Then the user select Equals method
    Then the user enters numeric values in the search box and clicks update button
    Then the user verifies the results based on the values entered
