package com.G99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.G99Bank.qa.base.TestBase;

public class NewCustomerPage extends TestBase {
	
	@FindBy(xpath = "//p[text()='Add New Customer']")
	WebElement AddNewCustomerText;
	
	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean AddCustomerText() {
		return AddNewCustomerText.isDisplayed();
	}
	
	public String NewCustomerTitle() {
		return driver.getTitle();
	}
	

}
