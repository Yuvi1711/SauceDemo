package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.saucedemo.POMPack.LoginPOMClass;
import com.saucedemo.utilityPack.UtilityClass;

public class TestBaseClass {
  WebDriver driver;
  
  Logger log=Logger.getLogger("SauceDemoProject");
  
  @Parameters("browserName")
  @BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./DriverFile/chromedriver.exe");

			driver = new ChromeDriver();
		}
		else
		{	
			System.setProperty("webdriver.gecko.driver","./DriverFile/geckodriver.exe");

			driver = new FirefoxDriver();
		}	
	
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser is opened");
	
//		System.out.println("Browser is opened");	
		
		driver.manage().window().maximize();
//		System.out.println("Browser is maximzed");
		log.info("Browser is maximzed");
		
		driver.get("https://www.saucedemo.com/");
//		System.out.println("Url is opened");
//		System.out.println("Went on LoginPage");
		log.info("Url is opened");
		log.info("Went on LoginPage");

		
		//take screenshot
		UtilityClass.Screenshot(driver, "loginPage-22Oct");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//loginActivity
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.sendUsername();
//		System.out.println("Username is entered");
		log.info("username is entered");

		
		lp.sendPassword();
//		System.out.println("Password is entered");
		log.info("Password is entered");
		
		lp.clickLoginButton();
//		System.out.println("Clicked on login Button");
		log.info("Clicked on login Button");

		//homePage
//		System.out.println("Went on HomePage");
		log.info("Went on HomePage");

	}
	
	@AfterMethod
	public void tearDown()
	{	
		driver.quit();
//		System.out.println("browser is closed");
		log.info("Browser is closed");

	}



}
