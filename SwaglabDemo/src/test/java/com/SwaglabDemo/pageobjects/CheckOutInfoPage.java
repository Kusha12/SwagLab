package com.SwaglabDemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInfoPage {
	WebDriver ldriver;
	public CheckOutInfoPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	
	WebElement fname;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebtn;
	
	public void EnterFname(String Fname) {
		fname.sendKeys(Fname);
	}
	public void EnterLname(String Lname) {
		lname.sendKeys(Lname);
	}
	
	public void EnterZipCode(String Zcode) {
		zipcode.sendKeys(Zcode);
	}
	
	public void ClickContinueBtn() {
		continuebtn.click();
	}
	
}
