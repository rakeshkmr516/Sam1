package org.selenium.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	
	
	@Test(priority=12)
	public void test1(){
		Reporter.log("Test1");
	}
	
	
	@Test(priority=10)
	public void test2(){
		Reporter.log("Test2");
	}
	
	@Test(priority=2)
	public void test3(){
		Reporter.log("Test3");
	}
}
