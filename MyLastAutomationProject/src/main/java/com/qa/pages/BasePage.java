package com.qa.pages;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;


public class BasePage extends Page1 {
Logger log= Logger.getLogger(BasePage.class);
	
	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	



	@Override
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		WebElement element=null;
		try { 
			waitforelementvisiblity(locator);
			element=driver.findElement(locator);
			return element;//if no exception occured then no catch block will execute but if it occured then catch block will execute and print null .
		}catch(Exception e) {
			
			System.out.println("exception occured while execution element"+locator);
			
			System.out.println("Test123");
		}
		return element;//if any exception occured that means if it not able to create element it will return null.
		//	if exception occured return null;
	}

	@Override
	public void waitforelementvisiblity(By locator) {
		// TODO Auto-generated method stub
	
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		}
		catch(Exception e) {
			
			System.out.println("some exception occured while waiting element :"+locator);
			
		}
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	@Override
	public void sendKeys(By locator, String text) {
		// TODO Auto-generated method stub
		driver.findElement(locator).sendKeys(text);
		log.info("Text entered is:"+text);
		}
	
	

	@Override
	public void scrolldowntillelement(By locator,WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement element=driver.findElement(locator);
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	@Override
	public void clickelementbyJS(WebDriver driver,By locator) {
		WebElement element=driver.findElement(locator);
	JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click;", element);
	}

	

	
	@Override
	public void waitforclickablilityofelement(WebElement element,int time) {
		// TODO Auto-generated method stub
		try { 
			
			wait.until(ExpectedConditions.elementToBeClickable(element));
		
		}catch(Exception e) {
			
			System.out.println("Exception occurered while eaiting for element to be clickable");
		}
	}




	@Override
	public void doclick(By locator) {
		try {
			System.out.println("class name :" +Thread.currentThread().getStackTrace()[2].getClassName());
			System.out.println("method name :"+Thread.currentThread().getStackTrace()[2].getMethodName());
			waitforelementvisiblity(locator);
			//waitforclickablilityofelement(element, 60);
			driver.findElement(locator).click();
			log.info("successfully clicked on element");
			
		
			
		
		}
		catch(Exception e) {
			System.out.println("exception occured while clicking element :"+locator);
			try {
				clickelementbyJS(driver,locator);
				log.info("successfully clicked on element");
				
			}catch(Exception e1) {
				log.info("successfully clicked on element");
				
			}
			
			
		} 
		
		
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public  void TabEnter(By locator) {
		try {
			
			driver.findElement(locator).sendKeys(Keys.TAB);
			Thread.sleep(1000);
			driver.findElement(locator).sendKeys(Keys.ENTER);
			log.info("succesfully clicked on element");
			 
		}catch(Exception e) {
			log.info("failed to click on element");
			
		}
		
		
	}




	@Override
	public String getAlertText(WebDriver driver) {
		// TODO Auto-generated method stub
		
		///driver.switch.alert return the object of remotealert class which implements the alert interface
		String alerttext="";
		try{
			Alert alert=driver.switchTo().alert();
			
			alerttext=alert.getText();
			alert.accept();
			return alerttext;
		}catch(Exception e) {
			
		log.info("alert is not present");	
		return  alerttext;
		}
		
		
	}




	@Override
	public boolean IsEnabled(WebDriver driver, By locator) {
		// TODO Auto-generated method stub
		boolean IsPresent =false;
		try {
			
			if(driver.findElement(locator).isEnabled()) {
				IsPresent=true;
				log.info("element is enabled");
				
			}
			
		}
			
			catch(Exception e) {
			
			
			log.info("Element is not enabled");
			}
		
		
		
		return IsPresent;
		
		
	}
	public void getElementLoc(By locator) {
		
		
		
	}
	public void selectElementByDropDownusingList(By locator,String text) {
		
			try {
			List<WebElement> list=driver.findElements(locator);
			System.out.println(list.size());
			for(int i=0;i<=list.size();i++) {
				
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals(text)) {
				
				list.get(i).click();
				break;
			}
			}
			
			}catch(Exception e)
			{
				log.info("Unable to select the dropdownelement");
				
			}
		
		
	}
	public void selectDropDownValueusingSelectClass(By locator,String value) {
	/*	String DOB="20-Aug-2020";
		String[] arrdob=DOB.split("-");*/
		//select is class and we create object and access the method.
		WebElement element=driver.findElement(locator);
		Select select =new Select(element);
		select.selectByVisibleText(value);
		
	}




	@Override
	public void SwitchtoiframebyIndex(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		
		try {
			
			driver.switchTo().frame(i);
		}catch(Exception e) {
			
			log.info("Frame is not found by index");
		}
	}




	@Override
	public void Switchtoiframebyname(WebDriver driver, String name) {
		// TODO Auto-generated method stub
		
	try {
		wait=new WebDriverWait(driver,60);
			driver.switchTo().frame(name);
		}catch(Exception e) {
			System.out.println("unable to switch");
			log.info("Frame is not found by name");
		}
	}




	@Override
	public void Switchtodefaultcontent(WebDriver driver) {
		// TODO Auto-generated method stub
try {
			
			driver.switchTo().defaultContent();
		}catch(Exception e) {
			
			log.info("switch to default frame failed");
		}
	}




	@Override
	public void rightClickByActions(WebDriver driver, By locator) {
		// TODO Auto-generated method stub
		WebElement element=driver.findElement(locator);
		Actions rytactionclick=new Actions(driver);
	
		try {
			rytactionclick.contextClick(element).build().perform();
			log.info("Succcefully right clicked");
			
		}catch(Exception e) {
			
			log.info("Right click failed");
		}
	}




	@Override
	public void DoubleClickByaction(WebDriver driver, By Locator) {
		WebElement element=driver.findElement(Locator);
		Actions doubleclickaction=new Actions(driver);
		try {
			
			doubleclickaction.doubleClick(element).build().perform();
		}catch(Exception e) {
			log.info("failed to double click");
			
		}
		
	}




	@Override
	public void mousehoveractions(WebDriver driver, By locator) {
		// TODO Auto-generated method stub
		WebElement element=driver.findElement(locator);
		Actions mousehover=new Actions(driver);
		try {
			
			mousehover.moveToElement(element).build().perform();
			log.info("succesfully hover");
		}catch(Exception e) {
			
			log.info("unsuceefull to hover");
		}
	}




	@Override
	public void actions(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		
	}
	
	public  void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

		}
	/*// //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);*/

}
