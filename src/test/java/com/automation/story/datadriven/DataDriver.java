package com.automation.story.datadriven;
/*package com.ingcapgemini.wm.story.datadriven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ingcapgemini.wm.pageobjectmodel.HomePage;
import com.ingcapgemini.wm.pageobjectmodel.Login1;
import com.ingcapgemini.wm.util.CommonUtil;
import com.ingcapgemini.wm.util.SeleniumUtil;
import com.ingcapgemini.wm.util.WebConnector;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDriver {
	public static WebConnector webConnector=WebConnector.getInstance();
	WebDriver driver;
	
	@Given("^Admin user \"(.*?)\" and password \"(.*?)\" is logged into the application$")
	public void admin_user_and_password_is_logged_into_the_application(String username, String password) throws Throwable {
		driver=webConnector.getDriver();//browser has been open
		if(driver.findElements(By.id(HomePage.HOME_PAGE_WELCOME_ID)).size()==0 ){
					 
		
		driver.manage().window().maximize();
		SeleniumUtil.ImplicitWait(driver);
		driver.get(WebConnector.getConfigProperties().getProperty("App_URL"));
		Assert.assertEquals("the page title is not matching",Login1.LOGIN_PAGE_TITLE ,SeleniumUtil.getTitle(driver));
		Login1.loginToApp(driver, username, password);
		
		SeleniumUtil.ValidateWebElementPresence(driver,By.id(HomePage.HOME_PAGE_WELCOME_ID));
		//LOGGER.debug("############  LOGIN SUCCESSFUl ########################");
		
	    // Write code here that turns the phrase above into concrete actions
		}
	}

	@When("^User  fill the form fields \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void user_fill_the_form_fields_and_and(String frst, String scnd, String thrd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("*****************create userf************************"+frst);
		SeleniumUtil.getWebElement(driver, By.id("field1")).sendKeys(frst);
		SeleniumUtil.getWebElement(driver, By.id("field2")).sendKeys(scnd);
		SeleniumUtil.getWebElement(driver, By.id("field3")).sendKeys(thrd);
	}

	@Then("^Verify user is created \"(.*?)\"$")
	public void verify_user_is_created(String arg1) throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		SeleniumUtil.ValidateWebElementPresence(driver,By.id("ValidationText"));//even if this fails it will go to next scenario..
	   
	}
	
	
	
	
	
	
	
	
	
	
	@Given("^Admin user \"(.*?)\" and password \"(.*?)\" is logged into the application and User  fill the form fields \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void admin_user_and_password_is_logged_into_the_application_and_User_fill_the_form_fields_and_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("print arg"+arg1+" "+arg2+" "+arg3+" "+arg4+ " "+arg5);
	    
	}
	
	
	
	
	
	

}
*/