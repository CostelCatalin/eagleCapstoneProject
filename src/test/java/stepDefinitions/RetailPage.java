package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjectRepository.RetailPageObject;
import utilites.WebDriverUtility;

public class RetailPage extends Base{
	
	RetailPageObject accountInfo = new RetailPageObject();
			
		
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		openBrowser();
		logger.info("Retail Website is opened");
	}

	@And("^User click  on MyAccount$")
	public void user_click_on_MyAccount()  {
		accountInfo.clickOnMyAccount();
		logger.info("User clicked on MyAccount");
	}

	@When("^User click on Login$")
	public void User_click_on_Login() {
		accountInfo.clickOnLogin();
		logger.info("User Clicked on Login"); 
	}
	
	
	@When("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username_userName_and_password_password(String userName, String password) {
		accountInfo.enterEmail(userName);
		logger.info("user entered email");
		accountInfo.enterPassword(password);
		logger.info("user entered password"); 
	}
	
	@And("^User click on Login button$")
	public void user_click_on_Login_button() {
		accountInfo.clickOnLoginButton();
		logger.info("user clicked on login button");
	}
	
	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard() {
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(3000);
		logger.info("user is logged in to MyAccount");
	}

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link()  {
		accountInfo.clickOnAffiliateAccount();
		logger.info("User click on ‘Register for an Affiliate Account’ link");
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable info)  {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		accountInfo.enterCompanyName(dataValues.get(0).get("company"));
		accountInfo.enterWebsite(dataValues.get(0).get("website"));
		accountInfo.enterTaxID(dataValues.get(0).get("taxID"));
		accountInfo.clickOnPaymentMethod(dataValues.get(0).get("paymentMethod"));
		logger.info("User filled the information form");
	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box()  {
		logger.info("user accepted privacy and policy");
	}
	
	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() {
		accountInfo.clickOnContinueButton();   
		logger.info("User press Continue button");
	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message()  {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = accountInfo.succesMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		  logger.info("User see a success message");
		}
	
	
//	@Scenario10
	
	@When("^User click on Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink(){
		accountInfo.clickOnAffiliateAccount();
		logger.info("User click on 'Edit your Affiliate information' link");
	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button()  {
		accountInfo.clickOnBankTransferButton();
		logger.info("User select Bank Transfer method");
	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable info) {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		accountInfo.enterBankName(dataValues.get(0).get("bankName"));
		accountInfo.enterBranchName(dataValues.get(0).get("abaNumber"));
		accountInfo.enterSWIFTCode(dataValues.get(0).get("swiftCode"));
		accountInfo.enterAccountName(dataValues.get(0).get("accountName"));
		accountInfo.enterAccountNumber(dataValues.get(0).get("accountNumber"));
		logger.info("User filled Bank information");
	}
	
//	@Scenario11
	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() {
	 accountInfo.clickAccountInformation(); 
	 logger.info("User click on‘Edit your account information’ link");
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable info)  {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		accountInfo.enterFirstName(dataValues.get(0).get("firstname"));
		accountInfo.enterLastName(dataValues.get(0).get("lastName"));
		accountInfo.enterRegistrationEmail(dataValues.get(0).get("email"));  
		accountInfo.enterTelephone(dataValues.get(0).get("telephone"));
		logger.info("User modify personal information");
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() {
	accountInfo.clickOnContinueButton();   
	logger.info("User press on Continue");	
	    
	}

	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() {
		String expectedMessage = "Success: Your account has been successfully updated.";
		String actualMessage = accountInfo.succesMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		  logger.info("Success message it's diplayed");
		 
	}
	
	
	
}
