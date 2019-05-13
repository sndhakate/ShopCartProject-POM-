package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.CustomersPage;
import com.shopcart.qa.pages.Customers_ContactsPage;
import com.shopcart.qa.pages.Dashboard;
import com.shopcart.qa.util.TestUtil;

public class Customers_ContactsPageTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard dashboard;
	CustomersPage customersPage;
	Customers_ContactsPage customers_ContactsPage;
	
	public Customers_ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setEnv()
	{
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		customers_ContactsPage = dashboard.ClickOnCustomersLink().ClickOnContacts();
	}
	
		
	@Test(priority=1)
	public void verifyCurrentUrlTitleTest()
	{
		String actual = customers_ContactsPage.verifyCurrentUrlTitle();
		String expected = "Contacts • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=2)
	public void verifyCustomersTextTest()
	{
		String actual = customers_ContactsPage.verifyCustomersText();
		String expected = "Customers";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=3)
	public void ClickOnCustomersTextTest()
	{
		customers_ContactsPage.ClickOnCustomersText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=4)
	public void verifyContactsTextTest()
	{
		String actual = customers_ContactsPage.verifyContactsText();
		String expected = "Contacts";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=5)
	public void ClickOnContactsTextTest()
	{
		customers_ContactsPage.ClickOnContactsText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=6)
	public void verifyContactsPageTitleTest()
	{
		String actual = customers_ContactsPage.verifyContactsPageTitle();
		String expected = "Contacts";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=7)
	public void verifyAddNewContactIconTest()
	{
		boolean icon = customers_ContactsPage.verifyAddNewContactIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Diaplayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=8)
	public void Check_AddNewContactIcon_ColorTest()
	{
		customers_ContactsPage.Check_AddNewContactIcon_Color();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=9)
	public void ClickOnAddNewContactIconTest()
	{
		customers_ContactsPage.ClickOnAddNewContactIcon();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=10)
	public void verifyAddNewContactTextTest()
	{
		String actual = customers_ContactsPage.verifyAddNewContactText();
		String expected = "Add new contact";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=11)
	public void ClickOnAddNewContactTextTest()
	{
		customers_ContactsPage.ClickOnAddNewContactText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=12)
	public void verifyPanelHeadingTest()
	{
		String actual = customers_ContactsPage.verifyPanelHeading();
		String expected = "Add new contact";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=13)
	public void verifySaveBtnTest()
	{
		boolean icon = customers_ContactsPage.verifySaveBtn();
		Assert.assertTrue(icon);
		log.info("Is Icon Diaplayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=14)
	public void Check_SaveBtn_ColorTest()
	{
		customers_ContactsPage.Check_SaveBtn_Color();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=15)
	public void ClickOnSaveBtnTest()
	{
		customers_ContactsPage.ClickOnSaveBtn();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=16)
	public void verifyCancelBtnTest()
	{
		boolean icon = customers_ContactsPage.verifyCancelBtn();
		Assert.assertTrue(icon);
		log.info("Is Icon Diaplayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=17)
	public void Check_CancelBtn_ColorTest()
	{
		customers_ContactsPage.Check_CancelBtn_Color();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=18)
	public void ClickOnCancelBtnTest()
	{
		customers_ContactsPage.ClickOnCancelBtn();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@DataProvider
	public Object [][] getAddNewContact()
	{
		Object data [][] = TestUtil.getTestData("AddNewContact");
		return data;
	}	
	
	
	@Test(priority=19 , dataProvider = "getAddNewContact")	
	public void AddNewContact(String name, String emailid , String description )
	{
		customers_ContactsPage.AddNewContact(name, emailid, description);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
