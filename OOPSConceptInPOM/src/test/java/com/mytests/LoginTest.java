
package com.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;



public class LoginTest extends BaseTest {
//Enable =false that test case will not be excuted .
	@Test(priority=1,enabled=false)
	public void LoginPageTitleTest() {
		
		
String title=page.getInstance(LoginPage.class).loginPagetitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2 )
	public void doLoginTest() {
		
		HomePage homepage=page.getInstance(LoginPage.class).doLogin("pinky_poo1234", "Premamadhav1@");
		String homepagetitle=homepage.getTitle();
		System.out.println("homepagetitle");
		
	}
}
