package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage implements ElementofCRM{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	public String getLoginPageTitle() {
return getTitle();
		}
	public void login(String un,String pwd) {
		sendKeys(Username,un);
		sendKeys(Password,pwd);
		doclick(SignInbutton);
		
	}
	
}
