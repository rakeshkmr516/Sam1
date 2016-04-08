package org.selenium.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();


		driver.get("http://the-internet.herokuapp.com/nested_frames");

		System.out.println("------------------------------------------------");

		System.out.println(driver.getPageSource());

		System.out.println("------------------------------------------------");

		driver.switchTo().frame("frame-bottom");


		System.out.println(driver.getPageSource());

		System.out.println("------------------------------------------------");


		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-top");

		System.out.println("------------------------------------------------");

		System.out.println(driver.getPageSource());

		System.out.println("------------------------------------------------");





		driver.switchTo().frame("frame-middle");

		System.out.println("------------------------------------------------");

		System.out.println(driver.getPageSource());

		System.out.println("------------------------------------------------");


		driver.switchTo().parentFrame();
		
		System.out.println("------------------------------------------------");

		System.out.println(driver.getPageSource());

		System.out.println("------------------------------------------------");

		
		driver.close();
		
		
		driver.quit();
		
		
	}

}
