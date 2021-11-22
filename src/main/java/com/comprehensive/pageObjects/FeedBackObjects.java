package com.comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedBackObjects{
	public WebDriver driver;
	
	public FeedBackObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Contact us')][1]")
	WebElement contactus;
	@FindBy(xpath="//input[@name='contact[name]']")
	WebElement Name;
	@FindBy(xpath="//input[@name='contact[email]']")
	WebElement Email;
	@FindBy(xpath="//textarea[@name='contact[body]']")
	WebElement Message;
	@FindBy(xpath="//button[contains(text(),'Send')][1]")
	WebElement send;

	@FindBy(xpath="	//p[@class='note note--success']")
	WebElement sending_confirmation;
	
	public WebElement Contact_us() {
		return contactus;
	}	
	public WebElement Name() {
		return Name;
	}
	public WebElement EmailID() {
		return Email;
	}
	public WebElement MessageBox() {
		return Message;
	}
	public WebElement Send() {
		return send;
	}
	public WebElement Sending_confirmation() {
		return sending_confirmation;
	}
}
