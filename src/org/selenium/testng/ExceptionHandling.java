package org.selenium.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExceptionHandling {
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void testHandleException(){
	Reporter.log("The divison is:"+1/0);
	}

}
