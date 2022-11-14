package com.saucedemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOM;

public class TC03_Verify_BagProduct_AddToCart_Functionality extends TestBaseClass
{

	@Test
	public void verifyBagProductAddToCart() 
	{
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickAddToCartBagButton();
//		System.out.println("Bag Product is selected");
		log.info("Bag Product is selected");

		
		//validation
//		System.out.println("Apply Validation");
		log.info("Apply validation");

		
		String exepctedProductCount = "1";	
		String actualProductCount = hp.getTextOfAddToCartButton();
	
//		Assertion
		Assert.assertEquals(actualProductCount, exepctedProductCount);
	}
	
	

}
