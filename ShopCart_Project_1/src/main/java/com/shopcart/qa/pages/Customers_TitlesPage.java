package com.shopcart.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class Customers_TitlesPage extends TestBase {
	
	@FindBy(xpath="//li[@class='breadcrumb-container']//a[contains(text(),'Customers')]")
	WebElement CustomersText;
	
	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Titles')]")
	WebElement TitleText;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement TitlesPageTitle;
	
	@FindBy(xpath="//a[@id='page-header-desc-gender-new_gender']//i[@class='process-icon-new']")
	WebElement AddNewIcon;
	
	@FindBy(xpath="//div[contains(text(),'Add new title')]")
	WebElement AddNewTitleText;
	
	@FindBy(xpath="//div[@class='panel-heading']")
	WebElement PanelHeading;
	
	@FindBy(xpath="//input[@id='name_1']")
	WebElement SocialTitle;
	
	@FindBy(xpath="//button[@id='gender_form_submit_btn']")
	WebElement SaveBtn;
	
	@FindBy(xpath="//i[@class='process-icon-cancel']")
	WebElement CancelBtn;
	
	@FindBy(xpath="//tr[5]//td[6]//div[1]//div[1]//button[1]")
	WebElement DropDown5;
	
	@FindBy(xpath="//div[@class='btn-group pull-right open']//ul[@class='dropdown-menu']//a[1]")
	WebElement DeleteTitle;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[6]/div[1]/form[2]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[1]/input[1]")
	WebElement checkbox;
	
	
	
	
	
	public Customers_TitlesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCurrentTitle()
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

	public String verifyTitlesText()
	{
		return TitleText.getText();
	}

	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnTitleText()
	{
		TitleText.click();
	}

	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public String verifyTitlesPageTitle()
	{
		return TitlesPageTitle.getText();
	}

	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAddNewIcon()
	{
		return AddNewIcon.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_AddNewIcon_Color()
	{
		log.info("before mouse over the element color is :" + AddNewIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(AddNewIcon).build().perform();
		log.info("after mouse over the element color is :" + AddNewIcon.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnAddNewTitleIcon()
	{
		AddNewIcon.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public String verifyAddNewTitleText()
	{
		return AddNewTitleText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------

	public void ClickOnAddNewTitleText()
	{
		AddNewTitleText.click();
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

	public void AddNewTitle(String title)
	{
		AddNewIcon.click();
		SocialTitle.sendKeys(title);
		SaveBtn.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	public void DeleteTitleItem() 
	{
//		DesiredCapabilities chrome = DesiredCapabilities.chrome();
//		chrome.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

		
		Actions action = new Actions(driver);
		action.moveToElement(DropDown5).build().perform();
		
		DropDown5.click();
		DeleteTitle.click();
		
		Alert alert  = driver.switchTo().alert();
		
		//String alertMsg = driver.switchTo().alert().getText();
		
	//	System.out.println(alertMsg);
		
		alert.accept();
		
		
//		driver.switchTo().alert().sendKeys("Helllo"); //Error : - User dialog does not have a text box input field.
//		alert.accept();
//		System.out.println(alert.getText());
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	

}
