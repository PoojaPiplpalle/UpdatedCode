package com.qa.crm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.crm.pages.LoginPage;



public class LoginPageTest extends BaseTest {

	@Test(priority=1,enabled=false)
	public void verifyLoginPageTitleTest() {
String title=page.getInstance(LoginPage.class).getLoginPageTitle();
// Getinstance will return login page class object.
System.out.println("Login Page Title is:"+title);
Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void LoginTest() throws InterruptedException {
		
		page.getInstance(LoginPage.class).doLogin("pinky_poo1234","Premamadhav1@" );
	}

}
