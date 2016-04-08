package org.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		
		
			 
			  //Create object of FirefoxProfile in built class to access Its properties.
			  FirefoxProfile fp = new FirefoxProfile();
			  
			  //Set Location to store files after downloading.
			  fp.setPreference("browser.download.dir", "F:\\WebDriverdownloadspavan");
			  
			  fp.setPreference("browser.download.folderList", 2);
			  
			  //Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
			  fp.setPreference("browser.helperApps.neverAsk.saveToDisk", 
			    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"//MIME types Of MS Excel File.
			    + "application/pdf;" //MIME types Of PDF File.
			    + "application/vnd.openxmlformats-officedocument.wordprocessingml.document;" //MIME types Of MS doc File.
			    + "text/plain;" //MIME types Of text File.
			    + "text/csv"); //MIME types Of CSV File.
			  
			  fp.setPreference( "browser.download.manager.showWhenStarting", false );
			  fp.setPreference( "pdfjs.disabled", true );
		
			  //Pass fprofile parameter In webdriver to use preferences to download file.
			  WebDriver driver = new FirefoxDriver(fp);  
			 
			  driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
			         //Download Text File
			  driver.findElement(By.xpath("//a[contains(.,'Download Text File')]")).click();
			  Thread.sleep(5000);//To wait till file gets downloaded.
			                //Download PDF File
			  driver.findElement(By.xpath("//a[contains(.,'Download PDF File')]")).click();
			  Thread.sleep(5000);
			                //Download CSV File
			  driver.findElement(By.xpath("//a[contains(.,'Download CSV File')]")).click();
			  Thread.sleep(5000);
			                //Download Excel File
			  driver.findElement(By.xpath("//a[contains(.,'Download Excel File')]")).click();
			  Thread.sleep(5000);
			 
			  driver.close();
			  
			  driver.quit();
			  
			 
			  
			 }
			 
			 
			}
