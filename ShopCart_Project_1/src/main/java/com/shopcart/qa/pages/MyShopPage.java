package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class MyShopPage extends TestBase {
	
	@FindBy(xpath="//ul[@id='blocknewproducts']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//span[contains(text(),'Add to cart')]")
	WebElement PrintedSummerDressLink;
	
	
	public MyShopPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddToCartItem()
	{
		Actions action = new Actions(driver);
		action.moveToElement(PrintedSummerDressLink).click(PrintedSummerDressLink).build().perform();
	}
}
