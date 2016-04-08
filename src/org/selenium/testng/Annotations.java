package org.selenium.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite(){
		Reporter.log("Before Suite");
	}	
	@AfterSuite
	public void afterSuite(){
		Reporter.log("After Suite");
	}

	
	@BeforeTest
	public void beforeTest(){
		Reporter.log("Befre Test");
	}
	
	@AfterTest
	public void afterTest(){
		Reporter.log("After Test");
	}
	
	
	@BeforeClass
	public void beforeClass(){
		Reporter.log("Before Class");
	}
	
	
	@AfterClass
	public void afterClass(){
		Reporter.log("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		Reporter.log("Before Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		Reporter.log("Ater Method");
	}
	
	@Test
	public void testClass1(){
		Reporter.log("Test1");
	}
	
	@Test
	public void testClass2(){
		Reporter.log("Test2");
	}
	
	
}


