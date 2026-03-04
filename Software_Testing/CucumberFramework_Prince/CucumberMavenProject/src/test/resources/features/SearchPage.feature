
Feature: Test all scenario for Find a Vehicle

  @Smoke @All
  Scenario Outline: Verify the user can search for Products
    Given I navigate to the Ebay UI
    And Search for a Product <Product>
    And Click on Search
    Then I should see the result in search page for validation <Product>
    Then I select Make_from dropdown <Make>
    And I select Model from dropdown <Model>
    And I enter Year From <YearFrom>
    And I enter Year To <YearTo>
    And I select Distance from dropdown <Distance>
    And I enter ZIP code
    Then I click on Find Vehicle button

    Examples:
      |Product    |Make|Model|YearTo|YearFrom|Distance|
      |Motorcycle |AJS |37A   |2000 |2010    |1000 miles|




	


 
 
 