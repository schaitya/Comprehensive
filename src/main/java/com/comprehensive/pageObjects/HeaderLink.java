package com.comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderLink {
	
public WebDriver driver;
	
	public HeaderLink(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='myheader']/div[1]/div")
	WebElement Link;
	
	public WebElement Links() {
		return Link;
	}
}
