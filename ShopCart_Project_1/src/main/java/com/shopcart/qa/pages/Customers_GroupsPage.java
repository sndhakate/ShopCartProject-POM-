package com.shopcart.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class Customers_GroupsPage extends TestBase {
	
	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Groups')]")
	WebElement GroupsText;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement GroupsPageTitle;
	
	@FindBy(xpath ="//a[@id='page-header-desc-group-new_group']//i[@class='process-icon-new']")
	WebElement AddNewIcon;
	
	@FindBy(xpath="//div[contains(text(),'Add new group')]")
	WebElement AddNewGroupText;
	
	@FindBy(xpath="//span[@class='label-tooltip']//i[@class='process-icon-new']")
	WebElement AddIcon;
	
	@FindBy(xpath="//i[@class='process-icon-refresh']")
	WebElement RefreshIcon;
	
	@FindBy(xpath="//i[@class='process-icon-terminal']")
	WebElement TerminalIcon;
	
	@FindBy(xpath="//i[@class='process-icon-database']")
	WebElement DatabaseIcon;
	
	@FindBy(xpath="//input[@id='local_groupFilter_date_add_0']")
	WebElement DateFrom;
	
	@FindBy(xpath="//input[@id='local_groupFilter_date_add_1']")
	WebElement DateTo;
	
	@FindBy(xpath="//button[@id='submitFilterButtongroup']")
	WebElement SearchBtn;
	
	
	
	public Customers_GroupsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyCurrentTitle()
	{
		log.info("--------------------------------------------Current Title-----------------------------------------------");
		String title = driver.getTitle();
		return title;		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyGroupsText()
	{
		return GroupsText.getText();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnGroupsText()
	{
		GroupsText.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyGroupsPageTitle()
	{
		return GroupsPageTitle.getText();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAddNewIcon()
	{
		return AddNewIcon.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_AddNewIcon_Color()
	{
		log.info("before mouse over the element color is : " + AddNewIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(AddNewIcon).build().perform();
		log.info("after mouse over the element color is : " + AddNewIcon.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnAddNewIcon()
	{
		AddNewIcon.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyAddNewGroupText()
	{
		return AddNewGroupText.getText();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnAddNewGroupText()
	{
		AddNewGroupText.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyAddIcon()
	{
		return AddIcon.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_AddIcon_Color()
	{
		log.info("before mouse over the element color is : " + AddIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(AddIcon).build().perform();
		log.info("after mouse over the element color is : " + AddIcon.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnAddIcon()
	{
		AddIcon.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyRefreshIcon()
	{
		return RefreshIcon.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_RefreshIcon_Color()
	{
		log.info("before mouse over the element color is : " + RefreshIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(RefreshIcon).build().perform();
		log.info("after mouse over the element color is : " + RefreshIcon.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnRefreshIcon()
	{
		RefreshIcon.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyTerminalIcon()
	{
		return TerminalIcon.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_TerminalIcon_Color()
	{
		log.info("before mouse over the element color is : " + TerminalIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(TerminalIcon).build().perform();
		log.info("after mouse over the element color is : " + TerminalIcon.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnTerminalIcon()
	{
		TerminalIcon.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyDatabaseIcon()
	{
		return DatabaseIcon.isDisplayed();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_DatabaseIcon_Color()
	{
		log.info("before mouse over the element color is : " + DatabaseIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(DatabaseIcon).build().perform();
		log.info("after mouse over the element color is : " + DatabaseIcon.getCssValue("color"));
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnDatabaseIcon()
	{
		DatabaseIcon.click();
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
//	public void SelectDate(WebDriver driver , WebElement element , String dateVal)
//	{
//		DateFrom.click();
//		String dateVal = "08/05/1993";
//		selectDateByJS = (driver , date, dateVal);
//		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
//		javascriptExecutor.executeScript("arguments[0].setAttribute('value','"+dateVal+"')", element);
//	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
}
