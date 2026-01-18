Feature: Orange HRM Homepage

#  Scenario: Verify the Homepage of Orange HRM
#    Given I launch the Chrome browser
#    When Hit the OrangeHRM URL
#    Then Verifying the OrangeHRM Logo on Homepage
#    And Close the browser
#
#  Scenario: Verify the Ornagehrm hyperlink in Homepage
#    Given I launch the Chrome browser
#    When Hit the OrangeHRM URL
#    Then Verifying the Orange Hrm hyperlink on homepage
#    And Close the browser

  Scenario: Verify the user able to access Adminlink and Logout the App
    When Hit the OrangeHRM URL
    Then Enter "Admin" and "admin123" credentials
    Then Click on LoginButton
    Then Verify the Homepage Logo afterlogin
    Then Click on Adminlink
    Then Verify the Logout
