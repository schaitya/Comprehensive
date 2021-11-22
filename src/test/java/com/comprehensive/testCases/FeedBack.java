package com.comprehensive.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.FeedBackObjects;
import com.comprehensive.utilities.base;

public class FeedBack extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void ContactPage() throws InterruptedException {
		
		FeedBackObjects cp = new FeedBackObjects(driver);
		driver.get(url);
		
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
		
		cp.Name().sendKeys("HD Shah");
		cp.EmailID().sendKeys("coolc16@outlook.com");
		cp.MessageBox().sendKeys("This is for contact page");
		
		Thread.sleep(3000);
		cp.Send().click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");

	}
}
