package com.tuitionApp.testCases;

import java.sql.SQLException;

import org.asynchttpclient.util.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tuitionApp.pageObjects.HomePage;
import com.tuitionApp.pageObjects.LoginPage;
import utilities.DBValidation;

public class HomePageTestCases extends BaseClass {

	DBValidation dbvalidation = new DBValidation();
	HomePage hp;
	LoginPage lp;

	@Test(enabled = true)
	public void validatPageHeader() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "123*1");
		hp = new HomePage(driver);
		String actual = hp.verifyPageHeading();
		String expected = "Tuition Application";
		Assert.assertEquals(actual, expected, "Page heading not as expected");
	}

	@Test(enabled = true)
	public void validateAddEmp() {
		lp = new LoginPage(driver);
		lp.performLogin("admin", "123*1");
		hp = new HomePage(driver);
		hp.AddUser("Jins", "jins1356@gmail.com", "123456789", "50");

	}

	@Test(enabled = false)
	public void testUserExistsInDatabase() throws SQLException {
		String first_name = "Jins";
		boolean userExists = dbvalidation.isUserExists(first_name);
		Assert.assertTrue(userExists, "User should exist in the database.");
	}

	@Test(enabled = false)
	public void verifyPageHeader() {
	}

	@Test(enabled = false)
	public void verifyTableHeaders() {
	}

	@Test(enabled = false)
	public void validateUpdateEmployee() {
	}
}
