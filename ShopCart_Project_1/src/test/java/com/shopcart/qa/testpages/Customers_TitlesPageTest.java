package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.CustomersPage;
import com.shopcart.qa.pages.Customers_TitlesPage;
import com.shopcart.qa.pages.Dashboard;
import com.shopcart.qa.util.TestUtil;

public class Customers_TitlesPageTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard dashboard;
	CustomersPage customersPage;
	Customers_TitlesPage customers_TitlesPage;
	
	public Customers_TitlesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setEnv()
	{
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		customers_TitlesPage = dashboard.ClickOnCustomersLink().ClickOnTitles();
	}
	
	@Test(priority=1)
	public void verifyCurrentTitleTest()
	{
		String actual = customers_TitlesPage.verifyCurrentTitle();
		String expected = "Titles • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=2)
	public void verifyCustomersTextTest()
	{
		String actual = customers_TitlesPage.verifyCustomersText();
		String expected = "Customers";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=3)
	public void ClickOnCustomersTextTest()
	{
		customers_TitlesPage.ClickOnCustomersText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=4)
	public void verifyTitlesTextTest()
	{
		String actual = customers_TitlesPage.verifyTitlesText();
		String expected = "Titles";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=5)
	public void ClickOnTitleTextTest()
	{
		customers_TitlesPage.ClickOnTitleText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=6)
	public void verifyTitlesPageTitleTest()
	{
		String actual = customers_TitlesPage.verifyTitlesPageTitle();
		String expected = "Titles";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=7)
	public void verifyAddNewIconTest()
	{
		boolean icon = customers_TitlesPage.verifyAddNewIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Diaplayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=8)
	public void Check_AddNewIcon_ColorTest()
	{
		customers_TitlesPage.Check_AddNewIcon_Color();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=9)
	public void ClickOnAddNewTitleIconTest()
	{
		customers_TitlesPage.ClickOnAddNewTitleIcon();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=10)
	public void verifyAddNewTitleTextTest()
	{
		String actual = customers_TitlesPage.verifyAddNewTitleText();
		String expected = "Add new title";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=11)
	public void ClickOnAddNewTitleTextTest()
	{
		customers_TitlesPage.ClickOnAddNewTitleText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=12)
	public void verifyPanelHeadingTest()
	{
		String actual = customers_TitlesPage.verifyPanelHeading();
		String expected = "Add new contact";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=13)
	public void verifySaveBtnTest()
	{
		boolean icon = customers_TitlesPage.verifySaveBtn();
		Assert.assertTrue(icon);
		log.info("Is Icon Diaplayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=14)
	public void Check_SaveBtn_ColorTest()
	{
		customers_TitlesPage.Check_SaveBtn_Color();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=15)
	public void ClickOnSaveBtnTest()
	{
		customers_TitlesPage.ClickOnSaveBtn();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=16)
	public void verifyCancelBtnTest()
	{
		boolean icon = customers_TitlesPage.verifyCancelBtn();
		Assert.assertTrue(icon);
		log.info("Is Icon Diaplayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=17)
	public void Check_CancelBtn_ColorTest()
	{
		customers_TitlesPage.Check_CancelBtn_Color();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=18)
	public void ClickOnCancelBtnTest()
	{
		customers_TitlesPage.ClickOnCancelBtn();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@DataProvider
	public Object [][] getAddNewTitle()
	{
		Object data [][] = TestUtil.getTestData("AddNewTitle");
		return data;
	}	
	
	
	@Test(priority=19 , dataProvider = "getAddNewTitle")	
	public void AddNewTitle(String title )
	{
		customers_TitlesPage.AddNewTitle(title);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------	

	@Test(priority=20)
	public void DeleteTitleItemTest() 
	{
		customers_TitlesPage.DeleteTitleItem();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
