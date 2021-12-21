package automationFramework;

import java.io.IOException;

import org.testng.annotations.Test;

import com.fileutility.ReadFromPropertyFile;

public class FetchDataFromProperty {
	@Test
	public void fetchData() throws IOException {
		ReadFromPropertyFile rp = new ReadFromPropertyFile();
		String uname = rp.propertyFile("Username");
		String pwd = rp.propertyFile("Password");
		String brw = rp.propertyFile("Browser");
		
		System.out.println("Username	: "+uname);
		System.out.println("Password	: "+pwd);
		System.out.println("Browser		: "+brw);
		
	}
}
