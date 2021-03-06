package automationFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.crm.VTiger.ObjectRepository.LoginPage;
import com.fileutility.BaseClass;

public class Tl_01ClickLeadTest extends BaseClass 
{		
	@Test(groups= {"smoke","regression"})
	public void createLead() 
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.leadClick();
		loginPage.leadImageClick();
		String title = loginPage.getLeadText();
		System.out.println("Before BreakPoint");
		Assert.assertEquals("Creating NewLead",title);
		System.out.println("After BreakPoint");
		System.out.println(title);
	}	
}