package com.comprehensive.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.rolling.action.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.Homepage;
import com.comprehensive.utilities.base;

public class Homepage_TC extends base
{
	public static Logger log= LogManager.getLogger(base.class.getName());
	@Test
	public void Homepage() throws InterruptedException
	{
		Homepage hp=new Homepage(driver);
		driver.get(url);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertTrue(hp.Homepage_logo().isDisplayed());

		
		
	}
	
}