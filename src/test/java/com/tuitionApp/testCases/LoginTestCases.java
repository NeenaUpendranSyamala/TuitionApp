package com.tuitionApp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tuitionApp.pageObjects.LoginPage;

import utilities.Constants;

public class LoginTestCases extends BaseClass {

	LoginPage lp;

	@Test(enabled = true)
	public void verifyLogin() {
		lp = new LoginPage(driver);
		lp.performLogin(Constants.USER, Constants.PASSWORD);
		if (driver.getTitle().equals("TuiTion")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
