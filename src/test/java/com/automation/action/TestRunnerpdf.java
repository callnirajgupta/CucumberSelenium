package com.automation.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedParallelCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


// to run script in multiple thread and generate one PDF.
/*@RunWith(ExtendedParallelCucumber.class)
@ExtendedCucumberOptions(
        threadsCount = 3,
		jsonReport = "target/cucumber.json",
		//jsonUsageReport = "build/cucumber-usage.json",
		outputFolder = "target/",
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		toPDF = true
		)*/
// to generate Pdf report
/*@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target2/cucumber.json",
retryCount = 0,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
coverageReport = true,
featureOverviewChart = true,
jsonUsageReport = "target2/cucumber-usage.json",
usageReport = true,
screenShotLocation = "/screenshots/",
screenShotSize = "300px",
toPDF = true,
excludeCoverageTags = {"@flaky" },
includeCoverageTags = {"@passed" },
outputFolder = "target")*/

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurefile/Module2", tags = { "@AddToCart"}, plugin = {
		"pretty", "html:target2/cucumber-html-report","usage:target2/cucumber-usage.json",
		"json:target2/cucumber.json", "junit:target2/cucumber.xml" ,"rerun:target2/rerun.txt" }, glue = { "com.automation" } )


public class TestRunnerpdf {
	
	@BeforeClass
	public static void beforeClass(){ //For BeforeClass annotation static is compulsory because JVM calls it directly

		
		if(System.getProperty("Browser")==null){
			System.setProperty("Browser", "chrome");
			
		}
		if(System.getProperty("headless")==null){
			System.setProperty("headless","null");
		}
		if(System.getProperty("ENV")==null){
			System.setProperty("ENV", "SIT");
			
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
