package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	private  WebDriver driver;
private By accountSections =By.cssSelector("div#center_column span");
public AccountsPage(WebDriver driver) {
	this.driver=driver;
	}

public int getAccountsSectionCount() {
	return driver.findElements(accountSections).size();
	}

public String getAccountsPageTitle() {
	
	return driver.getTitle();
}
public List<String> getAccountsSectionslist() {
	List<String> accountslist=new ArrayList<>();
	List<WebElement> accountsheaderlist=driver.findElements(accountSections);
for(WebElement e:accountsheaderlist) {
	
	String text=e.getText();
	System.out.println(text);
	accountslist.add(text);
}
	return accountslist;
	}


}
