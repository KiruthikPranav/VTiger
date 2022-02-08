package com.crm.VTiger.ObjectRepository;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P {
	/*
	@Test
	public void d() {
		System.out.println("Browser Opened");
		System.out.println("Login");
		Assert.assertEquals(true, false,"After Login Home Page Failed");
		System.out.println("HomePage");
		System.out.println("Sign Out");
	}*/
	
	@Test
	public void d1() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Browser Opened");
		System.out.println("Login");
		softAssert.assertEquals(true, false,"After Login Home Page Failed");
		System.out.println("HomePage");
		softAssert.assertEquals(true, false,"After Login Home Page Failed");
		System.out.println("Sign Out");
		softAssert.assertAll();
		System.out.println("Browser Closed");
		
	}
	
}