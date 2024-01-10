package com.SwaglabDemo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListener extends TakeScreenShotClass implements ITestListener{
	ExtentReports report=ExtentManager.getExtentReport();
	ExtentTest eTest;
	public void onTestStart(ITestResult result) {
		String testname=result.getName();

		eTest=report.createTest(testname);
		eTest.log(Status.INFO, testname+"Execution started");
	}

	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();
		eTest.log(Status.PASS,testname+"got successfully executed");

	}

	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		 eTest.log(Status.FAIL,testname+"got failed");
		 WebDriver driver = null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 eTest.addScreenCaptureFromPath(teakescreenshot(driver,testname),testname);

	}

	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();
		eTest.log(Status.SKIP,testname+"skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
		report.flush();

	}

}
