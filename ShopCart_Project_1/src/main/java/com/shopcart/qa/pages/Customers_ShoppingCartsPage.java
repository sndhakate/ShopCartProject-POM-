package com.shopcart.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class Customers_ShoppingCartsPage extends TestBase {

	@FindBy(xpath="//li[@class='breadcrumb-current']//a[contains(text(),'Shopping Carts')]")
	WebElement ShoppingCartsText;
	
	@FindBy(xpath="//h2[@class='page-title']")
	WebElement ShoppingCartPageTitle;
	
	@FindBy(xpath="//a[@id='page-header-desc-cart-export_cart']//i[@class='process-icon-export']")
	WebElement ExportCartIcon;
	
	@FindBy(xpath="//div[contains(text(),'Export carts')]")
	WebElement ExportCartText;
	
	@FindBy(xpath="//i[@class='icon-sort-by-attributes-alt']")
	WebElement SortIcon;
	
	@FindBy(xpath="//span[contains(text(),'Conversion Rate')]")
	WebElement ConversionRateText;
	
	@FindBy(xpath="//div[@class='kpi-content']//i[@class='icon-shopping-cart']")
	WebElement CartIcon;
	
	@FindBy(xpath="//span[contains(text(),'Abandoned Carts')]")
	WebElement AbandonedCartText;
	
	@FindBy(xpath="//i[@class='icon-money']")
	WebElement MoneyIcon;
	
	@FindBy(xpath="//span[contains(text(),'Average Order Value')]")
	WebElement AverageOrderValueText;
	
	@FindBy(xpath="//div[@class='kpi-content']//i[@class='icon-user']")
	WebElement UserIcon;
	
	@FindBy(xpath="//span[contains(text(),'Net Profit per Visitor')]")
	WebElement NpText;
	
	@FindBy(xpath="//button[@class='close refresh']//i[@class='process-icon-refresh']")
	WebElement RefreshIcon;
	
	@FindBy(xpath="//span[@class='label-tooltip']//i[@class='process-icon-export']")
	WebElement ExportIcon;
	
	@FindBy(xpath="//span[@class='label-tooltip']//i[@class='process-icon-refresh']")
	WebElement RefreshListIcon;
	
	@FindBy(xpath="//div[@class=\"table-responsive-row clearfix\"]//table")
	WebElement Table;
	
	@FindBy(xpath="//tr[2]//td[9]//div[1]//div[1]//button[1]//i[1]")
	WebElement DropDown2;
	
	@FindBy(xpath="//div[@class='btn-group pull-right open']//ul[@class='dropdown-menu']//a[1]")
	WebElement DeleteCart;
	
	@FindBy(xpath="//button[contains(text(),'Bulk actions')]")
	WebElement BulkActions;
	
		
	
	
	
	public Customers_ShoppingCartsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCurrentTitle()
	{
		return driver.getTitle();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyShoppingCartsText()
	{
		return ShoppingCartsText.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnShoppingCartsText()
	{
		ShoppingCartsText.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyShoppingCartPageTitle()
	{
		return ShoppingCartPageTitle.getText();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyExportCartIcon()
	{
		return ExportCartIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_ExportCartIcon_Color()
	{
		log.info("before mouse over the icon color is : " + ExportCartIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(ExportCartIcon).build().perform();
		log.info("after mouse over the icon color is : " + ExportCartIcon.getCssValue("color"));
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnExportCartIcon()
	{
		ExportCartIcon.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyExportCartText()
	{
		return ExportCartText.getText();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnExportCartText()
	{
		ExportCartText.click();
	}	
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifySortIcon()
	{
		return SortIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyConversionRateText()
	{
		return ConversionRateText.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyCartIcon()
	{
		return CartIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyAbandonedCartText()
	{
		return AbandonedCartText.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyMoneyIcon()
	{
		return MoneyIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyAverageOrderValueText()
	{
		return AverageOrderValueText.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyUserIcon()
	{
		return UserIcon.isDisplayed();
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String verifyNpText()
	{
		return NpText.getText();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyRefreshIcon()
	{
		return RefreshIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_RefreshIcon_Color()
	{
		log.info("before mouse over the icon color is : " + RefreshIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(RefreshIcon).build().perform();
		log.info("after mouse over the icon color is : " + RefreshIcon.getCssValue("color"));
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnRefreshIcon()
	{
		RefreshIcon.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyExportIcon()
	{
		return ExportIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_ExportIcon_Color()
	{
		log.info("before mouse over the icon color is : " + ExportIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(ExportIcon).build().perform();
		log.info("after mouse over the icon color is : " + ExportIcon.getCssValue("color"));
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnExportIcon()
	{
		ExportIcon.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------

	public boolean verifyRefreshListIcon()
	{
		return RefreshListIcon.isDisplayed();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void Check_RefreshListIcon_Color()
	{
		log.info("before mouse over the icon color is : " + RefreshListIcon.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(RefreshListIcon).build().perform();
		log.info("after mouse over the icon color is : " + RefreshListIcon.getCssValue("color"));
	}	
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void ClickOnRefreshListIcon()
	{
		RefreshListIcon.click();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void DeleteCartItem()
	{
		Actions action = new Actions(driver);
		action.moveToElement(DropDown2).build().perform();
		DropDown2.click();
		DeleteCart.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	
}
