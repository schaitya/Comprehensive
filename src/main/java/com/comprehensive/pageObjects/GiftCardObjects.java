package com.comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GiftCardObjects{
	
public WebDriver driver;
	
	public GiftCardObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
//	Home Page Gift Card Object
	@FindBy(xpath="//a[@href='https://www.bigsmall.in/products/gift-card']")
	WebElement gift_card;
	
//	Gift card add to cart object
	@FindBy(xpath="//button[@name='add']")
	WebElement addtocart;
	
//	Checkout Button on Gift card page
	@FindBy(xpath="//button[@name='checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//img[@class=\"wa-optin-widget-close-img\"]")
	WebElement popupClose;

	@FindBy(xpath="//th[@class='product__description']/span")
	WebElement payPro;
	
	public WebElement getGift_card() {
		return gift_card;
	}

	public WebElement getAddToCart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getPopupClose() {
		return popupClose;
	}

	public WebElement getPayPro() {
		return payPro;
	}
	
	
	
	

}
