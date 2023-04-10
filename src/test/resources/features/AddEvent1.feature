@PER10-426
Feature: Add event
  As a Store Manager, I should be able to add an event


  Background:
    Given user is on the  dashboard page

@PER10-424
  Scenario: user can access the Add Event page
    When the user hover over and clicks on the fleet module
    Then the user clicks on the vehicles module
    Then the user clicks on the any vehicles row
    And user should be able to see "Add Event" button
   Then the user logout

@PER10-425
  Scenario: user can should see pop window
    When the user hover over and clicks on the fleet module
    Then the user clicks on the vehicles module
    Then the user clicks on the any vehicles row
    And user should be able to see "Add Event" button
    Then the user clicks on the Add Event button
    And user should be able to see pop up window and sees following compulsory fields


      | Title*                  |
      | Owner*                  |
      | Organizer display name* |
      | Organizer email*        |
      | Start*                  |
      | End*                    |
    And user clicks the close button
    Then the user logout

#  Scenario: user can access the Add Event page
#
#    Given user is on the  dashboard page
#    When the user clicks on the fleet module
#    Then the user clicks on the vehicles module
#    Then the user clicks on the any vehicles row
#    And user should be able to see "Add Event" button
#    Then the user clicks on the Add Event button
#    Then user should be able to see pop up window and sees following compulsory fields
#
#
#      | Title*                  |
#      | Owner*                  |
#      | Organizer display name* |
#      | Organizer email*        |
#      | Start*                  |
#      | End*                    |
