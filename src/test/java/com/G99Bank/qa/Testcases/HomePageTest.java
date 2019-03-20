package com.G99Bank.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.G99Bank.qa.base.TestBase;
import com.G99Bank.qa.pages.EditCustomerPage;
import com.G99Bank.qa.pages.HomePage;
import com.G99Bank.qa.pages.LogIn;
import com.G99Bank.qa.pages.NewCustomerPage;

public class HomePageTest extends TestBase {
	LogIn login;
	HomePage homepage;
	NewCustomerPage newcustomerpage;
	EditCustomerPage editcustomerpage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		intialization();
		login = new LogIn();
		homepage = login.login(prop.getProperty("userid"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void VerifyHomePageTitleTest() {
		String title = homepage.verifyHomePageTitle();
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage", "Title Mismatches");
	}
	
	@Test(priority=2)
	public void verifyUserCredTest() {
		boolean usercred = homepage.verifyUser();
		Assert.assertTrue(usercred, "User Credentials are not displaying");
	}
	
	@Test(priority=3)
	public void ClickOnNewCustomerLinkTest() {
		newcustomerpage = homepage.clickOnNewCustomerLink();
	}
	
	@Test(priority=4)
	public void ClickOnEditCustomerLinkTest() {
		editcustomerpage = homepage.clickOnEditCustomerLink();
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
