package com.shopcart.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopcart.qa.base.TestBase;
import com.shopcart.qa.pages.AdminLoginPage;
import com.shopcart.qa.pages.Dashboard;

public class AdminLoginPageTest extends TestBase {
	
	AdminLoginPage adminLoginPage;
	Dashboard	dashboard;
	
	
	@BeforeMethod
	public void setEnv() {
		initialization();
		adminLoginPage = new AdminLoginPage();
		}
	
	@Test(priority=1)
	public void verifyUrlTitleTest() 
	{
		String actual = adminLoginPage.verifyPageTitle();
		String expected = "ShopCartt > Administration panel (PrestaShop™)";
		Assert.assertEquals(actual, expected );
		log.info("Actual : " + actual);
		log.info("Expected :" + expected);
		log.info("===============================================================================================");
	}	
	
	@Test(priority=2)
	public void verifyUrlLogoLinkTest() 
	{
		boolean logo = adminLoginPage.verifyUrlLogoLink();
		Assert.assertTrue(logo);
		log.info(logo);
		log.info("===============================================================================================");
	}
	
	@Test(priority=3)
	public void verifyUrlVersionTextTest() 
	{
		String actual = adminLoginPage.verifyUrlVersionText();
		String expected = "1.6.1.23";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected :" + expected);
		log.info("===============================================================================================");
	}
	
	@Test(priority=4)
	public void verifyUrlImageTest() 
	{
		boolean img = adminLoginPage.verifyUrlImage();
		Assert.assertTrue(img);
		log.info(img);
		log.info("===============================================================================================");
	}
	
	@Test(priority=5)
	public void verifyShopCarttTextTest() 
	{
		String actual = adminLoginPage.verifyShopCarttText();
		String expected = "ShopCartt";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected :" + expected);
		log.info("===============================================================================================");
	}
	
	@Test(priority=6)
	public void verifyStayLoggedInTextTest() 
	{
		String actual = adminLoginPage.verifyStayLoggedInText();
		String expected = "Stay logged in";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected :" + expected);
		log.info("===============================================================================================");
	}
	
	@Test(priority=7)
	public void ClickOnStayLoggedInCheckboxTest() 
	{
		adminLoginPage.ClickOnStayLoggedInCheckbox();
		log.info("===============================================================================================");
	}
	
	@Test(priority=8)
	public void verifyUrlRightsLinkTest() 
	{
		boolean b = adminLoginPage.verifyUrlRightsLink();
		Assert.assertTrue(b);
		log.info(b);
		log.info("===============================================================================================");
	}	
	
	@Test(priority=9)
	public void verifyTwitterIconLinkTest() 
	{
		boolean logo = adminLoginPage.verifyTwitterIconLink();
		Assert.assertTrue(logo);
		log.info(logo);
		log.info("===============================================================================================");
	}
	
	@Test(priority=10)
	public void verifyFacebookIconLinkTest() 
	{
		boolean logo = adminLoginPage.verifyFacebookIconLink();
		Assert.assertTrue(logo);
		log.info(logo);
	}
	
	@Test(priority=11)
	public void verifyGithubIconLinkTest() 
	{
		boolean logo = adminLoginPage.verifyGithubIconLink();
		Assert.assertTrue(logo);
		log.info(logo);
		log.info("===============================================================================================");
	}
	
	@Test(priority=12)
	public void verifyGooglePlusLinkTest() 
	{
		boolean logo = adminLoginPage.verifyGooglePlusLink();
		Assert.assertTrue(logo);
		log.info(logo);
		log.info("===============================================================================================");
	}
	
	@Test(priority=13)
	public void blankAdminLoginDetailsTest() 
	{
		adminLoginPage.BlankAdminLoginDetails("", "");
		log.info("===============================================================================================");
	}
	
	@Test(priority=14)
	public void InvalidAdminLoginDetailsTest() 
	{
		adminLoginPage.InvalidAdminLoginDetails(prop.getProperty("invalidEmail"), prop.getProperty("invalidPassword"));
		log.info("===============================================================================================");
	}
	
	@Test(priority=15)
	public void InvalidPasswordTest() 
	{
		adminLoginPage.InvalidPassword(prop.getProperty("email"), prop.getProperty("invalidPassword"));
		log.info("===============================================================================================");
	}
	
	@Test(priority=16)
	public void InvalidEmailValidFormatTest() 
	{
		adminLoginPage.InvalidEmailValidFormat("xyz@gmail.com", prop.getProperty("password"));
		log.info("===============================================================================================");
	}
	
	@Test(priority=17)
	public void InvalidEmailInvalidFormatTest() 
	{
		adminLoginPage.InvalidEmailInvalidFormat("abcdefg", prop.getProperty("password"));
		log.info("===============================================================================================");
	}
	
	@Test(priority=18)
	public void BlankEmailValidPasswordTest() 
	{
		adminLoginPage.BlankEmailValidPassword("", "password");
		log.info("===============================================================================================");
	}
	
	@Test(priority=19)
	public void ValidEmailFormatInvalidPasswordFormatTest() 
	{
		adminLoginPage.ValidEmailFormatInvalidPasswordFormat("abc@gmail.com", "ab@c");
		log.info("===============================================================================================");
	}
	
	@Test(priority=20)
	public void ValidEmailBlankPasswordTest() 
	{
		adminLoginPage.ValidEmailBlankPassword(prop.getProperty("email"), "");
		log.info("===============================================================================================");
	}	
	
	@Test(priority=21)
	public void enterValidAdminLoginDetailsTest() 
	{
		dashboard = adminLoginPage.enterValidAdminLoginDetails(prop.getProperty("email"), prop.getProperty("password"));
		log.info("===============================================================================================");
	}
	
	@Test(priority=22)
	public void verifyEmailPlaceholderTest() 
	{
		String actual = adminLoginPage.verifyEmailPlaceholder();
		String expected = " test@example.com";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected :" + expected);
		log.info("===============================================================================================");
	}
	
	@Test(priority=23)
	public void verifyPasswordPlaceholderTest() 
	{
		String actual = adminLoginPage.verifyPasswordPlaceholder();
		String expected = " Password";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected :" + expected);
		log.info("===============================================================================================");
	}
	
	@Test(priority=24)
	public void check_LoginButton_colorTest() 
	{
		adminLoginPage.check_LoginButton_color();
		log.info("===============================================================================================");
	}
	
	@Test(priority=25)
	public void verifyLoginTextTest() 
	{
		String actual = adminLoginPage.verifyLoginText();
		String expected = "LOG IN";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected :" + expected);
		log.info("===============================================================================================");
	}
	
	
	@Test(priority=26)
	public void forgotPasswordLinkTest() 
	{
		String actual = adminLoginPage.forgotPasswordLink();
		String expected = "I forgot my password";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);		
		log.info("===============================================================================================");
	}
	
	@Test(priority=27)
	public void urlRightTextTest() 
	{
		String actual = adminLoginPage.urlRightText();
		String expected = "© PrestaShop™ 2007-2019 - All rights reserved";
		Assert.assertEquals(actual, expected);
		log.info("Actual : " + actual);
		log.info("Expected : " + expected);
		log.info("===============================================================================================");
	}
		
	@Test(priority=28)
	public void check_twitter_logo_colorTest() 
	{
		adminLoginPage.check_twitter_logo_color();
		log.info("===============================================================================================");
	}
	
	@Test(priority=29)
	public void check_facebook_logo_colorTest() 
	{
		adminLoginPage.check_facebook_logo_color();
		log.info("===============================================================================================");
	}
	
	@Test(priority=30)
	public void check_github_logo_colorTest() 
	{
		adminLoginPage.check_github_logo_color();
		log.info("===============================================================================================");
	}
	
	@Test(priority=31)
	public void check_googleplus_logo_colorTest() 
	{
		adminLoginPage.check_googleplus_logo_color();
		log.info("===============================================================================================");
	}
	
	@Test(priority=32)
	public void ClickOnForgotPasswordLinkTest() 
	{
		adminLoginPage.ClickOnForgotPasswordLink();
		log.info("===============================================================================================");
	}
	
	@Test(priority=33)
	public void ClickOnTwitterIconTest() 
	{
		adminLoginPage.ClickOnTwitterIcon();
		log.info("===============================================================================================");
	}
	
	@Test(priority=34)
	public void ClickOnGithubIconTest() 
	{
		adminLoginPage.ClickOnGithubIcon();
		log.info("===============================================================================================");
	}
	
	@Test(priority=35)
	public void ClickOnFacebookIconTest() 
	{
		adminLoginPage.ClickOnFacebookIcon();
		log.info("===============================================================================================");
	}
	
	@Test(priority=36)
	public void ClickOnGooglePlusIconTest() 
	{
		adminLoginPage.ClickOnGooglePlusIcon();
		log.info("===============================================================================================");
	}
		
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}
