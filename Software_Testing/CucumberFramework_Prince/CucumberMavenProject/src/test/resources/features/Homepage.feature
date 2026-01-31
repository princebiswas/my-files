Feature: Test all scenario for Home Page

    @Smoke
    Scenario Outline: Verify all functionality in home page
	Given I navigate to the Ebay UI
#    And I click on all available links on the page
	And I click on Shop by category
	And I select a product from Motors <Product1>
    And I select Make from dropdown <Make>
    And I select Model from dropdown <Model>
    And I enter ZIP code
    And I select Conditions from dropdown <Conditions>
	Examples:
	|Product1   |Make   |Model  |Conditions|
	|Motorcycle |BMW    |120i  |New       |


