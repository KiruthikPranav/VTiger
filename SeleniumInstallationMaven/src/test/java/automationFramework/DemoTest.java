package automationFramework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Test;

import com.crm.VTiger.ObjectRepository.LoginPage;
import com.fileutility.BaseClass;

public class DemoTest extends BaseClass
{		
	@Test
	public void createLead() 
	{	/*
		LoginPage loginPage = new LoginPage(driver);
		loginPage.leadClick();
		loginPage.leadImageClick();
		String title = loginPage.getLeadText();
		Assert.assertEquals("Creating New Lead",title);
		System.out.println(title);
		*/
		driver.navigate().to("http://localhost:8888/index.php?module=Products&action=EditView&return_action=DetailView&parenttab=Inventory");
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"jscal_trigger_sales_start_date\"]")).click();
		String name = driver.findElement(By.xpath("/html/body/div[17]/table/thead/tr[1]/td[2]")).getText();
		String temp[] = name.split(", ");
		String month = temp[0];
		String year = temp[1];
		String expMonth ="January" ,expYear = "2025";
		
			System.out.println(month+"_"+year);
		
		while(!((month.equals(expMonth))&&(year.equals(expYear)))) {
			driver.findElement(By.xpath("/html/body/div[17]/table/thead/tr[2]/td[4]")).click();
			name = driver.findElement(By.xpath("/html/body/div[17]/table/thead/tr[1]/td[2]")).getText();
			String tem[] = name.split(", ");
			 month = tem[0];
			 year = tem[1];
		}
		name = driver.findElement(By.xpath("/html/body/div[17]/table/thead/tr[1]/td[2]")).getText();
		System.out.println(month+"__"+year);
		System.out.println(name);
	}	
}