package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
//Initilising webdriver with help of thread local

//This below method is used to initialise the threadlocal driver on the basis of given browser
public 	WebDriver init_driver(String browser) {
	
	System.out.println("browser value is:"+ browser);
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		tlDriver.set(new ChromeDriver());//Object of chromedriver is created and it will be set with threadlocal driver
		//when initialise a chromedriver,set it with threadlocal driver so it will create a local copy Webddriver for specific thread and threadlocal driver have instance of webdriver 
	//Will create the same copy of driver to each driver so that testcase will be executed in parallel mode.
	//Let say we have multiple thread,and we have written webdriver driver=new chromdriver with the help of threadlocal so every thread will get the same copy of driver becoz of thread local so every thread will attack one one google chrome
	}
	
	else if(browser.equals("firefox")){
		WebDriverManager.firefoxdriver().setup();
		tlDriver.set(new FirefoxDriver());
	}
	
	else if(browser.equals("safari")){
		//WebDriverManager.Safaridriver().setup();
		tlDriver.set(new SafariDriver());
	}
	else {
		System.out.println("Please pass the correct browser value"+browser);
	}
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
}


//When u run in parallel execution so let say 5 threads are running together and all threads are calling the getDriver Mthod together so all should be synchronized so use synchronized.
//that only one thread accesses the synchronized resource and other threads wait for the resource to become free.20-Jun-2019

//This method is use to get the driver with ThreadLocal
public static synchronized WebDriver getDriver() {
	//create multiple copy of same driver
	return tlDriver.get();//This will return webdriver.
	///This method will return	threadlocal instance and inside threadlocal we have already initialise chromdriver or firefox based on condition
	
}

}
