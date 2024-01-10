package com.SwaglabDemo.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwaglabDemo.pageobjects.BaseClass;
import com.SwaglabDemo.pageobjects.CheckOutInfoPage;
import com.SwaglabDemo.pageobjects.HomePage;
import com.SwaglabDemo.pageobjects.LoginPage;
import com.SwaglabDemo.pageobjects.ProductCartPage;
import com.SwaglabDemo.pageobjects.ProductConformationPage;
import com.SwaglabDemo.pageobjects.ProductOverviewPage;

public class TC_001 extends BaseClass
{
	@Test()
	public void LoginTest()  {
		//log.info("url lunched");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		//log.info("username entered");
		l.setUntbx(username);
		//log.info("user entered password");
		l.setPwdtbx(password);
		l.setLoginbtn();
		//log.info("Login Button Clicked");
		
		HomePage h =new HomePage(driver);
		h.Clickbackpack();
		//log.info("backpack btn clicked");
		h.Addtocart();
		h.Cartbtn();
		
		ProductCartPage p=new ProductCartPage(driver);
		p.checkoutbtn();		//log.info("checkout btn  clicked");
		String FNAME="harish";
		String LNAME="kumar";
		String Zcode="60076";
		CheckOutInfoPage c=new CheckOutInfoPage(driver);
		c.EnterFname(FNAME);
		//log.info("fname entered");
		c.EnterLname(LNAME);
		//log.info("lname entered");
		c.EnterZipCode(Zcode);
		//log.info("zcode entered");
		c.ClickContinueBtn();
		//log.info("continue btn clicked");
		
		ProductOverviewPage p1=new ProductOverviewPage(driver);
		p1.ClickFinishbtn();
	//	log.info("finish btn clicked");

		ProductConformationPage p2=new ProductConformationPage(driver);
		System.out.println(p2.getMessage());
	}
}