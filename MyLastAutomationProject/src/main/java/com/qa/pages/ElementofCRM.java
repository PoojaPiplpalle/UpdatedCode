package com.qa.pages;

import org.openqa.selenium.By;

public interface ElementofCRM {

	
By Username=By.name("username");
By Password=By.name("password");
By SignInbutton=By.xpath("//input[@type='submit']");
By ContactsTab=By.xpath("//a[contains(text(),'Contacts')]");
By NewContact=By.xpath("//a[text()='New Contact']");
By Combinedform=By.linkText("Combined Form");
By Calender=By.linkText("Calendar");
By titleDropdwon=By.xpath("//select[@name='title']");
By firstname=By.xpath("//input[@name='first_name']");
By Lastname=By.xpath("//input[@name='surname']");
By savebtn=By.xpath("//input[@type='submit' and @value='Save']");

}
