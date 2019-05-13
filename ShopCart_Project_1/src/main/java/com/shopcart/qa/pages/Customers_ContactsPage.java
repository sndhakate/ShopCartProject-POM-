package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class Customers_ContactsPage extends TestBase {
	
	@FindBy(xpath="//li[@class='breadcrumb-container']//a[contains(text(),'Customers')]")
	WebElement CustomersText;
	
	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Contacts')]")
	WebElement ContactsText;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement ContactsPageTitle;
	
	@FindBy(xpath="//a[@id='page-header-desc-contact-new_contact']//i[@class='process-icon-new']")
	WebElement AddNewContactIcon;
	
	@FindBy(xpath="//div[contains(text(),'Add new contact')]")
	WebElement AddNewContactText;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	WebElement PanelHeading;
	
	@FindBy(xpath="//input[@id='name_1']")
	WebElement nameTitle;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//textarea[@id='description_1']")
	WebElement Description;
	
	@FindBy(xpath="//i[@class='process-icon-save']")
	WebElement SaveBtn;
	
	@FindBy(xpath="//i[@class='process-icon-cancel']")
	WebElement CancelBtn;
	
	
	public Customers_ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyCurrentUrlTitle()
	{
		return driver.getTitle();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyCustomersText()
	{
		return CustomersText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCustomersText()
	{
		CustomersText.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyContactsText()
	{
		return ContactsText.getText();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnContactsText()
	{
		ContactsText.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyContactsPageTitle()
	{
		return ContactsPageTitle.getText();
	}		
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAddNewContactIcon()
	{
		return AddNewContactIcon.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_AddNewContactIcon_Color()
	{
		log.info("before mouse over the element color is :" + AddNewContactIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(AddNewContactIcon).build().perform();
		log.info("after mouse over the element color is :" + AddNewContactIcon.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnAddNewContactIcon()
	{
		AddNewContactIcon.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public String verifyAddNewContactText()
	{
		return AddNewContactText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnAddNewContactText()
	{
		AddNewContactText.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyPanelHeading()
	{
		return PanelHeading.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifySaveBtn()
	{
		return SaveBtn.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_SaveBtn_Color()
	{
		log.info("before mouse over the element color is :" + SaveBtn.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(SaveBtn).build().perform();
		log.info("after mouse over the element color is :" + SaveBtn.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnSaveBtn()
	{
		SaveBtn.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyCancelBtn()
	{
		return CancelBtn.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_CancelBtn_Color()
	{
		log.info("before mouse over the element color is :" + CancelBtn.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(CancelBtn).build().perform();
		log.info("after mouse over the element color is :" + CancelBtn.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCancelBtn()
	{
		CancelBtn.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public void AddNewContact(String name, String emailid , String description )
	{
		AddNewContactIcon.click();
		nameTitle.clear();
		nameTitle.sendKeys(name);
		email.clear();
		email.sendKeys(emailid);
		Description.clear();
		Description.sendKeys(description);
		SaveBtn.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	

}
