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

import com.automation.util.SeleniumUtil;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedParallelCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//AddToCart


/*@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "target/cucumber.json",
		//jsonUsageReport = "build/cucumber-usage.json",
		outputFolder = "target/",
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		featureOverviewChart = true,
		knownErrorsReport = true,
		knownErrorsConfig = "configs/reports/known_errors.json",
		usageReport = true,
		coverageReport = false,
		retryCount = 0,
        breakdownReport = true,
        breakdownConfig = "src/test/resources/breakdown_config.json",
		screenShotLocation = "screenshots/",
		screenShotSize = "300px",
		toPDF = true,
		pdfPageSize = "auto",
		consolidatedReport = true,
		consolidatedReportConfig = "configs/reports/consolidated_batch.json"
		)*/

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
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 3,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
//coverageReport = true,
//jsonUsageReport = "target/cucumber-usage.json",
//usageReport = true,
toPDF = true,
excludeCoverageTags = {"@flaky" },
includeCoverageTags = {"@passed" },
outputFolder = "target")*/

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featurefile/Module2", tags = { "@LoginAndLogout_ExamplesParameters " }, plugin = {
		"pretty", "html:target/cucumber-html-report",
		"json:target/cucumber.json", "junit:target/cucumber.xml" ,"rerun:target/rerun.txt" }, glue = { "com.automation" } )


public class TestRunner {
	
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
