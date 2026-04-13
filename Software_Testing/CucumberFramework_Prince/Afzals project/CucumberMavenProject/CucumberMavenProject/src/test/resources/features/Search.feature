Feature: Amazon Search
	@smoke
	Scenario: Search for a product
	
	Given I am on the Amazon Homepage
	When  I search for "Laptop"
	Then I should see result for "Laptop" on search page
	
	@smoke
	Scenario Outline: Search for product
		Given I am on the Amazon Homepage
		When  I search for "<product>"
		Then I should see result for "<product>" on search page
		
		Examples:
		
			| product |
			| laptop |
			| headphones |
			| smartwatch|
		
	@smoke	
	Scenario Outline: Search for a product from DropDown
	
	Given I am on the Amazon Homepage
	When  I select "<category>" from the search dropdown
	#And  I search for "<product>"
	#Then I should see result for "<product>"
	
	Examples:
		
			|category 	| product |
			|Germany| laptop |
			|France| Train |
			|Japan| Math|
	
 