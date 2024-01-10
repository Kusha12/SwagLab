package com.SwaglabDemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCartPage {
	WebDriver ldriver;
	public ProductCartPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkoutbtn;
	
	
	public void checkoutbtn() {
		checkoutbtn.click();
	}


}
