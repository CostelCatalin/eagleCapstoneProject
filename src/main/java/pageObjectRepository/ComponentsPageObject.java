 package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class ComponentsPageObject extends Base{

	
	public ComponentsPageObject(){
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;	
	
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement showAllComponents;	
	
	
	@FindBy(xpath = "//a[text()='Mice and Trackballs (0)']")
	private WebElement miceAndTrackballs;	
	
//	Monitors:
	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement monitors;	
	
	@FindBy(xpath = "//a[text()='test 1 (0)']")
	private WebElement test1;
	
	@FindBy(xpath = "//a[text()='test 2 (0)']")
	private WebElement test2;
	
	
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
	
//	Apple Cinema 30:
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
	
	
//	Samsung SyncMaster 941BW:
	@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement samsungSyncMaster941BWImage;
	
	@FindBy(xpath = "//a[contains(text(),'Samsung SyncMaster 941BW')]")
	private WebElement samsungSyncMaster941BWText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartApplesamsungSyncMaster941BW;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement addToWishList3;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProduct2;
	
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement hpBanner;
	
//	Printer:
	@FindBy(xpath = "//a[text()='Printers (0)']")
	private WebElement printers;	

	@FindBy(xpath = "//a[text()='Scanners (0)']")
	private WebElement scanners;	
	
	@FindBy(xpath = "//a[text()='Web Cameras (0)']")
	private WebElement webCameras;	

//	Left side:
	
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement desktopsLeftSide;
			
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement laptopsNotebooksLeftSide;
	
		
	@FindBy(xpath = "//a[contains(text(),'Components (2)')]")
	private WebElement componentsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Mice and Trackballs (0)')]")
	private WebElement  miceAndTrackballsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Monitors (2)')]")
	private WebElement monitorsLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Printers (0)')]")
	private WebElement printersLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Scanners (0)')]")
	private WebElement scannersLeftSide;
	
	@FindBy(xpath = "//a[contains(text(),'- Web Cameras (0)')]")
	private WebElement webCamerasLeftSide;
	
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
