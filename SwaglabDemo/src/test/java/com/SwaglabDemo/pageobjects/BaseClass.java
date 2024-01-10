package com.SwaglabDemo.pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.*;

import com.SwaglabDemo.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig r=new ReadConfig();
	public String url=r.getApplicationUrl();
	public String username=r.getUsername();
	public String password=r.getPassword();
	String browser = r.getBrowser();
	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

	/*public static String ScreenShot(WebDriver driver,String testname) 
	{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		//step2: call getScreenshotAs method to create image file
		File src = screenshot.getScreenshotAs(OutputType.FILE);

		String destination=System.getProperty("user.dir")+"\\Screenshot\\"+testname+"_"+dateName +".png";

		File dest = new File(destination);

		//step3: copy image file to destination
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destination;
	}*/

}