package com.G99Bank.qa.Testcases;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.G99Bank.qa.base.TestBase;
import com.G99Bank.qa.pages.HomePage;
import com.G99Bank.qa.pages.LogIn;
import com.G99Bank.qa.pages.NewCustomerPage;
import com.G99Bank.qa.test.Xls_Reader1;
import com.G99Bank.qa.util.TestUtil;

public class NewCustomerPageTest extends TestBase{
	
	LogIn login;
	HomePage homepage;
	NewCustomerPage newcustomer;
	
	static String sheetName = "Sheet2";
	
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
		Assert.assertEquals(title,"Guru99 Bank New Customer Entry Page");
	}
	
	@Test(priority=2)
	public void verifyAddCustomertextTest() {
		boolean b = newcustomer.AddCustomerText();
		Assert.assertTrue(b, "add customer text is not displayed");
	}
	
	@DataProvider
	public Object[][] getNewCustomerData() {
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=3, dataProvider = "getNewCustomerData")
	public void validateNewCustomerForm(String customername, String gen, String DoB, String Addr, 
			String CITY, String STATE, String pinnumber, String phonenumber, String mailid, String pd) {
		
		/*newcustomer.CreateNewCustomer("amirsyed", "m", "22/11/1997", "Jaipur", "Jaipur", "Rajasthan",
				"302017", "9065781234", "amir.syed@gmail.com", "amirsyed123");*/
		newcustomer.CreateNewCustomer(customername, gen, DoB, Addr, CITY, STATE, pinnumber, phonenumber, mailid, pd);
		
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
