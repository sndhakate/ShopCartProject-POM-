package com.shopcart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.qa.base.TestBase;

public class AdminLoginPage extends TestBase {
	
	@FindBy(xpath="//img[@id='logo']")
	WebElement PrestaShopLogo;
	
	@FindBy(xpath="//div[@class='text-center']")
	WebElement versionText;
	
	@FindBy(xpath="//div[@id='shop-img']//img")
	WebElement urlImage;
	
	@FindBy(xpath="//h4[@id='shop_name']")
	WebElement shopCarttText;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailLink;
	
	@FindBy(xpath="//span[@class='help-block']")
	WebElement emailError;
	
	@FindBy(xpath="//li[contains(text(),'The Employee does not exist, or the password provided is incorrect')]")
	WebElement errorPopup;
	
	@FindBy(xpath="//div[@id='error']//ol")
	WebElement invalidPasswordPopup;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement passwordLink;
	
	@FindBy(xpath="//span[contains(text(),'This field is required.') and @for='passwd']")
	WebElement passwordError;
	
	@FindBy(xpath="//div[@class='form-group row-padding-top']//button[@name='submitLogin']")
	WebElement loginBtnLink;
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement loginText;
	
	@FindBy(xpath="//label[@for='stay_logged_in']")
	WebElement stayLoggedInText;
	
	@FindBy(xpath="//input[@id='stay_logged_in']")
	WebElement stayLoggedInCheckBox;
	
	@FindBy(xpath="//a[@class='show-forgot-password pull-right']")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[contains(text(),'© PrestaShop™ 2007-2019 - All rights reserved')]")
	WebElement urlRightsLink;
	
	@FindBy(xpath="//i[@class='icon-twitter']")
	WebElement twitterIconLink;
	
	@FindBy(xpath="//i[@class='icon-facebook']")
	WebElement facebookIconLink;
	
	@FindBy(xpath="//i[@class='icon-github']")
	WebElement githubIconLink;
	
	@FindBy(xpath="//i[@class='icon-google-plus']")
	WebElement googlePlusLink;
		
	
	
	public AdminLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUrlLogoLink() {
		return PrestaShopLogo.isDisplayed();
	}
	
	public String verifyUrlVersionText() {
		return versionText.getText();
	}
	
	public boolean verifyUrlImage() {
		return urlImage.isDisplayed();
	}
	
	public String verifyShopCarttText() {
		return shopCarttText.getText();
	}	
	
	public String verifyStayLoggedInText() {
		return stayLoggedInText.getText();
	}
	
	public void ClickOnStayLoggedInCheckbox() {
		stayLoggedInCheckBox.click();
	}
	
	public boolean verifyUrlRightsLink() {
		return urlRightsLink.isDisplayed();
	}
	
	public boolean verifyTwitterIconLink() {
		return twitterIconLink.isDisplayed();
	}
	
	public boolean verifyFacebookIconLink() {
		return facebookIconLink.isDisplayed();
	}
	
	public boolean verifyGithubIconLink() {
		return githubIconLink.isDisplayed();
	}
	
	public boolean verifyGooglePlusLink() {
		return googlePlusLink.isDisplayed();
	}
	
	// ***********Blank Admin Login
	
	public void BlankAdminLoginDetails(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
		
		String EmailErrorMsg = emailError.getText();
		log.info("Please enter a valid email : " + EmailErrorMsg);
		
		String PasswordErrorMsg = passwordError.getText();
		log.info("Please enter a Password : " + PasswordErrorMsg);				
	}
	
	//************Invalid Email and Password Admin Login
	
	public void InvalidAdminLoginDetails(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
		
		String ErrorPopupMsg = errorPopup.getText();
		log.info("Popup Error : " + ErrorPopupMsg);				
	}
	
	//*************Invalid Password and valid Email Admin Login
	
	public void InvalidPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
		
		String ErrorPopupMsg = errorPopup.getText();
		log.info("Popup Error : " + ErrorPopupMsg);		
	}
	
	//**************Invalid Email valid format Admin Login
	
	public void InvalidEmailValidFormat(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
				
		String ErrorPopupMsg = errorPopup.getText();
		log.info("Popup Error : " + ErrorPopupMsg);		
		}
	
	//***************Invalid Email Invalid format Admin Login
	
	public void InvalidEmailInvalidFormat(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
				
		String EmailErrorMsg = emailError.getText();
		log.info(EmailErrorMsg);
		
		String EmailFormatMsg = emailLink.getAttribute("placeholder");
		log.info("Please enter the email in this format : " + EmailFormatMsg);
		}
	
	//******************Valid Email format , Invalid Password format ( condition for password format is minimum 5 digits or alphabet can also used special char)
	
	public void ValidEmailFormatInvalidPasswordFormat(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
		
		String AlertPopup = invalidPasswordPopup.getText();
		log.info("There is one error : " + AlertPopup);
		
		}	
	
	//******************Blank Email and valid password
	
	public void BlankEmailValidPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
				
		String EmailErrorMsg = emailError.getText();
		log.info("Email Error  Msg : " + EmailErrorMsg);
				
		}
	
	//*******************Valid Email and Blank Password
	
	public void ValidEmailBlankPassword(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
				
		String PasswordErrorMsg = passwordError.getText();
		log.info("Password Error Msg : " + PasswordErrorMsg);
		
		}
	
	
	//******************Valid Admin Login Details
	
	public Dashboard enterValidAdminLoginDetails(String email, String password) {
		emailLink.clear();
		emailLink.sendKeys(email);
		
		passwordLink.clear();
		passwordLink.sendKeys(password);
		
		loginBtnLink.click();
		
		return new Dashboard();		
	}
	
	public String verifyEmailPlaceholder() {
		return emailLink.getAttribute("placeholder");
	}
	
	public String verifyPasswordPlaceholder() {
		return passwordLink.getAttribute("placeholder");
	}
	
	public void check_LoginButton_color() {
		log.info("before mouse over the button color is : " + loginBtnLink.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(loginBtnLink).build().perform();
		log.info("after mouse over the button color is : " + loginBtnLink.getCssValue("color"));
	}
	
	public String verifyLoginText() {
		return loginText.getText();
	}
	
	public String forgotPasswordLink() {
		return forgotPasswordLink.getText();
	}
	
	public String urlRightText() {
		return urlRightsLink.getText();		
	}
	
	public void check_twitter_logo_color() {
		log.info("before mouse over the logo color is : " + twitterIconLink.getCssValue("background-color"));
		Actions action = new Actions(driver);
		action.moveToElement(twitterIconLink).build().perform();
		log.info("after mouse over the logo color is : " + twitterIconLink.getCssValue("color"));
	}
	
	public void check_facebook_logo_color() {
		log.info("before mouse over the logo color is : " + facebookIconLink.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(facebookIconLink).build().perform();
		log.info("after mouse over the logo color is : " + facebookIconLink.getCssValue("color"));
	}	
	
	public void check_github_logo_color() {
		log.info("before mouse over the logo color is : " + githubIconLink.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(githubIconLink).build().perform();
		log.info("after mouse over the logo color is : " + githubIconLink.getCssValue("color"));
	}
	
	public void check_googleplus_logo_color() {
		log.info("before mouse over the logo color is : " + googlePlusLink.getCssValue("color"));
		Actions action = new Actions(driver);
		action.moveToElement(googlePlusLink).build().perform();
		log.info("after mouse over the logo color is : " + googlePlusLink.getCssValue("color"));
	}
	
	public ForgotPasswordPage ClickOnForgotPasswordLink() {
		forgotPasswordLink.click();
		return new ForgotPasswordPage();
	}
	
	public TwitterPage ClickOnTwitterIcon() {
		twitterIconLink.click();
		return new TwitterPage();
	}
	
	public GithubPage ClickOnGithubIcon() {
		githubIconLink.click();
		return new GithubPage();
	}
	
	public FacebookPage ClickOnFacebookIcon() {
		facebookIconLink.click();
		return new FacebookPage();
	}
	
	public GooglePlusPage ClickOnGooglePlusIcon() {
		googlePlusLink.click();
		return new GooglePlusPage();
	}
	
}
