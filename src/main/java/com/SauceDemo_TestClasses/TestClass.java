package com.SauceDemo_TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo_POMClasses.Home_Page_POM;

public class TestClass extends TestBaseClass_1
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{
		
	//validation		
	String expectedTitle = "Swag Labs";
			
	String actualTitle = driver.getTitle();
			
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("login functionality test case is passed");
	}
	else
	{
		System.out.println("login functionality test case is failed");
	}
	}	
	
	@Test
	public void VerifyLogoutFunctionality()
	{
		
	//valiation
		
	String expectedTitle = "Swag Labs";
				
	String actualTitle = driver.getTitle();
				
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("login functionality test case is passed");
	}
	else
	{
		System.out.println("login functionality test case is failed");
	}
	}
	
	@Test
	public void VerifyBagAddToCartFunctionality()
	{
		Home_Page_POM HP = new Home_Page_POM(driver);
				
		HP.clickBagButton();
		System.out.println("Bag product will get selected");
		
		
		//validation
		String expectedProduct = "1";
		
		String actualProduct = HP.getTextFromAddToCart();
		System.out.println("actual product - "+actualProduct);
		
		System.out.println("apply validation");
		
		if(expectedProduct.equals(actualProduct))
		{
			System.out.println("Bag product add to cart test case passed");
		}
		else
		{
			System.out.println("Bag product add to cart test case failed");
		}
	}

}
