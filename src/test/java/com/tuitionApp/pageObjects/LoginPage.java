package com.tuitionApp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
	}
	
	//web elements
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement SignInBtn;
	
	public void performLogin(String usr,String pwd) {
		 username.sendKeys(usr);
		 password.sendKeys(pwd);
		 SignInBtn.click();
	}

}
