package com.SauceDemo_TestClasses;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo_POMClasses.login_Page_POM;
import com.SauceDemo_utilityClass.ScreenshotClass;

public class TestBaseClass 
{
	WebDriver driver;
	Logger log = Logger.getLogger("SauceDemo");
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
			"./Driver_Files\\chromedriver.exe");
											
			driver = new ChromeDriver();
		}				
		else
		{
			System.setProperty("webdriver.gecko.driver",
			"./Driver_Files\\geckodriver.exe");
													
			driver = new FirefoxDriver();
		}
	
	PropertyConfigurator.configure("log4j.properties");
		
	log.info("browser is opened");			
	
	driver .manage().window().maximize();
	log.info("browser is maximized");
									
	driver.get("https://www.saucedemo.com/");
	log.info("Saucedemo URL is open");
					
	//loginPage
	ScreenshotClass.takesScreenshot(driver);
					
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
							
	login_Page_POM x = new login_Page_POM(driver);
							
	x.sendUsername();
	log.info("username is entered");
							
	x.sendPassword();
	log.info("Password is entered");
							
	x.clickonloginButton();
	log.info("Clicked on login button");
			
	ScreenshotClass.takesScreenshot(driver);
	
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		log.info("browser is closed");
						
		log.info("end of program");

	}
}
