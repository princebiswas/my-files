Feature: Test all scenario for Home Page

  @All
  Scenario Outline: Verify all functionality in home page
    Given I navigate to the Ebay UI
    And I hover on Featured
    Then I click on Deals on #3D printer link
    Examples:
      | Product     |
      | cars trucks |