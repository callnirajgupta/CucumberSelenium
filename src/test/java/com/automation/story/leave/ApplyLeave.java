package com.automation.story.leave;
/*package com.ingcapgemini.wm.story.leave;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ingcapgemini.wm.pageobjectmodel.ApplyLeavePO;
import com.ingcapgemini.wm.pageobjectmodel.HomePage;
import com.ingcapgemini.wm.pageobjectmodel.Login1;
import com.ingcapgemini.wm.pageobjectmodel.MyLeavePO;
import com.ingcapgemini.wm.util.CommonUtil;
import com.ingcapgemini.wm.util.SeleniumUtil;
import com.ingcapgemini.wm.util.WebConnector;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplyLeave {
	
	private static final Logger LOGGER=LogManager.getLogger(ApplyLeave.class);
	public WebConnector webConnector=WebConnector.getInstance();
	WebDriver driver=webConnector.getDriver();
	@Given("^user \"(.*?)\" is logged into the application$")
	public void user_is_logged_into_the_application(String userId) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LOGGER.info("user "+userId+" is logged into the application"+LOGGER.getClass().getCanonicalName());
		CommonUtil.login(userId);
				
	    
	}


	
	@When("^user apply leave for date from \"(.*?)\" to \"(.*?)\" with leave type as \"(.*?)\" with comments as \"(.*?)\"$")
	public void user_apply_leave_for_date_from_to_with_leave_type_as_with_comments_as(String fromDate, String toDate, String leaveType, String comment) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 HomePage.clickLeaveApply(driver);
		    SeleniumUtil.ValidateWebElementPresence(driver,By.id(ApplyLeavePO.APPLYLEAVE__LEAVETYPE_ID));
		   ApplyLeavePO.applyLeave(driver, leaveType, fromDate, toDate, comment);
		   SeleniumUtil.ValidateWebElementPresence(driver,By.id(HomePage.HOME_PAGE_WELCOME_ID));
	}
	
	

	@Then("^verify that leave is applied successfully$")
	public void verify_that_leave_is_applied_successfully() throws Throwable {
	    
	   //write a code for fetching gettext in the pagefactory-ApplyLeavePO and put assertion here...as
		//Assert.assertEquals("SUCCESSFUL SUBMISSION",ApplyLeavePO.gettext);.....
	}
	
	@Given("^Leave request is present in the system for the user \"(.*?)\"$")
	public void leave_request_is_present_in_the_system_for_the_user(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	

	
	@When("^user cancels the leaves from \"(.*?)\" to \"(.*?)\"$")
	public void user_cancels_the_leaves_from_to(String frmDate, String toDate) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		SeleniumUtil.getWebElement(driver, By.xpath(HomePage.HOME_PAGE_LEAVE_LINK_XPATH)).click();
		
		SeleniumUtil.getWebElement(driver, By.id(ApplyLeavePO.APPLYLEAVE__MYLEAVE_ID)).click();
		
		
		SeleniumUtil.selectItemWebTable(driver, By.xpath(MyLeavePO.MYLEAVE_LEAVETABLE_XPATH), 0, 5, frmDate, "Pending Approval", "Cancel");
		SeleniumUtil.getWebElement(driver, By.id(MyLeavePO.MYLEAVE_SAVE_ID)).click();
	    
	}
	
	
	@Then("^verify cancellation is successful$")
	public void verify_cancellation_is_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumUtil.ValidateWebElementPresence(driver, By.xpath(MyLeavePO.MYLEAVE_CANCELLEDSTATUS_XPATH));
	   
	}


	@Given("^Testing the re-run scenario$")
	public void testing_the_re_run_scenario() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("the assert is failing", false);
	}

	
	
}
*/