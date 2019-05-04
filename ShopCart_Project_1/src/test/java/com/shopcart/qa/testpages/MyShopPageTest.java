package com.shopcart.qa.testpages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.Dashboard;
import com.shopcart.qa.pages.MyShopPage;

public class MyShopPageTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard dashboard;
	MyShopPage myShopPage;
	
	public MyShopPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setEnv() {
		initialization();
		adminLoginPage = new AdminLoginPage();
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		dashboard = new Dashboard();
		myShopPage = dashboard.ClickOnMyShopLink();
	}
	
	@Test
	public void AddToCartItemTest() 
	{
		myShopPage.AddToCartItem();
	}

}
