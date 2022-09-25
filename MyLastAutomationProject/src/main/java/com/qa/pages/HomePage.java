package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class HomePage extends BasePage implements ElementofCRM{
static public ExtentReports reports;
static public ExtentTest test;
	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
public void contactslinks(String firstnametext,String lastnametext,String titlevalue) {
	Switchtoiframebyname(driver,"mainpanel");
	mousehoveractions(driver,ContactsTab);
	doclick(NewContact);
	selectDropDownValueusingSelectClass(titleDropdwon,titlevalue);
	sendKeys(firstname,firstnametext);
	wait=new WebDriverWait(driver,60);
	sendKeys(Lastname,lastnametext);
	wait=new WebDriverWait(driver,60);
	doclick(savebtn);

	
}

public String homepagetitle() {
	wait=new WebDriverWait(driver,60);
	return getTitle();
}
	
	
}
