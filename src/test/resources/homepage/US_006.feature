Feature: As a user, I want a "Course" page on the website where I can access detailed
  information about the courses offered at the school.

  @10
  Scenario: TC_001 When the 'Course' menu title in the top bar of the homepage is clicked,
  it should redirect to the 'Course' page.

    Given User goes to "wwcURL" page
    Then The user clicks on Course in the top menu of the Home page
    Then Confirms that you have been redirected to the Course page


  @11
  Scenario: TC_002 Check that the lesson titles provided in the course are visible on the course page.
    Given User goes to "wwcURL" page
    When  The user clicks on Course in the top menu of the Home page
    Then  The user clicks on a lesson.
    Then  The user views the course details.
    And   The user exits the Course page.
