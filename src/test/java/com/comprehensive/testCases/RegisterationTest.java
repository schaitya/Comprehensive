package com.comprehensive.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;

import com.comprehensive.pageObjects.RegisterationObjects;
import com.comprehensive.utilities.base;

public class RegisterationTest extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@Test(dataProvider = "getData")
	public void register(String fname,String lname,String email,String pass) throws IOException, InterruptedException {
		driver.get(url);
		RegisterationObjects obj = new RegisterationObjects(driver);
		obj.getLogin().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		obj.getRegister().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		obj.getfName().sendKeys(fname);
		obj.getlName().sendKeys(lname);
		obj.getEmail().sendKeys(email);
		obj.getPass().sendKeys(pass);
		Thread.sleep(3000l);
		obj.getSubmit().click();
		Thread.sleep(3000l);
		String title = "Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in";
		assertEquals(driver.getTitle(), title);
		
		System.out.println("control i before");
		obj.getAccount().click();
		System.out.println("control i after");

		Thread.sleep(1000l);
		obj.getLogOut().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][4];

		data[0][0] = "chaitya";
		data[0][1] =  "shah";
		data[0][2] = "case1@gmail.com";
		data[0][3] = "12345678";			

		data[1][0] = "12";
		data[1][1] =  "2";
		data[1][2] = "case2@hello.com";
		data[1][3] = "heyggygo123";	

		return data;
	}

}
