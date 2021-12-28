package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class IccRankingsTest {
	
	@Test
	public void iccRankingTest() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("start-maximized");
		Thread.sleep(3000);
		
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement team = driver.findElement(By.xpath("//tr[@class=\"table-body\"]/descendant::span[text()=\"Afghanistan\"]"));
		System.out.println(team.getText());
		//driver.findElement(null)
		
	}

}
