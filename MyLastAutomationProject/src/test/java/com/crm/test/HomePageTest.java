package com.crm.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.datadriven;


public class HomePageTest extends TestBase1 {

	
	
	@Test(priority=1)
	public void homePageTitleTest() {
		page1.getInstance(LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		String homepgetitle=page1.getInstance(HomePage.class).homepagetitle();
		System.out.println(homepgetitle); 
		System.out.println("Test");
	}
/*	@DataProvider
	public ArrayList<String> GetmaleTestData() throws IOException {
		datadriven d=new datadriven();
ArrayList<String> data=	d.getData("MaleEntry");
return data;
String FirstName=data.get(2);
String LastName=data.get(3);
String Title=data.get(1);
}*/
/*
	@DataProvider//will fetch data from excel file.
	public void GetfemaleTestData() throws IOException {
		datadriven d=new datadriven();
ArrayList<String> data=	d.getData("FemaleEntry");
String FirstName=data.get(2);
String LastName=data.get(3);
String Title=data.get(1);
}
	*/
	
	@Test(priority=2)
	public void contactsPagemaleTest() throws IOException, InterruptedException {
		page1.getInstance(LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		datadriven d=new datadriven();
		ArrayList<String> data=	d.getData("MaleEntry");
		String Title=data.get(1);
		String FirstName=data.get(2);
		String LastName=data.get(3);
		
		Thread.sleep(2000);
		
		page1.getInstance(HomePage.class).contactslinks(FirstName,LastName,Title);
	}
	
	@Test(priority=3)
	public void contactsPagefemaleTest() throws IOException, InterruptedException {
		page1.getInstance(LoginPage.class).login(prop.getProperty("username"), prop.getProperty("password"));
		datadriven d=new datadriven();
		ArrayList<String> data=	d.getData("FemaleEntry");
		String FirstName1=data.get(2);
		String LastName1=data.get(3);
		String Title1=data.get(1);
		Thread.sleep(2000); 
		
		page1.getInstance(HomePage.class).contactslinks(FirstName1,LastName1,Title1);
	}
}
