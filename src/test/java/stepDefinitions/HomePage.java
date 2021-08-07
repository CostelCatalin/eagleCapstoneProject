package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;
import utilites.WebDriverUtility;

public class HomePage extends Base{

	HomePageObject homePage = new HomePageObject();
	
//	Scenario13
	
//	@Given("^User is on Retail website$")
//	public void user_is_on_Retail_website() {
//		openBrowser();
//		logger.info("Retail Website is opened");
//	}
	
	@And("^User click on Currency$")
	public void user_click_on_Currency()  {
		homePage.clickOnCurrency();
		logger.info("User click on Currency");
	}

	@And("^User Chose Euro from dropdown$")
	public void user_Chose_Euro_from_dropdown()  {
		homePage.clickOnEuroCurrency();
		logger.info("User select Currency");
	}

	@Then("^Currency value should change to Euro$")
	public void currency_value_should_change_to_Euro()  {
		homePage.EuroCurrencyMessage();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	logger.info("Currency value is changed to Eur0 and it's diplayed");
	}
	
//	Scenario14
	@When("^User click on shopping cart$")
	public void user_click_on_shopping_cart()  {
		homePage.clickOnshoopingCart();  
	}

	@Then("^“Your shopping cart is empty!” message should display$")
	public void your_shopping_cart_is_empty_message_should_display() {
		String expectedMessage = "Your shopping cart is empty!";
		String actualMessage = homePage.shoppingCartMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User see 'Your shopping cart is empty!' message on display");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	
}
