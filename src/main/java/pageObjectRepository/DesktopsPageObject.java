package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class DesktopsPageObject extends Base {
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
	private WebElement desktopsMessage;
	
		
//	Refine Search:
	
	@FindBy(xpath = "//a[text()='PC (0)']")
	private WebElement PC;
	
	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement Mac;

	@FindBy(id="grid-view")
	private WebElement gridView;
	
	@FindBy(id="list-view")
	private WebElement listView;
	
	@FindBy(id="compare-total")
	private WebElement compareTotal;
	
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
	
//	Add To Cart Button
	@FindBy(id="button-cart")
	private WebElement addToCart;
	
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	// Qty:
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement qty;
	

	
//	Reviews
	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	private WebElement Reviews;

	@FindBy(xpath="//a[contains(text(),'0 reviews')]")
	private WebElement reviews;
	
//	Write a review button:
	@FindBy(xpath="//a[contains(text(),'Write a review')]")
	private WebElement writeAReview;
	
	//Write a review FIELDS:
//	@FindBy(xpath = "//button[@id='button-review']")
//	private WebElement reviewName;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement reviewName;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourTextReview;
	
//	Continue button Reviews:
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButtonReview;
	

	//	Rating Button:
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement rating1;
	@FindBy(xpath = "//input[@value='2']")
	private WebElement rating2;
	@FindBy(xpath = "//input[@value='3']")
	private WebElement rating3;
	@FindBy(xpath = "//input[@value='4']")
	private WebElement rating4;
	@FindBy(xpath = "//input[@value='5']")
	private WebElement rating5;
	
	
	
//	______________ITEMS______________________________
	
//	Apple Cinema 30
	@FindBy(xpath = "(//img[@class='img-responsive'])[2]")
	private WebElement AppleCinemaImage;
	
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30\"')]")
	private WebElement AppleCinemaText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement addToCartAppleCinema30;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addToWishList2;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProduct1;
	
//	Inside product: Apple Cinema 30
	@FindBy(xpath = "//img[@alt='Apple Cinema 30\"']")
	private WebElement AppleCinemaImage1;
	
	@FindBy(xpath = "//button[@title='Next (Right arrow key)']")
	private WebElement rightArrowKey;
	
	@FindBy(xpath = "Previous (Left arrow key)")
	private WebElement leftArrowKey;
	
//	Description
	@FindBy(xpath = "//a[contains(text(),'Description')]")
	private WebElement description;
//	Specification
	@FindBy(xpath = "//a[contains(text(),'Specification')]")
	private WebElement specification;
	
	
//	
	
	@FindBy(xpath = "//a[text()='Apple']")
	private WebElement brand;
	
//	Available Options:
//RadioButtons:
	@FindBy(xpath = "//input[@value='5']")
	private WebElement radioButton1;
	
	@FindBy(xpath = "//input[@value='6']")
	private WebElement radioButton2;
	
	@FindBy(xpath = "//input[@value='7']")
	private WebElement radioButton3;
	
	@FindBy(xpath = "//input[@value='8']")
	private WebElement checkBox1;
	
	@FindBy(xpath = "//input[@value='9']")
	private WebElement checkBox2;
	
	@FindBy(xpath = "//input[@value='10']")
	private WebElement checkBox3;
	
	@FindBy(xpath = "//input[@value='11']")
	private WebElement checkBox4;
	
	@FindBy(id="input-option208")
	private WebElement textField;

	//	Select Color:
	
	@FindBy(xpath="//select[@id='input-option217']")
	private WebElement selectColor;
	
//	uploadFile
	@FindBy(xpath="//button[@id='button-upload222']")
	private WebElement uploadFile;

	// Select Date:
	@FindBy(xpath="//input[@id='input-option219']")
	private WebElement selectDate;
	
	// Select Time:
	@FindBy(xpath="//input[@id='input-option221']")
	private WebElement selectTime;
	
	// Select Date and Time:
	@FindBy(xpath="//input[@id='input-option220']")
	private WebElement selectDateAndTime;
	
		
	
//	Canon EOS 5D"
	@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement canonEOSImage;
	
	@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D')]")
	private WebElement canonEOSText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartCanonEOS;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement addToWishList3;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProduct2;
	
	@FindBy(xpath = "//i[@class='fa fa-check-circle']")
	private WebElement thankYouMessage;
	
	
//	Inside product: Canon EOS 5D"
	
	@FindBy(xpath = "//img[@alt='Canon EOS 5D']")
	private WebElement CanonImage1;
	
		
	
//Brand
	@FindBy(xpath = "//a[text()='Canon']")
	private WebElement brandCannon;
	
//	Available Options:
	
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement selectCannonColor;
	
	
//	HP LP3065
	@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
	private WebElement hpLP3065Image;
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065Text;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCarthpLP3065;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement addToWishList4;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])3]")
	private WebElement compareThisProduct3;

	//Inside product:
	
		@FindBy(xpath = "//img[@title='HP LP3065']")
		private WebElement HPImage1;
		//Brand
		@FindBy(xpath = "//a[contains(text(),'Hewlett-Packard')]")
		private WebElement brandHewlettPackard;
		
		//	Available Options:
		@FindBy(xpath = "//input[@id='input-option225']")
		private WebElement deliveryDate;
	
	
//	HTC Touch HD
	@FindBy(xpath = "(//img[@class='img-responsive'])[5]")
	private WebElement htcTouchHDImage;
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement htcTouchHDText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
	private WebElement addToCarthtcTouchHD;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement addToWishList5;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement compareThisProduct4;
	
		//Inside product HTC Touch HD:
		@FindBy(xpath = "//img[@title='HTC Touch HD']")
		private WebElement HTCImage1;
		//Brand
		@FindBy(xpath = "//a[text()='HTC']")
		private WebElement brandHTC;
	
	
//	iPhone
	@FindBy(xpath = "(//img[@class='img-responsive'])[6]")
	private WebElement iPhoneImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPhone')]")
	private WebElement iPhoneText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[5]")
	private WebElement addToCartiPhone;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[6]")
	private WebElement addToWishList6;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[5]")
	private WebElement compareThisProduct5;
		
	//		Inside product Iphone:
			@FindBy(xpath = "//img[@title='iPhone']")
			private WebElement iphoneImage1;
			//Brand
			@FindBy(xpath = "//a[text()='Apple']")
			private WebElement brandIphone;
	
//	iPod Classic:
	@FindBy(xpath = "(//img[@class='img-responsive'])[7]")
	private WebElement iPodClassicImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement iPodClassicText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[6]")
	private WebElement addToCartiPodClassic;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[7]")
	private WebElement addToWishList7;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[6]")
	private WebElement compareThisProduct6;
	
	//	Inside product iPod:
		@FindBy(xpath = "//img[@title='iPod Classic']")
		private WebElement iPodImage1;
		//Brand
		@FindBy(xpath = "//a[text()='iPod Classic']")
		private WebElement brandiPod;
	
//	MacBook:
	@FindBy(xpath = "(//img[@class='img-responsive'])[8]")
	private WebElement macBookImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement macBookText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[7]")
	private WebElement addToCartmacBook;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[8]")
	private WebElement addToWishList8;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[7]")
	private WebElement compareThisProduct7;

	//	Inside product MacBook:
	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookImage1;

	
//	MacBook Air:
	@FindBy(xpath = "(//img[@class='img-responsive'])[9]")
	private WebElement macBookAirImage;
	
	@FindBy(xpath = "//a[contains(text(),'MacBook Air')]")
	private WebElement macBookAirText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])8]")
	private WebElement addToCartmacBookAir;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[9]")
	private WebElement addToWishList9;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[8]")
	private WebElement compareThisProduct8;

	//	Inside product MacBook Air:
		@FindBy(xpath = "//img[@title='MacBook Air']")
		private WebElement macBookAirImage1;	
	
	
//	Palm Treo Pro:
	@FindBy(xpath = "(//img[@class='img-responsive'])[10]")
	private WebElement palmTreoProImage;
	
	@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
	private WebElement palmTreoProText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])9]")
	private WebElement addToCartpalmTreoPro;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[10]")
	private WebElement addToWishList10;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[9]")
	private WebElement compareThisProduct9;
	
	//	Inside product Palm Treo Pro:
	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmTreoProImage1;
	//Brand
	@FindBy(xpath = "//a[text()='Palm']")
	private WebElement brandPalmTreoPro;
	
	
//	Product 8:
	@FindBy(xpath = "(//img[@class='img-responsive'])[11]")
	private WebElement product8Image;
	
	@FindBy(xpath = "//a[contains(text(),'Product 8')]")
	private WebElement product8Text;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])10]")
	private WebElement addToCartproduct8;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[11]")
	private WebElement addToWishList11;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[10]")
	private WebElement compareThisProduct10;
	
	
	
//	Samsung SyncMaster 941BW:
	@FindBy(xpath = "(//img[@class='img-responsive'])[12]")
	private WebElement samsungSyncMasterImage;
	
	@FindBy(xpath = "//a[contains(text(),'Samsung SyncMaster 941BW')]")
	private WebElement samsungSyncMasterText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])11]")
	private WebElement addToCartsamsungSyncMaster;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[12]")
	private WebElement addToWishList12;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[11]")
	private WebElement compareThisProduct11;

	//	Inside product Palm Treo Pro:
	@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
		private WebElement samsungSyncMaster941BWImage1;
		
	
	
//	Sony VAIO:
	@FindBy(xpath = "(//img[@class='img-responsive'])[13]")
	private WebElement sonyVAIOImage;
	
	@FindBy(xpath = "//a[contains(text(),'Sony VAIO')]")
	private WebElement sonyVAIOText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])12]")
	private WebElement addToCartsonyVAIO;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[13]")
	private WebElement addToWishList13;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[12]")
	private WebElement compareThisProduct12;
	
		//	Inside product Palm Treo Pro:
		@FindBy(xpath = "//img[@title='Sony VAIO']")
		private WebElement sonyVAIOImage1;
	
	
	
//	Left side:
	
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement desktopsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- PC (0)')]")
	private WebElement PCLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Mac (1)')]")
	private WebElement macLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement laptopsNotebooksLeftSide;
	
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
	
	
	
	
	
	
//	______________Methods Scenario 1:______________________________
	
	
	public void SuccessMessage() {
		String actual = "Success: You have added Canon EOS 5D to your shopping cart!";
		String expected = "Success: You have added Canon EOS 5D to your shopping cart!";		 
		System.out.println(actual.substring(0,7));
		System.out.println(expected.substring(0,7));
		 actual.contentEquals("Success");
	
		WebDriverUtility.screenShot();
	}
	
	
	public void clickOnDesktops() {
		WebDriverUtility.clickOnElement(desktops);
	}
	
	public void clickOnshowAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktops);
	}
	
	public String DesktopMessage() {
		String message = desktopsMessage.getText();
		return message;
		}
	
	
//	______________Methods Scenario 2:______________________________
	
	
	public void clickOnHPLP3065() {
		WebDriverUtility.clickOnElement(hpLP3065Text);
	}
	
	public void enterQuantity (String quantity) {
//		WebDriverUtility.clearText(qty);
		WebDriverUtility.enterValue(qty, quantity);
	}
	
	public void addToCartButton() {
		WebDriverUtility.clickOnElement(addToCart);
	}
	

	
	
//	______________Methods Scenario 3:______________________________
		
		public void clickOnCanonEOS() {
			WebDriverUtility.clickOnElement(canonEOSText);
	}
	
		public void selectCanonEOS5DColor() {
		WebDriverUtility.selectByVisibleText(selectCannonColor, "Red");
		}		
		
//		______________Methods Scenario 4:______________________________
		
		public void clicOnReviews() {
			WebDriverUtility.clickOnElement(Reviews);
		}
		
		public void addYourNameOnReviewsField (String yourName) {
			WebDriverUtility.enterValue(reviewName, yourName);
		}

	
		public void addYourTextReviewsField (String TextReview) {
			WebDriverUtility.enterValue(yourTextReview, TextReview);
		}
		
		public void clickRatingValue(String ratingValue) {
			WebDriverUtility.clickOnElement(rating5);
		}
				
		public void clickOnContinueButtonReviews () {
			WebDriverUtility.clickElementWithJS(continueButtonReview);
		}
		
		public String ThankYouMessage() {
			String message = thankYouMessage.getText();
			return message;
			}
		
}

