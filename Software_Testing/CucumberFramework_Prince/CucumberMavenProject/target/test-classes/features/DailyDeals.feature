Feature: Test all scenario for Home Page

  @Smoke
  Scenario Outline: Verify all functionality in home page
    Given I navigate to the Ebay UI
    Then I should see the result in search page for validation
    And I click on Featured
    Then I click on Deals on #3D printer link
    Examples:
      |  |