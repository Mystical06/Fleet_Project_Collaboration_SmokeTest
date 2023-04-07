Feature: Deleting a car
  User Story: As a 'Sales Manager', I should be able to delete a car

Scenario: User sees delete button and delete confirmation popup
  Given User logs in as a "driver"
  When User clicks on Fleet tab on quick launchpad page
  And User clicks on Vehicles option under fleet tab
  Then User hovers to three dots at the end of a row of driver fleet
  Then User sees delete button
  Then User clicks on delete button
  Then User clicks on Yes,Delete button
  Then User sees no permission message

@wip
  Scenario: User sees delete button and delete confirmation popup
    Given User logs in as a "sales manager"
    When User clicks on Fleet tab
    And User clicks on Vehicles option under fleet tab
    Then User hovers to three dots at the end of a row
    Then User sees delete button
    Then User clicks on delete button
    Then User sees delete confirmation popup
    Then User clicks on Yes,Delete button
    Then User sees item deleted message
    Then User confirms the deleted car is no longer on the Fleet-Vehicle page


  Scenario: User sees delete button and delete confirmation popup
    Given User logs in as a "store manager"
    When User clicks on Fleet tab
    And User clicks on Vehicles option under fleet tab
    Then User hovers to three dots at the end of a row
    Then User sees delete button
    Then User clicks on delete button
    Then User sees delete confirmation popup
    Then User clicks on Yes,Delete button
    Then User sees item deleted message
    Then User confirms the deleted car is no longer on the Fleet-Vehicle page







