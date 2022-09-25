package com.qa.crm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.crm.pages.Page;

public class BaseTest {
public WebDriver driver;
public WebDriverWait wait;
public Page page;//Creating ref of Page;

@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    wait=new WebDriverWait(driver,30);
    try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.manage().window().fullscreen();
    //create the object of page class:Instantiate page class.
    page=new Page(driver, wait);
    driver.get("https://www.crmpro.com/index.html");
}


@AfterMethod
public void tearDown()
{
	driver.quit();
	
}
}
