package com.automation.pageobjectmodel;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.automation.util.SeleniumUtil;

public class Login_PO {
	
	private static final Logger LOGGER=LogManager.getLogger(Login_PO.class);
	public static final String LOGIN_PAGE_EMAIL_CSS="input#email";
	public static final String LOGIN_PAGE_PASSWORD_CSS="input[id=passwd]";
	public static final String LOGIN_PAGE_SIGNIN_BUTTON_ID="SubmitLogin";
	
	public static void loginToApplication(String userName, String password){
		LOGGER.info("############# inside Login_PO method ###################");
		if (userName!=null){
			SeleniumUtil.setValue(By.cssSelector(LOGIN_PAGE_EMAIL_CSS), userName);
			
		}
		if (password!=null){
			SeleniumUtil.setValue(By.cssSelector(LOGIN_PAGE_PASSWORD_CSS), password);			
			
		}
		SeleniumUtil.clickWebElement(By.id(LOGIN_PAGE_SIGNIN_BUTTON_ID));
		
		SeleniumUtil.wait(2000);
	}
	
	
}
