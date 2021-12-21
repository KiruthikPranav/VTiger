package com.crm.VTiger.ObjectRepository;

import org.testng.annotations.Test;
import junit.framework.Assert;

public class TestDemoForRetryAnalyser {
	
	@Test(retryAnalyzer = com.crm.VTiger.ObjectRepository.RetryAnalyser.class)
	public void toFail() {
		Assert.assertTrue(false);
	}
	
	@Test(retryAnalyzer=com.crm.VTiger.ObjectRepository.RetryAnalyser.class)
	public void toPass() {
		Assert.assertTrue(true);
	}
	
}