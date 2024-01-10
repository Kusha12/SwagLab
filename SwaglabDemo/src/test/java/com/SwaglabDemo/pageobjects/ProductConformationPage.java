package com.SwaglabDemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductConformationPage {
	
	
	WebDriver ldriver;
	public ProductConformationPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//h2[normalize-space()='Thank you for your order!']")
	WebElement message;
	 
	public String getMessage() {
		String text = message.getText();
		return text;
	}

}
