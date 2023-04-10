@PER10-422
Feature: Vehicle Table View-Cucumber

  User Story: As a driver, I should be able to see all vehicle information in a table,
  under the Fleet-Vehicle page

  Background: User is on the login page
    Given The  user (driver)is on the login page
@PER10-414
Scenario: Navigating Fleet -- Vehicles
    When the user enters the driver information
    And the user navigates to Fleet, Vehicles
    Then the user can see all vehicle information in a table
@PER10-415
Scenario:  Validate the user can see the total page number
  When the user enters the driver information
  And the user navigates to Fleet, Vehicles
  Then  the user can see the total page number

   @PER10-416
  Scenario: Validate the user can go to the next page by clicking ">" button
  and can go to the previous page by clicking "<" button
    When the user enters the driver information
    And the user navigates to Fleet, Vehicles
    Then the user can go to the next page by clicking ">" button and can go to the previous page by clicking "<" button
@PER10-417
  Scenario: Validate the user can see total recordings of vehicles
    When the user enters the driver information
    And the user navigates to Fleet, Vehicles
   Then the user can see total recordings of vehicles
