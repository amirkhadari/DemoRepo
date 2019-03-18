package com.G99Bank.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.G99Bank.qa.base.TestBase;
import com.G99Bank.qa.pages.HomePage;
import com.G99Bank.qa.pages.LogIn;

public class HomePageTest extends TestBase {
	LogIn login;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod()
	public void setUp() {
		intialization();
		login = new LogIn();
		homepage = new HomePage();
		login.login(prop.getProperty("userid"), prop.getProperty("password"));
	}
	
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
