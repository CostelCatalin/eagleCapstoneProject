@Complete
Feature: Home Page Feature

@Scenario13
Scenario: User verify currency values change
Given User is on Retail website
When User click on Currency 
And User Chose Euro from dropdown 
Then Currency value should change to Euro


@Scenario14
Scenario: User empty Shopping cart message displays 
Given User is on Retail website
When User click on shopping cart 
Then “Your shopping cart is empty!” message should display
