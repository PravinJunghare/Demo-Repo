package com.maven.extentreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class AppGetTitle extends Base
{
	
	String expTitle="actTIME-Vie";
  @Test
  public void appGetTitle()
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
	  eTest.log(LogStatus.INFO,"Enter the username");
	  driver.findElement(By.id("username")).sendKeys("admin");
	  eTest.log(LogStatus.INFO,"Enter the password");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  eTest.log(LogStatus.INFO,"click on loginbutton");
	  driver.findElement(By.xpath("//a[@ id='loginButton']")).click();
	  driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
	  eTest.log(LogStatus.INFO,"Getting The tilte");
	  String actTitle=driver.getTitle();
	  eTest.log(LogStatus.INFO,"Validation of title");
	 
	  
	  
  }
}
