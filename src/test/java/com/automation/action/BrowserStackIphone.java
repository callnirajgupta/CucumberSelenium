package com.automation.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackIphone {

	public static final String USERNAME = "nirajgupta4";
	  public static final String AUTOMATE_KEY = "YigFP1LcnxRZpPTjBBxD";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "iPhone");
	    caps.setCapability("device", "iPhone 8 Plus");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "11");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
