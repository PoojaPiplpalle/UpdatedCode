package com.mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

public class BaseTest {
WebDriver driver;
public Page page;
WebDriverWait wait;

@BeforeMethod
@Parameters(value= {"Browser"})
public void setUpTest(String Browser) {
	  
	//page=new BasePage(driver,wait);
	if(Browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    wait=new WebDriverWait(driver,50);
	}
	page=	new BasePage(driver,wait);	
	   driver.get("https://www.crmpro.com/index.html");
	   try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   //Instantiate the Page class:
	 //page=new Page();//We cannot create like this becoz Page class is abstract we should instantiate throogh child class
	
			
}
@AfterMethod
public void tearDown() {
	driver.quit();
	//close() - This command closes the browser's current window. If multiple windows are open, the current window of focus will be closed. driver. quit() - If quit() is called on the driver instance and there are one or more browser windows open, it closes all the open browser windows.
}

}