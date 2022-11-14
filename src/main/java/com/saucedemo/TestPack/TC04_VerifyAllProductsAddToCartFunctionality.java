package com.saucedemo.TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePagePOM;

public class TC04_VerifyAllProductsAddToCartFunctionality extends TestBaseClass 
{
	@Test
	public void verifyAllProductsAddToCart()
	{
		//all products select
		HomePagePOM hp = new HomePagePOM(driver);
		hp.clickAllProducts();
//		System.out.println("All products will be get selected");
		log.info("All products will be get selected");

		
		//validation
//		System.out.println("Apply Validation");
		log.info("Apply validation");

				
		String exepctedProductCount = "3";	
		String actualProductCount = hp.getTextOfAddToCartButton();
//		System.out.println("total products selected are->"+actualProductCount);
		log.info("total products selected are->\"+actualProductCount");

		
		
//		Assertion
		Assert.assertEquals(actualProductCount, exepctedProductCount);
	}
}