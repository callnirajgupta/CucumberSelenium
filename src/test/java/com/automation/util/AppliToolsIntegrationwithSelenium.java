package com.automation.util;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.applitools.eyes.RectangleSize;
//import com.applitools.eyes.selenium.Eyes;


public class AppliToolsIntegrationwithSelenium {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		 WebDriver driver= new ChromeDriver(options);	
		 //driver.manage().window().maximize();
		// Initialize the eyes SDK and set your private API key.
			Eyes eyes = new Eyes();

			// Set the API key from the env variable. Please read the "Important Note"
			// section above.
			eyes.setApiKey("APPLITOOLS_API_KEY");

			try {
				// Call getTestInfoForPart to get the appropriate test information.
				//HashMap<String, String> testInfo = App.getTestInfoForPart(args);

				// Start the test by setting AUT's name, window or the page name that's being tested, viewport width and height
				eyes.open(driver, "appName","windowName", new RectangleSize(1300,300));

				// Navigate the browser to the "ACME" demo app
				driver.get("https://demo.applitools.com");

				// Visual checkpoint #1.
				eyes.checkWindow("Login window");

	            //🌟 Note: You can have multiple "checkWindow" to create multiple test steps within a test.🌟  
	            //For example, you may want to test errors in the login window after clicking a login button,
	            //In that case, you may add the following before you call eyes.close(). 
	            //This will create a test with two test steps.
	            //driver.click("login");
	            //eyes.checkWindow("Login Window Error");

				// End the test.
				eyes.close();

			} catch (Exception e) {
				System.out.println(e);
			} finally {

				// Close the browser.
				driver.quit();

				// If the test was aborted before eyes.close was called, ends the test as
				// aborted.
				eyes.abortIfNotClosed();

				// End main test
				//System.exit(0);
			}

	}*/

}
