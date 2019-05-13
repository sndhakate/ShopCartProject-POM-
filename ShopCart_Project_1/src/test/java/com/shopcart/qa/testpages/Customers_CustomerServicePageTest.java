package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.CustomersPage;
import com.shopcart.qa.pages.Customers_CustomerServicePage;
import com.shopcart.qa.pages.Dashboard;

public class Customers_CustomerServicePageTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard dashboard;
	CustomersPage customersPage;
	Customers_CustomerServicePage customers_CustomerServicePage;
	
	public Customers_CustomerServicePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setEnv()
	{
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		customers_CustomerServicePage = dashboard.ClickOnCustomersLink().ClickOnCustomerServices();
	}
	
	@Test(priority=1)
	public void verifyCurrentTitleTest()
	{
		String actual = customers_CustomerServicePage.verifyCurrentTitle();
		String expected = "Customer Service • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=2)
	public void ClickOnCustomersTest()
	{
		customers_CustomerServicePage.ClickOnCustomers();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=3)
	public void verifyCustomerServicesTextTest()
	{
		String actual = customers_CustomerServicePage.verifyCustomerServicesText();
		String expected = "Customer Service";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=4)
	public void ClickOnCustomerServicesTextTest()
	{
		customers_CustomerServicePage.ClickOnCustomerServicesText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=5)
	public void verifyCustomerServicesPageTitleTest()
	{
		String actual = customers_CustomerServicePage.verifyCustomerServicesPageTitle();
		String expected = "Customer Service";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=6)
	public void verifyEnvelopeIconTest()
	{
		boolean icon = customers_CustomerServicePage.verifyEnvelopeIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=7)
	public void verifyPendingDiscussionThreadsTest()
	{
		String actual = customers_CustomerServicePage.verifyPendingDiscussionThreads();
		String expected = "Pending Discussion Threads";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=8)
	public void verifyTimeIconTest()
	{
		boolean icon = customers_CustomerServicePage.verifyTimeIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=9)
	public void verifyAverageResponseTimeTest()
	{
		String actual = customers_CustomerServicePage.verifyAverageResponseTime();
		String expected = "Average Response Time";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=10)
	public void verifyCopyIconTest()
	{
		boolean icon = customers_CustomerServicePage.verifyCopyIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=11)
	public void verifyMessagesPerThreadTest()
	{
		String actual = customers_CustomerServicePage.verifyMessagesPerThread();
		String expected = "Messages per Thread";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=12)
	public void verifyRefreshIconTest()
	{
		boolean icon = customers_CustomerServicePage.verifyRefreshIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=13)
	public void Check_RefreshIcon_ColorTest()
	{
		customers_CustomerServicePage.Check_RefreshIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=14)
	public void ClickOnRefreshIconTest()
	{
		customers_CustomerServicePage.ClickOnRefreshIcon();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=12)
	public void verifyWebmasterTest()
	{
		String actual = customers_CustomerServicePage.verifyWebmaster();
		String expected = "WEBMASTER";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=13)
	public void verifyCustomerServiceTest()
	{
		String actual = customers_CustomerServicePage.verifyCustomerService();
		String expected = "CUSTOMER SERVICE";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=14)
	public void verifyMeaningOfStatusTest()
	{
		String actual = customers_CustomerServicePage.verifyMeaningOfStatus();
		String expected = "MEANING OF STATUS";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=15)
	public void verifyStatisticsTest()
	{
		String actual = customers_CustomerServicePage.verifyStatistics();
		String expected = "STATISTICS";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=16)
	public void verifyCustomerOption_SaveTest()
	{
		boolean icon = customers_CustomerServicePage.verifyCustomerOption_Save();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=17)
	public void Check_CustomerOption_Save_ColorTest()
	{
		customers_CustomerServicePage.Check_CustomerOption_Save_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=18)
	public void ClickOnCustomerOption_SaveTest()
	{
		customers_CustomerServicePage.ClickOnCustomerOption_Save();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=19)
	public void verifyCustomerServiceOption_SaveTest()
	{
		boolean icon = customers_CustomerServicePage.verifyCustomerServiceOption_Save();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=20)
	public void Check_CustomerServiceOption_Save_ColorTest()
	{
		customers_CustomerServicePage.Check_CustomerServiceOption_Save_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=21)
	public void ClickOnCustomerServiceOption_SaveTest()
	{
		customers_CustomerServicePage.ClickOnCustomerServiceOption_Save();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=22)
	public void AddToCustomerServiceOptionTest()
	{
		customers_CustomerServicePage.AddToCustomerServiceOption();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
