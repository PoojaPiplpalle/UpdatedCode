package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private  WebDriver driver;
//1.By Locators:
private By emailid=By.id("email");
private By password=By.id("passwd");
private By signInButton=By.id("SubmitLogin");
private By forgetpwdlink=By.linkText("Forgot your password?111");

//2.Constructor of the page class:
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
//Page actions:Features of the page

public String getLoginPageTitle() {
	return driver.getTitle();
	}
public boolean isForgetPasswordLinkExist() {
	return driver.findElement(forgetpwdlink).isDisplayed();
}
public void enterUserName(String username) {
	driver.findElement(emailid).sendKeys(username);
	}
public void enterPassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
	}
public void clickOnLogin() {
	
	driver.findElement(signInButton).click();
}
public AccountsPage doLogin(String un,String pwd) {
	driver.findElement(emailid).sendKeys(un);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(signInButton).click();
	return new AccountsPage(driver);
}
}
