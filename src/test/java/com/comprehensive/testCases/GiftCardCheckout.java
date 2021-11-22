package com.comprehensive.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.GiftCardObjects;
import com.comprehensive.utilities.base;

public class GiftCardCheckout extends base {


	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@Test
	public void AddGift() throws IOException, InterruptedException{
		System.out.println("gift card");
		driver.get(url);
		GiftCardObjects gfcard=new GiftCardObjects(driver);
		gfcard.getGift_card().click();
		test.info("navigated to Add giftcard section");
		log.info("navigated to Add giftcard section");
		gfcard.getAddToCart().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gfcard.getCheckout().click();
		gfcard.getPopupClose().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertEquals(gfcard.getPayPro().getText(), "Gift Card");
		log.info("Gift card checkout Successfully");
		test.info("Gift card checkout Successfully");
		

		
}
}
