package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;




public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;
	
	//We Can create the constructor of abstract class:
	public Page(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		//this.wait=new WebDriverWait(this.driver,30);
		this.wait=wait;
	}
	
	//create abstract methods://Use abstract keyword and do not add implementation.
	public abstract String getPageTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement(By locator);
	public abstract void waitforElementPresent(By locator);
	public abstract void waitforPageTitle(String title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
		return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
	}catch(Exception e) {
		e.printStackTrace();
		return null;//If any exception is there return null;
	}
	}
	//newInstance is use to create the object of particular class.
}
