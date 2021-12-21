package com.TestYantra.VTiger;

import org.testng.annotations.Test;
import com.crm.VTiger.ObjectRepository.LoginPage;
import com.fileutility.BaseClass;
import com.fileutility.WebDriverUtilities;

public class Tl_06MemberOf extends BaseClass{
	
	@Test
	public void memberOf() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		WebDriverUtilities wd = new WebDriverUtilities();
		
		lp.clickOrg();
		lp.clickOrgImg();
		lp.name();
		lp.addMember();
		
		wd.switchWindow(driver, 1);
		
		lp.clickMember();
		Thread.sleep(3000);
		wd.acceptAlert(driver);
		wd.switchWindow(driver, 0);
		System.out.println("Its working fine till here");
		//driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		lp.save();
		Thread.sleep(5000);
		
	}
}