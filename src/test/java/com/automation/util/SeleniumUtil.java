package com.automation.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SeleniumUtil {

	
	//for one time driver object initialization
	//private  static WebConnector SELENIUM=null;
	
	public static boolean driverStatus=false;
	private static SeleniumUtil web;
	private static WebDriver driver=null;
	private WebDriver fireFox=null;
	private WebDriver IE=null;
	private WebDriver chrome=null;
	private static Properties configProperties;//value initialized will remain same for the entire execution until u use setter(creating object of class and accessing variable)
	private static Properties sqlProperties;
	private static final String  configFile=System.getProperty("user.dir")+"//src//test//resources//config//Config.properties";
	//private static String sqlFile=System.getProperty("user.dir")+"//src//test//resources//config//SQL.properties";
	
	
	
	
	
	private static final Logger LOGGER = LogManager.getLogger(SeleniumUtil.class);
	private static String ScreenShotFolder = System.getProperty("user.dir") + "//ScreenShot";
	// private static WebConnector webConnector = WebConnector.getInstance();
	private static int BROWSER_SYNC;
	private static int WEBLEMENT_SYNC;

	

	

	
			
	/*//for one time driver object initialization
		public  static void initializeSeleniumConnector() {
			 SELENIUM = WebConnector.getInstance();
		}

		//for one time driver object initialization

		public static WebDriver getDriver() {
			return SELENIUM.getDriver();
		}*/
		
	//This code inside static block is executed only once: the first time you make an object of that class or the first time you access a static member of that class 
		static{
			System.out.println("inside static block");
			configProperties=new Properties();
			sqlProperties=new Properties();
			try{
				FileInputStream fisConfig=new FileInputStream(configFile);
				
				configProperties.load(fisConfig);
			
				//FileInputStream fisSQL=new FileInputStream(sqlFile);
				//sqlProperties.load(fisSQL);
				BROWSER_SYNC = Integer
						.parseInt(configProperties.getProperty("BrowserSync"));
				WEBLEMENT_SYNC = Integer
						.parseInt(configProperties.getProperty("WebElementSync"));
						
			
			}catch(Exception e){
				System.out.println("!!!!!!!!!!!!!!!!!!!!Inside catch block"+e.getMessage());
				
			}
		}
		private SeleniumUtil(){//if constructor is declared as private means this implements singleton concept..means object cannot be created from outside...means one instance of the class exist during runtime...
			
		}
		
		
		public static SeleniumUtil getInstance(){
			if(web==null) {
				web= new SeleniumUtil();
			}
			return web;	
		}

		public WebDriver getDriver() throws MalformedURLException{//one instance of webconnector implies as one instance of driver....
			if (driver==null){
				driverStatus=true;
			//	if("firefox".equalsIgnoreCase(System.getProperty("Browser")) && fireFox==null){
					if("firefox".equalsIgnoreCase(System.getProperty("Browser"))){
					LOGGER.info("Inside Firefox browser initialization");
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\geckodriver.exe");
					FirefoxOptions options = new FirefoxOptions();
					options.setHeadless(true);
					driver= new FirefoxDriver(options);
			    fireFox=driver;
			    LOGGER.debug("FireFox Browser launched successfully");
			}
			//else if("IE".equalsIgnoreCase(System.getProperty("Browser")) && IE==null){
					else if("IE".equalsIgnoreCase(System.getProperty("Browser"))){
				LOGGER.info("Inside IE browser initialization");
					System.out.println("i am inside IE");
					 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\IEDriverServer_32.exe");
					driver= new InternetExplorerDriver();
					IE=driver;
					LOGGER.debug("IE Browser launched successfully");
				}
			//else if("Chrome".equalsIgnoreCase(System.getProperty("Browser")) && chrome==null){
				else if("Chrome".equalsIgnoreCase(System.getProperty("Browser"))){
					if(System.getProperty("ExecuteOn").equalsIgnoreCase("saucelab")){
						 String USERNAME = "roboticautomation";
						   String ACCESS_KEY = "5a8cbd77-9240-46e2-bc4d-8db1a4190794";
						   String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
					
								  DesiredCapabilities caps = DesiredCapabilities.chrome();
						    caps.setCapability("platform", "Windows 10");
						    caps.setCapability("version", "65");
						 
						    driver = new RemoteWebDriver(new java.net.URL(URL), caps);
					
					}else{
						
					
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				if(System.getProperty("headless").equalsIgnoreCase("headless")){
		        options.addArguments("headless");
		        options.addArguments("window-size=1200x600");
				}
				driver= new ChromeDriver(options);	
						chrome=driver;
					}
				}
				
		}
			return driver;
		}
	//used for killing driver object/set driver=null, in the same tc us need to close the browser and open a new one...
		
		/**
		 * method is used for......
		 * return type is void
		 * @param setDriver
		 */
		public static void setDriver(WebDriver setDriver) {//setter..
			driver = setDriver;
		}
		
		public static void maximizeBrowser(){
			driver.manage().window().maximize();
			
		}
		
		public static void launchApplication(){
			driver.get(SeleniumUtil.getConfigProperties().getProperty(System.getProperty("ENV") + "_App_URL"));
		}

		/*public void setFireFox(WebDriver fireFox) {
			this.fireFox = fireFox;
		}

		public void setIE(WebDriver iE) {
			IE = iE;
		}

		public void setChrome(WebDriver chrome) {
			this.chrome = chrome;
		}*/


		public static Properties getConfigProperties() {
			return configProperties;
		}


	
	
	
	
	
	public static WebElement getWebElement(By by) {
			LOGGER.debug("inside getWebElement");
			WebElement webElement = driver.findElement(by);
			return webElement;
		}
	
	public static List<WebElement> getWebElements(By by) {
		LOGGER.debug("inside getWebElement");
		List<WebElement> webElements = driver.findElements(by);
		return webElements;
	}
	
	
		
	/*public static WebElement getWebElement( By by) {
		LOGGER.debug("inside getWebElement");
		WebElement webElement = SELENIUM.getDriver().findElement(by);
		return webElement;
	}*/

	public static void takeScreenShot() throws IOException {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-sss");
		String strDate = formatter.format(date);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File(ScreenShotFolder + "//ScreenShot" + strDate));
	}
	
/*	public static void takeScreenShot() throws IOException {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss-sss");
		String strDate = formatter.format(date);
		File scrFile = ((TakesScreenshot) SELENIUM.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(ScreenShotFolder + "//ScreenShot" + strDate));
	}
*/
	public static String getSimpleDateFormate(Date date, String formate) {

		SimpleDateFormat formatter = new SimpleDateFormat(formate);
		String strDate = formatter.format(date);
		return strDate;
	}

	public static String getTitle() {
		return driver.getTitle();
	}
	
	/*public static String getTitle() {
		return SELENIUM.getDriver().getTitle();
	}
*/
	/**
	 * Close browser
	 */

	public static void closeBrowser() {
		LOGGER.info("############################# Inside CloseBrowser #############################");
		driver.close();
		//driver.quit();
		LOGGER.debug("###################   Closed Browser #############################");
	}

	
	/*public static void closeBrowser() {
		if(SELENIUM !=null && SELENIUM.getDriver() !=null){
		LOGGER.info("Inside CloseBrowser");
		SELENIUM.getDriver().close();
		SELENIUM.getDriver().quit();
		SELENIUM.setDriver(null);
		LOGGER.debug("Closed Browser");
		}
	}*/
	
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void ImplicitWait() {

		LOGGER.info(" print the sysc time " + BROWSER_SYNC);
		driver.manage().timeouts().implicitlyWait(BROWSER_SYNC, TimeUnit.SECONDS);

	}
	
	
/*
	public static void ImplicitWait() {

		LOGGER.info(" print the sysn time " + BROWSER_SYNC);
		SELENIUM.getDriver().manage().timeouts().implicitlyWait(BROWSER_SYNC, TimeUnit.SECONDS);

	}*/

	
	
	public static void switchFrame(String frame){
		
		
		objExplicitWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath(frame))));
		
	}
	
	
	
	
	
	public static void switchToDefaultContent(){
		driver.switchTo().defaultContent();
	}
	
	
	
	public static void cleanFolder(int day,String folder){
		LOGGER.info("delete log from logs folder before day :"+day);
		File file=new File(System.getProperty("user.dir")+"//"+folder+"//");
		for (File file1:file.listFiles()){
			long diff = new Date().getTime()-file1.lastModified();
			if (diff>day*24*60*60*1000){
				file1.delete();
			}
			
			LOGGER.debug("Logs deleted before days :"+day);
		}
		
		
	}
	
	
	
 public static WebDriverWait objExplicitWait(){

		WebDriverWait explicitWait = new WebDriverWait(driver,WEBLEMENT_SYNC);
		System.out.println("webelement###################--"+WEBLEMENT_SYNC);
		//return(new WebDriverWait(driver, WEBLEMENT_SYNC));
		return explicitWait;
	}


	
	
	public static void ValidateWebElementPresence(By by) {
		LOGGER.info("Inside ValidateWebElementPresence method"); 
	
		
	//	WebDriverWait explicitWait = new WebDriverWait(driver, WEBLEMENT_SYNC);
		
		
	//objExplicitWait().until(ExpectedConditions.visibilityOfElementLocated(by));
	
	objExplicitWait().until(ExpectedConditions.presenceOfElementLocated(by));
	
	

		LOGGER.info("#########Element is present: " + by);

	}
	
	
	public static void ValidateWebElementVisible(By by) {
		LOGGER.info("Inside ValidateWebElementPresence method");

		objExplicitWait().until(ExpectedConditions.visibilityOfElementLocated(by));

		LOGGER.info("######### Element is visible: " + by);

	}
	
	
	
	/*public static void ValidateWebElementPresence(By by) {
		LOGGER.info("Inside ValidateWebElementPresence method"); 
		WebDriverWait explicitWait = new WebDriverWait(SELENIUM.getDriver(),WEBLEMENT_SYNC);
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(by));

		LOGGER.info("Element is present: " + by);

	}
*/
	
	/*public static void selectWebList(By by, String val, String selectBy){
		LOGGER.info("Inside selectWebList");
			WebElement wb=SELENIUM.getDriver().findElement(by);
				Select sel=new Select(wb);
				*/
	public static void selectWebList(By by, String val, String selectBy){
		LOGGER.info("Inside selectWebList");
			WebElement wb=driver.findElement(by);
				Select sel=new Select(wb);
						

	
				
				switch(selectBy){
				case "selectByVisibleText":
					sel.selectByVisibleText(val);
					LOGGER.debug("Selected by-"+selectBy);
					 break;
				case "selectbyIndex":
					sel.selectByIndex(Integer.parseInt(val));
					LOGGER.debug("Selected by-"+selectBy);
					 break;
					 
				case "SelectByvalue"://or 2+3
					sel.selectByValue(val);
					LOGGER.debug("Selected by-"+selectBy);
					 break;
					 
					 
				default:
					LOGGER.info("Proper Value not selected");
			
			}
				
				


	}
	
	public static void robotSendKeys(int keyCode) throws Throwable{
		
		Robot robot=new Robot();
		robot.keyPress(keyCode);
		robot.keyRelease(keyCode);
		
		
	}
	
	
	
	/*public static void selectItemWebTable(By by,int columnfirst,int columnSecond,String firstvalue,String secondvalue,String selectValue){
		WebElement table = SELENIUM.getDriver().findElement(by);
		 List<WebElement> rows=table.findElements(By.tagName("tr"));*/
		 
		 
	public static void selectItemWebTable(By by,int columnfirst,int columnSecond,String firstvalue,String secondvalue,String selectValue){
		WebElement table = driver.findElement(by);
		 List<WebElement> rows=table.findElements(By.tagName("tr"));

		 
		 

	 
	
   for (WebElement eachRow : rows) 
   {
   	List<WebElement> columns =eachRow.findElements(By.tagName("td"));
   	//OR...
   	// for (int i=1;i<rows.size();i++){
   	// List<WebElement> columns =rows.get(i).findElements(By.tagName("td"));//no. of columns in that particular row
			 

       if((columns.get(columnfirst).findElement(By.tagName("a")).getText()).contains(firstvalue) && (columns.get(columnSecond).findElement(By.tagName("a")).getText()).contains(secondvalue) )
       {

         
         WebElement wb=columns.get(6).findElement(By.tagName("select"));
         Select sel = new Select(wb);
         sel.selectByVisibleText(selectValue);
         break;

       }
}
	
	
	
}
 public static void robotUploadFile(String filePath) throws Throwable{

	 StringSelection stringSelection = new StringSelection(filePath);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        //Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.keyPress(KeyEvent.VK_ENTER);
       // robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
 
 public static void clickWebElement(By by){
	ValidateWebElementVisible(by);
	getWebElement(by).click();
	 
	 
 }
 
 
 public static void setValue(By by,String value){
	 
	  
		ValidateWebElementPresence(by);
		if (value!=null)
		getWebElement(by).sendKeys(value);
		 
		 
	 }
 
 
 public static boolean validateWebElementDisplay(By by){
	 boolean isDisplayed=false;
	 try {
		isDisplayed=getWebElement(by).isDisplayed();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	 
	 	 return isDisplayed;
	 
	 
	 
 }
 
 
 public static int validateWebElementCount(By by){
	 
	 return getWebElements(by).size();
	 
	 	 
	  
	 
 }
 
 public static void wait(int time){
	 try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 
 
	
}
