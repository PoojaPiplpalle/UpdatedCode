package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver,WebDriverWait wait) {
		super(driver,wait);
		// TODO Auto-generated constructor stub

	}
	// Declaring all locator private so that is should not be used out of the class

	// PageLocator:
	private By username = By.name("username");
	private By password = By.name("password");
	private By loginbtn = By.xpath("//input[@type='submit']");
	//getter using the concept od encapsulations:How to access private variable of class with the help of public variable. 

		//Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
		//Ryt click and click on source and generate getter and setters.
	//after adding getters replace By with WebElement becoz this method will return WebElement.
	public WebElement getUsername() {
		return getElement(username);
	}
	
	public WebElement getPassword() {
		return getElement(password);
	}
	
	public WebElement getLoginbtn() {
		return getElement(loginbtn);
	}
	//Actions:
	
	public String loginPagetitle() {
		 return getPageTitle();
		
		
	}
	
public HomePage doLogin(String username1,String Password1) {
	
	getUsername().sendKeys(username1);
	getPassword().sendKeys(Password1);
	getLoginbtn().click();
	//after clicking it will land into homepage.
	return getInstance(HomePage.class);
}

//using method overloading and passing blank username and password

public void doLogin() {
	
	getUsername().sendKeys("");
	getPassword().sendKeys("");
	getLoginbtn().click();
	//after clicking it will land into homepage.
	
}

//again method overloading and passing blank password
//username:pinky_poo1234
//password:Premamadhav1@
public void doLogin(String UserCred) {
	
if(UserCred.contains("username")) {
	
	getUsername().sendKeys(UserCred.split(":")[1].trim());
}else if(UserCred.contains("password")){
	 getPassword().sendKeys(UserCred.split(":")[1].trim());
	
}
getLoginbtn().click();
}

}
