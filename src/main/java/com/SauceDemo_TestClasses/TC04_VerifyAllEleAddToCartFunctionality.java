package com.SauceDemo_TestClasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo_POMClasses.Home_Page_POM;
import com.SauceDemo_utilityClass.ScreenshotClass;

public class TC04_VerifyAllEleAddToCartFunctionality extends TestBaseClass
{

	@Test
	public void VerifyAllEleAddToCartFunctionality() throws IOException
	{
		
		//home page 
		//bag element 
		Home_Page_POM HP = new Home_Page_POM(driver);
						
		HP.clickAllProducts();
		log.info("All product will get selected");

		ScreenshotClass.takesScreenshot(driver);
		
		//validation
		String expectedProduct = "6";
		
		String actualProduct = HP.getTextFromAddToCart();
		log.info("actual product - "+actualProduct);
		
		log.info("apply validation");
		
		Assert.assertEquals(actualProduct, expectedProduct);
		
//		if(expectedProduct.equals(actualProduct))
//		{
//			System.out.println("all product add to cart test case passed");
//		}
//		else
//		{
//			System.out.println("all product add to cart test case failed");
//		}
	}

	}

