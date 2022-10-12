package com.SauceDemo_TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo_POMClasses.Home_Page_POM;
import com.SauceDemo_utilityClass.ScreenshotClass;

public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void VerifyLogoutFunctionality() throws IOException
	{
		//home page functionality
		Home_Page_POM b = new Home_Page_POM(driver);
		b.clickMenuButton();
		b.clickLogoutButton();
		
		ScreenshotClass.takesScreenshot(driver);	
	//login page
		
	String expectedTitle = "Swag Labs";
				
	String actualTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle, expectedTitle);
				
//	if(expectedTitle.equals(actualTitle))
//	{
//		System.out.println("logout functionality test case is passed");
//	}
//	else
//	{
//		System.out.println("logout functionality test case is failed");
//	}
	}
	

}
