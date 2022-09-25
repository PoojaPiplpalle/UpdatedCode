package com.crm.test;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.util.WebEventListener;
import com.qa.pages.BasePage;
import com.qa.pages.Page1;

public class TestBase1  {

	public  WebDriver driver;
	public  Properties prop;
	public Page1 page1;
	public WebDriverWait wait;
	public  EventFiringWebDriver e_driver;
	public  WebEventListener eventListener;
	
	public TestBase1() {
		
		  prop=new Properties();
			 try {
				FileInputStream ip=new FileInputStream("C:\\Users\\lenovo\\Documents\\ToolsQA\\MyLastAutomationProject\\src\\main\\java\\com\\qa\\config\\config.properties");
				prop.load(ip);
			 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	@BeforeMethod
	public void setUp() {
String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))  {
			
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		    driver=new ChromeDriver();
		
		    //System is a class and setProperty is method of System Class.
		//    As the name suggests, the setProperty method enables QAs to set the properties for the desired browser to be used in test automation.

		 //   The setProperty method has two attributes – “propertyName” and “value.” The propertyName represents the name of the browser-specific driver, and the value points to the path of that browser driver.
		//This is achieved because System.setProperty manages the initialization of the Chrome driver in the first step.
		   //WebDriver is interface and chromedriver is class
		    
		    /* We can create Object of a class ChromeDriver by taking reference of an interface (WebDriver). In this case, we can call implemented methods of WebDriver interface.

		    As per the above statement, we are creating an instance of the WebDriver interface and casting it to FirefoxDriver Class. All other Browser Drivers like ChromeDriver, InternetExplorerDriver, PhantomJSDriver, SafariDriver etc implemented the WebDriver interface (actually the RemoteWebDriver class implements WebDriver Interface and the Browser Drivers extends RemoteWebDriver). Based on this statement, you can assign Firefox driver and run the script in Firefox browser (any browser depends on your choice).
		*/
		
		
		}
		try {
			
			Thread.sleep(7000);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	    //create the object of page class:Instantiate page class.
		page1=new BasePage(driver,wait);
		e_driver = new EventFiringWebDriver(driver);//create object(e_driver) of eventfiringWebDriver class and create ref variable e_driver and driver as parameter
		/*WebEventListener class
		 * 
WebEventListener class-It is use to generate the selenium action logs.
		create WebEventListener class in com.crm.qa.util package. and copy paste the code
		In TestBase.Java after launching the chrome create object(e_driver) of eventfiringWebDriver class and create ref variable e_driver and driver as parameter
		create object(eventListener) of WebEventListener class
		ad register eventListener with eventfiringWebDriver Object.
		 and assign e_driver to driver.*/

		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		//WebEventListener class->It is use to generate the selenium action logs.
		eventListener = new WebEventListener();//create object(eventListener) of WebEventListener class
		e_driver.register(eventListener);//and register eventListener with eventfiringWebDriver Object.
		driver = e_driver;//assign e_driver to driver
	driver.get(prop.getProperty("url"));
	Reporter.log("url is opened");
	driver.manage().window().maximize();
	Reporter.log("Browser is maximized");
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}


	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		//close() - This command closes the browser's current window. If multiple windows are open, the current window of focus will be closed. driver. quit() - If quit() is called on the driver instance and there are one or more browser windows open, it closes all the open browser windows.
		
	}
	

		
}
	
// But one of the simplest ways to store log information in testing is using Reporter Class.
/*//Method-3 Reporter Class
Along with these report generated methods, you can use object.properties file to store the system generated logs as well as user generated logs. But one of the simplest ways to store log information in testing is using Reporter Class.

Reporter is a class present in TestNG. It provides 4 different methods to store log information they are:

Reporter.log(String s);
Reporter.log(String s, Boolean logToStandardOut);
Reporter.log(String s, int level);
Reporter.log(String s, int level, Boolean logToStandardOut);
The log method is a static method of Reporter class. So you are accessing that method through the Reporter class.
 * 
 */
