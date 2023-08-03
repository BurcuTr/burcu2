Feature: US_009 As a user, I want a "Contact" page on the website with contact information so
  that I can get in touch with the school administration.
  @15
  Scenario: TC_001 When the 'Contact' menu title in the top bar of the homepage is clicked,
  it should redirect to the 'Contact' page.
    Given User goes to "wwcURL" page
    When  Click on the "Contact" link in the top bar on the homepage.
    Then  The browser will redirect to the "Contact" page.
    Then  The redirected page should contain contact information and/or a contact form.
  @16
  Scenario: TC_002 On the 'Contact' page, it should be verified that the 'Send In Your Query'
  section contains visible and editable text boxes for Name, Email, Subject, and Description.
    Given Access the "Contact" page.
    When  In the "Submit Your Inquiry" section, make sure that there are text boxes for "Name", "Email", "Subject" and "Description".
    Then  verify that you can enter data in these text boxes.
  @17
  Scenario: TC_003 In the 'Send In Your Query' section on the 'Contact' page, after entering data in the Name, Email, Subject, and Description text boxes,
  when the Submit button is clicked, it should be verified that the query is successfully sent.
    Given Ensure that under a section titled "Send In Your Query" or similar, there are text boxes for "Name," "Email," "Subject," and "Description."
    When  Enter appropriate data (Name, Email, Subject, and Description) into each text box.
    And  Verify that the query is successfully submitted.
  @18
    Scenario: TC_004 On the 'Contact' page, it should be verified that the information for 'Our Location', 'Call Us',
    and 'Working Hours' is visible.
      Given Ensure that the page contains information such as "Our Location," "Call Us," and "Working Hours" visible to the users.
      When  Verify that this information is presented in a way that users can easily access

