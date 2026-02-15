Feature: Orange HRM Homepage

#  Scenario: Verify the Homepage of Orange HRM
#    // Given I launch the Chrome browser
#    When Hit the OrangeHRM URL
#    Then Verifying the OrangeHRM Logo on Homepage
#    And Close the browser
#
#  Scenario: Verify the Ornagehrm hyperlink in Homepage
#    // Given I launch the Chrome browser
#    When Hit the OrangeHRM URL
#    Then Verifying the Orange Hrm hyperlink on homepage
#    And Close the browser
#
#  Scenario: Verify the user able to access Adminlink and Logout the App
#    When Hit the OrangeHRM URL
#    Then Enter "Admin" and "admin123" credentials
#    Then Click on LoginButton
#    Then Verify the Homepage Logo afterlogin
#    Then Click on Adminlink
#    Then Verify the Logout
#
#  Scenario: Verify the Leave application by user
#    When Hit the OrangeHRM URL
#    Then Enter "Admin" and "admin123" credentials
#    Then Click on LoginButton
#    Then Verify the Homepage Logo afterlogin
#    Then Click on Leave
#    Then Click on Apply option in Leave
#    Then Apply the CAN Leave
#    Then Verify the Logout

  Scenario: Verify the Finding User in Admin User management
    When Hit the OrangeHRM URL
    Then Enter "Admin" and "admin123" credentials
    Then Click on LoginButton
    Then Verify the Homepage Logo afterlogin
    Then Click on Adminlink
#    Then Click On User management
    Then Enter User "FMLName" and Search
    Then Find the User "FMLName" in the System users

