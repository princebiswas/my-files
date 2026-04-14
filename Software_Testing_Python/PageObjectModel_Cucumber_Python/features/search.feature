Feature: Amazon product search
  Scenario: Search for a product
    Given I open Amazon Homepage
    When I search for "Laptop"
    When I should see result related to "Laptop"