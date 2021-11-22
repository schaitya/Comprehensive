package com.comprehensive.testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.comprehensive.pageObjects.LoginPageObjects;
import com.comprehensive.utilities.base;
import com.comprehensive.utilities.baseData;

public class LoginTest extends base {
	baseData readconfig = new baseData();
	// Properties prop;
	public String excel = readconfig.Excel();

	public static Logger log = LogManager.getLogger(base.class.getName());

	@Test
	public void Loginpage() throws IOException, InterruptedException {
		LoginPageObjects lp = new LoginPageObjects(driver);

		driver.get(url);

		lp.Login_click().click();
		log.info("Login Page loaded successfully");
		test.info("Login Page loaded successfully");

		File scr1 = new File(excel);
		FileInputStream fis1 = new FileInputStream(scr1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);

		XSSFSheet sheet = workbook.getSheetAt(0);

		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Row secondRow = rows.next();

		Iterator<Cell> ce1 = firstRow.cellIterator();
		ce1.next();
		String email = ce1.next().getStringCellValue();

		Iterator<Cell> ce2 = secondRow.cellIterator();
		ce2.next();
		String password = ce2.next().getStringCellValue();

		lp.Email().sendKeys(email);
		log.info("Email entered successfully");
		test.info("Email entered successfully");

		lp.Password().sendKeys(password);
		log.info("password entered successfully");
		log.info("password entered successfully");

		Thread.sleep(5000l);
		lp.Sign_in().click();
		Thread.sleep(5000l);

		assertEquals("Challenge– Bigsmall.in", driver.getTitle());
		log.info("user navigated to login verification");
		test.info("user navigated to login verification");

		lp.getLogOut().click();
		workbook.close();
	}

}
