package com.comprehensive.testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.Cart_Checkout;
import com.comprehensive.utilities.base;

public class CartCheckout_TC extends base{
	
public static Logger log= LogManager.getLogger(base.class.getName());
	
	@Test
	public void cartcheckout() throws IOException, InterruptedException{
		driver.get(url);
		Cart_Checkout cart=new Cart_Checkout(driver);
		cart.Cart().click();
		log.info("Navigated to cart");
		test.info("Navigated to cart");
		cart.product_selection().click();
		cart.Add_cart().click();
		log.info("Product added to cart successfully");
		test.info("Product added to cart successfully");
		cart.Go_Checkout().click();
		cart.Remove_whatsappimg().click();
		Assert.assertTrue(cart.continuebutton().isDisplayed());
		log.info("successfully navigated to the checkout page");
		test.info("successfully navigated to the checkout page");

	}
	}
