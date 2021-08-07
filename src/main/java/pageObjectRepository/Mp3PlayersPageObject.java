package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base{

	public Mp3PlayersPageObject() {
		
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3Players;	
	
	@FindBy(xpath = "//a[contains(text(),'MP3 Players')]")
	private WebElement showAllmp3Players;
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continueButton;	
	
	
//	Refine Search:
	
	@FindBy(xpath = "//a[text()='test 11 (0)']")
	private WebElement test11;	
	
	@FindBy(xpath = "//a[text()='test 12 (0)']")
	private WebElement test12;
	
	@FindBy(xpath = "//a[text()='test 15 (0)']")
	private WebElement test15;
	
	@FindBy(xpath = "//a[text()='test 16 (0)']")
	private WebElement test16;
	
	@FindBy(xpath = "//a[text()='test 17 (0)']")
	private WebElement test17;
	
	@FindBy(xpath = "//a[text()='test 18 (0)']")
	private WebElement test18;
	
	@FindBy(xpath = "//a[text()='test 19 (0)']")
	private WebElement test19;
	
	@FindBy(xpath = "//a[text()='test 20 (0)']")
	private WebElement test20;
	
	@FindBy(xpath = "//a[text()='test 21 (0)']")
	private WebElement test21;
	
	@FindBy(xpath = "//a[text()='test 22 (0)']")
	private WebElement test22;
	
	@FindBy(xpath = "//a[text()='test 23 (0)']")
	private WebElement test23;
	
	@FindBy(xpath = "//a[text()='test 24 (0)']")
	private WebElement test24;
	
	@FindBy(xpath = "//a[text()='test 4 (0)']")
	private WebElement test4;
	
	@FindBy(xpath = "//a[text()='test 5 (0)']")
	private WebElement test5;
	
	@FindBy(xpath = "//a[text()='test 6 (0)']")
	private WebElement test6;
	
	@FindBy(xpath = "//a[text()='test 7 (0)']")
	private WebElement test7;
	
	@FindBy(xpath = "//a[text()='test 8 (0)']")
	private WebElement test8;
	
	@FindBy(xpath = "//a[text()='test 9 (0)']")
	private WebElement test9;
	
//select and sort bar
	
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

	
//	iPod Classic:
		@FindBy(xpath = "(//img[@class='img-responsive'])[2]")
	private WebElement iPodClassicImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Classic')]")
	private WebElement iPodClassicText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
	private WebElement addToCartiPodClassic;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addToWishList2;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProduct1;

	
	// iPod Namo:
		@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
	private WebElement iPodNanoImage;
	
	@FindBy(xpath = "//a[contains(text(),'iPod Nano')]")
	private WebElement iPodNanoText;
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addToCartiPodNano;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement addToWishList3;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProduct2;
	
	
	// iPod Shuffle:
			@FindBy(xpath = "(//img[@class='img-responsive'])[4]")
		private WebElement iPodShuffleImage;
		
		@FindBy(xpath = "//a[contains(text(),'iPod Shuffle')]")
		private WebElement iPodShuffleText;
		
		@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
		private WebElement addToCartiPodShuffle;
		
		@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
		private WebElement addToWishList4;
		
		@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
		private WebElement compareThisProduct3;

		
		// iPod Touch:
					@FindBy(xpath = "(//img[@class='img-responsive'])[5]")
				private WebElement iPodTouchImage;
				
				@FindBy(xpath = "//a[contains(text(),'iPod Touch')]")
				private WebElement iPodTouchText;
				
				@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
				private WebElement addToCartiPodTouch;
				
				@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
				private WebElement addToWishList5;
				
				@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
				private WebElement compareThisProduct4;

				
//			Left side:
				
			@FindBy(xpath = "//a[contains(text(),'Desktops (13)')]")
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
				
			@FindBy(xpath = "//a[contains(text(),'- test 11 (0)')]")
			private WebElement test11LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 12 (0)')]")
			private WebElement test12LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 15 (0)')]")
			private WebElement test15LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 16 (0)')]")
			private WebElement test16LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 17 (0)')]")
			private WebElement test17LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 18 (0)')]")
			private WebElement test18LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 19 (0)')]")
			private WebElement test19LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 20 (0)')]")
			private WebElement test20LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 21 (0)')]")
			private WebElement test21LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 22 (0)')]")
			private WebElement test22LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 23 (0)')]")
			private WebElement test23LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 24 (0)')]")
			private WebElement test24LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 4 (0)')]")
			private WebElement test4LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 5 (0)')]")
			private WebElement test5LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 6 (0)')]")
			private WebElement test6LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 7 (0)')]")
			private WebElement test7LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 8 (0)')]")
			private WebElement test8LeftSide;	
			
			@FindBy(xpath = "//a[contains(text(),'- test 9 (0)')]")
			private WebElement test9LeftSide;	
			
			
			
			
			
			
}
