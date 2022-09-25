package com.crm.test;

import org.testng.annotations.Test;


import org.testng.Assert;


import com.qa.pages.LoginPage;



public class LoginPageTest extends TestBase1 {

	@Test(priority=2)
	public void loginTest() {
	page1.getInstance(LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void loginpagetitletest() {
		
		String title=page1.getInstance(LoginPage.class).getLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	
	
}
