package com.G99Bank.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.G99Bank.qa.base.TestBase;
import com.G99Bank.qa.pages.HomePage;
import com.G99Bank.qa.pages.LogIn;

public class LoginPageTest extends TestBase{
	
	LogIn loginp;
	HomePage homepage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		intialization();
		loginp = new LogIn();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title = loginp.ValidateLogInPageTitle();
		Assert.assertEquals(title, "Guru99 Bank Home Page");
	}
	
	@Test(priority=2)
	public void G99LogoTest() {
		boolean logo = loginp.ValidateLogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=3)
	public void logintest() {
		homepage = loginp.login(prop.getProperty("userid"), "password");
	}
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	} 

}