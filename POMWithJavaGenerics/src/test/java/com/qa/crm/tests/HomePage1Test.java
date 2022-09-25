package com.qa.crm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.crm.pages.HomePage1;
import com.qa.crm.pages.LoginPage;


public class HomePage1Test extends BaseTest {

	@Test(priority=1)
	public void homePageTitleTest() throws InterruptedException {
		
		page.getInstance(LoginPage.class).doLogin("pinky_poo1234","Premamadhav1@" );
		String Title=page.getInstance(HomePage1.class).getTitle();
	Thread.sleep(2000);
		System.out.println("Home Page Title:"+Title);
		Assert.assertEquals(Title, "CRMPRO");
	}
	
	@Test(priority=2,enabled=false)
	public void verifyHomePageHeaderTest() throws InterruptedException {
		
		page.getInstance(LoginPage.class).doLogin("pinky_poo1234", "Premamadhav1");
		String header=page.getInstance(HomePage1.class).getHomePageHeader();
		System.out.println("HomePage header is:"+header);
		Assert.assertEquals(header, "CRMPRO");
		
	}
}


