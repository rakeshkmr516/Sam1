package org.selenium.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency {
	
	
	
	@Test
	public void login(){
		Reporter.log("Login"+1/0);
	}
	
	@Test(dependsOnMethods="login")
	public void logout(){
		Reporter.log("Logout");
	}
	

}
