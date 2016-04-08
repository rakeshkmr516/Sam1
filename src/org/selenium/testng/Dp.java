package org.selenium.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp {
	
	
	
	
	@Test(dataProvider="data")
	public void Login(String sUsername,String sPassword){
		System.out.println("Username: "+sUsername);
		System.out.println("Password : "+sPassword);
	}
	
	
	
	
	
	@DataProvider(name="data")
	public Object[][] data(){
		return new Object[][] {{"Rakesh","HARI"},{"Rohan","Prem"}};
	}
	

}
