package com.TestYantra.VTiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	
	public void logoutPage(WebDriver driver,WebElement signOut,WebElement button) {
		Actions act = new Actions(driver);
		act.moveToElement(signOut).moveToElement(button).click().build().perform();
	}
	
}
