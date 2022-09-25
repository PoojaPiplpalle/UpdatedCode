package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);//Calling page class contructor
		// TODO Auto-generated constructor stub
	}
//Generics Util Wrapper:-
	public void doclick(By locator) {
		driver.findElement(locator).click();
	
	}
	
	public  void doSendKeys(By locator,String text) {
		driver.findElement(locator).sendKeys(text);
		
	}
	public String dogetText(By locator) {
		
		return driver.findElement(locator).getText();
	}
	public void actions(WebDriver driver,WebElement locator) {
		
		Actions action=new Actions(driver);
				action.moveToElement(locator).click().build().perform();
	}
}
