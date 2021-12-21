package com.TestYantra.VTiger;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.fileutility.BaseClass;

public class TlDemo extends BaseClass{
	
	@Parameters("browser")
	@Test
	public void a(String browser) {
		System.out.println(browser);
	}

}
