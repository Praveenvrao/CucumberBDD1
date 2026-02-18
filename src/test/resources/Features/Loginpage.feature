Feature: Orange HRM Homepage

  Background: Below are common steps for every scenario
    When Hit the OrangeHRM URL

#  Scenario: Verify the Homepage of Orange HRM
#    // Given I launch the Chrome browser
#    Then Verifying the OrangeHRM Logo on Homepage
#    And Close the browser
#
#  Scenario: Verify the Ornagehrm hyperlink in Homepage
#    // Given I launch the Chrome browser
#    Then Verifying the Orange Hrm hyperlink on homepage
#    And Close the browser
#
#  Scenario: Verify the user able to access Adminlink and Logout the App
#    Then Enter "Admin" and "admin123" credentials
#    Then Click on LoginButton
#    Then Verify the Homepage Logo afterlogin
#    Then Click on Adminlink
#    Then Verify the Logout
#
#  Scenario: Verify the Leave application by user
#    Then Enter "Admin" and "admin123" credentials
#    Then Click on LoginButton
#    Then Verify the Homepage Logo afterlogin
#    Then Click on Leave
#    Then Click on Apply option in Leave
#    Then Apply the CAN Leave
#    Then Verify the Logout
#
#  Scenario: Verify the Finding User in Admin User management
#    Then Enter "Admin" and "admin123" credentials
#    Then Click on LoginButton
#    Then Verify the Homepage Logo afterlogin
#    Then Click on Adminlink
#    Then Enter User "FMLName" and Search
#    Then Find the User "FMLName" in the System users

  Scenario: Verify the Homepage after login
    Then Login with "TC01" User
    Then Verify the Homepage Logo afterlogin

