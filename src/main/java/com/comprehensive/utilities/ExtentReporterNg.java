package com.comprehensive.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//Listener class used to generate repo reports

public class ExtentReporterNg
{
	ExtentReports repo;
	 
	public ExtentReporterNg()
	{
		String path=System.getProperty("user.dir")+ "\\Project reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("bigsmall automation report");
		reporter.config().setDocumentTitle("Test result");
		
		repo= new ExtentReports();
		repo.attachReporter(reporter);
		repo.setSystemInfo("Tester","Chaitya");
		
	}

	public ExtentReports getRepo() {
		return repo;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
