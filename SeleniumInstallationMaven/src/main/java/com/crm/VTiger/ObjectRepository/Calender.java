package com.crm.VTiger.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.fileutility.WebDriverUtilities;

public class Calender {
	public static void main(String[] args) {
		WebDriverUtilities wb = new WebDriverUtilities();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xdsoft.net/jqplugins/calendar-popup/");
		
		WebElement element = driver.findElement(By.xpath("//div[@class='calendar-popup-composer calendar-popup-composer_main calendar-popu"
				+ "p-composer_inline']//a[@class='calendar-po"
				+ "pup-arrow calendar-popup-icon calendar-popup-arrow_next']"));
		wb.explicittWaitElementVisibilty(driver, 15, element);
		element.click();
		WebElement mnth = driver.findElement(By.xpath("//div[@class='calendar-popup-composer calendar-popup"
				+ "-composer_main calendar-popup-composer_inline']/div/div/div[1]"));
		String month = mnth.getText();
		WebElement yar = driver.findElement(By.xpath("//div[@class='calendar-popup-composer calendar-popup"
				+ "-composer_main calendar-popup-composer_inline']/div/div/div[2]"));
		String year = yar.getText();
		//System.out.println(month);
		String expMonth = "February";
		String expYear = "2024";
		while(!((month.equals(expMonth))&&(year.equals(expYear)))) {
			element.click();
			month = mnth.getText();
			year = yar.getText();
		}
		System.out.println(year+" "+month);
		driver.quit();
	}
}