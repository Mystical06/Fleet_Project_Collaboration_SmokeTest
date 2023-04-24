@PER10-223
Feature:User Story :
  As a store manager , I should be able to add an event
  Background:User should be able to see Add Event menu
    When user login as a store manager
    And user clicks on Fleet menu
    And user clicks on  Vehicle dropdown
    And user clicks any row on general information page
    And user clicks on Add Event menu
@PER10-436
  Scenario:Users can mark the event with any color at the "Add Event" pop up
    When user fills  compulsory areas
      | title     | AsiyesEvent             |
      | organiser | me                      |
      | email     | asiyeakpinar4@gmail.com |
    And user select purple color and clicks save button
    And user navigate back clicking twice backward button
    And user on the dashboard again
    And user sees the event is added with given color on calendar
      | hexCode           | #dbadff       |
      | calendarEventName | AsiyesEventme |
    Then the user logout

@PER10-437
  Scenario:Users can mark it as an "All-day event"
    When user clicks on All-day event check box
    And All-day event check box is selected
    And close Add Event Page
    Then  user logout

@PER10-438
  Scenario:User can repeat the action by specifying occurrence periods and ending time
    When user clicks on Repeat menu
    And  user clicks the dropdown icon
    And dropdown menu includes 4 different options
    And "Never" option should be selected
    And "After" option should be clickable
    And "By" options should be clickable
    And close Add Event Page
    Then user logout

  @PER10-439
  Scenario:Users can see all events on the General information page
    When user fills  title input
      | title | AsiyesEvent |
    And  click on save button
    And  user navigated to general information page
    And  user can see event information at the bottom on the page
      | event | AsiyesEvent |
