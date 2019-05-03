package com.shopcart.qa.testpages;

import org.testng.Assert;
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
	
	
	@Test
	public void verifyDashboardTitle()
	{
		String actual = dashboard.verifyDashboardTitle();		
		Assert.assertEquals(actual, "abc");
		log.info(actual);
		
	}
	
}

