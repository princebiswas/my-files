
Feature: Test all scenario for Search Page

  @Smoke
  Scenario Outline: Verify the user can search for Products
    Given I navigate to the Ebay UI
    And Search for a Product <Product>
    And Click on Search
    And I should see the result in search page for validation <Product>
    Examples:
      |Product|
      |Motorcycle|



	


 
 
 