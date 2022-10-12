package com.SauceDemo_utilityClass;

import java.io.File;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass
{
	public static void takesScreenshot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & hh-mm-ss");
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File seleniumFile= ts.getScreenshotAs(OutputType.FILE);	
		File myFile = new File("./Screenshot_Folder\\SauceDemo" +date+ ".jpg");
		FileHandler.copy(seleniumFile, myFile);
	}
	

}
