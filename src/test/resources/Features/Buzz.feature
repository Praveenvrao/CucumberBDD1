Feature: Orange HRM Buzz

Scenario: Post and verify the Buzzpost
  When Hit the OrangeHRM URL
  Then Login with "TC01" User
  Then click on Buzz link
  Then click on Buzz newsfeed
  Then Write and post the buzzpost
  Then Verify the posted Buzzpost in newsfeed
  Then Verify the Logout