package com.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import junit.framework.Assert;

public class loginTest {
WebDriver driver;
//at class level 
Logger log=Logger.getLogger(loginTest.class);

@BeforeMethod
public void setup() {
	log.info("**********starting test case execution********");	
	
	//Interview Questions:s
	//1.what is log ?;capturing info/activities at the time of program execution.
	//types of logs:
	//1.info
	//2.warn
	//3error
	//4.fatal
	
	//how to generate the logs?:use apache log4j(log4j jar)
	//how it works?;:it reads log4j configuration  from log4j properties file.
	//where to create?;;create inside resource folder.
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\chromedriver.exe");
    driver=new ChromeDriver();
    log.info("launching chrome broswer");
    
    try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.manage().window().fullscreen();
    //create the object of page class:Instantiate page class.
   
    driver.get("https://www.crmpro.com/index.html");
    log.info("entering applicaton url");
    //to generate the warning message:use log.warn.
    log.warn("Hey this is warning msg");
    //to print error message:
    log.fatal("this is fatal info");
    //to display debug message.
    log.debug("this is debug info");
}
	
@Test(priority=1)
public void freecrmtesttitle() {
	log.info("**********starting test case********");
	log.info("**********freecrmtesttitle********");
	String title=driver.getTitle();
	System.out.println(title);
	log.info("login page title is :"+title);
	Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	log.info("*********ending test case********");
	log.info("**********freecrmtesttitle********");
	}

@AfterMethod
public void tearDown() {
	
	driver.quit();
	log.info("**********browser is closed********");
}
}
//https://github.com/naveenanimation20/Log4jAPICode/blob/master/src/main/resources/log4j.properties

