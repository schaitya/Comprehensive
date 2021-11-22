package com.comprehensive.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//header//a[@href='/account/login']")
	WebElement login;
	
	@FindBy(xpath="//input[@id='CustomerEmail']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='CustomerPassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	WebElement signinbutton;
	
	@FindBy(id="customer_logout_link")
	WebElement logOut;
	
	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement Login_click()
	{
		return login;
	}
	
	public WebElement Email()
	{
		return emailid;
		
	}
	public WebElement Password()
	{
		return password;
		
	}
	
	public WebElement Sign_in()
	{
		return signinbutton;
		
	}
//	public WebElement Login_validate()
//	{
//		return login_validate;
//		
//	}
}
