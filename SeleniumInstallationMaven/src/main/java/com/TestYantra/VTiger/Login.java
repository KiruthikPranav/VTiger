package com.TestYantra.VTiger;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.fileutility.ReadFromPropertyFile;

public class Login {

	ReadFromPropertyFile rp = new ReadFromPropertyFile();

	public void loginPage(WebDriver driver) throws IOException {
		
		driver.findElement(By.name("user_name")).sendKeys(rp.propertyFile("username"));
		driver.findElement(By.name("user_password")).sendKeys(rp.propertyFile("password"));
		WebElement login = driver.findElement(By.id("submitButton"));
		login.click();
	}
	
}