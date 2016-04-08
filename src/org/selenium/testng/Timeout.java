package org.selenium.testng;

import org.testng.annotations.Test;

public class Timeout {
	
	
	
	@Test(timeOut=1000)
	public void testTimeout() throws InterruptedException{
		Thread.sleep(400000);
	}

}
