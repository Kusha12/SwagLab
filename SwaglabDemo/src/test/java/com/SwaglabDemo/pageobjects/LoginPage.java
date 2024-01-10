package com.SwaglabDemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	 @FindBy(xpath="//input[@id='user-name']")
	 WebElement untbx;
	 @FindBy(xpath="//input[@id='password']")
	 WebElement pwdtbx;
	 @FindBy(xpath="//input[@id='login-button']")
	 WebElement loginbtn;
	 
	 public LoginPage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
	 }

	public void setUntbx(String uname)
	{
		untbx.sendKeys(uname);
	}

	public void setPwdtbx(String pwd)
	{
		pwdtbx.sendKeys(pwd);
	}

	public void setLoginbtn() 
	{
		loginbtn.click();
	}
}