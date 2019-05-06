package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.util.ActionsClass;
import com.shopcart.qa.util.DropDownHelper;

public class CustomersPage extends TestBase {
	
	@FindBy(xpath="//li[@class='breadcrumb-container']//a[contains(text(),'Customers')]")
	WebElement CustomerTagText;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement CustomersPageTitle;
	
	@FindBy(xpath="//a[@id='page-header-desc-customer-new_customer']//i[@class='process-icon-new']")
	WebElement AddNewCustomerIcon;
	
	@FindBy(xpath="//div[contains(text(),'Add new customer')]")
	WebElement AddNewCustomerText;
	
	@FindBy(xpath="//i[@class='process-icon-modules-list']")
	WebElement ModuleListIcon;
	
	@FindBy(xpath="//div[contains(text(),'Recommended Modules and Services')]")
	WebElement ModuleListText;
	
	@FindBy(xpath="//i[@class='process-icon-help']")
	WebElement HelpIcon;
	
	@FindBy(xpath="//div[contains(text(),'Help')]")
	WebElement HelpText;
	
	@FindBy(xpath="//i[@class='icon-male']")
	WebElement MaleIcon;
	
	@FindBy(xpath="//span[@class='title'][contains(text(),'Customers')]")
	WebElement CustomerText;
	
	@FindBy(xpath="//div[@class='kpi-content']//i[@class='icon-calendar']")
	WebElement CalenderIcon;
	
	@FindBy(xpath="//span[contains(text(),'Average Age')]")
	WebElement AverageAgeText;
	
	@FindBy(xpath="//i[@class='icon-retweet']")
	WebElement RetweetIcon;
	
	@FindBy(xpath="//span[contains(text(),'Orders per Customer')]")
	WebElement OrdersPerCustomerText;
	
	@FindBy(xpath="//div[@class='kpi-content']//i[@class='icon-envelope']")
	WebElement EnvelopeIcon;
	
	@FindBy(xpath="//span[contains(text(),'Newsletter Registrations')]")
	WebElement NewsletterRegd;
	
	@FindBy(xpath="//span[@class='label-tooltip']//i[@class='process-icon-new']")
	WebElement NewIcon;
	
	@FindBy(xpath="//i[@class='process-icon-export']")
	WebElement ExportIcon;
	
	@FindBy(xpath="//i[@class='process-icon-import']")
	WebElement ImportIcon;
	
	@FindBy(xpath="//span[@class='label-tooltip']//i[@class='process-icon-refresh']")
	WebElement RefreshIcon;
	
	@FindBy(xpath="//i[@class='process-icon-terminal']")
	WebElement TerminalIcon;
	
	@FindBy(xpath="//i[@class='process-icon-database']")
	WebElement DatabaseIcon;
	
	@FindBy(xpath="//button[@id='submitFilterButtoncustomer']//i[@class='icon-search']")
	WebElement SearchIcon;
	
	@FindBy(xpath="//button[@id='submitFilterButtoncustomer']")
	WebElement SearchBtn;
	
	@FindBy(xpath="//button[contains(text(),'Bulk actions')]")
	WebElement BulkActionBtn;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	WebElement SetReqBtn;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	WebElement ReqFieldAlert;
	
	@FindBy(xpath="//input[@name='checkme']")
	WebElement ReqFieldCheckbox;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement SaveIcon;
	
	@FindBy(xpath="//a[contains(text(),'Addresses')]")
	WebElement AddressesPage;
	
	@FindBy(xpath="//a[contains(text(),'Groups')]")
	WebElement GroupsPage;
	
	@FindBy(xpath="//a[contains(text(),'Shopping Carts')]")
	WebElement ShoppingCartsPage;
	
	@FindBy(xpath="//a[contains(text(),'Customer Service')]")
	WebElement CustomerServicePage;
	
	@FindBy(xpath="//li[@id='subtab-AdminContacts']//a[contains(text(),'Contacts')]")
	WebElement ContactsPage;
	
	@FindBy(xpath="//a[contains(text(),'Titles')]")
	WebElement TitlesPage;
	
	@FindBy(xpath="//input[@id='gender_1']")
	WebElement Mr_box;
	
	@FindBy(xpath="//input[@id='firstname']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@id='lastname']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailAdd;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//select[@name='days']")
	WebElement BdayDays;
	
	@FindBy(xpath="//select[@name='months']")
	WebElement BdayMonths;
	
	@FindBy(xpath="//select[@name='years']")
	WebElement BdayYears;
	
	@FindBy(xpath="//i[@class='process-icon-save']")
	WebElement Save;
	
	
		
	public CustomersPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyCurrentTitle()
	{
		log.info("--------------------------------------------Current Title-----------------------------------------------");
		return driver.getTitle();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyCustomerTagText()
	{
		log.info("--------------------------------------Verifying Customers Tag Text------------------------------------");
		return CustomerTagText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCustomerTagText()
	{
		log.info("--------------------------------------Click On Customers Tag Text------------------------------------");
		CustomerTagText.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyCustomersPageTitle()
	{
		log.info("--------------------------------------Verifying Customers Page Title------------------------------------");
		return CustomersPageTitle.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAddNewCustomerIcon()
	{
		log.info("--------------------------------------Verifying Add New Customers Icon Display------------------------------------");
		return AddNewCustomerIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_AddNewCustomerIcon_Color()
	{
		log.info("before Mouse over icon color is :" + AddNewCustomerIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(AddNewCustomerIcon).build().perform();
		log.info("after Mouse over icon color is :" + AddNewCustomerIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyingAddNewCustomerText()
	{
		log.info("--------------------------------------Verifying Add New CustomerText------------------------------------");
		return AddNewCustomerText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnAddNewCustomerText()
	{
		log.info("--------------------------------------Click On Add New Customers Text------------------------------------");
		AddNewCustomerText.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyModuleListIcon()
	{
		log.info("--------------------------------------Verifying Module List Icon Display------------------------------------");
		return ModuleListIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_ModuleListIcon_Color()
	{
		log.info("before Mouse over icon color is :" + ModuleListIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(ModuleListIcon).build().perform();
		log.info("after Mouse over icon color is :" + ModuleListIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyingModuleListText()
	{
		log.info("--------------------------------------Verifying Module List Text---------------------------------------------");
		return ModuleListText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnModuleListText()
	{
		log.info("--------------------------------------Click On Module List Text------------------------------------");
		ModuleListText.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyHelpIcon()
	{
		log.info("--------------------------------------Verifying Help Icon Display------------------------------------");
		return HelpIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_HelpIcon_Color()
	{
		log.info("before Mouse over icon color is :" + HelpIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(HelpIcon).build().perform();
		log.info("after Mouse over icon color is :" + HelpIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyingHelpText()
	{
		log.info("--------------------------------------Verifying Help Text---------------------------------------------");
		return HelpText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnHelpText()
	{
		log.info("--------------------------------------Click On Help Text------------------------------------");
		HelpText.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyMaleIcon()
	{
		log.info("--------------------------------------Verifying Male Icon Display------------------------------------");
		return MaleIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyingCustomerText()
	{
		log.info("--------------------------------------Verifying Customer Text---------------------------------------------");
		return CustomerText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyCalenderIcon()
	{
		log.info("--------------------------------------Verifying Calender Icon Display------------------------------------");
		return CalenderIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyingAverageAgeText()
	{
		log.info("--------------------------------------Verifying Average AgeText ---------------------------------------------");
		return AverageAgeText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyRetweetIcon()
	{
		log.info("--------------------------------------Verifying Retweet Icon Display------------------------------------");
		return RetweetIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyingOrdersPerCustomerText()
	{
		log.info("--------------------------------------Verifying Orders Per CustomerText  ---------------------------------------------");
		return OrdersPerCustomerText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyEnvelopeIcon()
	{
		log.info("--------------------------------------Verifying Envolope Icon Display------------------------------------");
		return EnvelopeIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyingNewsletterRegdText()
	{
		log.info("--------------------------------------Verifying Newsletter Regd.Text  ---------------------------------------------");
		return NewsletterRegd.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyNewIcon()
	{
		log.info("--------------------------------------Verifying New Icon Display------------------------------------");
		return NewIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_NewIcon_Color()
	{
		log.info("before Mouse over icon color is :" + NewIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(NewIcon).build().perform();
		log.info("after Mouse over icon color is :" + NewIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyExportIcon()
	{
		log.info("--------------------------------------Verifying Export Icon Display------------------------------------");
		return ExportIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_ExportIcon_Color()
	{
		log.info("before Mouse over icon color is :" + ExportIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(ExportIcon).build().perform();
		log.info("after Mouse over icon color is :" + ExportIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyImportIcon()
	{
		log.info("--------------------------------------Verifying Export Icon Display------------------------------------");
		return ImportIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_ImportIcon_Color()
	{
		log.info("before Mouse over icon color is :" + ImportIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(ImportIcon).build().perform();
		log.info("after Mouse over icon color is :" + ImportIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyRefreshIcon()
	{
		log.info("--------------------------------------Verifying Refresh Icon Display------------------------------------");
		return RefreshIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_RefreshIcon_Color()
	{
		log.info("before Mouse over icon color is :" + RefreshIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(RefreshIcon).build().perform();
		log.info("after Mouse over icon color is :" + RefreshIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyTerminalIcon()
	{
		log.info("--------------------------------------Verifying Terminal Icon Display------------------------------------");
		return TerminalIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_TerminalIcon_Color()
	{
		log.info("before Mouse over icon color is :" + TerminalIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(TerminalIcon).build().perform();
		log.info("after Mouse over icon color is :" + TerminalIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyDatabaseIcon()
	{
		log.info("--------------------------------------Verifying Database Icon Display------------------------------------");
		return DatabaseIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_DatabaseIcon_Color()
	{
		log.info("before Mouse over icon color is :" + DatabaseIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(DatabaseIcon).build().perform();
		log.info("after Mouse over icon color is :" + DatabaseIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifySearchIcon()
	{
		log.info("--------------------------------------Verifying Search Icon Display------------------------------------");
		return SearchIcon.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_SearchIcon_Color()
	{
		log.info("before Mouse over icon color is :" + SearchIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(SearchIcon).build().perform();
		log.info("after Mouse over icon color is :" + SearchIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnSearchBtn()
	{
		log.info("--------------------------------------Click On Search Btn------------------------------------");
		SearchBtn.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyBulkActionBtn()
	{
		log.info("--------------------------------------Verifying Bulk Action Btn Display------------------------------------");
		return BulkActionBtn.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_BulkActionBtn_Color()
	{
		log.info("before Mouse over icon color is :" + BulkActionBtn.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(BulkActionBtn).build().perform();
		log.info("after Mouse over icon color is :" + BulkActionBtn.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public String verifyingBulkActionBtn()
	{
		log.info("--------------------------------------Verifying Bulk Action Btn Text  ---------------------------------------------");
		return BulkActionBtn.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnBulkActionBtn()
	{
		log.info("--------------------------------------Click On Bulk Action Btn------------------------------------");
		BulkActionBtn.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifySetReqBtn()
	{
		log.info("--------------------------------------Verifying Set Req. Btn Display------------------------------------");
		return SetReqBtn.isDisplayed();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_SetReqBtn_Color()
	{
		log.info("before Mouse over icon color is :" + SetReqBtn.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(SetReqBtn).build().perform();
		log.info("after Mouse over icon color is :" + SetReqBtn.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public String verifyingSetReqBtn()
	{
		log.info("--------------------------------------Verifying Set Req.Btn Text  ---------------------------------------------");
		return SetReqBtn.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnSetReqBtn()
	{
		log.info("--------------------------------------Click On Set Req. Btn------------------------------------");
		SetReqBtn.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyReqFieldCheckbox()
	{
		log.info("--------------------------------------Verify Req.Field Alert-------------------------------------");
		SetReqBtn.click();
		ReqFieldCheckbox.click();
		return ReqFieldCheckbox.isSelected();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public void Check_SaveIconBtn_Color()
	{
		SetReqBtn.click();
		log.info("before Mouse over icon color is :" + SaveIcon.getAttribute("color") );
		Actions action = new Actions(driver);
		action.moveToElement(SaveIcon).build().perform();
		log.info("after Mouse over icon color is :" + SaveIcon.getAttribute("color") );
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnSaveIcon()
	{
		log.info("--------------------------------------Click On Save Icon -----------------------------------");
		SetReqBtn.click();
		SaveIcon.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public Customers_AddressesPage ClickOnAddresses()
	{
		log.info("--------------------------------------Click On Addresses -----------------------------------");
		Actions action = new Actions (driver);
		action.moveToElement(AddressesPage).build().perform();
		return new Customers_AddressesPage();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public Customers_GroupsPage ClickOnGroups()
	{
		log.info("--------------------------------------Click On Groups -----------------------------------");
		Actions action = new Actions (driver);
		action.moveToElement(GroupsPage).build().perform();
		return new Customers_GroupsPage();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public Customers_ShoppingCartsPage ClickOnShoppingCarts()
	{
		log.info("--------------------------------------Click On ShoppingCarts -----------------------------------");
		Actions action = new Actions (driver);
		action.moveToElement(ShoppingCartsPage).build().perform();
		return new Customers_ShoppingCartsPage();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public Customers_CustomerServicePage ClickOnCustomerServices()
	{
		log.info("--------------------------------------Click On CustomerServices -----------------------------------");
		Actions action = new Actions (driver);
		action.moveToElement(CustomerServicePage).build().perform();
		return new Customers_CustomerServicePage();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public Customers_ContactsPage ClickOnContacts()
	{
		log.info("--------------------------------------Click On Contacts -----------------------------------");
		Actions action = new Actions (driver);
		action.moveToElement(ContactsPage).build().perform();
		return new Customers_ContactsPage();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public Customers_TitlesPage ClickOnTitles()
	{
		log.info("--------------------------------------Click On Titles -----------------------------------");
		Actions action = new Actions (driver);
		action.moveToElement(TitlesPage).build().perform();
		return new Customers_TitlesPage();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void AddNewCustomer(String name , String Lastname , String Email , String pswd , String Bdays , String Bmonths , String Byears )
	{
		NewIcon.click();
		Mr_box.click();
		Fname.clear();
		Fname.sendKeys(name);
		Lname.clear();
		Lname.sendKeys(Lastname);
		EmailAdd.clear();
		EmailAdd.sendKeys(Email);
		password.clear();
		password.sendKeys(pswd);
		
		dropDownHelper = new DropDownHelper(driver);
		dropDownHelper.SelectUsingIndex(BdayDays, 8);
		
		dropDownHelper = new DropDownHelper(driver);
		dropDownHelper.SelectUsingVisibleText(BdayMonths, Bmonths);
		
		dropDownHelper = new DropDownHelper(driver);
		dropDownHelper.SelectUsingIndex(BdayYears, 26);
		
		Save.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
