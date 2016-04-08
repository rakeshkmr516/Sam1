package org.selenium.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HandlingWindows {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();

		driver.get("http://the-internet.herokuapp.com/windows");


		WebElement e = driver.findElement(By.linkText("Click Here"));
		e.isDisplayed();
		e.click();


		String handle = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();


		Object[] str = handles.toArray();


		driver.switchTo().window((String) (str[1]));

		System.out.println(driver.getCurrentUrl());


		driver.switchTo().window((String) (str[0]));

		System.out.println(driver.getCurrentUrl());


		driver.close();


		driver.quit();



	}

	}
