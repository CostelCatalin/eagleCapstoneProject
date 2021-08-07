package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class IphooneObject extends Base{
			
		public IphooneObject() {
		PageFactory.initElements(driver, this);
		}
	
		@FindBy(xpath = "//input[@name='search']")
		private WebElement searchBar;
		
	
		
		@FindBy(xpath = "//i[@class='fa fa-search']")
		private WebElement searchBotton;
		
			
		
		public void enterValueOnSearchBar(String searchValue) {
			WebDriverUtility.enterValue(searchBar, searchValue);
					}
		
		
		public void clickOnSearchBotton() {
			WebDriverUtility.clickOnElement(searchBotton);
		}
}
