package com.comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverObjects {

public WebDriver driver;
	
	public HoverObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@data-dropdown-rel='birthday-gifts']")
	WebElement NavElement;
	
	@FindBy(xpath="//*[@id=\'myheader\']/div[1]/div/div/ul/li[10]/ul/li[3]/a")
	WebElement selectItem;
	
	@FindBy(xpath="//h1[contains(text(),'Birthday Gifts for Kids')]")
	WebElement subpage_visiblity;
	
	public WebElement Hover_select() {
		return NavElement;
	}

	public WebElement Select_Item() {
		return selectItem;
	}
	
	public WebElement Page_Loaded() {
		return subpage_visiblity;
	}
	
}
