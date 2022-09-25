package TestngListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class Base {
public static WebDriver driver;
public static void Initialization() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");	
	 driver=new ChromeDriver();
	 driver.get("http://www.google.com");
}

public void failed(String testMethodName ) {//in this method write a logic to take screenshot.
	//we will be calling this mehtod whnerve the testcase is getting failed.
	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils is a class to take screenshot and create new file object to store the screenshot to destination
	//Create on folder where u want to keep  screenshot.Rtyclickk om project and click on folder and give and close ang get the path by properties
	try {
		FileUtils.copyFile(scrFile, new File("C:\\Users\\lenovo\\Documents\\ToolsQA\\RetryLogic\\Screenshot\\"+testMethodName+"_"+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Test");
	}
}


}
