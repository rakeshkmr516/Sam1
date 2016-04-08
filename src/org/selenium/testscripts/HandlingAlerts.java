package org.selenium.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) {



		WebDriver driver = new FirefoxDriver();

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");



		WebElement btnAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));

		btnAlert.isDisplayed();
		btnAlert.click();
		// it will open a pop-up which consists ok button 


		/*
		 * 
		 * driver.swtitchto.alert()
		ok -> accept
		cancel -> dismiss
		set text -> sendkeys
		get text*/


		Alert btnalert = driver.switchTo().alert();


		btnalert.accept();


		WebElement btnConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));

		btnConfirm.isDisplayed();
		btnConfirm.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());

		Alert btnconfirm = driver.switchTo().alert();


		btnconfirm.dismiss();




		WebElement btnPrompt= driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));

		btnPrompt.isDisplayed();
		btnPrompt.click();


		Alert btnprompt = driver.switchTo().alert();


		btnprompt.sendKeys("PAVAN");



		btnprompt.accept();





	}

}
