package pageObjectRepository;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LaptopsNoteBooksPageObject extends Base{

	


	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
			}
		
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsNotebooks;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsNotebooks;
	
	
	@FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[1]")
	private WebElement cartTotal;
	
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	private WebElement cartTotalOption;
	
//	Refine Search:
	
	@FindBy(xpath = "//a[text()='Macs (0)']")
	private WebElement PC;
	
	@FindBy(xpath = "//a[text()='Windows (0)']")
	private WebElement Mac;

	@FindBy(id="grid-view")
	private WebElement gridView;
	
	@FindBy(id="list-view")
	private WebElement listView;
	
	@FindBy(id="compare-total")
	private WebElement compareTotal;
	
//	Add To Cart Button
	@FindBy(id="button-cart")
	private WebElement addToCart1;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement cartEmpty;	
	
//		
	
	@FindBy(xpath = "//i[@class='fa fa-times-circle']")
	private WebElement removeButton;
	
//	Dropdown box
	
//	WebElement sortBy = driver.findElement(By.id("input-sort"));
//	Select select = new Select(sortBy);		
//	select.selectByVisibleText("Price (High > Low)");
	
	@FindBy(id="input-sort")
	private WebElement sortBy;
	
//	WebElement show = driver.findElement(By.id("input-limit"));
//	Select select1 = new Select(show);		
//	select1.selectByVisibleText("100");
	
	@FindBy(id="input-limit")
	private WebElement show;
	
	
	
	
	
	
//	HP LP3065:
	@FindBy(xpath = "(//img[@class='img-responsive'])[2]")
	private WebElement hpLP3065Image;
	
	@FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
	private WebElement hpLP3065Text;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement addToCarthpLP3065;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addHPLP3065ToWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProduct1;
	
	
//	MacBook:
	@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement macBookImage;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookItem;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartmacBook;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement addMacBookToWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareMacBookButton;
	
//	MacBook Air:
	@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
	private WebElement macBookAirImage;
	
	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAirText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartmacBookAir;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement addMacBookAirToWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement compareMacBookAirButton;
	
	
//	MacBook Pro:
	@FindBy(xpath = "(//img[@class='img-responsive'])[5]")
	private WebElement macBookProImage;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookProLink;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement addToCartmacBookPro;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement addMacBookProToWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement compareThisProduct4;	

	
//	Sony VAIO:
	@FindBy(xpath = "(//img[@class='img-responsive'])[6]")
	private WebElement sonyVAIOImage;
	
	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVAIOText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[5]")
	private WebElement addToCartsonyVAIO;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement addSonyVaIOToWishList;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[5]")
	private WebElement compareThisProduct5;	
	
//	Left side:
	
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement desktopsLeftSide;
			
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement laptopsNotebooksLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Macs (0)')]")
	private WebElement macsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Windows (0)')]")
	private WebElement windowsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement componentsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'Tablets (1)')]")
	private WebElement tabletsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'Software (0)')]")
	private WebElement softwareLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs (3)')]")
	private WebElement PhonesLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'Cameras (2)')]")
	private WebElement CamerasLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'MP3 Players (4)')]")
	private WebElement mp3LeftSide;

	
	@FindBy(xpath = "//h1[contains(text(),'Product Comparison')]")
	private WebElement compareMessage;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement youMustText;
	
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement priceTag;
	
	
	public void clickOnLaptoppAndNoteBook() {
		WebDriverUtility.clickOnElement(laptopsNotebooks);
	}
		public void clickOnShowAllLaptoppAndNoteBook() {
		WebDriverUtility.clickOnElement(showAllLaptopsNotebooks);	
	}
	
		public void clickOnMAcBook() {
			WebDriverUtility.clickOnElement(macBookItem);	
		}
		
		public void addToCart() {
			WebDriverUtility.clickOnElement(addToCart1);	
		}
	
		public String cartMessage() {
			String message = cartEmpty.getText();
			return message;
			}
		
		
		public void SuccessMessage() {
			String actual = "Success: You have added Canon EOS 5D to your shopping cart!";
			String expected = "Success: You have added Canon EOS 5D to your shopping cart!";		 
			System.out.println(actual.substring(0,7));
			System.out.println(expected.substring(0,7));
			 actual.contentEquals("Success");
//			WebDriverUtility.wait(3000);
//			WebDriverUtility.screenShot();
		}
		
		public void clickOnItemsCart() {
			WebDriverUtility.clickOnElement(cartTotal);	
		}
		
		
		public void clickOncartTotalOption() {
			WebDriverUtility.clickOnElement(cartTotalOption);	
		}
		
		public void clickOnRemoveButton() {
			WebDriverUtility.clickOnElement(removeButton);	
		}
		
//		DesktopsPageObject descktop = new DesktopsPageObject();
//		
//		public void addToCartButton () {
//		WebDriverUtility.clickOnElement(descktop.getAddToCart());
//		}
		
		
		
//		Scenario6:
		public void clickOnCompareButtonMcBook() {
		WebDriverUtility.clickOnElement(compareMacBookButton);
				}
		
		public void clickOnCompareButtonMacBookAir() {
			WebDriverUtility.clickOnElement(compareMacBookAirButton);
		}
		
		public void clickOnCompareProduct() {
			WebDriverUtility.clickOnElement(compareTotal);
		}
		
		public String compareText() {
			String text = compareMessage.getText();
			return text;
		}
		
	
		public String youMustMessage() {	
			String youMust = youMustText.getText();
			return youMust;
		 		
		}
		 
//Scenario7:
		public void clickOnSonyVaIOAddWishListButton() {
	WebDriverUtility.clickOnElement(addSonyVaIOToWishList);
	} 		
	
//		Scenario8:
		
		public void clickOnMacBookProItem() {
			WebDriverUtility.clickOnElement(macBookProLink);			
		}
		
		public String priceTagDisplayed() {
			String youMust = priceTag.getText();
			return youMust;			
		}
		
		
		
}
