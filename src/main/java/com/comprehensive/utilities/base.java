package com.comprehensive.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class base {

	baseData readData=new baseData();
	
	public static WebDriver driver;
	
	public static ExtentReports extent;

	public static ExtentTest test;

	public String url = readData.getApplicationURL();
	
	public String browser=readData.getBrowser();
	@BeforeSuite
	public WebDriver initalizeDriver()
	{			
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readData.getChromePath());
			driver=new ChromeDriver();
			System.out.println(driver);
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readData.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readData.getIEPath());
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		ExtentReporterNg obj = new ExtentReporterNg();
		extent = obj.getRepo();
		return driver;
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
		
	}
	
	
		public static String getscreenshotpath(String TestCaseName) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		String target = (System.getProperty("user.dir") + "/Screenshots/" + TestCaseName+ System.currentTimeMillis() + ".png");
		File file=new File(target);
		FileUtils.copyFile(source, file);
		return target;
	}
	

	
	
}
