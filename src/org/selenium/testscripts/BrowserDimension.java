package org.selenium.testscripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserDimension {

	public static void main(String[] args) {
	FirefoxProfile prof = new FirefoxProfile();
		
		prof.setPreference("browser.startup.homepage", "https://www.twitter.com");
		
		
		
		
		WebDriver driver = new FirefoxDriver(prof);
		
	
		driver.navigate().to("http://www.facebook.com");



		System.out.println(driver.manage().window().getSize());



		Dimension dim = new Dimension(620, 259);

		driver.manage().window().setSize(dim);



	}

}
