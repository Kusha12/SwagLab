package com.SwaglabDemo.utilities;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {


	public static ExtentTest test;

	public static ExtentReports getExtentReport() {
		ExtentReports extent =new ExtentReports();
		
		ReadConfig r1=new ReadConfig();
		File extenreportfile=new File(System.getProperty("user.dir")+"\\ExtentReports\\reports.html");
		ExtentSparkReporter sparkreport=new ExtentSparkReporter(extenreportfile);
		
		
		extent.setSystemInfo("Machine:", "testpc1");
		extent.setSystemInfo("OS", "windows 11");
		extent.setSystemInfo("browser:", r1.getBrowser());
		extent.setSystemInfo("user name:", "Prachi");

		//configuration to change look and feel of report
		sparkreport.config().setDocumentTitle("Extent Listener Report Demo");
		sparkreport.config().setReportName("This is my First Report");
		sparkreport.config().setTheme(Theme.DARK);
		extent.attachReporter(sparkreport);
		
		
		return extent;
	}

	
}
