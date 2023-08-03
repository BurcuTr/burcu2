Feature: As a registered user (student/parent), I want to have access to
  the login page from the homepage so that I can log in to my personal panel.

  @12
  Scenario:TC_003 On the "userlogin" page, it should be verified that users can log in to
  their panels by entering their (previously registered) information.

    Given User goes to "wwcURL" page
    Then Verify and Click on the Login Button on the Homepage
    And User Logs in with username and password
    And Verify StudentParent Dashboard Page
    Then Close the browser
