package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{

	public SoftwarePageObject() {
		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(xpath="//a[text()='Software']")
	private WebElement software;
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continueButton;
	
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
