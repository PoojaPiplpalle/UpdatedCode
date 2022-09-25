package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

	public BasePage(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}


	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
	
		try {
			waitforElementPresent(locator);
		 element=driver.findElement(locator);
		 return element;
	}catch(Exception e) {
		System.out.println("some error occured during execution of element:"+locator);
		e.printStackTrace();
	}
		return element;//if any exception occured that means if it not able to create element it will return null.
	}

	@Override
	public void waitforElementPresent(By locator) {
		try {
wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}catch(Exception e) {
			
			System.out.println("some Exception occured while waiting for the element :"+locator.toString());
		}
		
	}

	@Override
	public void waitforPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
					}catch(Exception e) {
						
						System.out.println("some Exception occured while waiting for the element :"+title);
					}
		
	}

	
}
