package com.shopcart.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.shopcart.qa.util.DropDownHelper;
import com.shopcart.qa.util.TestUtil;
import com.shopcart.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = Logger.getLogger(TestBase.class.getName());
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public DropDownHelper dropDownHelper;
	
	
	public TestBase() {
			try {
					prop = new Properties();
					PropertyConfigurator.configure("C:\\Users\\Lenovo\\gitShopCartProject_POM\\ShopCart_Project_1\\src\\main\\java\\com\\shopcart\\qa\\config\\log4j.properties");
					FileInputStream fip = new FileInputStream("C:\\Maven Projects\\ShopCart_Project_1\\src\\main\\java\\com\\shopcart\\qa\\config\\config.properties");
					prop.load(fip);
			} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			log.info("**************Setting the System Properties****************");
			System.getProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\gitShopCartProject_POM\\ShopCart_Project_1\\src\\main\\java\\com\\shopcart\\qa\\exeDriverFile\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FireFox")){
			System.getProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\gitShopCartProject_POM\\ShopCart_Project_1\\src\\main\\java\\com\\shopcart\\qa\\exeDriverFile\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;		
		
		
		log.info("**************Launching the WebDriver*****************");
		log.info("**************Maximizing the Web Window************");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();		
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		log.isTraceEnabled();
		log.isDebugEnabled();
				
	}
	
	public static void failed(String methodName) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Lenovo\\gitShopCartProject_POM\\ShopCart_Project_1\\screenshots" + methodName + "_" + ".jpg"));
	}
	

}
