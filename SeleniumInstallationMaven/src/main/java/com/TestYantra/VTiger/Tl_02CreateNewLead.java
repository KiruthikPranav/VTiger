package com.TestYantra.VTiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.fileutility.BaseClass;

public class Tl_02CreateNewLead extends BaseClass {
	WebDriver driver;
	@Test(groups="Lead")
	public void fillDetails() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[2]/following::img[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kiruthik");
		driver.findElement(By.name("lastname")).sendKeys("Pranav");
		driver.findElement(By.name("company")).sendKeys("TestYantra");
		driver.findElement(By.id("designation")).sendKeys("Test");
		WebElement leadSourceElement = driver.findElement(By.name("leadsource"));
		Select leadSource = new Select(leadSourceElement);
		leadSource.selectByVisibleText("Employee");
		WebElement industryElement = driver.findElement(By.name("industry"));
		Select industry = new Select(industryElement);
		industry.selectByVisibleText("Education");
		driver.findElement(By.name("annualrevenue")).sendKeys("3000");
		driver.findElement(By.id("noofemployees")).sendKeys("5");
		driver.findElement(By.id("secondaryemail")).sendKeys("krituhik@gmail.com");
		
	}
}