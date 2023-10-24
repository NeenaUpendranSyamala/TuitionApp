package com.tuitionApp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tuitionApp.pageObjects.LoginPage;

public class LoginTestCases extends BaseClass {

	LoginPage lp;

	@Test(enabled = true)
	public void verifyLogin() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "123*1");
		if (driver.getTitle().equals("TuiTion")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
