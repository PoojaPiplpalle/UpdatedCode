package com.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public abstract class Page1 {
  WebDriver driver;
  WebDriverWait wait;
  
  public Page1(WebDriver driver,WebDriverWait wait) {
	  this.driver=driver;
	  this.wait=wait;
  }
  
 //Writing the generics method:
public abstract void doclick(By locator);
public abstract WebElement getElement(By locator);
public abstract void waitforelementvisiblity(By  locator);
public abstract String getTitle();
public abstract void sendKeys(By locator,String text);
public abstract void scrolldowntillelement(By locator,WebDriver driver);
public abstract void clickelementbyJS(WebDriver driver,By locator);
public abstract void actions(WebDriver driver,WebElement element);
public abstract void waitforclickablilityofelement(WebElement element ,int time);
public abstract String getAlertText(WebDriver driver);
public abstract boolean IsEnabled(WebDriver driver,By locator);
public abstract void SwitchtoiframebyIndex(WebDriver driver,int i);
public abstract void Switchtoiframebyname(WebDriver driver,String name);
public abstract void Switchtodefaultcontent(WebDriver driver);
public abstract void rightClickByActions(WebDriver driver,By locator);
public abstract void DoubleClickByaction(WebDriver driver,By Locator);
public abstract void mousehoveractions(WebDriver driver,By locator);



public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
	try {
	return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
}catch(Exception e) {
	e.printStackTrace();
	return null;//If any exception is there return null;
}
}




}
