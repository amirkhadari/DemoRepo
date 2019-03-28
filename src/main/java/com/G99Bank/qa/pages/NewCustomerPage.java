package com.G99Bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.G99Bank.qa.base.TestBase;

public class NewCustomerPage extends TestBase {
	
	@FindBy(xpath = "//p[text()='Add New Customer']")
	WebElement AddNewCustomerText;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement custname;
	@FindBy(xpath ="//input[@value='f']")
	WebElement female;
	@FindBy(id="dob")
	WebElement birth;
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pinno;
	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement telephoneno;
	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailid;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='sub']")
	WebElement sub;
	
	
	
	
	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean AddCustomerText() {
		return AddNewCustomerText.isDisplayed();
	}
	
	public String NewCustomerTitle() {
		return driver.getTitle();
	}
	
	public void CreateNewCustomer(String name, String gender, String db, String adrs,
			String cit, String sta, String pno, String tno, String id, String pwd) {
		
		custname.sendKeys(name);
		if(gender.equals("f")) {
			female.click();
		}
		birth.sendKeys(db);
		address.sendKeys(adrs);
		city.sendKeys(cit);
		state.sendKeys(sta);
		pinno.sendKeys(pno);
		telephoneno.sendKeys(tno);
		emailid.sendKeys(id);
		password.sendKeys(pwd);
		
		sub.click();
	}

}
