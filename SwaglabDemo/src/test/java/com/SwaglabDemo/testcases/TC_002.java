package com.SwaglabDemo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwaglabDemo.pageobjects.BaseClass;
import com.SwaglabDemo.pageobjects.HomePage;

public class TC_002 extends BaseClass
{
	
	WebDriver driver;
	@Test(priority = 2 )
	public void gettext() {
		String Atext = "Swag Labs";
		HomePage h1=new HomePage(driver);
		String Etext = h1.getTxt();
		Assert.assertEquals(Atext, Etext);
	}
}