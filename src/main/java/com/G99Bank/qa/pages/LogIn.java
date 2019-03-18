package com.G99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.G99Bank.qa.base.TestBase;

public class LogIn extends TestBase{
	
	@FindBy(name="uid")
	WebElement UserID;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath = "//img[@src='/logo.png']")
	WebElement G99logo;
	
	public LogIn() {
			PageFactory.initElements(driver, this);
	}
	
	public String ValidateLogInPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateLogo() {
		return G99logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		UserID.sendKeys(un);
		Password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}

}
