package com.comprehensive.testCases;

import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.HeaderLink;
import com.comprehensive.utilities.base;

public class HeaderLink_TC extends base{
	
	public static Logger log= LogManager.getLogger(base.class.getName());
	@Test
	public void HeaderLinks() throws InterruptedException
	{
		HeaderLink hl=new HeaderLink(driver);
		driver.get(url);
		
		WebElement con=hl.Links();
//		log.info("Number of links present in the page are"+n);
//		test.info("Number of links present in the page are"+n);
		
		 //clicking on the link separately
        for(int i=1;i<5;i++)
        {
        	String keytab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        	con.findElements(By.tagName("a")).get(i).sendKeys(keytab);
//        	log.info(driver.getTitle());
//        	test.info(driver.getTitle());

        }
        
        Thread.sleep(5000L);
        
      //getting all tabs title
        Set<String> ab=driver.getWindowHandles();
        Iterator<String> it=ab.iterator();
        while(it.hasNext())
        {
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
//        	log.info(driver.getTitle());
//        	test.info(driver.getTitle());
        }
        

	}
}
