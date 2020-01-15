package com.automation.util;

import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automation.pageobjectmodel.HomePage_PO;
import com.automation.pageobjectmodel.Login_PO;
import com.automation.pageobjectmodel.WelcomePage_PO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class CommonUtil { 
	
	private static final Logger LOGGER = LogManager.getLogger(CommonUtil.class);
		
    static WebDriver driver;
	
		
	

	
	public static void logOut(){
		
		LOGGER.info("############  INSIDE LOGOUT  ########################");
		//sign out could be different in diff pages...u can driver.findelement(by)....and pass the locator to this sign out method
		WelcomePage_PO.clickSignOut();
		SeleniumUtil.ValidateWebElementPresence(By.className(HomePage_PO.HOME_PAGE_SIGNIN_CLASSNAME));
			
		//Assert.assertTrue("LogOut Successful", true);
		LOGGER.debug("############  LOGOUT SUCCESSFUL  ########################");
		
				
		
	}

	public  static void login(String userId, String password) throws MalformedURLException {		
		
		LOGGER.info("############  INSIDE LOGIN ########################");
		
		driver=SeleniumUtil.getInstance().getDriver();//if u need  to it..
		
		SeleniumUtil.maximizeBrowser();
		
		SeleniumUtil.ImplicitWait();		
		
		SeleniumUtil.launchApplication();
		// OR SeleniumUtil.getInstance().getDriver().get(SeleniumUtil.getConfigProperties().getProperty(System.getProperty("ENV") + "_App_URL"));
		 //OR driver.get(SeleniumUtil.getConfigProperties().getProperty(System.getProperty("ENV") + "_App_URL"));
		
		Assert.assertEquals("the page title is not matching", HomePage_PO.HOME_PAGE_TITLE, SeleniumUtil.getTitle());		
		SeleniumUtil.ValidateWebElementPresence(By.className(HomePage_PO.HOME_PAGE_SIGNIN_CLASSNAME));
		Assert.assertEquals("the page title is not matching", HomePage_PO.HOME_PAGE_TITLE, SeleniumUtil.getTitle());
		HomePage_PO.clickSignIn_HomePage();
		
		SeleniumUtil.ValidateWebElementPresence(By.cssSelector(Login_PO.LOGIN_PAGE_EMAIL_CSS));
		
		Login_PO.loginToApplication(userId, password);		
		
		
	}

	
	



}
