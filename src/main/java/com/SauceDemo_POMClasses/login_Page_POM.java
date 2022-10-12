package com.SauceDemo_POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page_POM 
{
	private WebDriver driver;
	private Actions act;
		
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
		
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
		
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
		
//	public void clickonloginButton()
//	{
//		loginButton.click();
//	}

	//or
	//mouse action
	public void clickonloginButton()
	{
		act.click(loginButton).perform();
	}
	
	public login_Page_POM(WebDriver driver)
	{
		this.driver = driver;
	
		PageFactory.initElements(driver, this);
	
		act = new Actions(driver);
	}
		
}
