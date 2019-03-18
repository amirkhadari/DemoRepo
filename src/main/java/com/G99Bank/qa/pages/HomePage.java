package com.G99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.G99Bank.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[text()='Manger Id : mngr180839']")
	WebElement UserCred;
	
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement NewCustomerLink;
	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement EditCustomerLink;
	
	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement DeleteCustomerLink;
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement NewAccountLink;
	
	@FindBy(xpath="//a[text()='Edit Account']")
	WebElement EditAccountLink;
	
	@FindBy(xpath="//a[text()='Delete Account']")
	WebElement DeleteAccountLink;
	
	@FindBy(xpath="//a[text()='Deposit']")
	WebElement DepositLink;
	
	@FindBy(xpath="//a[text()='Withdrawal']")
	WebElement WithdrawalLink;
	
	@FindBy(xpath="//a[text()='Fund Transfer']")
	WebElement FundTransferLink;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement ChangePasswordLink;
	
	@FindBy(xpath="//a[text()='Balance Enquiry']")
	WebElement BalanceEnquiryLink;
	
	@FindBy(xpath="//a[text()='Mini Statement']")
	WebElement MiniStatementLink;
	
	@FindBy(xpath="//a[text()='Customised Statement']")
	WebElement CustomisedStatementLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUser() {
		return UserCred.isDisplayed();
	}
	
	public NewCustomerPage clickOnNewCustomerLink() {
		NewCustomerLink.click();
		return new NewCustomerPage();
	}
	
	public EditCustomerPage clickOnEditCustomerLink() {
		EditCustomerLink.click();
		return new EditCustomerPage();
	}
	
	public DeleteCustomerPage clickOnDeleteCustomerLink() {
		DeleteCustomerLink.click();
		return new DeleteCustomerPage();
	}

}
