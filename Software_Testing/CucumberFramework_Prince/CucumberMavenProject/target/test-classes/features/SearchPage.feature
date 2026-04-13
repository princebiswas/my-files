
Feature: Test all scenario for Find a Vehicle

  @Smoke @All
  Scenario Outline: Verify the user can search for Products
    Given I navigate to the Ebay UI
    And Search for a Product <Product>
    And Click on Search
    Then I should see the result in search page for validation <Product>
    Then I enter information for Find a Vehicle
    Then I click on Find Vehicle button

    Examples:
      |Product    |Make|Model|YearFrom|YearTo|Distance|
      |Motorcycle |AJS |37A  |2010    |2000  |1000 miles|
