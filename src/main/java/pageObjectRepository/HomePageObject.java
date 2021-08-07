
package pageObjectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilites.WebDriverUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends Base{
	
	public HomePageObject() {
	PageFactory.initElements(driver, this);
	}
	
//	
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currency;
	
	public void clickOnCurrency() {
	WebDriverUtility.clickOnElement(currency);
			}
	
	@FindBy(xpath = "(//button[@class='currency-select btn btn-link btn-block'])[1]")
	private WebElement currencyEuro;
	
	public void clickOnEuroCurrency() {
	WebDriverUtility.clickOnElement(currencyEuro);
	}
	
	
	public void EuroCurrencyMessage() {
		WebDriverUtility.isElementDisplayed(currencyEuro);
	
	}
		
	

	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement phone;
	
	public void clickOnPhone() {
		WebDriverUtility.clickOnElement(phone);
				}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	public void clickOnmyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
				}

	@FindBy(xpath = "//span[contains(text(),'Wish List (0)')]")
	private WebElement wishList;

	public void clickOnWishList() {
		WebDriverUtility.clickOnElement(wishList);
				}
	
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	private WebElement shoopingCart;
	
	public void clickOnshoopingCart() {
		WebDriverUtility.clickOnElement(shoopingCart);
				}
		
	
	@FindBy(xpath = "//span[contains(text(),'Checkout')]")
	private WebElement checkout;

	public void clickOnCheckOut() {
		WebDriverUtility.clickOnElement(checkout);
				}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textEnviroment;
	
	public void clickOnTextEnviroment() {
		WebDriverUtility.clickOnElement(textEnviroment);
				}

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;
	
	
	public void enterValueOnSearchBar(String searchValue) {
		WebDriverUtility.enterValue(searchBar, searchValue);
				}
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	private WebElement searchBotton;
	
	public void clickOnSearchBotton() {
		WebDriverUtility.clickOnElement(searchBotton);
				}
		
	@FindBy(id = "cart-total")
	private WebElement cartItems;
	
	public void clickOnCartItems() {
		WebDriverUtility.clickOnElement(cartItems);
				}
	
//	Banner 1:
	@FindBy(xpath = "(//div[@class='swiper-button-next'])[1]")
	private WebElement swiperButtonNext1;
	
	public void clickOnSwiperButtonNext1() {
		WebDriverUtility.clickOnElement(swiperButtonNext1);
				}
	
	@FindBy(xpath = "//img[@alt='MacBookAir']")
	private WebElement swipeviewport1;
	
	public void clickOnSwipeViewPort1() {
		WebDriverUtility.clickOnElement(swipeviewport1);
				}
	
	@FindBy(xpath = "//img[@alt='iPhone 6']")
	private WebElement swipeviewport2;
	
	public void clickOnSwipeViewPort2() {
		WebDriverUtility.clickOnElement(swipeviewport2);
				}
	
		
	
//	Featured:
//	1.MacBook
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macBookFeatureimage;
	
	public void clickOnMacBookFeatureImage() {
		WebDriverUtility.clickOnElement(macBookFeatureimage);
				}
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBookFeatureText;
	
	public void clickOnMacBookFeatureText() {
		WebDriverUtility.clickOnElement(macBookFeatureText);
				}
		
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
	private WebElement addToCart7;
	
	public void clickOnAddToCart7() {
		WebDriverUtility.clickOnElement(addToCart7);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addToWishList2;
	
	public void clickOnAddToWishList2() {
		WebDriverUtility.clickOnElement(addToWishList2);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[1]")
	private WebElement compareThisProduct1;
	
	public void clickOnCompareThisProduct1() {
		WebDriverUtility.clickOnElement(compareThisProduct1);
				}
	
//	2.iPhone
	@FindBy(xpath = "//img[@alt='iPhone']")
	private WebElement iPhoneFeatureimage;
	
	public void clickOniPhoneFeatureimage() {
		WebDriverUtility.clickOnElement(iPhoneFeatureimage);
				}
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhoneFeatureText;
	
	public void clickOniPhoneFeatureText() {
		WebDriverUtility.clickOnElement(iPhoneFeatureText);
				}
		
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[8]")
	private WebElement addToCart8;
	
	public void clickOnAddToCart8() {
		WebDriverUtility.clickOnElement(addToCart8);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[3]")
	private WebElement addToWishList3;
	
	public void clickOnAddToWishList3() {
		WebDriverUtility.clickOnElement(addToWishList3);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareThisProduct2;
	
	public void clickOnCompareThisProduct2() {
		WebDriverUtility.clickOnElement(compareThisProduct2);
				}
	
//	3.Apple Cinema 30"
	@FindBy(xpath = "//img[@alt='iPhone']")
	private WebElement appleCinema30Featureimage;
	
	public void clickOnAppleCinema30Featureimage() {
		WebDriverUtility.clickOnElement(appleCinema30Featureimage);
				}
	
	@FindBy(xpath = "(//img[@class='img-responsive'])[7]")
	private WebElement appleCinema30FeatureText;
	
	public void clickOnAppleCinema30FeatureText() {
		WebDriverUtility.clickOnElement(appleCinema30FeatureText);
				}
		
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[9]")
	private WebElement addToCart9;
	
	public void clickOnAddToCart9() {
		WebDriverUtility.clickOnElement(addToCart9);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[4]")
	private WebElement addToWishList4;
	
	public void clickOnAddToWishList4() {
		WebDriverUtility.clickOnElement(addToWishList4);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement compareThisProduct3;
	
	public void clickOnCompareThisProduct3() {
		WebDriverUtility.clickOnElement(compareThisProduct3);
				}
	
//	4.Canon EOS 5D
	@FindBy(xpath = "//img[@alt='iPhone']")
	private WebElement canonFeatureimage;
	
	public void clickOnCanonFeatureimage() {
		WebDriverUtility.clickOnElement(canonFeatureimage);
				}
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonFeatureText;
	
	public void clickOnCanonFeatureText() {
		WebDriverUtility.clickOnElement(canonFeatureText);
				}
		
	@FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[10]")
	private WebElement addToCart10;
	
	public void clickOnAddToCart10() {
		WebDriverUtility.clickOnElement(addToCart10);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[5]")
	private WebElement addToWishList5;
	
	public void clickOnAddToWishList5() {
		WebDriverUtility.clickOnElement(addToWishList5);
				}
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[4]")
	private WebElement compareThisProduct4;
	
	public void clickOnCompareThisProduct4() {
		WebDriverUtility.clickOnElement(compareThisProduct4);
				}
	
//	Banner 2:
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet swiper-pagination-bullet-active'])[2]")
	private WebElement swiperPaginationBullet1;
	
	public void clickOnSwiperPaginationBullet1() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet1);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[2]")
	private WebElement swiperPaginationBullet2;
	
	public void clickOnSwiperPaginationBullet2() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet2);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[3]")
	private WebElement swiperPaginationBullet3;
	
	public void clickOnSwiperPaginationBullet3() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet3);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[4]")
	private WebElement swiperPaginationBullet4;
	
	public void clickOnSwiperPaginationBullet4() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet4);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[5]")
	private WebElement swiperPaginationBullet5;
	
	public void clickOnSwiperPaginationBullet5() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet5);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])6]")
	private WebElement swiperPaginationBullet6;
	
	public void clickOnSwiperPaginationBullet6() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet6);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[7]")
	private WebElement swiperPaginationBullet7;
	
	public void clickOnSwiperPaginationBullet7() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet7);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[8]")
	private WebElement swiperPaginationBullet8;
	
	public void clickOnSwiperPaginationBullet8() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet8);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[9]")
	private WebElement swiperPaginationBullet9;
	
	public void clickOnSwiperPaginationBullet9() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet9);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[10]")
	private WebElement swiperPaginationBullet10;
	
	public void clickOnSwiperPaginationBullet10() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet10);
				}
	
	@FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])[11]")
	private WebElement swiperPaginationBullet11;
	
	public void clickOnSwiperPaginationBullet11() {
		WebDriverUtility.clickOnElement(swiperPaginationBullet11);
				}
	
// Next button  on Banner:
	
	@FindBy(xpath = "(//div[@class='swiper-button-next'])[2]")
	private WebElement swiperButtonNext2;
	
	public void clickOnSwiperButtonNext2() {
		WebDriverUtility.clickOnElement(swiperButtonNext2);
				}
	
//	Information:
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	private WebElement aboutAs;
	
	public void clickOnAboutAs() {
		WebDriverUtility.clickOnElement(aboutAs);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Delivery Information')]")
	private WebElement deliveryInformation;
	
	public void clickOnDeliveryInformation() {
		WebDriverUtility.clickOnElement(deliveryInformation);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	private WebElement privacyPolicy;
	
	public void clickOnPrivacyPolicy() {
		WebDriverUtility.clickOnElement(privacyPolicy);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Terms & Conditions')]")
	private WebElement termAndText;
	
	public void clickOnTermAndText() {
		WebDriverUtility.clickOnElement(termAndText);
				}

	//	Customer Service:
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	private WebElement contactUs;
	
	public void clickOnContactUs() {
		WebDriverUtility.clickOnElement(contactUs);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Returns')]")
	private WebElement returns;
	
	public void clickOnReturns() {
		WebDriverUtility.clickOnElement(returns);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Site Map')]")
	private WebElement siteMap;
	
	public void clickOnSiteMap() {
		WebDriverUtility.clickOnElement(siteMap);
				}
	
//	Extras:
	
	@FindBy(xpath = "//a[contains(text(),'Brands')]")
	private WebElement brands;
	
	public void clickOnBrands() {
		WebDriverUtility.clickOnElement(brands);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Gift Certificates')]")
	private WebElement giftCertificates;
	
	public void clickOnGiftCertificates() {
		WebDriverUtility.clickOnElement(giftCertificates);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
	private WebElement affiliate;
	
	public void clickOnAffiliate() {
		WebDriverUtility.clickOnElement(affiliate);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Specials')]")
	private WebElement specials;
	
	public void clickOnSpecials() {
		WebDriverUtility.clickOnElement(specials);
				}
	
//	My Account Bottom:
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	private WebElement myAccountBottom;
	
	public void clickOnMyAccountBottom() {
		WebDriverUtility.clickOnElement(myAccountBottom);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Order History')]")
	private WebElement orderHistory;
	
	public void clickOnOrderHistory() {
		WebDriverUtility.clickOnElement(orderHistory);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Wish List')]")
	private WebElement wishListBottom;
	
	public void clickOnWishListBottom() {
		WebDriverUtility.clickOnElement(wishListBottom);
				}
	
	@FindBy(xpath = "//a[contains(text(),'Newsletter')]")
	private WebElement newsLetter;
	
	public void clickOnNewsLetter() {
		WebDriverUtility.clickOnElement(newsLetter);
				}

	
	@FindBy(xpath = "//body/div[@id='error-not-found']/div[1]/div[1]/p[1]")
	private WebElement shopCartMessage;
	
	public String shoppingCartMessage() {
		String message = shopCartMessage.getText();
		return message;
	}
		
	
		
	}
	

