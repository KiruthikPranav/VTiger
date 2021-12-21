package automationFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.VTiger.ObjectRepository.LoginPage;
import com.fileutility.BaseClass;


public class Tl_01ClickLeadTest extends BaseClass 
{		
	@Test
	public void createLead() 
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.leadClick();
		loginPage.leadImageClick();
		String title = loginPage.getLeadText();
		Assert.assertEquals("Creating New Lead",title);
		System.out.println(title);
	}	
}