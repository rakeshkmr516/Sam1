package org.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExample {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		
		
		caps.setBrowserName("chrome");
		
		caps.setPlatform(Platform.ANY);
		
		
		
		String url = "http://www.google.com";
		
		String RemoteURL = "http://localhost:4444/wd/hub";
		
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL(RemoteURL),caps);
		
		driver.get(url);
		
		
		Thread.sleep(40000);
		
		driver.quit();
		
		
		
		
	}

}
