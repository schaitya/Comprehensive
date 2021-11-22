package com.comprehensive.testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.HoverObjects;
import com.comprehensive.utilities.base;

public class Hoveraction_TC extends base {
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	
	@Test
	public void Hover() throws IOException, InterruptedException{
		driver.get(url);
		
		HoverObjects hoverObject=new HoverObjects(driver);
		Actions a=new Actions(driver);
		
		a.moveToElement(hoverObject.Hover_select()).build().perform();
		log.info("Hover performed successfully");
		test.info("Hover performed successfully");
		
		Thread.sleep(3000l);
		hoverObject.Select_Item().click();
		Thread.sleep(2000l);
		
		Assert.assertTrue(hoverObject.Page_Loaded().isDisplayed());
		log.info("desired page loaded successfully");
		test.info("desired page loaded successfully");

		
  }
}
