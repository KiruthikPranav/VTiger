package com.TestYantra.VTiger;

import org.testng.annotations.Test;
import com.fileutility.BaseClass;

public class TLDemo2 extends BaseClass {

	@Test(groups="smoke")
	public void parallel() {
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.guru99.com/locators-in-selenium-ide.html");
		System.out.println("3");
	}
	
	@Test(groups="smoke")
	public void parallelChrome() {
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		System.out.println("4");
	}
	
}
