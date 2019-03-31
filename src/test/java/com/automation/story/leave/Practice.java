package com.automation.story.leave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



 class Practice {

	 public static void main(String args[]) throws InterruptedException{
		 System.setProperty("webdriver.gecko.driver","D:\\Selenium_31May2017\\SeleniumInstallations\\Browser Drivers\\geckodriver-v0.16.1-win32\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		 
		  driver.get("http://only-testing-blog.blogspot.in/");  
		  
		  
		//  driver.findElement(By.id(""))
		  Actions act=new Actions(driver);
		  //driver.switchTo().frame("I20_1497247838705");
		  WebElement moveToElement=driver.findElement(By.xpath("//a[text()='Hover over me']"));
		  act.moveToElement(moveToElement).perform();
		  Thread.sleep(2000);
		  
		  
			
		
		}
	
	
}


