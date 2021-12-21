package automationFramework;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.fileutility.ReadFromJsonFile;

public class FetchDataFromJson {
	
	@Test
	public void data() throws IOException, ParseException {
		ReadFromJsonFile rd = new ReadFromJsonFile();
		String uname = rd.readFromJson("Username");
		String pwd = rd.readFromJson("Password");
		String brw = rd.readFromJson("Browser");
		
		System.out.println("Username	: "+uname);
		System.out.println("Password	: "+pwd);
		System.out.println("Browser		: "+brw);
	}
}