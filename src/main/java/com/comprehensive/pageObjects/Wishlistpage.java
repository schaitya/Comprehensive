package com.comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {

public WebDriver driver;
	
	public Wishlistpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-product-id='6917229019334']")
	WebElement product;
	
	@FindBy(xpath="//span[contains(text(),'Add to Wishlist')]")
	WebElement Add_wishlist;
	
	@FindBy(xpath="//span[contains(text(),'wish list')]")
	WebElement wishlist;
	
	@FindBy(xpath="//button[@id='swym-welcome-button']")
	WebElement accessWishList;
	
	@FindBy(xpath="//a[@class='swym-link']")
	WebElement Product_visibility;
	
	public WebElement Product_click() {
		return product;
	}
	public WebElement Add_wishlist() {
		return Add_wishlist;
	}
	public WebElement Wishlist_click() {
		return wishlist;
	}
	public WebElement AcessTab_click() {
		return accessWishList;
	}

	public WebElement Product_visibility() {
		return Product_visibility;
	}
}
