package com.SwaglabDemo.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShotClass {
	public String teakescreenshot(WebDriver driver,String testname) {
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);

		//step2: call getScreenshotAs method to create image file

		File src = screenshot.getScreenshotAs(OutputType.FILE);

		File dest = new File(System.getProperty("user.dir") + "\\Screenshots\\" + testname + ".png");
		String abpath = dest.getAbsolutePath();
		try {
			//step3: copy image file to destination
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return abpath;
	}

}
