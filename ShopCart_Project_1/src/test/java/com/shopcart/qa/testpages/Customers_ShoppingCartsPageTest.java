package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.CustomersPage;
import com.shopcart.qa.pages.Customers_ShoppingCartsPage;
import com.shopcart.qa.pages.Dashboard;

public class Customers_ShoppingCartsPageTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard dashboard;
	CustomersPage customersPage;
	Customers_ShoppingCartsPage customers_ShoppingCartsPage;
	
	public Customers_ShoppingCartsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setEnv()
	{
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		customers_ShoppingCartsPage = dashboard.ClickOnCustomersLink().ClickOnShoppingCarts();		
	}
	
	@Test(priority=1)
	public void verifyCurrentTitleTest()
	{
		String actual = customers_ShoppingCartsPage.verifyCurrentTitle();
		String expected = "Shopping Carts • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=2)
	public void verifyShoppingCartsTextTest()
	{
		String actual = customers_ShoppingCartsPage.verifyShoppingCartsText();
		String expected = "Shopping Carts";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=3)
	public void ClickOnShoppingCartsTextTest()
	{
		customers_ShoppingCartsPage.ClickOnShoppingCartsText();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=4)
	public void verifyShoppingCartPageTitleTest()
	{
		String actual = customers_ShoppingCartsPage.verifyShoppingCartPageTitle();
		String expected = "Shopping Carts";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=5)
	public void verifyExportCartIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifyExportCartIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=6)
	public void Check_ExportCartIcon_ColorTest()
	{
		customers_ShoppingCartsPage.Check_ExportCartIcon_Color();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=7)
	public void ClickOnExportCartIconTest()
	{
		customers_ShoppingCartsPage.ClickOnExportCartIcon();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=8)
	public void verifyExportCartTextTest()
	{
		String actual = customers_ShoppingCartsPage.verifyExportCartText();
		String expected = "Export carts";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=9)
	public void ClickOnExportCartTextTest()
	{
		customers_ShoppingCartsPage.ClickOnExportCartText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=10)
	public void verifySortIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifySortIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=11)
	public void verifyConversionRateTextTest()
	{
		String actual = customers_ShoppingCartsPage.verifyConversionRateText();
		String expected = "Conversion Rate";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=12)
	public void verifyCartIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifyCartIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=13)
	public void verifyAbandonedCartTextTest()
	{
		String actual = customers_ShoppingCartsPage.verifyAbandonedCartText();
		String expected = "Abandoned Carts";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=14)
	public void verifyMoneyIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifyMoneyIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=15)
	public void verifyAverageOrderValueTextTest()
	{
		String actual = customers_ShoppingCartsPage.verifyAverageOrderValueText();
		String expected = "Average Order Value";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=16)
	public void verifyUserIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifyUserIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=17)
	public void verifyNpTextTest()
	{
		String actual = customers_ShoppingCartsPage.verifyNpText();
		String expected = "Net Profit per Visitor";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=18)
	public void verifyRefreshIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifyRefreshIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=19)
	public void Check_RefreshIcon_ColorTest()
	{
		customers_ShoppingCartsPage.Check_RefreshIcon_Color();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=20)
	public void ClickOnRefreshIconTest()
	{
		customers_ShoppingCartsPage.ClickOnRefreshIcon();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=21)
	public void vverifyExportIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifyExportIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=22)
	public void Check_ExportIcon_ColorTest()
	{
		customers_ShoppingCartsPage.Check_ExportIcon_Color();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=23)
	public void ClickOnExportIconTest()
	{
		customers_ShoppingCartsPage.ClickOnExportIcon();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=24)
	public void verifyRefreshListIconTest()
	{
		boolean icon = customers_ShoppingCartsPage.verifyRefreshListIcon();
		Assert.assertTrue(icon);
		log.info("Is icon Diaplayed : " + icon);			
	}		

	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=25)
	public void Check_RefreshListIcon_ColorTest()
	{
		customers_ShoppingCartsPage.Check_RefreshListIcon_Color();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=26)
	public void ClickOnRefreshListIconTest()
	{
		customers_ShoppingCartsPage.ClickOnRefreshListIcon();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=27)
	public void DeleteCartItemTest()
	{
		customers_ShoppingCartsPage.DeleteCartItem();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}	
	
}
