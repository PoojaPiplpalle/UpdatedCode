package TestngListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//Screenshot.java is child of base class
@Listeners(CustomListener.class)//we have to add listener on top of class and define from which class we have to listen.
public class ScreenshotTest extends Base {
//For screenshot we need to add commomIo Dependency in POM.xml.
	
	@BeforeMethod
	public void setup()
	{
	//calling the inilizaion method  diretly we are inherting and without creating object becoz method is static	
		Initialization();
	}
	
	
	@Test
	public void TakeScreenshot() {
		Assert.assertEquals(false,true);
		
	}
	
	@Test
	public void TakeScreenshot2() {
		Assert.assertEquals(false,true);
		
	}
	@Test
	public void TakeScreenshot3() {
		Assert.assertEquals(false,true);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
}

//Steps of Execution:
//First it will start the execution from screenshot test class
//First before method iniliatses it will call initialisation() present present in Base class.
//Then @Test will execute and it will get failed.
//will check the listener annotation and screenshot class will listen all method/listeners present in CustomListener.class.
//It will go to custom listener and its is implemeting ITestListener method then it will come  to onTestFailure method and execute failed() method which is present in Base Class
//will take screenshot and store in some folder
//

// will take all the method name which are getting failed call listener then will go to Custom listen class and will class onTestfailure which contains failed method so inside failed method we are passing thses parameter ( result.getMethod().getMethodName()) which return result containing method name.
//then failed method is called and we have passed String parameter  (testMethodName parameter) which is storing result containing method name and will store screenshot accorinding to method name.
//testng will store all the result of testcase in result ref which is defined in customListener  interface.
//from result we are gtting method and method name which are getting failed. and finally all the method name are storing in Base class method failed(String testMethodName)