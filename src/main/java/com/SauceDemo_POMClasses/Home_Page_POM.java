package com.SauceDemo_POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page_POM 
{
	private WebDriver driver;
	private Select s;

	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menuButton;
	
	public void clickMenuButton()
	{
		menuButton.click();
	}
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutButton;
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagElement;
	
	public void clickBagButton()
	{
		bagElement.click();
	}


	public Home_Page_POM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
		s = new Select(DropDown);
	}
	

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addToCart;
	
	public String getTextFromAddToCart()
	{
		String totalProducts = addToCart.getText();
		return totalProducts;
	}
	
	//multiple product element
	//for loop not select all product
	//so we use for each loop
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allProducts;
	
	public void clickAllProducts()
	{
		for(int i=0;i<allProducts.size();i++)
		{
			allProducts.get(i).click();
		}
	}
	
//	//for each loop
//	@FindBy(xpath="//button[text()='Add to cart']")
//	private List<WebElement> allProducts;  
//		
//	public void clickAllProducts()
//	{
//		for(int i=0; i<allProducts.size(); i++)
//		{
//			allProducts.get(i).click();
//		}
//			
//		for(WebElement i : allProducts)
//		{
//			i.click();
//		}		
//	}
	
	//DropDown Element Filter
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement DropDown;
	
	public void clickDropDownFilter()
	{
		DropDown.click();
		//above we declare
//		Select s = new Select(DropDown);
		s.selectByValue("lohi");
	}

}
