package org.selenium.testscripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotWeb {

	public static void main(String[] args) throws InterruptedException {

		ScreenshotWeb sw = new ScreenshotWeb();

		WebDriver driver = new FirefoxDriver();


		driver.get("http://www.twitter.com");

		sw.takeScreen(driver);

		WebElement ele =  driver.findElement(By.linkText("Sign up"));
		ele.isDisplayed();
		ele.click();

		Thread.sleep(3000);

		sw.takeScreen(driver);


		Thread.sleep(3000);

		driver.quit();



	}




	public void takeScreen(WebDriver driver){
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


		File destFile = new File("E:\\pavanscreenshot\\screenshot_"+System.currentTimeMillis()+".jpeg");


		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
