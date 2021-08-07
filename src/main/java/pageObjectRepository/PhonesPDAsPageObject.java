package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base{

public PhonesPDAsPageObject() {
PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(xpath="//a[text()='Software']")
	private WebElement sofware;	
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continueButton;	
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

//	HTC Touch HD:
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[2]")
	private WebElement htcTouchImage;
	
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement htcTouchText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement addToCarthtcTouch;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addToWishList2;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProduct1;
	
//	Iphone:
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement iPhoneImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPhone')]")
	private WebElement iPhoneText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartIPhone;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement addToWishList3;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProduct2;
	
//	Palm Treo Pro:
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
	private WebElement palmTreoProeImage;
	
	@FindBy(xpath = "//a[contains(text(),'Palm Treo Pro')]")
	private WebElement palmTreoProeText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartpalmTreoProe;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])4]")
	private WebElement addToWishList4;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement compareThisProduct3;
	
	
//	Left side:
	
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement desktopsLeftSide;
	
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
	
	
}
