package com.comprehensive.testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.AllproductTab;
import com.comprehensive.utilities.base;

public class AllproductTab_TC extends base{
	
public static Logger log= LogManager.getLogger(base.class.getName());
	
	@Test
	public void AllTab() throws IOException, InterruptedException{
		driver.get(url);
		AllproductTab Apt=new AllproductTab(driver);
		Apt.AllTab().click();
		log.info("All tab clicked and page loaded");
		test.info("All tab clicked and page loaded");
		Apt.Next_navigation().click();
		log.info("navigated to 2nd page");
		test.info("navigated to 2nd page");
		Assert.assertTrue(Apt.Product_visibility().isDisplayed());
		log.info("Product is successfully displayed");
		test.info("Product is successfully displayed");

	
	}
}
