package org.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://the-internet.herokuapp.com/upload");
		
		
		
		WebElement btnFileUpload = driver.findElement(By.id("file-upload"));
		
		
		btnFileUpload.isDisplayed();
		
		btnFileUpload.sendKeys("G:\\New\\etl testing\\BVT.txt");
	
		
		
		
		WebElement btnFileSubmit = driver.findElement(By.cssSelector("#file-submit"));
		
		btnFileSubmit.isDisplayed();
		
		btnFileSubmit.click();
		
		
		
		
		
		
	}

}
