package com.SwaglabDemo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductOverviewPage {
	WebDriver ldriver;

	public ProductOverviewPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}


	@FindBy(xpath="//button[@id='finish']")
	WebElement finishbtn;

	public void ClickFinishbtn() {
		finishbtn.click();
	}
}
            