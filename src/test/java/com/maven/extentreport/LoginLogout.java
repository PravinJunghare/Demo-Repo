package com.maven.extentreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LoginLogout extends Base
{
	
	@Test
public void loginLogout()

{
	
	eTest=eReport.startTest("Get App Title");
	  eTest.log(LogStatus.INFO,"Launching the browser");
	  driver=new ChromeDriver();
	  eTest.log(LogStatus.INFO,"Setting the timeouts");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  eTest.log(LogStatus.INFO,"maximize the browser");
	  driver.manage().window().maximize();
	  eTest.log(LogStatus.INFO,"Navigating to Test Url");
	  driver.get("https://demo.actitime.com");

}
}