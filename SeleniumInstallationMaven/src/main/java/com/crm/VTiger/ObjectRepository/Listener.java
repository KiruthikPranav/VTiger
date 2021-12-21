package com.crm.VTiger.ObjectRepository;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.fileutility.BaseClass;

public class Listener extends BaseClass implements ITestListener {
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Started screenshot in TestSuccess");
		
		try {
			webUtility.takeScreenShot(BaseClass.staticDriver, "I:\\Selenium\\1 Selenium Class\\2 Month\\Own Learn 1", 
					result.getName()+" "+javaUtility.getSystemDate(), ".png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ScreenShot taken");

	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
