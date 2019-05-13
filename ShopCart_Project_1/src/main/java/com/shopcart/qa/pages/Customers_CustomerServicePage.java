package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class Customers_CustomerServicePage extends TestBase {
	
	@FindBy(xpath="//li[@class='breadcrumb-container']//a[contains(text(),'Customers')]")
	WebElement Customers;

	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Customer Service')]")
	WebElement CustomerServicesText;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement CustomerServicesPageTitle;
	
	@FindBy(xpath="//div[@class='kpi-content']//i[@class='icon-envelope']")
	WebElement EnvelopeIcon;
	
	@FindBy(xpath="//span[contains(text(),'Pending Discussion Threads')]")
	WebElement PendingDiscussionThreads;
	
	@FindBy(xpath="//div[@class='kpi-content']//i[@class='icon-time']")
	WebElement TimeIcon;
	
	@FindBy(xpath="//span[contains(text(),'Average Response Time')]")
	WebElement AverageResponseTime;
	
	@FindBy(xpath="//i[@class='icon-copy']")
	WebElement CopyIcon;
	
	@FindBy(xpath="//span[contains(text(),'Messages per Thread')]")
	WebElement MessagesPerThread;
	
	@FindBy(xpath="//button[@class='close refresh']//i[@class='process-icon-refresh']")
	WebElement RefreshIcon;
	
	@FindBy(xpath="//div[contains(text(),'Webmaster')]")
	WebElement Webmaster;
	
	@FindBy(xpath="//div[contains(text(),'Customer service')]")
	WebElement CustomerService;
	
	@FindBy(xpath="//div[contains(text(),'Meaning of status')]")
	WebElement MeaningOfStatus;
	
	@FindBy(xpath="//div[contains(text(),'Statistics')]")
	WebElement Statistics;
	
	@FindBy(xpath="//div[@id='customer_thread_fieldset_contact']//i[@class='process-icon-save']")
	WebElement CustomerOption_Save;
	
	@FindBy(xpath="//input[@name='PS_SAV_IMAP_URL']")
	WebElement IMAP_URL;
	
	@FindBy(xpath="//div[@id='customer_thread_fieldset_general']//button[@name='submitOptionscustomer_thread'][contains(text(),'Save')]")
	WebElement CustomerServiceOption_Save;	
	

	
	public Customers_CustomerServicePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCurrentTitle()
	{
		return driver.getTitle();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCustomers()
	{
		Customers.click();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyCustomerServicesText()
	{
		return CustomerServicesText.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCustomerServicesText()
	{
		CustomerServicesText.click();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyCustomerServicesPageTitle()
	{
		return CustomerServicesPageTitle.getText();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyEnvelopeIcon()
	{
		return EnvelopeIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyPendingDiscussionThreads()
	{
		return PendingDiscussionThreads.getText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyTimeIcon()
	{
		return TimeIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyAverageResponseTime()
	{
		return AverageResponseTime.getText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyCopyIcon()
	{
		return CopyIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyMessagesPerThread()
	{
		return MessagesPerThread.getText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyRefreshIcon()
	{
		return RefreshIcon.isDisplayed();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_RefreshIcon_Color()
	{
		log.info("before mouse over the element color is :" + RefreshIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(RefreshIcon).build().perform();
		log.info("after mouse over the element color is :" + RefreshIcon.getCssValue("color"));
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnRefreshIcon()
	{
		RefreshIcon.click();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyWebmaster()
	{
		return Webmaster.getText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyCustomerService()
	{
		return CustomerService.getText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyMeaningOfStatus()
	{
		return MeaningOfStatus.getText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyStatistics()
	{
		return Statistics.getText();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyCustomerOption_Save()
	{
		return CustomerOption_Save.isDisplayed();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_CustomerOption_Save_Color()
	{
		log.info("before mouse over the element color is :" + CustomerOption_Save.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(CustomerOption_Save).build().perform();
		log.info("after mouse over the element color is :" + CustomerOption_Save.getCssValue("color"));
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCustomerOption_Save()
	{
		CustomerOption_Save.click();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyCustomerServiceOption_Save()
	{
		return CustomerServiceOption_Save.isDisplayed();
	}		
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_CustomerServiceOption_Save_Color()
	{
		log.info("before mouse over the element color is :" + CustomerServiceOption_Save.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(CustomerServiceOption_Save).build().perform();
		log.info("after mouse over the element color is :" + CustomerServiceOption_Save.getCssValue("color"));
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnCustomerServiceOption_Save()
	{
		CustomerServiceOption_Save.click();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void AddToCustomerServiceOption()
	{
		IMAP_URL.sendKeys("https://www.google.com");
		CustomerServiceOption_Save.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
}
