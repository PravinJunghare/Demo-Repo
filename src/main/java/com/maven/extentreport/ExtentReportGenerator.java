package com.maven.extentreport;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;


public class ExtentReportGenerator 
{
	
	public static ExtentReports getExtentReportInstance()
	{
		Date date =new Date();
	    String finalCurrentDatepath=System.getProperty("user.dir")+"//Reports//"+date.toString().replace(" ", "_").replace(":", "_");
		ExtentReports eReports=new ExtentReports(finalCurrentDatepath, false, DisplayOrder.NEWEST_FIRST);
	    File file =new File("Reports_Config_xml");
	    eReports.loadConfig(file);
	    eReports.addSystemInfo("Environment Info", "QA").addSystemInfo("Automation Tool", "Selenium").addSystemInfo("Selenium Version", "3.14");
		return eReports;
	
	}

}
