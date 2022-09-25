package com.qa.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage1 extends BasePage {

	public HomePage1(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	//Page Locator
	By Header=By.xpath("//td[text()='CRMPRO']");
	
	public String getTitle() {
		WebDriverWait wait=new WebDriverWait(driver,60);
		return driver.getTitle();
	}
	
	public String getHomePageHeader()
	
	{
		return dogetText(Header);
	}

	
}
