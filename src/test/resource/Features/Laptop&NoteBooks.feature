@Complete
Feature: Laptop & NoteBooks Feature
 
Background: 
Given User is on Retail Website
When User click on Laptop &NoteBook tab 
And User click on Show all Laptop &NoteBook option
 
 
  @Scenario5
  Scenario: Add and Remove a Mac book from Cart
	 
	And User click on MacBook item 
	And User click add to Cart button 
	Then User should see a message 'Success: You have added MacBook to your shopping cart!'
	And User should see item showed to the cart 
	And User click on cart option 
	And User click on red X button to remove the item from cart
	Then Item should be removed and cart should show '0 items'

@Scenario6
Scenario: Product Comparison  

And User click on product comparison icon on ‘MacBook’
And User click on product comparison icon on ‘MacBook Air
Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’
And User click on Product comparison link 
Then User should see Product Comparison Chart

@Scenario7
Scenario: Adding an item to Wish list   

And User click on heart icon to add ‘Sony VaIO’ laptop to wish list 
Then User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’


@Scenario8
Scenario: Validate the price of MacBook Pro is 2000   

And User click on ‘MacBook Pro’ item 
Then User should see price tag is present on UI


