package org.selenium.grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired {

	public static void main(String[] args) throws InterruptedException {
	
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		
		
		
		caps.setBrowserName("chrome");
		
		
		caps.setPlatform(Platform.ANY);

		
		
		System.setProperty("webdriver.chrome.driver", "E:\\jm\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(caps);
		
		
		driver.get("http://www.google.com");
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
