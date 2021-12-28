package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport_CreateTest {
	
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeSuite
	public void setUpExtend()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		driver=new ChromeDriver();
		
		String dirpath = System.getProperty("user.dir");
		String extentpath = dirpath+"/SDET2Extent.html";
		
		reporter=new ExtentHtmlReporter(extentpath);
		reporter.config().setDocumentTitle("Vtiger");
		reporter.config().setTheme(Theme.DARK);
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		
		reports.setSystemInfo("Tester", "Steef");
		reports.setSystemInfo("Env", "Window 10");
		reports.setSystemInfo("Build", "5.4.0");
		reports.setSystemInfo("Browser Version", "91");
		
	}
	
	@Test
	public void launch_fb()
	{
		test=reports.createTest("launch_fb");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "facebook");
		
	}
	
	@Test
	public void launch_Vtiger()
	{
		test=reports.createTest("launch_Vtiger");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		String title = driver.getTitle();
		Assert.assertEquals(true, true);
	}
	
	@AfterSuite
	public void closeSetup()
	{
		reports.flush();
	}


}
