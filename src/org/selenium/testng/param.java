package org.selenium.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param {

	
	
	@Parameters("search")
	@Test
	public void testSearch(String sSearch){
		System.out.println("The search keyword is: "+sSearch);
	}
}
