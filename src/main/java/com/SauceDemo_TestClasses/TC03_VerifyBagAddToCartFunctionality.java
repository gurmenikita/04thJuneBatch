package com.SauceDemo_TestClasses;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo_POMClasses.Home_Page_POM;
import com.SauceDemo_utilityClass.ScreenshotClass;

public class TC03_VerifyBagAddToCartFunctionality extends TestBaseClass
{

	@Test
	public void VerifyBagAddToCartFunctionality() throws IOException
	{
	
		//home page 
		//bag element 
		Home_Page_POM HP = new Home_Page_POM(driver);
				
		HP.clickBagButton();
		log.info("Bag product will get selected");
		ScreenshotClass.takesScreenshot(driver);
		
		//validation
		String expectedProduct = "1";
		
		String actualProduct = HP.getTextFromAddToCart();
		log.info("actual product - "+actualProduct);
		
		log.info("apply validation");
		
		Assert.assertEquals(actualProduct, expectedProduct);
		
//		if(expectedProduct.equals(actualProduct))
//		{
//			System.out.println("Bag product add to cart test case passed");
//		}
//		else
//		{
//			System.out.println("Bag product add to cart test case failed");
//		}
	}

	
}
