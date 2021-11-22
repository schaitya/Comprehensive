package com.comprehensive.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.Wishlistpage;
import com.comprehensive.utilities.base;

public class Wishlistpage_TC extends base{
		
	public static Logger log= LogManager.getLogger(base.class.getName());
		@Test
		public void wishlist() throws InterruptedException
		{
			Wishlistpage wp=new Wishlistpage(driver);
			driver.get(url);
			Thread.sleep(2000);
			wp.Product_click().click();
			wp.Add_wishlist().click();
//			log.info("Product added to wishlist");
//			test.info("Product added to wishlist");
			wp.Wishlist_click().click();
			Thread.sleep(2000);
			wp.AcessTab_click().click();
//			log.info("Wishlist page loaded successfully");
//			test.info("Wishlist page loaded successfully");
			Assert.assertTrue(wp.Product_visibility().isDisplayed());
//			log.info("Wishlist page loaded and product visibility in wishlist verified");
//			test.info("Wishlist page loaded and product visibility in wishlist verified");
		}
}
