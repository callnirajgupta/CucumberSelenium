/*	private static final Logger LOGGER = LogManager.getLogger(CommonUtil.class);
	public static WebConnector webConnector = WebConnector.getInstance();
	
	public WebConnector webConnector=WebConnector.getInstance();
	WebDriver driver=webConnector.getDriver();*/
	
	
package com.automation.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedParallelCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt",  plugin = {
		"pretty", "html:target1/cucumber-html-report",
		"json:target1/cucumber.json", "junit:target1/cucumber.xml"  }, glue = { "com.automation" } )


public class TestRunnerReRun {
	
	@BeforeClass
	public static void beforeClass(){ //For BeforeClass annotation static is compulsory because JVM calls it directly

		
		
		if(System.getProperty("Browser")==null){
			System.setProperty("Browser", "chrome");
			
		}
		if(System.getProperty("headless")==null){
			System.setProperty("headless","no");
		}
		if(System.getProperty("ENV")==null){
			System.setProperty("ENV", "SIT");
			
		}
		
		if(System.getProperty("ExecuteOn")==null){
			System.setProperty("ExecuteOn", "null");
			
		}
				
		//for one time driver object initialization
		//SeleniumUtil.initializeSeleniumConnector();
		
		
		//SeleniumUtil.getInstance();
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.setProperty("currentdate", dateFormat.format(new Date()));
		//SeleniumUtil.cleanFolder(1, "Logs");//delete all except todays
		
	}
	
	@AfterClass
	public static void afterClass(){
		
	}

}
