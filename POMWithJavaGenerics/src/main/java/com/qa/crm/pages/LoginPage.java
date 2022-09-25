package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
//Define locator:
	By username=By.name("username");
	By password=By.name("password");
	By loginbtn=By.xpath("//input[@type='submit']");
	
	//Actions:
	public String getLoginPageTitle() {
		
		return driver.getTitle();
	}
	public void doLogin(String  Username,String Password) throws InterruptedException {
		doSendKeys(username,Username);
		doSendKeys(password,Password);
		Thread.sleep(3000);
		doclick(loginbtn);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
