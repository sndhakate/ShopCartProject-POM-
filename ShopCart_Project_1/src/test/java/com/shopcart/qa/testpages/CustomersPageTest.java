package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.CustomersPage;
import com.shopcart.qa.pages.Dashboard;
import com.shopcart.qa.util.TestUtil;

public class CustomersPageTest extends TestBase {
	
	AdminLoginPage adminLoginPage ;
	Dashboard dashboard ;
	CustomersPage customersPage ;
	
	public CustomersPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setEnv()
	{
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		customersPage = dashboard.ClickOnCustomersLink();		
	}
	
	@Test(priority=1)
	public void verifyCurrentTitleTest()
	{
		String actual = customersPage.verifyCurrentTitle();
		String expected = "Manage your Customers • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=2)
	public void verifyCustomerTagTextTest()
	{
		String actual = customersPage.verifyCustomerTagText();
		String expected = "Customers";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=3)
	public void ClickOnCustomerTagTextTest()
	{
		customersPage.ClickOnCustomerTagText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=4)
	public void verifyCustomersPageTitleTest()
	{
		boolean title = customersPage.verifyCustomersPageTitle();
		Assert.assertTrue(title);
		log.info("Is Page Title Displayed : " + title);
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=5)
	public void verifyAddNewCustomerIconTest()
	{
		boolean icon = customersPage.verifyAddNewCustomerIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=6)
	public void Check_AddNewCustomerIcon_ColorTest()
	{
		customersPage.Check_AddNewCustomerIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=7)
	public void verifyingAddNewCustomerTextTest()
	{
		String actual = customersPage.verifyingAddNewCustomerText();
		String expected = "Add new customer";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=8)
	public void ClickOnAddNewCustomerTextTest()
	{
		customersPage.ClickOnAddNewCustomerText();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=9)
	public void verifyModuleListIconTest()
	{
		boolean icon = customersPage.verifyModuleListIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=10)
	public void Check_ModuleListIcon_ColorTest()
	{
		customersPage.Check_ModuleListIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=11)
	public void verifyingModuleListTextTest()
	{
		String actual = customersPage.verifyingModuleListText();
		String expected = "Recommended Modules and Services";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=12)
	public void ClickOnModuleListTextTest()
	{
		customersPage.ClickOnModuleListText();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=13)
	public void verifyHelpIconTest()
	{
		boolean icon = customersPage.verifyHelpIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=14)
	public void Check_HelpIcon_ColorTest()
	{
		customersPage.Check_HelpIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=15)
	public void verifyingHelpTextTest()
	{
		String actual = customersPage.verifyingHelpText();
		String expected = "Help";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=16)
	public void ClickOnHelpTextTest()
	{
		customersPage.ClickOnHelpText();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=17)
	public void verifyMaleIconTest()
	{
		boolean icon = customersPage.verifyMaleIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=18)
	public void verifyingCustomerTextTest()
	{
		String actual = customersPage.verifyingCustomerText();
		String expected = "Customers";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=19)
	public void verifyCalenderIconTest()
	{
		boolean icon = customersPage.verifyCalenderIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=20)
	public void verifyingAverageAgeTextTest()
	{
		String actual = customersPage.verifyingAverageAgeText();
		String expected = "Average Age";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=21)
	public void verifyRetweetIconTest()
	{
		boolean icon = customersPage.verifyRetweetIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=22)
	public void verifyingOrdersPerCustomerTextTest()
	{
		String actual = customersPage.verifyingOrdersPerCustomerText();
		String expected = "Orders per Customer";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=23)
	public void verifyEnvelopeIconTest()
	{
		boolean icon = customersPage.verifyEnvelopeIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=24)
	public void verifyingNewsletterRegdTextTest()
	{
		String actual = customersPage.verifyingNewsletterRegdText();
		String expected = "Newsletter Registrations";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=25)
	public void verifyNewIconTest()
	{
		boolean icon = customersPage.verifyNewIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=26)
	public void Check_NewIcon_ColorTest()
	{
		customersPage.Check_NewIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=27)
	public void verifyExportIconTest()
	{
		boolean icon = customersPage.verifyExportIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=28)
	public void Check_ExportIcon_ColorTest()
	{
		customersPage.Check_ExportIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=29)
	public void verifyImportIconTest()
	{
		boolean icon = customersPage.verifyImportIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=30)
	public void Check_ImportIcon_ColorTest()
	{
		customersPage.Check_ImportIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=31)
	public void verifyRefreshIconTest()
	{
		boolean icon = customersPage.verifyRefreshIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=32)
	public void Check_RefreshIcon_ColorTest()
	{
		customersPage.Check_RefreshIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=33)
	public void verifyTerminalIconTest()
	{
		boolean icon = customersPage.verifyTerminalIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=34)
	public void Check_TerminalIcon_ColorTest()
	{
		customersPage.Check_TerminalIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=35)
	public void verifyDatabaseIconTest()
	{
		boolean icon = customersPage.verifyDatabaseIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=36)
	public void Check_DatabaseIcon_ColorTest()
	{
		customersPage.Check_DatabaseIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=37)
	public void verifySearchIconTest()
	{
		boolean icon = customersPage.verifySearchIcon();
		Assert.assertTrue(icon);
		log.info("Is Icon Displayed : " + icon);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=38)
	public void Check_SearchIcon_ColorTest()
	{
		customersPage.Check_SearchIcon_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=39)
	public void ClickOnSearchBtnTest()
	{
		customersPage.ClickOnSearchBtn();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=40)
	public void verifyBulkActionBtnTest()
	{
		boolean Btn = customersPage.verifyBulkActionBtn();
		Assert.assertTrue(Btn);
		log.info("Is Icon Displayed : " + Btn);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=41)
	public void Check_BulkActionBtn_ColorTest()
	{
		customersPage.Check_BulkActionBtn_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=42)
	public void verifyingBulkActionBtnTest()
	{
		String actual = customersPage.verifyingBulkActionBtn();
		String expected = "Bulk actions";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=43)
	public void ClickOnBulkActionBtnTest()
	{
		customersPage.ClickOnBulkActionBtn();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=44)
	public void verifySetReqBtnTest()
	{
		boolean Btn = customersPage.verifySetReqBtn();
		Assert.assertTrue(Btn);
		log.info("Is Icon Displayed : " + Btn);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=45)
	public void Check_SetReqBtn_ColorTest()
	{
		customersPage.Check_SetReqBtn_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=46)
	public void verifyingSetReqBtnTest()
	{
		String actual = customersPage.verifyingSetReqBtn();
		String expected = "Set required fields for this section";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=47)
	public void ClickOnSetReqBtnTest()
	{
		customersPage.ClickOnSetReqBtn();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=48)
	public void verifyReqFieldCheckboxTest()
	{
		boolean checkBox = customersPage.verifyReqFieldCheckbox();
		Assert.assertTrue(checkBox);
		log.info("Is checkBox Selected : " + checkBox);
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=49)
	public void Check_SaveIconBtn_ColorTest()
	{
		customersPage.Check_SaveIconBtn_Color();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=50)
	public void ClickOnSaveIconTest()
	{
		customersPage.ClickOnSaveIcon();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=51)
	public void ClickOnAddressesTest()
	{
		customersPage.ClickOnAddresses();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=52)
	public void ClickOnGroupsTest()
	{
		customersPage.ClickOnGroups();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=53)
	public void ClickOnShoppingCartsTest()
	{
		customersPage.ClickOnShoppingCarts();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=54)
	public void ClickOnCustomerServicesTest()
	{
		customersPage.ClickOnCustomerServices();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=55)
	public void ClickOnContactsTest()
	{
		customersPage.ClickOnContacts();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=56)
	public void ClickOnTitlesTest()
	{
		customersPage.ClickOnTitles();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	@DataProvider
	public Object[][]getAddNewCustomerData()
	{
		Object data [][] = TestUtil.getTestData("AddNewCustomer");
		return data;
	}
	
	@Test(priority=57 , dataProvider = "getAddNewCustomerData")
	public void AddNewCustomerTest(String name , String Lastname , String Email , String pswd , String Bdays , String Bmonths , String Byears )
	{
		customersPage.AddNewCustomer(name, Lastname, Email, pswd, Bdays, Bmonths, Byears);
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
