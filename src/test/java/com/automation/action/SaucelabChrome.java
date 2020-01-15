package com.automation.action;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaucelabChrome {

	public static String sauceUserName = "aautomation2020";
	   public static  String sauceAccessKey = "21b63924-7fef-444a-88dd-35ca8f4ced5b";
	    
	    public static void main(String arg[]) throws MalformedURLException{

	    /**
	     * In this section, we will configure our test to run on some specific
	     * browser/os combination in Sauce Labs
	     */
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("username", sauceUserName);
	        capabilities.setCapability("accessKey", sauceAccessKey);
	        capabilities.setCapability("browserName", "Chrome");
	        capabilities.setCapability("platform", "Windows 10");
	        capabilities.setCapability("version", "59.0");
	    capabilities.setCapability("name", "sample test1");

	     WebDriver driver = new RemoteWebDriver(new URL("https://ondemand.saucelabs.com:443/wd/hub"), capabilities);

	    //navigate to the url of the Sauce Labs Sample app
	    driver.navigate().to("https://www.saucedemo.com");

	    //Create an instance of a Selenium explicit wait so that we can dynamically wait for an element
	    WebDriverWait wait = new WebDriverWait(driver, 5);

	    //wait for the user name field to be visible and store that element into a variable
	    By userNameFieldLocator = By.cssSelector("[type='text']");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(userNameFieldLocator));

	    //type the user name string into the user name field
	    driver.findElement(userNameFieldLocator).sendKeys("standard_user");

	    //type the password into the password field
	    driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");

	    //hit Login button
	    driver.findElement(By.cssSelector("[type='submit']")).click();

	    //Synchronize on the next page and make sure it loads
	    By inventoryPageLocator = By.id("inventory_container");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(inventoryPageLocator));

	    //Assert that the inventory page displayed appropriately
	    Boolean result = driver.findElements(inventoryPageLocator).size() > 0;
	    assertTrue(result);

	    /**
	     * Here we teardown the driver session and send the results to Sauce Labs
	     */
	    if (result){
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=passed");
	    }
	    else {
	      ((JavascriptExecutor)driver).executeScript("sauce:job-result=failed");
	    }
	    driver.quit();

	  }
}
