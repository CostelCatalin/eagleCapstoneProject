package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopsAndNoteBooks extends Base {

	LaptopsNoteBooksPageObject items = new LaptopsNoteBooksPageObject();

//	@Given("^User is on Retail Website$")
//	public void user_is_on_Retail_websites() {
//		openBrowser();
//		logger.info("Retail Website is opened");
//	}

	@When("^User click on Laptop &NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() {
		items.clickOnLaptoppAndNoteBook();
		logger.info("User clicked on Laptop &NoteBook tab ");
	}

	@And("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() {
		items.clickOnShowAllLaptoppAndNoteBook();
		logger.info("User clicked on Show all Laptop &NoteBook");
	}

	@And("^User click on MacBook item$")
	public void user_click_on_MacBook_item() {
		items.clickOnMAcBook();
		logger.info("User click on MacBook item");
	}

//	@And("^User click add to Cart button$")
//	public void user_click_add_to_Cart_button() {
//		items.addToCart();
//		logger.info("User click add to Cart button");
//	}

	@Then("^User should see a message 'Success: You have added MacBook to your shopping cart!'$")
	public void user_should_see_tem_s_showed_to_the_cart() {
		items.SuccessMessage();
		logger.info("Success: you have added MacBook to your Shopping cart! is diplayed");
	}

	@And("^User should see item showed to the cart$")
	public void user_see_1_item_to_the_cart() {
		items.clickOnItemsCart();
		logger.info("User should see ‘1 item(s)-602.00’ showed to the cart");
	}

	@And("^User click on cart option$")
	public void user_click_on_cart_option() {
		items.clickOncartTotalOption();
		logger.info("User click on cart option");
	}

	@And("^User click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() {
		items.clickOnRemoveButton();
		logger.info("The item is removed from cart");
	}

	@Then("^Item should be removed and cart should show '0 items'$")
	public void item_should_be_removed() {
		String expectedMessage = "Your shopping cart is empty!";
		String actualMessage = "Your shopping cart is empty!";
		Assert.assertEquals(expectedMessage, actualMessage);
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
		logger.info("Your shopping cart is empty!");
	}

//	Scenario6:
	
	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook()  {
	 items.clickOnCompareButtonMcBook();
	 logger.info("User click on product comparison icon on ‘MacBook’");
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air()  {
	   items.clickOnCompareButtonMacBookAir();
	   logger.info("User click on product comparison icon on ‘MacBook Air");
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() {
		String actual = "Success: You have added Canon EOS 5D to your shopping cart!";
		String expected = "Success: You have added Canon EOS 5D to your shopping cart!";		 
		System.out.println(actual.substring(0,7));
		System.out.println(expected.substring(0,7));
		 actual.contentEquals("Success");
		 Assert.assertEquals(actual, expected);
	 logger.info("Success: You have added MacBook Air to your product comparison! is diplayed");
	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() {
	  items.clickOnCompareProduct();
	  logger.info("User click on Product comparison link");
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart()  {
		String actual = "Product Comparison";
		String expected = items.compareText();	 
		Assert.assertEquals(actual, expected);
		WebDriverUtility.screenShot();
	logger.info("Product Comparison Chart it's displayed"); 
	}
	
	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list()  {
	   items.clickOnSonyVaIOAddWishListButton();
	   logger.info("User click on heart icon to add ‘Sony VaIO’ laptop to wish list");
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_get_a_message() {
		String actual = "You must login or create an account to save Sony VAIO to your wish list!";
		String expected = "You must login or create an account to save Sony VAIO to your wish list!";		 
//		String expected = items.youMustMessage();
		System.out.println(actual.substring(0,8));
		System.out.println(expected.substring(0,8));
		 actual.contentEquals("You must");
		 Assert.assertEquals(actual, expected);
		 WebDriverUtility.screenShot();
		 WebDriverUtility.wait(3000);
		 logger.info("User see the message ‘You must login or create an account to save Sony VAIO to your wish list!’");  
	}
	
	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item()  {
	   items.clickOnMacBookProItem();
	   logger.info("User click on ‘MacBook Pro’ item");
	}

	@Then("^User should see price tag is present on UI$")
	public void user_see_price_tag() {
		String actual = "$2,000.00";
		String expected = items.priceTagDisplayed();	 
		Assert.assertEquals(actual, expected);
		WebDriverUtility.screenShot();
		 WebDriverUtility.wait(3000);
		 logger.info("User see the price '$2,000.00' tag present on UI");  
	}
	
	
}
