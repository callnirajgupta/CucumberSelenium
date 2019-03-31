package com.automation.story.leave;
/*package com.ingcapgemini.wm.story.leave;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ingcapgemini.wm.pageobjectmodel.ApplyLeavePO;
import com.ingcapgemini.wm.pageobjectmodel.HomePage;
import com.ingcapgemini.wm.pageobjectmodel.TimeSheetPO;
import com.ingcapgemini.wm.util.CommonUtil;
import com.ingcapgemini.wm.util.SeleniumUtil;
import com.ingcapgemini.wm.util.WebConnector;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TimeSheet {
	public WebConnector webConnector=WebConnector.getInstance();
	WebDriver driver=webConnector.getDriver();
	
	@Given("^user \"(.*?)\" is logged into the application$")
	public void user_is_logged_into_the_application(String userId) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LOGGER.info("user "+userId+" is logged into the application"+LOGGER.getClass().getCanonicalName());
		CommonUtil.login(userId);
				
	    
	}
	

	@When("^user clicks on time link$")
	public void user_clicks_on_time_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumUtil.getWebElement(driver, By.xpath(TimeSheetPO.TIMESHEET_PAGE_TIME_LINK_XPATH)).click();
		Assert.assertTrue("the assert is failing", false);
		   
	}
	
	@When("^user clicks on time link_a$")
	public void user_clicks_on_time_link_a() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumUtil.getWebElement(driver, By.xpath(TimeSheetPO.TIMESHEET_PAGE_TIME_LINK_XPATH)).click();
		Assert.assertTrue("the assert is failing", false);
		   
	}
	
	@When("^user clicks on time link_b$")
	public void user_clicks_on_time_link_b() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumUtil.getWebElement(driver, By.xpath(TimeSheetPO.TIMESHEET_PAGE_TIME_LINK_XPATH)).click();
		Assert.assertTrue("the assert is failing", false);
		   
	}
	
	

	@Then("^verify timesheet page opens up$")
	public void verify_timesheet_page_opens_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumUtil.ValidateWebElementPresence(driver,By.id(TimeSheetPO.TIMESHEET_PAGE_TIMEHEETFORWEEK_ID));
		
	  
	}
	
}
*/