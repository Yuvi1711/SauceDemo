package com.saucedemo.utilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class UtilityClass {

	public static void Screenshot(WebDriver driver,String Yuvi1) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;		
		File  sourceFile = ts.getScreenshotAs(OutputType.FILE);     //byte format		
		File destFile = new File("./Screenshot/"+Yuvi1+".jpg");		
		FileHandler.copy(sourceFile, destFile);	

	}

}
