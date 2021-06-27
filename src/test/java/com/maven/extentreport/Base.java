package com.maven.extentreport;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base 
{

	static ExtentReports eReport= ExtentReportGenerator.getExtentReportInstance();
	ExtentTest eTest;
	WebDriver driver;
}
