Feature: Orange HRM Homepage

  Scenario: Verify the Homepage of Orange HRM
    Given I launch the Chrome browser
    When Hit the OrangeHRM URL
    Then Verifying the OrangeHRM Logo on Homepage
    And Close the browser

  Scenario: Verify the Ornagehrm hyperlink in Homepage
    Given I launch the Chrome browser
    When Hit the OrangeHRM URL
    Then Verifying the Orange Hrm hyperlink on homepage
    And Close the browser