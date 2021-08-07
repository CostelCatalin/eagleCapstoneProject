package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RetailPageObject extends Base {

	
	public RetailPageObject() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(id = "input-firstname")
	private WebElement firstName;
	@FindBy(id = "input-lastname")
	private WebElement lastName;
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-telephone")
	private WebElement telephone;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy(id = "input-confirm")
	private WebElement confirmPassword;
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	private WebElement yesSubscribe;
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement noSubscribe;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicy;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessage;

	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage1;

	
//	My Affiliate Account
	@FindBy(xpath ="//a[text()='Edit your affiliate information']")
	private WebElement affiliateAccount;
	
	@FindBy(xpath ="//input[@id='input-company']")
	private WebElement companyName;
	
	@FindBy(xpath ="//input[@id='input-website']")
	private WebElement inputWebsite;
	
//	Payment Information
	
	@FindBy(xpath ="//input[@id='input-tax']")
	private WebElement inputTax;
	
//	Payment Methods:
//	Paypal:
	@FindBy(xpath="//input[@value='paypal']")
	private WebElement paymentMethod;
	
	@FindBy(xpath="//input[@value='input-paypal']")
	private WebElement payPalEmailAccount;

//	Bank:
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(xpath ="//input[@id='input-bank-name']")
	private WebElement bankName;
	
	@FindBy(xpath ="//input[@id='input-bank-branch-number']")
	private WebElement branchNumber;
	
	@FindBy(xpath ="//input[@id='input-bank-swift-code']")
	private WebElement sWIFTCode;
	
	@FindBy(xpath ="//input[@id='input-bank-account-name']")
	private WebElement bankAccountName;
	
	@FindBy(xpath ="//input[@id='input-bank-account-number']")
	private WebElement bankAccountNumber;
	
	
//	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement readAndAgreeButton;
	
//	Scenario11:
//	Edit your account Information:
	@FindBy(xpath ="//a[text()='Edit your account information']")
	private WebElement editAccountInformation;
	
	
	
	
//	Methods:
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}

	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}

	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}

	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}

	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}

	public void clickOnRegisterOption() {
		WebDriverUtility.clickOnElement(register);
	}

	public void enterFirstName(String fName) {
		WebDriverUtility.clearText(firstName);
		WebDriverUtility.enterValue(firstName, fName);
	}

	public void enterLastName(String lName) {
		WebDriverUtility.clearText(lastName);
		WebDriverUtility.enterValue(lastName, lName);
	}

	public void enterRegistrationEmail(String emailvalue) {
		WebDriverUtility.clearText(email);
		WebDriverUtility.enterValue(email, emailvalue);
	}

	public void enterTelephone(String telephoneValue) {
		WebDriverUtility.clearText(telephone);
		WebDriverUtility.enterValue(telephone, telephoneValue);
	}

	public void enterRegistrationPassword(String passwordValue) {
		WebDriverUtility.enterValue(password, passwordValue);
	}

	public void enterConfirmPassword(String confirmPasswordValue) {
		WebDriverUtility.enterValue(confirmPassword, confirmPasswordValue);

	}

	public void subscribe(String subscribeValue) {
		if (subscribeValue.equalsIgnoreCase("yes")) {
			if (!yesSubscribe.isSelected())
				WebDriverUtility.clickOnElement(yesSubscribe);
		} else
			if (!noSubscribe.isSelected())
			WebDriverUtility.clickOnElement(noSubscribe);
	}
	
	public void clickOnPrivacyPolicy() {
		WebDriverUtility.clickOnElement(privacyPolicy);
	}
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}
	
	public String accountCreationMessage() {
		String message = successMessage.getText();
		return message;
	}

	//Scenario 9:	
	public void clickOnAffiliateAccount() {
		WebDriverUtility.clickOnElement(affiliateAccount);
			}
	
	public void enterCompanyName(String companyNameText) {
		WebDriverUtility.clearText(companyName);
		WebDriverUtility.enterValue(companyName, companyNameText);
	}
	
	public void enterWebsite(String inputWebsiteText) {
		WebDriverUtility.clearText(inputWebsite);
		WebDriverUtility.enterValue(inputWebsite,inputWebsiteText );
	}
	
	public void enterTaxID(String taxIDText) {
		WebDriverUtility.clearText(inputTax);
		WebDriverUtility.enterValue(inputTax, taxIDText);
		
	}
	
	public void clickOnPaymentMethod(String PayPal) {
		WebDriverUtility.clickOnElement(paymentMethod);
		
	}
	
	public void enterPayPalEmailAccount(String EmailAccountPayment) {
		WebDriverUtility.clearText(payPalEmailAccount);
		WebDriverUtility.enterValue(payPalEmailAccount, EmailAccountPayment);
	}
	
	public void clickOnReadAndAgreeButton(String AgreeButton) {
		WebDriverUtility.enterValue(readAndAgreeButton, AgreeButton);
	}

	public String succesMessage() {
		String message = successMessage1.getText();
		return message;
	}
		//Scenario 10:
		
		public void clickOnBankTransferButton() {
		WebDriverUtility.clickOnElement(bankTransfer);
		}
		
		
		
	public void enterBankName(String bankNameText) {
		WebDriverUtility.enterValue(bankAccountName, bankNameText);
			}
		
	public void enterBranchName(String branchNameText) {
		WebDriverUtility.enterValue(branchNumber, branchNameText);
			}
		
public void enterSWIFTCode(String SwiftCodeText) {
		WebDriverUtility.enterValue(sWIFTCode, SwiftCodeText);
}

public void enterAccountName(String AccountNameText) {
	WebDriverUtility.enterValue(bankAccountName, AccountNameText);
}


public void enterAccountNumber(String AccountNumberText) {
	WebDriverUtility.enterValue(bankAccountNumber, AccountNumberText);
	}

//Scenario 11:

public void clickAccountInformation() {
	WebDriverUtility.clickOnElement(editAccountInformation);
}



}





