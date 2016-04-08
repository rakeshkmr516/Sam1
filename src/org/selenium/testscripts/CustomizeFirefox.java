package org.selenium.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class CustomizeFirefox {

	public static void main(String[] args) {
		
		FirefoxProfile prof = new FirefoxProfile();
		
		prof.setPreference("browser.startup.homepage", "http://twitter.com");
		
		
		
		
		WebDriver driver = new FirefoxDriver(prof);
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	}

}
