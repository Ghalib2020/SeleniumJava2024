Feature: Cart Functionality of Best Buy

Scenario: make sure product is added to cart

Given user is in Bestbuy HomePage
When user click on a product
And user click add to cart
Then validate product is added to cart