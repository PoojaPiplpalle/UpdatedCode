package com.qa.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
public  WebDriver driver;
public WebDriverWait wait;


//create pageclass constructor:
public Page(WebDriver driver,WebDriverWait wait){
	
	//To initialise the driver and wait we use this keyword.
	this.driver=driver;
	this.wait=wait;
}

//create a method using java generics and return a new page 
//create a mehtod getInstance and return type of method is TPage and create a parameter as class level and ref as pageClass
//This meh=thod will return pageclass and contructor will return pageClassObject.

public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
	try {
	return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
}catch(Exception e) {
	e.printStackTrace();
	return null;//If any exception is there return null;
}
}
}