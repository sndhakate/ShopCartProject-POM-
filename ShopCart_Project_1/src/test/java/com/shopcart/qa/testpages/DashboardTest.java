package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.Dashboard;

public class DashboardTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard dashboard;
	
	public DashboardTest() {
		super();
	}

	@BeforeMethod
	public void setEnv() {
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		}
	
	
	@Test(priority=1)
	public void verifyDashboardTitleTest()
	{
		String actual = dashboard.verifyDashboardTitle();
		String expected = "Dashboard • ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=2)
	public void verifyDashboardLogoTest()
	{
		boolean logo = dashboard.verifyDashboardLogo();
		Assert.assertTrue(logo);
		log.info("Is logo displayed : " + logo);
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=3)
	public void verifyShopCarttTagTest()
	{
		String actual = dashboard.verifyShopCarttTag();
		String expected = "ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=4)
	public void verifyCartBasketLogoTest()
	{
		boolean logo = dashboard.verifyCartBasketLogo();
		Assert.assertTrue(logo);
		log.info("Is logo displayed : " + logo);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=5)
	public void verifyUserIconTest()
	{
		boolean icon = dashboard.verifyUserIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=6)
	public void verifyEnvelopeIconTest()
	{
		boolean icon = dashboard.verifyEnvelopeIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=7)
	public void verifyCupLogoTest()
	{
		boolean logo = dashboard.verifyCupLogo();
		Assert.assertTrue(logo);
		log.info("Is logo displayed : " + logo);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=8)
	public void verifyQuickAccessLinkTest()
	{
		String actual = dashboard.verifyQuickAccessLink();
		String expected = "Quick Access";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=9)
	public void ClickOnCartBasketLogoTest()
	{
		dashboard.ClickOnCartBasketLogo();		
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=10)
	public void ClickOnUserIconTest()
	{
		dashboard.ClickOnUserIcon();		
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=11)
	public void ClickOnEnvelopeIconTest()
	{
		dashboard.ClickOnEnvelopeIcon();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=12)
	public void ClickOnCupLogoTest()
	{
		dashboard.ClickOnCupLogo();		
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=13)
	public void ClickOnQuickAccessLinkTest()
	{
		dashboard.ClickOnQuickAccessLink();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority=14)
	public void verifyConnectToPrestashopLinkTest()
	{
		String actual = dashboard.verifyConnectToPrestashopLink();
		String expected = "Connect to PrestaShop Marketplace account";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=15)
	public void verifyMyShopLinkTest()
	{
		String actual = dashboard.verifyMyShopLink();
		String expected = "My shop";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=16)
	public void verifySystemAdminLinkTest()
	{
		String actual = dashboard.verifySystemAdminLink();
		String expected = "System Administrator";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}			
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=17)
	public void verifyDropDownLinkTest()
	{
		boolean dropdown = dashboard.verifyDropDownLink();
		Assert.assertTrue(dropdown);
		log.info("Is dropdown available :" + dropdown);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=18)
	public void verifyAvatarSymbolTest()
	{
		boolean Symbol = dashboard.verifyAvatarSymbol();
		Assert.assertTrue(Symbol);
		log.info("Is symbol displayed : " + Symbol);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=19)
	public void ClickOnAvatarSymbolTest()
	{
		dashboard.ClickOnAvatarSymbol();		
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=20)
	public void verifySearchLinkIconTest()
	{
		boolean icon = dashboard.verifySearchLinkIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=21)
	public void verifySearchDropDownTest()
	{
		boolean dropdown = dashboard.verifySearchDropDown();
		Assert.assertTrue(dropdown);
		log.info("Is dropdown available :" + dropdown);
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=22)
	public void verifySearchBoxTest()
	{
		boolean box = dashboard.verifySearchBox();
		Assert.assertTrue(box);
		log.info("Is box displayeed : " + box);
	}			
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=23)
	public void verifySearchBoxPlaceholderTest()
	{
		String actual = dashboard.verifySearchBoxPlaceholder();
		String expected = "Search";
		Assert.assertEquals(actual, expected);
		log.info("Placeholder Actual : " + actual);
		log.info("Placeholder Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=24)
	public void verifyDemoModeToggleBtnTest()
	{
		String actual = dashboard.verifyDemoModeToggleBtn();
		String expected = "Demo mode";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}			
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=25)
	public void verifyHelpTextTest()
	{
		String actual = dashboard.verifyHelpText();
		String expected = "Help";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=26)
	public void verifyToggleBtnTest()
	{
		boolean btn = dashboard.verifyToggleBtn();
		Assert.assertTrue(btn);
		log.info("Is button enable : " + btn);
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=27)
	public void verifyHelpIconTest()
	{
		boolean icon = dashboard.verifyHelpIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=28)
	public void verifyCatalogIconTest()
	{
		boolean icon = dashboard.verifyCatalogIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=29)
	public void ClickOnCatalogLinkTest()
	{
		dashboard.ClickOnCatalogLink();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=30)
	public void verifyOrdersIconTest()
	{
		boolean icon = dashboard.verifyOrdersIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=31)
	public void ClickOnOrdersLinkTest()
	{
		dashboard.ClickOnOrdersLink();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=32)
	public void verifyCustomersIconTest()
	{
		boolean icon = dashboard.verifyCustomersIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=33)
	public void ClickOnCustomersLinkTest()
	{
		dashboard.ClickOnCustomersLink();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=34)
	public void verifyPriceRulesIconTest()
	{
		boolean icon = dashboard.verifyPriceRulesIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=35)
	public void ClickOnPriceRulesLinkTest()
	{
		dashboard.ClickOnPriceRulesLink();		
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=36)
	public void verifyModulesAndServicesIconTest()
	{
		boolean icon = dashboard.verifyModulesAndServicesIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=37)
	public void ClickOnModulesAndServicesLinkTest()
	{
		dashboard.ClickOnModulesAndServicesLink();		
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=38)
	public void verifyShippingIconTest()
	{
		boolean icon = dashboard.verifyShippingIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=39)
	public void ClickOnShippingLinkTest()
	{
		dashboard.ClickOnShippingLink();		
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=40)
	public void verifyLocalizationIconTest()
	{
		boolean icon = dashboard.verifyLocalizationIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=41)
	public void ClickOnLocalizationLinkTest()
	{
		dashboard.ClickOnLocalizationLink();		
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=42)
	public void verifyPreferenceIconTest()
	{
		boolean icon = dashboard.verifyPreferenceIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=43)
	public void ClickOnPreferenceLinkTest()
	{
		dashboard.ClickOnPreferenceLink();		
	}			
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=44)
	public void verifyAdvParametersIconTest()
	{
		boolean icon = dashboard.verifyAdvParametersIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=45)
	public void ClickOnAdvParametersIconTest()
	{
		dashboard.ClickOnAdvParametersIcon();		
	}				
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=46)
	public void verifyAdministrationIconTest()
	{
		boolean icon = dashboard.verifyAdministrationIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=47)
	public void ClickOnAdministrationlinkTest()
	{
		dashboard.ClickOnAdministrationlink();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=48)
	public void verifyStatsIconTest()
	{
		boolean icon = dashboard.verifyStatsIcon();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=49)
	public void ClickOnStatsLinkTest()
	{
		dashboard.ClickOnStatsLink();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=50)
	public void verifyAlignIconLinkTest()
	{
		boolean icon = dashboard.verifyAlignIconLink();
		Assert.assertTrue(icon);
		log.info("Is icon displayed : " + icon);
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=51)
	public void ClickOnAlignIconLinkTest()
	{
		dashboard.ClickOnAlignIconLink();		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=52)
	public void verifyDashboardSmallTextTest()
	{
		String actual = dashboard.verifyDashboardSmallText();
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected);
		log.info("Placeholder Actual : " + actual);
		log.info("Placeholder Expected : " + expected);
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=53)
	public void ClickOnDashboardSmallTextTest()
	{
		dashboard.ClickOnDashboardSmallText();		
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=54)
	public void verifyDashboardPageTitleTest()
	{
		String actual = dashboard.verifyDashboardPageTitle();
		String expected = "Dashboard";
		Assert.assertEquals(actual, expected);
		log.info("Placeholder Actual : " + actual);
		log.info("Placeholder Expected : " + expected);
	}		
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=55)
	public void Check_ToggleBtn_ColorTest()
	{
		dashboard.Check_ToggleBtn_Color();
	}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=56)
	public void Check_HelpIcon_ColorTest()
	{
		dashboard.Check_HelpIcon_Color();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	@Test(priority=57)
	public void  ClickOnMyShopLinkTest()
	{
		dashboard. ClickOnMyShopLink();		
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}	
	
}

