package com.tuitionApp.testCases;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tuition-web.azurewebsites.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@Test(enabled = false)
	public void test()
	{
		Assert.isTrue(true,"tested");
	}

}
