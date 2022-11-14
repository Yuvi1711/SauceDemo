package com.saucedemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOM;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	
	@Test
	public void verifyLogOut()
	{
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickOnMenuButton();
//		System.out.println("Clicked on menu Button");
		log.info("Clicked on menu button");

		
		hp.clickOnLogOutButton();
//		System.out.println("Clicked on logOut Button");
		log.info("Clicked on logout button");

		
		//loginPage
//		System.out.println("Went on LoginPage");
		log.info("Went on LoginPage");

		
		//validation
//		System.out.println("Apply validation");	
		log.info("Apply Validation");

		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle =driver.getTitle();	
		
//		Assertion
		Assert.assertEquals(actaulTitle, expectedTitle);
				
	}

}
