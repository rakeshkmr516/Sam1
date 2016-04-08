package org.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuthentication {

	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
		//<a href="/basic_auth">Basic Auth</a>
		
		WebElement lnkBasicAuth = driver.findElement(By.linkText("Basic Auth"));
		lnkBasicAuth.isDisplayed();
		lnkBasicAuth.click();
		
		
		//username:password@domain
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		if(driver.getPageSource().contains("Congratulations")){
			System.out.println("THere");
		}
		else{
			System.out.println("Not Theres");
		}
		
		
		driver.close();
		
		driver.quit();
		
	}

}
