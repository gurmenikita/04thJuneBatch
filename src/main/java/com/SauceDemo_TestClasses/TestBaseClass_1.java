package com.SauceDemo_TestClasses;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo_POMClasses.Home_Page_POM;
import com.SauceDemo_POMClasses.login_Page_POM;
import com.SauceDemo_utilityClass.ScreenshotClass;

public class TestBaseClass_1
{
	public WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
		"S:\\Testing\\Software\\chromedriver_win32\\chromedriver.exe");
												
		driver = new ChromeDriver();
		}				
		else
		{
			System.setProperty("webdriver.gecko.driver",
			"S:\\Testing\\Software\\geckodriver-v0.31.0-win64\\geckodriver.exe");
													
			driver = new FirefoxDriver();
		}
		
		System.out.println("browser is opened");
										
		driver .manage().window().maximize();
		System.out.println("browser is maximized");
										
		driver.get("https://www.saucedemo.com/");
		System.out.println("Saucedemo URL is open");
						
		//loginPage
		ScreenshotClass.takesScreenshot(driver);
						
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
						
	login_Page_POM x = new login_Page_POM(driver);
							
	x.sendUsername();
	System.out.println("username is entered");
							
	x.sendPassword();
	System.out.println("Password is entered");
							
	x.clickonloginButton();
	System.out.println("Clicked on login button");
			
	ScreenshotClass.takesScreenshot(driver);
	
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		
		Home_Page_POM b = new Home_Page_POM(driver);
		b.clickMenuButton();
		b.clickLogoutButton();
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
		System.out.println("browser is closed");
						
		System.out.println("end of program");
	
	}
	
}
