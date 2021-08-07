@Complete
Feature: Info Account

Background:
  Given User is on Retail website
	And User click  on MyAccount
	When User click on Login 
	And User enter username 'costel@gmail.com' and password 'bond007' 
	And User click on Login button
	Then User should be logged in to MyAccount dashboard
	
		
	@Scenario9
	Scenario: Register as an Affiliate user with Cheque Payment Method
	When User click on ‘Register for an Affiliate Account’ link 
	And User fill affiliate form with below information
	|company|website|taxID|paymentMethod|
	|EAGLES|https://tekschool.us/|2344563212|PayPal|
	And User check on About us check box 
	And User click on Continue button 
	Then User should see a success message

	@Scenario10
	Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
	When User click on Edit your affiliate informationlink 
	And user click on Bank Transfer radio button
	And User fill Bank information with below information
	|bankName|abaNumber|swiftCode|accountName|accountNumber|
	|Bank Of America|12346|45678|Costel Vasiliu|123456789|
	And User click on Continue button 
	Then User should see a success message 
	
	@Scenario11
	Scenario: Edit your account Information 
	When User click on ‘Edit your account information’ link 
	And User modify below information 
	|firstname|lastName|email|telephone| 
	|Costel Catalin|Vasiliu|costel@gmail.com|7031231236|
	And User click on continue button 
	Then User should see a message ‘Success: Your account has been successfully updated.’
	