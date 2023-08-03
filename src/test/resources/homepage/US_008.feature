Feature: US_008 As a user, I would like to see the school's achievements on the homepage.

  @13
  Scenario: TC_001 On the homepage, under the heading "Achievements," the Achievements section should be displayed.

    Given User goes to "wwcURL" page
    When Upon visiting the homepage, an Achievements section is displayed under the Achievements heading.
    Then When I followed the steps to close the browser, the browser closed successfully and all open tabs were closed.

  @14
  Scenario: TC_002 The boards in the "Achievements" section should be displayed with the following
  information: (1237 Graduates, 167 Certified Teachers, 57 Student Campuses, 6852 Students)
    Given Upon visiting the Achievements section, the following boards are displayed:
    * 1237 Graduates
    * 167 Certified Teachers
    * 57 Student Campuses
    * 6852 Students

