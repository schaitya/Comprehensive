package com.comprehensive.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class baseData {

	Properties pro;
	
	public baseData()
	{
		File src = new File("./Data/data.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getBrowser()
	{
		String browser=pro.getProperty("browser");
		return browser;
	}
	public String Excel()
	{
		String excel=pro.getProperty("Excel_Location");
		return excel;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	
}




