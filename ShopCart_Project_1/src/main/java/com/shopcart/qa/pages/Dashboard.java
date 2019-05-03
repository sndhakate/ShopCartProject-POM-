package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class Dashboard extends TestBase {
	
	@FindBy(xpath="//a[@id='header_shopversion']")
	WebElement DashboardLogo;
	
	@FindBy(xpath="//a[contains(text(),'ShopCartt')]")
	WebElement ShopCarttTag;
	
	@FindBy(xpath="//a[@class='dropdown-toggle notifs']//i[@class='icon-shopping-cart']")
	WebElement CartBasketLogo;
	
	@FindBy(xpath="//a[@class='dropdown-toggle notifs']//i[@class='icon-user']")
	WebElement UserIcon;
	
	@FindBy(xpath="//a[@class='dropdown-toggle notifs']//i[@class='icon-envelope']")
	WebElement EnvelopeIcon;
	
	@FindBy(xpath="//a[@class='dropdown-toggle gamification_notif']//img")
	WebElement CupLogo;
	
	@FindBy(xpath="//a[@id='quick_select']")
	WebElement QuickAccessLink;
	
	@FindBy(xpath="//span[contains(text(),'Connect to PrestaShop Marketplace account')]")
	WebElement ConnectToPrestashopLink;
	
	@FindBy(xpath="//span[contains(text(),'My shop')]")
	WebElement MyShopLink;
	
	@FindBy(xpath="//span[contains(text(),'System Administrator')]")
	WebElement SystemAdminLink;
	
	@FindBy(xpath="//i[@class='caret']")
	WebElement DropDownLink;
	
	@FindBy(xpath="//span[@class='employee_avatar_small']//img[@class='imgm img-thumbnail']")
	WebElement AvatarSymbol;
	
	@FindBy(xpath="//i[@id='search_type_icon']")
	WebElement SearchLinkIcon;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']//i[@class='icon-caret-down']")
	WebElement SearchDropDown;
	
	@FindBy(xpath="//input[@id='bo_query']")
	WebElement SearchBox;
	
	@FindBy(xpath="//div[contains(text(),'Demo mode')]")
	WebElement DemoModeToggleBtn;
		
	@FindBy(xpath="//div[contains(text(),'Help')]")
	WebElement HelpText;
	
	@FindBy(xpath="//i[@class='process-icon-toggle-on']")
	WebElement ToggleBtn;
	
	@FindBy(xpath="//i[@class='process-icon-help']")
	WebElement HelpIcon;
	
	@FindBy(xpath="//span[contains(text(),'Catalog')]")
	WebElement CatalogLink;
	
	@FindBy(xpath="//i[@class='icon-AdminCatalog']")
	WebElement CatalogIcon;
	
	@FindBy(xpath="//a[@class='title']//span[contains(text(),'Orders')]")
	WebElement OrdersLink;
	
	@FindBy(xpath="//i[@class='icon-AdminParentOrders']")
	WebElement OrdersIcon;
	
	@FindBy(xpath="//span[contains(text(),'Customers')]")
	WebElement CustomersLink;
	
	@FindBy(xpath="//i[@class='icon-AdminParentCustomer']")
	WebElement CustomersIcon;
	
	@FindBy(xpath="//span[contains(text(),'Price Rules')]")
	WebElement PriceRulesLink;
	
	@FindBy(xpath="//i[@class='icon-AdminPriceRule']")
	WebElement PriceRulesIcon;
	
	@FindBy(xpath="//span[contains(text(),'Modules and Services')]")
	WebElement ModulesAndServicesLink;
	
	@FindBy(xpath="//i[@class='icon-AdminParentModules']")
	WebElement ModulesAndServicesIcon;
	
	@FindBy(xpath="//span[contains(text(),'Shipping')]")
	WebElement ShippingLink;
	
	@FindBy(xpath="//i[@class='icon-AdminParentShipping']")
	WebElement ShippingIcon;
	
	@FindBy(xpath="//span[contains(text(),'Localization')]")
	WebElement LocalizationLink;
	
	@FindBy(xpath="//i[@class='icon-AdminParentLocalization']")
	WebElement LocalizationIcon;
	
	@FindBy(xpath="//span[contains(text(),'Preferences')]")
	WebElement PreferencesLink;
	
	@FindBy(xpath="//i[@class='icon-AdminParentPreferences']")
	WebElement PreferencesIcon;
	
	@FindBy(xpath="//span[contains(text(),'Advanced Parameters')]")
	WebElement AdvParametersLink;
	
	@FindBy(xpath="//i[@class='icon-AdminTools']")
	WebElement AdvParametersIcon;
	
	@FindBy(xpath="//span[contains(text(),'Administration')]")
	WebElement AdministrationLink;
	
	@FindBy(xpath="//i[@class='icon-AdminAdmin']")
	WebElement AdministrationIcon;
	
	@FindBy(xpath="//span[contains(text(),'Stats')]")
	WebElement StatsLink;
	
	@FindBy(xpath="//i[@class='icon-AdminParentStats']")
	WebElement StatsIcon;
	
	@FindBy(xpath="//i[@class='icon-align-justify icon-rotate-90']")
	WebElement AlignIconLink;
	
	
	public Dashboard() 
	{
		PageFactory.initElements(driver, this);
	}

	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifyDashboardTitle() 
	{
		return driver.getTitle();		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyDashboardLogo() 
	{
		return DashboardLogo.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifyShopCarttTag() 
	{
		return ShopCarttTag.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyCartBasketLogo() 
	{
		return CartBasketLogo.isDisplayed();	
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyUserIcon() 
	{
		return UserIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------

	public boolean verifyEnvelopeIcon() 
	{
		return EnvelopeIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyCupLogo() 
	{	
		return CupLogo.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifyQuickAccessLink()
	{
		return QuickAccessLink.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCartBasketLogo() 
	{
		CartBasketLogo.click();
	}
		
	//--------------------------------------------------------------------------------------------------------------------------
		
	public void ClickOnUserIcon() 
	{
		UserIcon.click();
	}
		
	//--------------------------------------------------------------------------------------------------------------------------

	public void ClickOnEnvelopeIcon() 
	{
		EnvelopeIcon.click();
	}
		
	//--------------------------------------------------------------------------------------------------------------------------
		
	public void ClickOnCupLogo() 
	{	
		CupLogo.click();
	}
		
	//--------------------------------------------------------------------------------------------------------------------------
		
	public void ClickOnQuickAccessLink()
	{
		QuickAccessLink.click();
	}
		
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifyConnectToPrestashopLink()
	{
		return ConnectToPrestashopLink.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifyMyShopLink()
	{
		return MyShopLink.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifySystemAdminLink()
	{
		return SystemAdminLink.getText();		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyDropDownLink()
	{
		return DropDownLink.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAvatarSymbol() 
	{
		return AvatarSymbol.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifySearchLinkIcon()
	{
		return SearchLinkIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifySearchDropDown()
	{
		return SearchDropDown.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifySearchBox()
	{
		return SearchBox.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifySearchBoxPlaceholder()
	{
		String placeholder = SearchBox.getAttribute("placeholder");
		return placeholder;		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifyDemoModeToggleBtn()
	{
		return DemoModeToggleBtn.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public String verifyHelpText()
	{
		return HelpText.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyToggleBtn()
	{
		return ToggleBtn.isEnabled();		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyHelpIcon()
	{
		return HelpIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
		
	public boolean verifyCatalogIcon()
	{
		return CatalogIcon.isDisplayed();
	}
		
	//--------------------------------------------------------------------------------------------------------------------------
	
	public CatalogPage ClickOnCatalogLink()
	{
		CatalogLink.click();
		return new CatalogPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyOrdersIcon()
	{
		return OrdersIcon.isDisplayed();
	}

	//--------------------------------------------------------------------------------------------------------------------------

	public OrdersPage ClickOnOrdersLink()
	{
		OrdersLink.click();
		return new OrdersPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------

	public boolean verifyCustomersIcon() 
	{
		return CustomersIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public CustomersPage ClickOnCustomersLink()
	{
		CustomersLink.click();
		return new CustomersPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyPriceRulesIcon()
	{
		return PriceRulesIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public PriceRulesPage ClickOnPriceRulesLink()
	{
		PriceRulesLink.click();
		return new PriceRulesPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyModulesAndServicesIcon()
	{
		return ModulesAndServicesIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public ModulesAndServicesPage ClickOnModulesAndServicesLink() 
	{
		ModulesAndServicesLink.click();
		return new ModulesAndServicesPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyShippingIcon()
	{
		return ShippingIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public ShippingPage ClickOnShippingLink()
	{
		ShippingLink.click();
		return new ShippingPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------

	public boolean verifyLocalizationIcon() 
	{
		return LocalizationIcon.isDisplayed();		
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public LocalizationPage ClickOnLocalizationLink()
	{
		LocalizationLink.click();
		return new LocalizationPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyPreferenceIcon()
	{
		return PreferencesIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public PreferencesPage ClickOnPreferenceLink()
	{
		PreferencesLink.click();
		return new PreferencesPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAdvParametersIcon()
	{
		return AdvParametersIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public AdvanceParametersPage ClickOnAdvParametersIcon()
	{
		AdvParametersIcon.click();
		return new AdvanceParametersPage();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAdministrationIcon()
	{
		return AdministrationIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public AdministrationPage ClickOnAdministrationlink() 
	{
		AdministrationLink.click();
		return new AdministrationPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyStatsIcon() 
	{
		return StatsIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public StatsPage ClickOnStatsLink()
	{
		StatsLink.click();
		return new StatsPage();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAlignIconLink()
	{
		return AlignIconLink.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnAlignIconLink()
	{
		AlignIconLink.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	
}	


	

