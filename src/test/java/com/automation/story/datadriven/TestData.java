package com.automation.story.datadriven;

import com.automation.common.GlobalStepDefinition;
import com.automation.util.Xls_Reader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestData {
	//private static int rowNum; 
	//private static String sheetName;
	private Xls_Reader xlReader= new Xls_Reader();
	
	@Given("^user niraj enter the  url \"(.*?)\"$")
	public void user_enter_the_url(String arg1) throws Throwable {
		//rowNum=GlobalStepDefinition.rowNum;
		//sheetName=GlobalStepDefinition.featureName;
		System.out.println("print the test data"+xlReader.getCellData(GlobalStepDefinition.sheetName, 1, GlobalStepDefinition.rowNum));
		System.out.println("print the test data with column name"+xlReader.getCellData(GlobalStepDefinition.sheetName, "testdata", GlobalStepDefinition.rowNum));
		
	  
	}

	@When("^user niraj enter the username \"(.*?)\" and password \"(.*?)\"$")
	public void user_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
		System.out.println("print the username"+xlReader.getCellData(GlobalStepDefinition.sheetName, 2, GlobalStepDefinition.rowNum));
		
		xlReader.setCellData(GlobalStepDefinition.sheetName, 4, GlobalStepDefinition.rowNum, "write datahhhhhhh");
	}

	@Then("^verify niraj that user is able to login into \"(.*?)\"$")
	public void verify_that_user_is_able_to_login_into(String arg1) throws Throwable {
		System.out.println("print the password"+xlReader.getCellData(GlobalStepDefinition.sheetName, 3, GlobalStepDefinition.rowNum));
	   
	}


}
