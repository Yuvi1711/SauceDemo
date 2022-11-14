package com.saucedemo.POMPack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {
	
	
		//webelement and actions on them maintain
		
		//1.WebDriver declare
//		WebDriver driver;
	    private WebDriver driver;
	

		
		//2.ele find
//		WebElement username= driver.findElement(By.xpath("xpath"));
		
//		@FindBy --->start @ -->annoatation
//		its like a method only
		
		@FindBy(xpath ="//input[@id='user-name']")
		WebElement userName;
		
		//3.Action of ele
		public void sendUsername()
		{
			userName.sendKeys("standard_user");
		}
		
		@FindBy(xpath ="//input[@id='password']")
		WebElement password;
		
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		
		@FindBy(xpath ="//input[@id='login-button']")
		WebElement loginButton;
		
//		public void clickLoginButton()
//		{
//			loginButton.click();
//		}
//		
		//click method-webElement interface
		
		//click method-mouse action
		public void clickLoginButton()
		{
			loginButton.click();;

		}
		//4.Const declared
		public LoginPOMClass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver,this);
//			act = new Actions(driver);
		}
		
		

	

}
