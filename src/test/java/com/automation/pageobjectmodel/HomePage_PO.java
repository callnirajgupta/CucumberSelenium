package com.automation.pageobjectmodel;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.automation.util.SeleniumUtil;

public class HomePage_PO {
	
	private static final Logger LOGGER=LogManager.getLogger(HomePage_PO.class);
	public static final String HOME_PAGE_TITLE="My Store";
	public static final String HOME_PAGE_SIGNIN_CLASSNAME="login";	
	
	
	public static void clickSignIn_HomePage(){		
		LOGGER.info("########### Inside clickSignIn_HomePage ###########");
		SeleniumUtil.clickWebElement(By.className(HOME_PAGE_SIGNIN_CLASSNAME));
			
		
	}
	

}


