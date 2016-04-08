package org.selenium.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
	
	
	
	@Test(groups={"sanity"})
	public void test1(){
		Reporter.log("Test1");
	}
	
	
	@Test(groups={"Regression"})
	public void test2(){
		Reporter.log("Test2");
	}
	
	@Test(groups={"sanity"})
	public void test3(){
		Reporter.log("Test3");
	}

}
