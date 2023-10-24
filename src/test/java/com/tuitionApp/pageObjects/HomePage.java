package com.tuitionApp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;
		
	public HomePage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//p[text()='Tuition Application']")
	WebElement pageHeader;
	
	@FindBy(xpath ="//button[text()='Add']")
	WebElement AddBtn;
	
	
	@FindBy(xpath ="//tbody/tr[@class='bg-green-100']/td[2]/input[1]")
	WebElement nameInpt;
	
	
	@FindBy(xpath ="//tbody/tr[@class='bg-green-100']/td[3]/input[1]")
	WebElement emailInpt;
	
	@FindBy(xpath ="//tbody/tr[@class='bg-green-100']/td[4]/input[1]")
	WebElement cellphnInpt;
	
	@FindBy(xpath ="//tbody/tr[@class='bg-green-100']/td[5]/input[1]")
	WebElement hrlywageInpt;
	
	@FindBy(xpath ="//button[text()='Save']")
	WebElement saveBtn;
	
	
	public String verifyPageHeading() {
		 return pageHeader.getText();
	}
	
	public void AddUser(String name, String email, String cellphn,String hrlywage) {
		AddBtn.click();
		nameInpt.sendKeys(name);
		emailInpt.sendKeys(email);
		cellphnInpt.sendKeys(cellphn);
		hrlywageInpt.sendKeys(hrlywage);
		saveBtn.click();
	}
	
	
	
}