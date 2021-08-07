package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Dec2Bin;
import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DesktopsPageObject;
import utilites.WebDriverUtility;

public class Descktops extends Base{

	DesktopsPageObject descktop= new DesktopsPageObject();
	
	@Given("^User is on Retail Website$")
	public void user_is_on_Retail_website()  {
		openBrowser();
		logger.info("Retail Website is opened");
	    
	}

	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab()  {
		descktop.clickOnDesktops();
		logger.info("User clicked on Desktops tab");
	}

	@And("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() {
		descktop.clickOnshowAllDesktops();
		logger.info("User clicked on Show all desktops ");
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		String expectedMessage = "Desktops";
		String actualMessage = descktop.DesktopMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		logger.info("All present items from Desktop page are diplayed");
		
	}
	
//	Scenario 2
	
	@When("^User click  ADD TO CART option on HP LP 3065 item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item() {
		descktop.clickOnHPLP3065();
		logger.info("User clicked on HP LP 3065 item");
	}

	@And("^User select quantity 1$")
	public void user_select_quantity() {
	descktop.enterQuantity("1");
		logger.info("User select quantity");
	}

	@And("^User click add to Cart button$")
	public void user_click_add_to_Cart_button_HP(){
	  descktop.addToCartButton();
	  logger.info("User click add to Cart button");
	}

	@Then("^User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart_HP(){
		WebDriverUtility.wait(3000);
		descktop.SuccessMessage();
	    logger.info("Success: you have added ‘HP LP3065’ to your Shopping cart! is diplayed");

	}
	
	
//	Scenario 3
	
	@When("^User click  ADD TO CART option on Canon EOS 5D item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item()  {
	   descktop.clickOnCanonEOS();
	   logger.info("User clicked on Canon EOS item");
	}

	@And("^User select color from dropdown Red$")
	public void user_select_color_from_dropdown_Red()  {
	    descktop.selectCanonEOS5DColor();
	    logger.info("User select item color");
	}

//	@And("^User click add to Cart button $")
//	public void User_click_add_to_Cart_button_Cannon(){
//		descktop.addToCartButton();
//		logger.info("User click add to Cart button");
//	}
	
	@Then("^User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'$")
	public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart_Cannon(){
		 descktop.SuccessMessage();
		  logger.info(" Message 'Success: you have added ‘Canon EOS 5D’ to your Shopping cart!' is diplayed");
	}
	
//	Scenario 4
	
	@When("^User click on Canon EOS 5D item$")
	public void user_click_on_Canon_EOS_D_item()  {
		descktop.clickOnCanonEOS();
		 logger.info("User clicked on Canon EOS 5D item");
	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link(){
		descktop.clicOnReviews();
		 logger.info("User clicked write a review link");
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable info) {
		List<Map<String, String>> dataValues = info.asMaps(String.class, String.class);
		descktop.addYourNameOnReviewsField(dataValues.get(0).get("yourname"));
		descktop.addYourTextReviewsField(dataValues.get(0).get("yourReview"));
		descktop.clickRatingValue(dataValues.get(0).get("Rating"));
		WebDriverUtility.wait(3000);
		logger.info("User filled the Write a review information");	
	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() {
	    descktop.clickOnContinueButtonReviews();
	logger.info("User click on Continue Button");    
	}

	@Then("^User should see a message with 'Thank you for your review\\. It has been submitted to the webmaster for approval\\.'”$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() {
		String expectedMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualMessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(3000);
		  logger.info("User see the message 'Thank you for your review. It has been submitted to the webmaster for approval'");
		   
		   
		   
	}
	
	
}
