package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.CustomersPage;
import com.shopcart.qa.pages.Customers_GroupsPage;
import com.shopcart.qa.pages.Dashboard;

public class Customers_GroupsPageTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard dashboard;
	CustomersPage customersPage;
	Customers_GroupsPage customers_GroupsPage;
	

	public Customers_GroupsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setEnv()
	{
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		customers_GroupsPage = dashboard.ClickOnCustomersLink().ClickOnGroups();
		
	}
	
	@Test(priority=1)
	public void verifyCurrentTitleTest()
	{
		String actual = customers_GroupsPage.verifyCurrentTitle();
		String expected = "Groups • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=2)
	public void verifyGroupsTextTest()
	{
		String actual = customers_GroupsPage.verifyGroupsText();
		String expected = "Groups";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=3)
	public void ClickOnGroupsTextTest()
	{
		customers_GroupsPage.ClickOnGroupsText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=4)
	public void verifyGroupsPageTitleTest()
	{
		String actual = customers_GroupsPage.verifyGroupsPageTitle();
		String expected = "Groups";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=5)
	public void verifyAddNewIconTest()
	{
		boolean icon = customers_GroupsPage.verifyAddNewIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Displayed :" + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=6)
	public void Check_AddNewIcon_ColorTest()
	{
		customers_GroupsPage.Check_AddNewIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=7)
	public void ClickOnAddNewIconTest()
	{
		customers_GroupsPage.ClickOnAddNewIcon();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=8)
	public void verifyAddNewGroupTextTest()
	{
		String actual = customers_GroupsPage.verifyAddNewGroupText();
		String expected = "Add new group";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=9)
	public void ClickOnAddNewGroupTextTest()
	{
		customers_GroupsPage.ClickOnAddNewGroupText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=10)
	public void verifyAddIconTest()
	{
		boolean icon = customers_GroupsPage.verifyAddIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Displayed :" + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=11)
	public void Check_AddIcon_ColorTest()
	{
		customers_GroupsPage.Check_AddIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=12)
	public void ClickOnAddIconTest()
	{
		customers_GroupsPage.ClickOnAddIcon();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=13)
	public void verifyRefreshIconTest()
	{
		boolean icon = customers_GroupsPage.verifyRefreshIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Displayed :" + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=14)
	public void Check_RefreshIcon_ColorTest()
	{
		customers_GroupsPage.Check_RefreshIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=15)
	public void ClickOnRefreshIconTest()
	{
		customers_GroupsPage.ClickOnRefreshIcon();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=16)
	public void verifyTerminalIconTest()
	{
		boolean icon = customers_GroupsPage.verifyTerminalIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Displayed :" + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=17)
	public void Check_TerminalIcon_ColorTest()
	{
		customers_GroupsPage.Check_TerminalIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=18)
	public void ClickOnTerminalIconTest()
	{
		customers_GroupsPage.ClickOnTerminalIcon();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=19)
	public void verifyDatabaseIconTest()
	{
		boolean icon = customers_GroupsPage.verifyDatabaseIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Displayed :" + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=20)
	public void Check_DatabaseIcon_ColorTest()
	{
		customers_GroupsPage.Check_DatabaseIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=21)
	public void ClickOnDatabaseIconTest()
	{
		customers_GroupsPage.ClickOnDatabaseIcon();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	
}
