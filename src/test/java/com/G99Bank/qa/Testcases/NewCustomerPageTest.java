package com.G99Bank.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.G99Bank.qa.base.TestBase;
import com.G99Bank.qa.pages.HomePage;
import com.G99Bank.qa.pages.LogIn;
import com.G99Bank.qa.pages.NewCustomerPage;

public class NewCustomerPageTest extends TestBase{
	
	LogIn login;
	HomePage homepage;
	NewCustomerPage newcustomer;
	public NewCustomerPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		login = new LogIn();
		homepage = new HomePage();
		newcustomer = new NewCustomerPage();
		login.login(prop.getProperty("userid"), prop.getProperty("password"));
		homepage.clickOnNewCustomerLink();
	}
	@Test(priority=1)
	public void VerifyNewCustomerTitleTest() {
		String title = newcustomer.NewCustomerTitle();
		//Assert.assertEquals(title,"Guru99 Bank New Customer Entry Page");
	}
	
	@Test(priority=2)
	public void verifyAddCustomertextTest() {
		boolean b = newcustomer.AddCustomerText();
		Assert.assertTrue(b, "add customer text is not displayed");
	}
	
	
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
