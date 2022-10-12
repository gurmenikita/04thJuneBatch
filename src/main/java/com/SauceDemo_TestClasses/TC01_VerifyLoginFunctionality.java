package com.SauceDemo_TestClasses;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo_POMClasses.login_Page_POM;
import com.SauceDemo_utilityClass.ScreenshotClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	
	@Test
	public void verifyLoginFunctionality() throws IOException
	{
		ScreenshotClass.takesScreenshot(driver);
	
		//validation		
	String expectedTitle = "Swag Labs";
			
	String actualTitle = driver.getTitle();
		
	Assert.assertEquals(actualTitle, expectedTitle);
	
//	if(expectedTitle.equals(actualTitle))
//	{
//		System.out.println("login functionality test case is passed");
//	}
//	else
//	{
//		System.out.println("login functionality test case is failed");
//	}
	}		

			
				
}			

