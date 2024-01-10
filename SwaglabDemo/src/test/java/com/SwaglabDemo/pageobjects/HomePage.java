package com.SwaglabDemo.pageobjects;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//div[normalize-space()='Sauce Labs Backpack']")
	WebElement backpacklink;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocartbtn;
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartbtn;
	public void Clickbackpack() {
		backpacklink.click();
	}
	public void Addtocart() {
		addtocartbtn.click();
	}
	public void Cartbtn() {
		cartbtn.click();
	}
	@FindBy(xpath="//span[@class='title']")
	WebElement txt;
	public String getTxt() {
		String text = txt.getText();
		return text;
	}
}
